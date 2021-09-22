package com.martoo.picker.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.Group
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.martoo.picker.interfaces.ListingView
import com.martoo.picker.ProductsAdapter
import com.martoo.picker.R
import com.martoo.picker.Utility
import com.martoo.picker.entities.toProductItemEntity
import com.martoo.picker.models.Order
import com.martoo.picker.models.Product
import com.woocom.models.MyOrder

class OrderDetailsActivity : AppCompatActivity(),
    ListingView {
    private var orderComplete: Boolean = false
    private var scanningProcess: Int = 0
    private var orderId: String = ""
    private var recentsProductsList: List<Product> = arrayListOf()
    private var recentProductCode: String = ""
    private lateinit var headerLL: LinearLayout
    private lateinit var completeBtn: Button
    private lateinit var actionDialog: Group
    private lateinit var actionDialogClose: ImageView
    private lateinit var actionDialogHeadingTv: TextView
    private lateinit var actionDialogHeadingEtv: EditText
    private lateinit var actionDialogScannedBtn: Button
    private lateinit var rvMain: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)
        actionDialog = findViewById<Group>(R.id.actionDialog)
        actionDialogClose = findViewById<ImageView>(R.id.actionDialogClose)
        actionDialogHeadingTv = findViewById<TextView>(R.id.actionDialogHeadingTv)
        actionDialogHeadingEtv = findViewById<EditText>(R.id.actionDialogHeadingEtv)
        actionDialogScannedBtn = findViewById<Button>(R.id.actionDialogScannedBtn)
        rvMain = findViewById<RecyclerView>(R.id.rvMain)
        headerLL = findViewById<LinearLayout>(R.id.header)
        completeBtn = findViewById<Button>(R.id.orderCompleteBtn)
        setSingleProducts(intent)
        completeBtn.setOnClickListener {
            if (completeBtn.text.toString().trim().lowercase() == "order completed") {
                callOrderComplete()
            }else{
                actionDialog.visibility == View.VISIBLE
            }
        }
        actionDialogClose.setOnClickListener { actionDialog.visibility = View.GONE }
        actionDialogScannedBtn.setOnClickListener {
            when(scanningProcess){
                0->{
                    scanProductOrBasket()
                }
                1->{
                    matchBasketOrAddProduct()
                }
                2->{
//                    if(!actionDialogHeadingEtv.text.toString().trim().isNullOrEmpty()){
//                        val scannedCode = actionDialogHeadingEtv.text.toString().trim().lowercase()
//                        if (scannedCode.startsWith("basket")) {
//                            checkBarCode(scannedCode,orderCurrent?.orderNumber?:"")
//                        }else{
//                            Toast.makeText(this@OrderDetailsActivity,"Please Scan a Basket!",Toast.LENGTH_LONG).show()
//                        }
//                    }else{
//                        Toast.makeText(this@OrderDetailsActivity,"Please Scan Barcode First!",Toast.LENGTH_LONG).show()
//                    }
                }
            }
        }
    }

    private fun callOrderComplete() {
        finish()
    }

    private fun setSingleProducts(intent: Intent) {
        val id = intent.getStringExtra("order_id")
        id?.let{orderIds->
            orderId = orderIds
            setOrdersFromDb(id)
        }
    }

    override fun onAccept(order: MyOrder) {

    }

    override fun AttachBasket(model: Order) {

    }

    override fun openOrderDetails(id: String) {

    }

    private fun setOrdersFromDb(id: String) {
        Utility.getProducts(this@OrderDetailsActivity,id).observe(this,{ orders->
            orders?.let{
                if(orders.isNotEmpty()){
                    val listing = ArrayList<Any>()
                    for(temp in  orders){
                        listing.add(temp)
                    }
                    headerLL.visibility = View.GONE
                    completeBtn.text = "Start Scanning"
                    val adapter = ProductsAdapter(this, listing,1,this@OrderDetailsActivity)
                    rvMain.layoutManager = LinearLayoutManager(this)
                    rvMain.adapter = adapter
                }
            }
        })
    }
    fun scanProductOrBasket() {
        val code = actionDialogHeadingEtv.text.toString().trim()
        recentProductCode = code
        if(code.isNullOrEmpty()){
            Toast.makeText(this@OrderDetailsActivity,"Scanned Product Code is INVALID", Toast.LENGTH_LONG).show()
        }else{
            Utility.checkProductRequired(code,orderId,this@OrderDetailsActivity).observe(this,{checkProds->
                recentsProductsList = checkProds
                if(checkProds.isNullOrEmpty()){
                    Toast.makeText(this@OrderDetailsActivity,"Invalid Product Scanned. Either full or not needed.",
                        Toast.LENGTH_LONG).show()
                }else{
                    setScanView(1)
                }
            })
        }
    }

    private fun setScanView(tag: Int) {
        actionDialog.visibility = View.VISIBLE
        when(tag){
            0->{
                scanningProcess = 0
                actionDialogHeadingTv.text = "Scan Product Barcode"
            }
            1->{
                scanningProcess = 1
                actionDialogHeadingTv.text = "Sca Basket for Product"
            }
            2->{
                scanningProcess = 2
                actionDialogHeadingTv.text = "Scan Basket QR Code"
            }
            else->{
                scanningProcess = 3
            }
        }
    }

    private fun matchBasketOrAddProduct() {
        val code = actionDialogHeadingEtv.text.toString().trim()
        if(code.isNullOrEmpty()){
            Toast.makeText(this@OrderDetailsActivity,"Scanned Basked Code is INVALID",Toast.LENGTH_LONG).show()
        }else{
            Utility.checkBasketInOrders(code,orderId,this@OrderDetailsActivity).observe(this,{checkProds->
                if(checkProds.isNullOrEmpty()){
                    Toast.makeText(this@OrderDetailsActivity,"Basket scanned is Not attached to order.",Toast.LENGTH_LONG).show()
                }else{
                    val product = getProductsFromOrder()
                    product?.let {
                        it.remaining++
                        it.basketId = code
                        Utility.addProductToBaskedAndDatabase(product.toProductItemEntity(),
                            this@OrderDetailsActivity)
                        Toast.makeText(this@OrderDetailsActivity,"Product Added Successfully!",Toast.LENGTH_LONG).show()
                        checkforOrderComplete()
                        return@observe

                    }

                }
            })
        }
    }

    private fun checkforOrderComplete() {
        Utility.getProducts(this@OrderDetailsActivity,orderId).observe(this,{
            if(it.isNullOrEmpty()){
                orderComplete = true
                actionDialog.visibility = View.GONE
                completeBtn.text = "Order Completed"
            }
        })
    }

    private fun getProductsFromOrder(): Product? {
        if (recentsProductsList.isNotEmpty()) {
            for(temp in recentsProductsList){
                if((temp.productCode?:"".isNotEmpty()) as Boolean && temp.productCode?:"" == recentProductCode){
                    return temp
                }
            }
        }
        return null
    }
}
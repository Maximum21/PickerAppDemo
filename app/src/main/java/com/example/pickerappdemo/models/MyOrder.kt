package com.example.pickerappdemo.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

class MyOrder() :Parcelable{
    var id: Int = 0
    @SerializedName("number")
    lateinit var orderNumber: String

    @SerializedName("date_created")
    lateinit var dateCreated: String

    @SerializedName("updated_at")
    public var updatedAt: String = ""
    @SerializedName("completed_at")
    public var completedAt: String = ""
    lateinit var status: String
    lateinit var currency: String
    lateinit var total: String
    lateinit var subtotal: String
    @SerializedName("total_line_items_quantity")
    var totalLineItemsQuantity: Int = 0
    @SerializedName("total_tax")
    lateinit var totalTax: String
    @SerializedName("total_shipping")
    lateinit var totalShipping: String
    @SerializedName("cart_tax")
    lateinit var cartTax: String
    @SerializedName("shipping_tax")
    lateinit var shippingTax: String
    @SerializedName("total_discount")
    lateinit var totalDiscount: String
    @SerializedName("shipping_methods")
    lateinit var shippingMethods: String
    @SerializedName("payment_method")
    lateinit var methodId: String
    @SerializedName("payment_method_title")
    lateinit var methodTitle: String
//    @SerializedName("billing")
//    lateinit var billingAddress: BillingAddress
//    @SerializedName("shipping")
//    lateinit var shippingAddress: ShippingAddress
    lateinit var note: String
    @SerializedName("customer_ip")
    lateinit var customerIp: String
    @SerializedName("customer_user_agent")
    lateinit var customerUserAgent: String
    @SerializedName("customer_id")
    var customerId: Int? = null
    @SerializedName("view_order_url")
    lateinit var viewOrderUrl: String
//    @SerializedName("line_items")
//    var lineItems: MutableList<MyLineItem> = ArrayList()
//    @SerializedName("shipping_lines")
//    var shippingLines: List<ShippingLine> = ArrayList()
//    @SerializedName("tax_lines")
//    var taxLines: List<TaxLine> = ArrayList()
//    @SerializedName("fee_lines")
//    var feeLines: List<FeeLine> = ArrayList()
//    @SerializedName("coupon_lines")
//    var couponLines: List<Any> = ArrayList()
//    lateinit var customer: Customer

    var image : Int? = null

    constructor(parcel: Parcel) : this() {
        id = parcel.readInt()
        orderNumber = parcel.readString().toString()
        updatedAt = parcel.readString().toString()
        completedAt = parcel.readString().toString()
        status = parcel.readString().toString()
        currency = parcel.readString().toString()
        total = parcel.readString().toString()
        subtotal = parcel.readString().toString()
        totalLineItemsQuantity = parcel.readInt()
        methodId = parcel.readString().toString()
        methodTitle = parcel.readString().toString()
        totalTax = parcel.readString().toString()
        totalShipping = parcel.readString().toString()
        cartTax = parcel.readString().toString()
        shippingTax = parcel.readString().toString()
        totalDiscount = parcel.readString().toString()
        shippingMethods = parcel.readString().toString()
        note = parcel.readString().toString()
        customerIp = parcel.readString().toString()
        customerUserAgent = parcel.readString().toString()
        customerId = parcel.readValue(Int::class.java.classLoader) as? Int
        viewOrderUrl = parcel.readString().toString()
        image = parcel.readValue(Int::class.java.classLoader) as? Int
    }
//
//    fun addLineItem(lineItem: MyLineItem) {
//        lineItems.add(lineItem)
//
//    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(orderNumber)
        parcel.writeString(updatedAt)
        parcel.writeString(completedAt)
        parcel.writeString(status)
        parcel.writeString(currency)
        parcel.writeString(total)
        parcel.writeString(subtotal)
        parcel.writeString(methodId)
        parcel.writeString(methodTitle)
        parcel.writeInt(totalLineItemsQuantity)
        parcel.writeString(totalTax)
        parcel.writeString(totalShipping)
        parcel.writeString(cartTax)
        parcel.writeString(shippingTax)
        parcel.writeString(totalDiscount)
        parcel.writeString(shippingMethods)
        parcel.writeString(note)
        parcel.writeString(customerIp)
        parcel.writeString(customerUserAgent)
        parcel.writeValue(customerId)
        parcel.writeString(viewOrderUrl)
        parcel.writeValue(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyOrder> {
        override fun createFromParcel(parcel: Parcel): MyOrder {
            return MyOrder(parcel)
        }

        override fun newArray(size: Int): Array<MyOrder?> {
            return arrayOfNulls(size)
        }
    }
}

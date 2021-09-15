package com.woocom.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.ArrayList
import java.util.Date


class Product : Serializable {

    var id: Int = 0
    var name: String = ""
    var slug: String? = null
    var permalink: String? = null
    var type: String? = null
    var status: String = ""
    var isFeatured: Boolean = false
    var catalog_visibility: String = ""
    var description: String = ""
    var short_description: String = ""
    var sku: String = ""
    var price: String = "0"
    var regular_price: String = "0"
    var sale_price: String = "0"
    var date_on_sale_from: Date? = null
    var date_on_sale_from_gmt: Date? = null
    var date_on_sale_to: Date? = null
    var date_on_sale_to_gmt: Date? = null
    var price_html: String = ""
    var on_sale: Boolean = false
    var cartQuantity: Int = 0
    var isPurchasable: Boolean = false
    var total_sales: Int = 0
    var isVirtual: Boolean = false
    var isEmpty: Boolean = false
    var isDownloadable: Boolean = false
    var downloads: ArrayList<Download> = ArrayList()
    var download_limit: Int = 0
    var download_expiry: Int = 0
    var external_url: String = ""
    var button_text: String = ""
    var tax_status: String = ""
    var tax_class: String = ""
    var isManage_stock: Boolean = false
    var stock_quantity: Int = 0
    var isIn_stock: Boolean = false
    var backorders: String = ""
    var isBackorders_allowed: Boolean = false
    var isBackordered: Boolean = false
    var isSold_individually: Boolean = false
    var weight: String = ""
    lateinit var dimensions: Any
    var isShipping_required: Boolean = false
    var isShipping_taxable: Boolean = false
    var shipping_class: String = ""
    var stock_status: String = ""
    var shipping_class_id: Int = 0
    var isReviews_allowed: Boolean = false
    var average_rating: String = ""
    var rating_count: Int = 0
    var related_ids: ArrayList<Int> = ArrayList()
    var upsell_ids: ArrayList<Int> = ArrayList()
    var cross_sell_ids: ArrayList<Int> = ArrayList()
    var parent_id: Int = 0
    var purchase_note: String = ""
    var categories: ArrayList<Category> = ArrayList()
    var tags: ArrayList<Tag> = ArrayList()

    @SerializedName("attributes")
    lateinit var productAttributes: ArrayList<ProductAttribute>

    lateinit var default_attributes: ArrayList<DefaultAttribute>
    lateinit var variations: ArrayList<Int>
    lateinit var grouped_products: ArrayList<Int>
    var menu_order: Int = 0
    lateinit var meta_data: ArrayList<Metadata>
    lateinit var images: ArrayList<Image>

    var dummyImage: Int = 0
    fun getFeatureImage(): String {
        if (this.images.isEmpty()) {
            return ""
        }

        return this.images.first().src!!
    }
}


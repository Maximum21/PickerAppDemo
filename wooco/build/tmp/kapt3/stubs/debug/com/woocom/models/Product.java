package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0007\u0010\u00d2\u0001\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010\'R\u001c\u0010+\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\u001c\u0010.\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010%\"\u0004\b0\u0010\'R \u00101\u001a\b\u0012\u0004\u0012\u0002020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001a\u00105\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0012\"\u0004\b@\u0010\u0014R\u001a\u0010A\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0012\"\u0004\bC\u0010\u0014R \u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001c\"\u0004\bG\u0010\u001eR\u001a\u0010H\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0012\"\u0004\bJ\u0010\u0014R\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001c\"\u0004\bP\u0010\u001eR\u001a\u0010Q\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0012\"\u0004\bS\u0010\u0014R \u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u001c\"\u0004\bW\u0010\u001eR\u001a\u0010X\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010\\R\u001a\u0010_\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\u001a\u0010a\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010Z\"\u0004\bb\u0010\\R\u001a\u0010c\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010Z\"\u0004\bd\u0010\\R\u001a\u0010e\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010Z\"\u0004\bf\u0010\\R\u001a\u0010g\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010Z\"\u0004\bh\u0010\\R\u001a\u0010i\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010Z\"\u0004\bj\u0010\\R\u001a\u0010k\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010Z\"\u0004\bl\u0010\\R\u001a\u0010m\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010Z\"\u0004\bn\u0010\\R\u001a\u0010o\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010Z\"\u0004\bp\u0010\\R\u001a\u0010q\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010Z\"\u0004\br\u0010\\R\u001a\u0010s\u001a\u00020YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010Z\"\u0004\bt\u0010\\R\u001a\u0010u\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0012\"\u0004\bw\u0010\u0014R \u0010x\u001a\b\u0012\u0004\u0012\u00020y0\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u001c\"\u0004\b{\u0010\u001eR\u001a\u0010|\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0006\"\u0004\b~\u0010\bR\u001c\u0010\u007f\u001a\u00020YX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010Z\"\u0005\b\u0081\u0001\u0010\\R\u001d\u0010\u0082\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0012\"\u0005\b\u0084\u0001\u0010\u0014R\u001f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0006\"\u0005\b\u0087\u0001\u0010\bR\u001d\u0010\u0088\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0006\"\u0005\b\u008a\u0001\u0010\bR\u001d\u0010\u008b\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0006\"\u0005\b\u008d\u0001\u0010\bR(\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\u001c\"\u0005\b\u0091\u0001\u0010\u001eR\u001d\u0010\u0092\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010\u0006\"\u0005\b\u0094\u0001\u0010\bR\u001d\u0010\u0095\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010\u0012\"\u0005\b\u0097\u0001\u0010\u0014R\u001d\u0010\u0098\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010\u0006\"\u0005\b\u009a\u0001\u0010\bR#\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010\u001c\"\u0005\b\u009d\u0001\u0010\u001eR\u001d\u0010\u009e\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010\u0006\"\u0005\b\u00a0\u0001\u0010\bR\u001d\u0010\u00a1\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a2\u0001\u0010\u0006\"\u0005\b\u00a3\u0001\u0010\bR\u001d\u0010\u00a4\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a5\u0001\u0010\u0012\"\u0005\b\u00a6\u0001\u0010\u0014R\u001d\u0010\u00a7\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a8\u0001\u0010\u0006\"\u0005\b\u00a9\u0001\u0010\bR\u001d\u0010\u00aa\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ab\u0001\u0010\u0006\"\u0005\b\u00ac\u0001\u0010\bR\u001f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ae\u0001\u0010\u0006\"\u0005\b\u00af\u0001\u0010\bR\u001d\u0010\u00b0\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b1\u0001\u0010\u0006\"\u0005\b\u00b2\u0001\u0010\bR\u001d\u0010\u00b3\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b4\u0001\u0010\u0012\"\u0005\b\u00b5\u0001\u0010\u0014R\u001d\u0010\u00b6\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b7\u0001\u0010\u0006\"\u0005\b\u00b8\u0001\u0010\bR$\u0010\u00b9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ba\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0001\u0010\u001c\"\u0005\b\u00bc\u0001\u0010\u001eR\u001d\u0010\u00bd\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0001\u0010\u0006\"\u0005\b\u00bf\u0001\u0010\bR\u001d\u0010\u00c0\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0001\u0010\u0006\"\u0005\b\u00c2\u0001\u0010\bR\u001d\u0010\u00c3\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0001\u0010\u0012\"\u0005\b\u00c5\u0001\u0010\u0014R\u001f\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0001\u0010\u0006\"\u0005\b\u00c8\u0001\u0010\bR#\u0010\u00c9\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0001\u0010\u001c\"\u0005\b\u00cb\u0001\u0010\u001eR#\u0010\u00cc\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019X\u0086.\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cd\u0001\u0010\u001c\"\u0005\b\u00ce\u0001\u0010\u001eR\u001d\u0010\u00cf\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d0\u0001\u0010\u0006\"\u0005\b\u00d1\u0001\u0010\b\u00a8\u0006\u00d3\u0001"}, d2 = {"Lcom/woocom/models/Product;", "Ljava/io/Serializable;", "()V", "average_rating", "", "getAverage_rating", "()Ljava/lang/String;", "setAverage_rating", "(Ljava/lang/String;)V", "backorders", "getBackorders", "setBackorders", "button_text", "getButton_text", "setButton_text", "cartQuantity", "", "getCartQuantity", "()I", "setCartQuantity", "(I)V", "catalog_visibility", "getCatalog_visibility", "setCatalog_visibility", "categories", "Ljava/util/ArrayList;", "Lcom/woocom/models/Category;", "getCategories", "()Ljava/util/ArrayList;", "setCategories", "(Ljava/util/ArrayList;)V", "cross_sell_ids", "getCross_sell_ids", "setCross_sell_ids", "date_on_sale_from", "Ljava/util/Date;", "getDate_on_sale_from", "()Ljava/util/Date;", "setDate_on_sale_from", "(Ljava/util/Date;)V", "date_on_sale_from_gmt", "getDate_on_sale_from_gmt", "setDate_on_sale_from_gmt", "date_on_sale_to", "getDate_on_sale_to", "setDate_on_sale_to", "date_on_sale_to_gmt", "getDate_on_sale_to_gmt", "setDate_on_sale_to_gmt", "default_attributes", "Lcom/woocom/models/DefaultAttribute;", "getDefault_attributes", "setDefault_attributes", "description", "getDescription", "setDescription", "dimensions", "", "getDimensions", "()Ljava/lang/Object;", "setDimensions", "(Ljava/lang/Object;)V", "download_expiry", "getDownload_expiry", "setDownload_expiry", "download_limit", "getDownload_limit", "setDownload_limit", "downloads", "Lcom/woocom/models/Download;", "getDownloads", "setDownloads", "dummyImage", "getDummyImage", "setDummyImage", "external_url", "getExternal_url", "setExternal_url", "grouped_products", "getGrouped_products", "setGrouped_products", "id", "getId", "setId", "images", "Lcom/woocom/models/Image;", "getImages", "setImages", "isBackordered", "", "()Z", "setBackordered", "(Z)V", "isBackorders_allowed", "setBackorders_allowed", "isDownloadable", "setDownloadable", "isEmpty", "setEmpty", "isFeatured", "setFeatured", "isIn_stock", "setIn_stock", "isManage_stock", "setManage_stock", "isPurchasable", "setPurchasable", "isReviews_allowed", "setReviews_allowed", "isShipping_required", "setShipping_required", "isShipping_taxable", "setShipping_taxable", "isSold_individually", "setSold_individually", "isVirtual", "setVirtual", "menu_order", "getMenu_order", "setMenu_order", "meta_data", "Lcom/woocom/models/Metadata;", "getMeta_data", "setMeta_data", "name", "getName", "setName", "on_sale", "getOn_sale", "setOn_sale", "parent_id", "getParent_id", "setParent_id", "permalink", "getPermalink", "setPermalink", "price", "getPrice", "setPrice", "price_html", "getPrice_html", "setPrice_html", "productAttributes", "Lcom/woocom/models/ProductAttribute;", "getProductAttributes", "setProductAttributes", "purchase_note", "getPurchase_note", "setPurchase_note", "rating_count", "getRating_count", "setRating_count", "regular_price", "getRegular_price", "setRegular_price", "related_ids", "getRelated_ids", "setRelated_ids", "sale_price", "getSale_price", "setSale_price", "shipping_class", "getShipping_class", "setShipping_class", "shipping_class_id", "getShipping_class_id", "setShipping_class_id", "short_description", "getShort_description", "setShort_description", "sku", "getSku", "setSku", "slug", "getSlug", "setSlug", "status", "getStatus", "setStatus", "stock_quantity", "getStock_quantity", "setStock_quantity", "stock_status", "getStock_status", "setStock_status", "tags", "Lcom/woocom/models/Tag;", "getTags", "setTags", "tax_class", "getTax_class", "setTax_class", "tax_status", "getTax_status", "setTax_status", "total_sales", "getTotal_sales", "setTotal_sales", "type", "getType", "setType", "upsell_ids", "getUpsell_ids", "setUpsell_ids", "variations", "getVariations", "setVariations", "weight", "getWeight", "setWeight", "getFeatureImage", "wooco_debug"})
public final class Product implements java.io.Serializable {
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String slug;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String permalink;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status = "";
    private boolean isFeatured = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String catalog_visibility = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String short_description = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sku = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String price = "0";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String regular_price = "0";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sale_price = "0";
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date_on_sale_from;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date_on_sale_from_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date_on_sale_to;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date_on_sale_to_gmt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String price_html = "";
    private boolean on_sale = false;
    private int cartQuantity = 0;
    private boolean isPurchasable = false;
    private int total_sales = 0;
    private boolean isVirtual = false;
    private boolean isEmpty = false;
    private boolean isDownloadable = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.woocom.models.Download> downloads;
    private int download_limit = 0;
    private int download_expiry = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String external_url = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String button_text = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tax_status = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tax_class = "";
    private boolean isManage_stock = false;
    private int stock_quantity = 0;
    private boolean isIn_stock = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String backorders = "";
    private boolean isBackorders_allowed = false;
    private boolean isBackordered = false;
    private boolean isSold_individually = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String weight = "";
    public java.lang.Object dimensions;
    private boolean isShipping_required = false;
    private boolean isShipping_taxable = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shipping_class = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stock_status = "";
    private int shipping_class_id = 0;
    private boolean isReviews_allowed = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String average_rating = "";
    private int rating_count = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> related_ids;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> upsell_ids;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> cross_sell_ids;
    private int parent_id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String purchase_note = "";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.woocom.models.Category> categories;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.woocom.models.Tag> tags;
    @com.google.gson.annotations.SerializedName(value = "attributes")
    public java.util.ArrayList<com.woocom.models.ProductAttribute> productAttributes;
    public java.util.ArrayList<com.woocom.models.DefaultAttribute> default_attributes;
    public java.util.ArrayList<java.lang.Integer> variations;
    public java.util.ArrayList<java.lang.Integer> grouped_products;
    private int menu_order = 0;
    public java.util.ArrayList<com.woocom.models.Metadata> meta_data;
    public java.util.ArrayList<com.woocom.models.Image> images;
    private int dummyImage = 0;
    
    public Product() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPermalink() {
        return null;
    }
    
    public final void setPermalink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isFeatured() {
        return false;
    }
    
    public final void setFeatured(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCatalog_visibility() {
        return null;
    }
    
    public final void setCatalog_visibility(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShort_description() {
        return null;
    }
    
    public final void setShort_description(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSku() {
        return null;
    }
    
    public final void setSku(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegular_price() {
        return null;
    }
    
    public final void setRegular_price(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSale_price() {
        return null;
    }
    
    public final void setSale_price(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate_on_sale_from() {
        return null;
    }
    
    public final void setDate_on_sale_from(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate_on_sale_from_gmt() {
        return null;
    }
    
    public final void setDate_on_sale_from_gmt(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate_on_sale_to() {
        return null;
    }
    
    public final void setDate_on_sale_to(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate_on_sale_to_gmt() {
        return null;
    }
    
    public final void setDate_on_sale_to_gmt(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice_html() {
        return null;
    }
    
    public final void setPrice_html(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getOn_sale() {
        return false;
    }
    
    public final void setOn_sale(boolean p0) {
    }
    
    public final int getCartQuantity() {
        return 0;
    }
    
    public final void setCartQuantity(int p0) {
    }
    
    public final boolean isPurchasable() {
        return false;
    }
    
    public final void setPurchasable(boolean p0) {
    }
    
    public final int getTotal_sales() {
        return 0;
    }
    
    public final void setTotal_sales(int p0) {
    }
    
    public final boolean isVirtual() {
        return false;
    }
    
    public final void setVirtual(boolean p0) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final void setEmpty(boolean p0) {
    }
    
    public final boolean isDownloadable() {
        return false;
    }
    
    public final void setDownloadable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.Download> getDownloads() {
        return null;
    }
    
    public final void setDownloads(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.Download> p0) {
    }
    
    public final int getDownload_limit() {
        return 0;
    }
    
    public final void setDownload_limit(int p0) {
    }
    
    public final int getDownload_expiry() {
        return 0;
    }
    
    public final void setDownload_expiry(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExternal_url() {
        return null;
    }
    
    public final void setExternal_url(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getButton_text() {
        return null;
    }
    
    public final void setButton_text(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax_status() {
        return null;
    }
    
    public final void setTax_status(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTax_class() {
        return null;
    }
    
    public final void setTax_class(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isManage_stock() {
        return false;
    }
    
    public final void setManage_stock(boolean p0) {
    }
    
    public final int getStock_quantity() {
        return 0;
    }
    
    public final void setStock_quantity(int p0) {
    }
    
    public final boolean isIn_stock() {
        return false;
    }
    
    public final void setIn_stock(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBackorders() {
        return null;
    }
    
    public final void setBackorders(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isBackorders_allowed() {
        return false;
    }
    
    public final void setBackorders_allowed(boolean p0) {
    }
    
    public final boolean isBackordered() {
        return false;
    }
    
    public final void setBackordered(boolean p0) {
    }
    
    public final boolean isSold_individually() {
        return false;
    }
    
    public final void setSold_individually(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeight() {
        return null;
    }
    
    public final void setWeight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDimensions() {
        return null;
    }
    
    public final void setDimensions(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    public final boolean isShipping_required() {
        return false;
    }
    
    public final void setShipping_required(boolean p0) {
    }
    
    public final boolean isShipping_taxable() {
        return false;
    }
    
    public final void setShipping_taxable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShipping_class() {
        return null;
    }
    
    public final void setShipping_class(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStock_status() {
        return null;
    }
    
    public final void setStock_status(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getShipping_class_id() {
        return 0;
    }
    
    public final void setShipping_class_id(int p0) {
    }
    
    public final boolean isReviews_allowed() {
        return false;
    }
    
    public final void setReviews_allowed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAverage_rating() {
        return null;
    }
    
    public final void setAverage_rating(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getRating_count() {
        return 0;
    }
    
    public final void setRating_count(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getRelated_ids() {
        return null;
    }
    
    public final void setRelated_ids(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getUpsell_ids() {
        return null;
    }
    
    public final void setUpsell_ids(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getCross_sell_ids() {
        return null;
    }
    
    public final void setCross_sell_ids(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    public final int getParent_id() {
        return 0;
    }
    
    public final void setParent_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchase_note() {
        return null;
    }
    
    public final void setPurchase_note(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.Category> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.Tag> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.Tag> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.ProductAttribute> getProductAttributes() {
        return null;
    }
    
    public final void setProductAttributes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.ProductAttribute> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.DefaultAttribute> getDefault_attributes() {
        return null;
    }
    
    public final void setDefault_attributes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.DefaultAttribute> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getVariations() {
        return null;
    }
    
    public final void setVariations(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getGrouped_products() {
        return null;
    }
    
    public final void setGrouped_products(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    public final int getMenu_order() {
        return 0;
    }
    
    public final void setMenu_order(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.Metadata> getMeta_data() {
        return null;
    }
    
    public final void setMeta_data(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.Metadata> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.Image> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.Image> p0) {
    }
    
    public final int getDummyImage() {
        return 0;
    }
    
    public final void setDummyImage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeatureImage() {
        return null;
    }
}
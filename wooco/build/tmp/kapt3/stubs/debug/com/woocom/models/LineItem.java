package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001e\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020\u0001X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\u001a\u0010-\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\u001a\u00100\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u000f\u00a8\u00063"}, d2 = {"Lcom/woocom/models/LineItem;", "", "()V", "meta_data", "", "Lcom/woocom/models/Metum;", "getMeta_data", "()Ljava/util/List;", "setMeta_data", "(Ljava/util/List;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "price", "getPrice", "setPrice", "productId", "", "getProductId", "()I", "setProductId", "(I)V", "quantity", "getQuantity", "setQuantity", "sku", "getSku", "setSku", "subtotal", "getSubtotal", "setSubtotal", "subtotalTax", "getSubtotalTax", "setSubtotalTax", "taxClass", "getTaxClass", "()Ljava/lang/Object;", "setTaxClass", "(Ljava/lang/Object;)V", "total", "getTotal", "setTotal", "totalTax", "getTotalTax", "setTotalTax", "variations", "getVariations", "setVariations", "wooco_debug"})
public final class LineItem {
    public java.lang.String subtotal;
    @com.google.gson.annotations.SerializedName(value = "subtotal_tax")
    public java.lang.String subtotalTax;
    public java.lang.String total;
    public java.lang.String totalTax;
    public java.lang.String price;
    private int quantity = 0;
    public java.lang.Object taxClass;
    public java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "product_id")
    private int productId = 0;
    public java.lang.String sku;
    public java.lang.String variations;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.woocom.models.Metum> meta_data;
    
    public LineItem() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubtotal() {
        return null;
    }
    
    public final void setSubtotal(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubtotalTax() {
        return null;
    }
    
    public final void setSubtotalTax(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalTax() {
        return null;
    }
    
    public final void setTotalTax(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrice() {
        return null;
    }
    
    public final void setPrice(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTaxClass() {
        return null;
    }
    
    public final void setTaxClass(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getProductId() {
        return 0;
    }
    
    public final void setProductId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSku() {
        return null;
    }
    
    public final void setSku(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVariations() {
        return null;
    }
    
    public final void setVariations(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocom.models.Metum> getMeta_data() {
        return null;
    }
    
    public final void setMeta_data(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocom.models.Metum> p0) {
    }
}
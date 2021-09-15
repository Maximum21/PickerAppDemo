package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0001X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001e\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u0001X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\b\u00a8\u00065"}, d2 = {"Lcom/woocom/models/MyLineItem;", "", "()V", "barcode", "", "getBarcode", "()Ljava/lang/String;", "setBarcode", "(Ljava/lang/String;)V", "image_url", "getImage_url", "setImage_url", "name", "getName", "setName", "points", "getPoints", "()Ljava/lang/Object;", "setPoints", "(Ljava/lang/Object;)V", "price", "getPrice", "setPrice", "productId", "", "getProductId", "()I", "setProductId", "(I)V", "quantity", "getQuantity", "setQuantity", "sku", "getSku", "setSku", "subtotal", "getSubtotal", "setSubtotal", "subtotalTax", "getSubtotalTax", "setSubtotalTax", "taxClass", "getTaxClass", "setTaxClass", "total", "getTotal", "setTotal", "totalTax", "getTotalTax", "setTotalTax", "variations", "getVariations", "setVariations", "wooco_debug"})
public final class MyLineItem {
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
    public java.lang.String barcode;
    public java.lang.String image_url;
    public java.lang.Object points;
    
    public MyLineItem() {
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
    public final java.lang.String getBarcode() {
        return null;
    }
    
    public final void setBarcode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage_url() {
        return null;
    }
    
    public final void setImage_url(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPoints() {
        return null;
    }
    
    public final void setPoints(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
}
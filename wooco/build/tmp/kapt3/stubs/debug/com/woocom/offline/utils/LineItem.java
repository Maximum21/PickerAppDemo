package com.woocom.offline.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0002\u0010\u0013R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001b\u00a8\u00066"}, d2 = {"Lcom/woocom/offline/utils/LineItem;", "", "subtotal", "", "subtotalTax", "total", "totalTax", "price", "quantity", "", "taxClass", "name", "", "productId", "sku", "variations", "meta", "", "Lcom/woocom/offline/utils/Metum;", "(FFFFFILjava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMeta", "()Ljava/util/List;", "setMeta", "(Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPrice", "()F", "setPrice", "(F)V", "getProductId", "()I", "setProductId", "(I)V", "getQuantity", "setQuantity", "getSku", "setSku", "getSubtotal", "setSubtotal", "getSubtotalTax", "setSubtotalTax", "getTaxClass", "()Ljava/lang/Object;", "setTaxClass", "(Ljava/lang/Object;)V", "getTotal", "setTotal", "getTotalTax", "setTotalTax", "getVariations", "setVariations", "wooco_debug"})
public final class LineItem {
    private float subtotal;
    private float subtotalTax;
    private float total;
    private float totalTax;
    private float price;
    private int quantity;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object taxClass;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private int productId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sku;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String variations;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.woocom.offline.utils.Metum> meta;
    
    public LineItem(float subtotal, float subtotalTax, float total, float totalTax, float price, int quantity, @org.jetbrains.annotations.NotNull()
    java.lang.Object taxClass, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int productId, @org.jetbrains.annotations.NotNull()
    java.lang.String sku, @org.jetbrains.annotations.NotNull()
    java.lang.String variations, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocom.offline.utils.Metum> meta) {
        super();
    }
    
    public final float getSubtotal() {
        return 0.0F;
    }
    
    public final void setSubtotal(float p0) {
    }
    
    public final float getSubtotalTax() {
        return 0.0F;
    }
    
    public final void setSubtotalTax(float p0) {
    }
    
    public final float getTotal() {
        return 0.0F;
    }
    
    public final void setTotal(float p0) {
    }
    
    public final float getTotalTax() {
        return 0.0F;
    }
    
    public final void setTotalTax(float p0) {
    }
    
    public final float getPrice() {
        return 0.0F;
    }
    
    public final void setPrice(float p0) {
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
    public final java.util.List<com.woocom.offline.utils.Metum> getMeta() {
        return null;
    }
    
    public final void setMeta(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocom.offline.utils.Metum> p0) {
    }
}
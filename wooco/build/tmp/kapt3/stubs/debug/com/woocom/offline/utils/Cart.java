package com.woocom.offline.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00170\u0019\u00a2\u0006\u0002\u0010\u001bJ\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u000bH\u00c6\u0003J\t\u0010J\u001a\u00020\u000bH\u00c6\u0003J\t\u0010K\u001a\u00020\u000bH\u00c6\u0003J\t\u0010L\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u00c6\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u00c6\u0003J\u0015\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00170\u0019H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\tH\u00c6\u0003J\t\u0010T\u001a\u00020\u000bH\u00c6\u0003J\t\u0010U\u001a\u00020\u000bH\u00c6\u0003J\t\u0010V\u001a\u00020\u000bH\u00c6\u0003J\t\u0010W\u001a\u00020\u000bH\u00c6\u0003J\u00c1\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00170\u0019H\u00c6\u0001J\u0013\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00d6\u0001J\t\u0010]\u001a\u00020\tH\u00d6\u0001R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00170\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010%\"\u0004\b9\u0010\'R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010\u001f\u00a8\u0006^"}, d2 = {"Lcom/woocom/offline/utils/Cart;", "", "id", "", "dateCreated", "Ljava/util/Date;", "dateUpdate", "completedAt", "currency", "", "total", "", "subtotal", "totalLineItemsQuantity", "totalTax", "totalShipping", "cartTax", "shippingTax", "totalDiscount", "lineItems", "", "Lcom/woocom/offline/utils/LineItem;", "couponLines", "", "items", "Landroidx/lifecycle/LiveData;", "Lcom/woocom/offline/utils/CartItem;", "(ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;FFFFFFFFLjava/util/List;Ljava/util/List;Landroidx/lifecycle/LiveData;)V", "getCartTax", "()F", "setCartTax", "(F)V", "getCompletedAt", "()Ljava/util/Date;", "setCompletedAt", "(Ljava/util/Date;)V", "getCouponLines", "()Ljava/util/List;", "setCouponLines", "(Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getDateCreated", "setDateCreated", "getDateUpdate", "setDateUpdate", "getId", "()I", "setId", "(I)V", "getItems", "()Landroidx/lifecycle/LiveData;", "setItems", "(Landroidx/lifecycle/LiveData;)V", "getLineItems", "setLineItems", "getShippingTax", "setShippingTax", "getSubtotal", "setSubtotal", "getTotal", "setTotal", "getTotalDiscount", "setTotalDiscount", "getTotalLineItemsQuantity", "setTotalLineItemsQuantity", "getTotalShipping", "setTotalShipping", "getTotalTax", "setTotalTax", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "wooco_debug"})
public final class Cart {
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date dateCreated;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date dateUpdate;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date completedAt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency;
    private float total;
    private float subtotal;
    private float totalLineItemsQuantity;
    private float totalTax;
    private float totalShipping;
    private float cartTax;
    private float shippingTax;
    private float totalDiscount;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.woocom.offline.utils.LineItem> lineItems;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends java.lang.Object> couponLines;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.woocom.offline.utils.CartItem>> items;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.offline.utils.Cart copy(int id, @org.jetbrains.annotations.NotNull()
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull()
    java.util.Date dateUpdate, @org.jetbrains.annotations.NotNull()
    java.util.Date completedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, float total, float subtotal, float totalLineItemsQuantity, float totalTax, float totalShipping, float cartTax, float shippingTax, float totalDiscount, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocom.offline.utils.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> couponLines, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.woocom.offline.utils.CartItem>> items) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Cart(int id, @org.jetbrains.annotations.NotNull()
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull()
    java.util.Date dateUpdate, @org.jetbrains.annotations.NotNull()
    java.util.Date completedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, float total, float subtotal, float totalLineItemsQuantity, float totalTax, float totalShipping, float cartTax, float shippingTax, float totalDiscount, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocom.offline.utils.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> couponLines, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.woocom.offline.utils.CartItem>> items) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateCreated() {
        return null;
    }
    
    public final void setDateCreated(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDateUpdate() {
        return null;
    }
    
    public final void setDateUpdate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCompletedAt() {
        return null;
    }
    
    public final void setCompletedAt(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final float component6() {
        return 0.0F;
    }
    
    public final float getTotal() {
        return 0.0F;
    }
    
    public final void setTotal(float p0) {
    }
    
    public final float component7() {
        return 0.0F;
    }
    
    public final float getSubtotal() {
        return 0.0F;
    }
    
    public final void setSubtotal(float p0) {
    }
    
    public final float component8() {
        return 0.0F;
    }
    
    public final float getTotalLineItemsQuantity() {
        return 0.0F;
    }
    
    public final void setTotalLineItemsQuantity(float p0) {
    }
    
    public final float component9() {
        return 0.0F;
    }
    
    public final float getTotalTax() {
        return 0.0F;
    }
    
    public final void setTotalTax(float p0) {
    }
    
    public final float component10() {
        return 0.0F;
    }
    
    public final float getTotalShipping() {
        return 0.0F;
    }
    
    public final void setTotalShipping(float p0) {
    }
    
    public final float component11() {
        return 0.0F;
    }
    
    public final float getCartTax() {
        return 0.0F;
    }
    
    public final void setCartTax(float p0) {
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final float getShippingTax() {
        return 0.0F;
    }
    
    public final void setShippingTax(float p0) {
    }
    
    public final float component13() {
        return 0.0F;
    }
    
    public final float getTotalDiscount() {
        return 0.0F;
    }
    
    public final void setTotalDiscount(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocom.offline.utils.LineItem> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocom.offline.utils.LineItem> getLineItems() {
        return null;
    }
    
    public final void setLineItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocom.offline.utils.LineItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getCouponLines() {
        return null;
    }
    
    public final void setCouponLines(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocom.offline.utils.CartItem>> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.woocom.offline.utils.CartItem>> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.woocom.offline.utils.CartItem>> p0) {
    }
}
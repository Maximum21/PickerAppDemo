package com.woocom.offline.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\bK\b\u0086\b\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010D\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010H\u001a\u00020\rH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u00bc\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\r2\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001J\t\u0010W\u001a\u00020\u000bH\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010!\"\u0004\b:\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00100\"\u0004\b@\u00102R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001e\u00a8\u0006X"}, d2 = {"Lcom/woocom/offline/utils/CartItem;", "", "id", "", "createdAt", "", "modifiedAt", "productId", "variationId", "quantity", "productName", "", "onSale", "", "productSalePrice", "productPrice", "productImage", "productPoints", "productMeasurement", "priceChange", "itemKey", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemKey", "()Ljava/lang/String;", "setItemKey", "(Ljava/lang/String;)V", "getModifiedAt", "setModifiedAt", "getOnSale", "()Ljava/lang/Boolean;", "setOnSale", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPriceChange", "()Z", "setPriceChange", "(Z)V", "getProductId", "()I", "setProductId", "(I)V", "getProductImage", "setProductImage", "getProductMeasurement", "setProductMeasurement", "getProductName", "setProductName", "getProductPoints", "setProductPoints", "getProductPrice", "setProductPrice", "getProductSalePrice", "setProductSalePrice", "getQuantity", "setQuantity", "getVariationId", "setVariationId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/woocom/offline/utils/CartItem;", "equals", "other", "hashCode", "toString", "wooco_debug"})
public final class CartItem {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long createdAt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long modifiedAt;
    private int productId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer variationId;
    private int quantity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean onSale;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productSalePrice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productPrice;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productImage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productPoints;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String productMeasurement;
    private boolean priceChange;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String itemKey;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.offline.utils.CartItem copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Long createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long modifiedAt, int productId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer variationId, int quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean onSale, @org.jetbrains.annotations.Nullable()
    java.lang.String productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productImage, @org.jetbrains.annotations.Nullable()
    java.lang.String productPoints, @org.jetbrains.annotations.Nullable()
    java.lang.String productMeasurement, boolean priceChange, @org.jetbrains.annotations.Nullable()
    java.lang.String itemKey) {
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
    
    public CartItem() {
        super();
    }
    
    public CartItem(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Long createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long modifiedAt, int productId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer variationId, int quantity, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean onSale, @org.jetbrains.annotations.Nullable()
    java.lang.String productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productPrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productImage, @org.jetbrains.annotations.Nullable()
    java.lang.String productPoints, @org.jetbrains.annotations.Nullable()
    java.lang.String productMeasurement, boolean priceChange, @org.jetbrains.annotations.Nullable()
    java.lang.String itemKey) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getModifiedAt() {
        return null;
    }
    
    public final void setModifiedAt(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getProductId() {
        return 0;
    }
    
    public final void setProductId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVariationId() {
        return null;
    }
    
    public final void setVariationId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOnSale() {
        return null;
    }
    
    public final void setOnSale(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductSalePrice() {
        return null;
    }
    
    public final void setProductSalePrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductPrice() {
        return null;
    }
    
    public final void setProductPrice(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductImage() {
        return null;
    }
    
    public final void setProductImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductPoints() {
        return null;
    }
    
    public final void setProductPoints(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductMeasurement() {
        return null;
    }
    
    public final void setProductMeasurement(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getPriceChange() {
        return false;
    }
    
    public final void setPriceChange(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItemKey() {
        return null;
    }
    
    public final void setItemKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}
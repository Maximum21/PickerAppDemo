package com.woocom.offline;

import java.lang.System;

@androidx.room.Entity(tableName = "cart_item")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001B\u00a7\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010?\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010I\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u00b2\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010MJ\u0013\u0010N\u001a\u00020\u00102\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001J\t\u0010Q\u001a\u00020\u000bH\u00d6\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R \u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R \u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R \u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010 \"\u0004\b7\u0010\"R \u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u0010\u001d\u00a8\u0006R"}, d2 = {"Lcom/woocom/offline/CartItemEntity;", "", "id", "", "createdAt", "", "modifiedAt", "productId", "quantity", "variationId", "productName", "", "productPoints", "productMeasurement", "productPrice", "onSale", "", "productSalePrice", "productImage", "itemKey", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemKey", "()Ljava/lang/String;", "setItemKey", "(Ljava/lang/String;)V", "getModifiedAt", "setModifiedAt", "getOnSale", "()Ljava/lang/Boolean;", "setOnSale", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getProductId", "()I", "setProductId", "(I)V", "getProductImage", "setProductImage", "getProductMeasurement", "setProductMeasurement", "getProductName", "setProductName", "getProductPoints", "setProductPoints", "getProductPrice", "setProductPrice", "getProductSalePrice", "setProductSalePrice", "getQuantity", "setQuantity", "getVariationId", "setVariationId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/woocom/offline/CartItemEntity;", "equals", "other", "hashCode", "toString", "wooco_debug"})
public final class CartItemEntity {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.PrimaryKey(autoGenerate = true)
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "created_at")
    private java.lang.Long createdAt;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "modified_at")
    private java.lang.Long modifiedAt;
    @androidx.room.ColumnInfo(name = "product_id")
    private int productId;
    @androidx.room.ColumnInfo(name = "quantity")
    private int quantity;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "variation_id")
    private java.lang.Integer variationId;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "product_name")
    private java.lang.String productName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "product_points")
    private java.lang.String productPoints;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "product_measurements")
    private java.lang.String productMeasurement;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "product_price")
    private java.lang.String productPrice;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "on_sale")
    private java.lang.Boolean onSale;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "product_sale_price")
    private java.lang.String productSalePrice;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "product_image")
    private java.lang.String productImage;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "item_key")
    private java.lang.String itemKey;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.offline.CartItemEntity copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Long createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long modifiedAt, int productId, int quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer variationId, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productPoints, @org.jetbrains.annotations.Nullable()
    java.lang.String productMeasurement, @org.jetbrains.annotations.Nullable()
    java.lang.String productPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean onSale, @org.jetbrains.annotations.Nullable()
    java.lang.String productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productImage, @org.jetbrains.annotations.Nullable()
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
    
    public CartItemEntity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Long createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long modifiedAt, int productId, int quantity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer variationId, @org.jetbrains.annotations.Nullable()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productPoints, @org.jetbrains.annotations.Nullable()
    java.lang.String productMeasurement, @org.jetbrains.annotations.Nullable()
    java.lang.String productPrice, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean onSale, @org.jetbrains.annotations.Nullable()
    java.lang.String productSalePrice, @org.jetbrains.annotations.Nullable()
    java.lang.String productImage, @org.jetbrains.annotations.Nullable()
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
    
    public final int component5() {
        return 0;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVariationId() {
        return null;
    }
    
    public final void setVariationId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
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
    public final java.lang.String component8() {
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
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductMeasurement() {
        return null;
    }
    
    public final void setProductMeasurement(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.Boolean component11() {
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
    public final java.lang.String component12() {
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
    public final java.lang.String component13() {
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
    public final java.lang.String component14() {
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
package com.woocom.offline;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\'J\b\u0010\t\u001a\u00020\u0006H\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u0004H\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\'J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0010\u001a\u00020\u0004H\u00a7\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u0004H\'J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\'\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\u0003H\'J\u0012\u0010\u0016\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\'\u00a8\u0006\u0017"}, d2 = {"Lcom/woocom/offline/CartItemDao;", "", "count", "Landroidx/lifecycle/LiveData;", "", "delete", "", "category", "Lcom/woocom/offline/CartItemEntity;", "deleteAll", "exists", "", "productId", "fetchAll", "", "get", "id", "getQuantity", "insert", "", "(Lcom/woocom/offline/CartItemEntity;)Ljava/lang/Long;", "items", "update", "wooco_debug"})
public abstract interface CartItemDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Long insert(@org.jetbrains.annotations.Nullable()
    com.woocom.offline.CartItemEntity category);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM cart_item ORDER BY created_at desc")
    public abstract java.util.List<com.woocom.offline.CartItemEntity> fetchAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM cart_item ORDER BY created_at desc")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.woocom.offline.CartItemEntity>> items();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM cart_item")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> count();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM cart_item where product_id = :productId")
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> exists(int productId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT quantity FROM cart_item where product_id = :productId")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getQuantity(int productId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM cart_item WHERE id =:id")
    public abstract androidx.lifecycle.LiveData<com.woocom.offline.CartItemEntity> get(int id);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.Nullable()
    com.woocom.offline.CartItemEntity category);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.Nullable()
    com.woocom.offline.CartItemEntity category);
    
    @androidx.room.Query(value = "DELETE FROM cart_item")
    public abstract void deleteAll();
}
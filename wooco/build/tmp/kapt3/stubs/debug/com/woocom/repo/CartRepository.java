package com.woocom.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\rJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0013\u001a\u00020\u0003J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocom/repo/CartRepository;", "", "baseUrl", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getBaseUrl$wooco_debug", "()Ljava/lang/String;", "setBaseUrl$wooco_debug", "(Ljava/lang/String;)V", "cartRepository", "Lcom/woocom/cocart/CoCartRepository;", "addToCart", "Lretrofit2/Call;", "Lcom/woocom/cocart/CoCart;", "productId", "quantity", "clear", "delete", "item_key", "update", "cartBody", "Lcom/woocom/data/api/CartBody;", "wooco_debug"})
public final class CartRepository {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String baseUrl;
    private com.woocom.cocart.CoCartRepository cartRepository;
    
    public CartRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl$wooco_debug() {
        return null;
    }
    
    public final void setBaseUrl$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.cocart.CoCart> addToCart(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String quantity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.lang.String> clear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.lang.String> update(@org.jetbrains.annotations.NotNull()
    java.lang.String item_key, @org.jetbrains.annotations.NotNull()
    com.woocom.data.api.CartBody cartBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.lang.String> delete(@org.jetbrains.annotations.NotNull()
    java.lang.String item_key) {
        return null;
    }
}
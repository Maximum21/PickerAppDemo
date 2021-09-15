package com.woocom.cocart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003J\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00100\u000bJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0013\u001a\u00020\u0003J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocom/cocart/CoCartRepository;", "", "baseUrl", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "apiService", "Lcom/woocom/data/api/CartAPI;", "retrofit", "Lretrofit2/Retrofit;", "addToCart", "Lretrofit2/Call;", "Lcom/woocom/cocart/CoCart;", "productId", "quantity", "cart", "", "clear", "delete", "item_key", "update", "cartBody", "Lcom/woocom/data/api/CartBody;", "wooco_debug"})
public final class CoCartRepository {
    private com.woocom.data.api.CartAPI apiService;
    private retrofit2.Retrofit retrofit;
    
    public CoCartRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.cocart.CoCart> addToCart(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String quantity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.Map<java.lang.String, com.woocom.cocart.CoCart>> cart() {
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
package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\bH\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\bH\'J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00100\u0003H\'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/woocom/data/api/CartAPI;", "", "addToCart", "Lretrofit2/Call;", "Lcom/woocom/cocart/CoCart;", "body", "Lcom/woocom/cocart/CartItemRequest;", "clear", "", "delete", "item_key", "getWishlist", "Lcom/google/gson/JsonObject;", "Lcom/woocom/models/User;", "lang", "list", "", "update", "Lcom/woocom/data/api/CartBody;", "wooco_debug"})
public abstract interface CartAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "add-item")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.cocart.CoCart> addToCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.cocart.CartItemRequest body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.util.Map<java.lang.String, com.woocom.cocart.CoCart>> list();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "clear")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.lang.String> clear();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "item/{item_key}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.lang.String> update(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "item_key")
    java.lang.String item_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.data.api.CartBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "item/{item_key}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.lang.String> delete(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "item_key")
    java.lang.String item_key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "get_wishlisted_products")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.google.gson.JsonObject> getWishlist(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.User body, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lang")
    java.lang.String lang);
}
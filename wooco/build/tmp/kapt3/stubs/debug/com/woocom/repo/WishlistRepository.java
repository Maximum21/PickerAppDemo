package com.woocom.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocom/repo/WishlistRepository;", "", "baseUrl", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "apiService", "Lcom/woocom/data/api/CartAPI;", "retrofit", "Lretrofit2/Retrofit;", "getWishList", "Lretrofit2/Call;", "Lcom/google/gson/JsonObject;", "userId", "lang", "wooco_debug"})
public final class WishlistRepository {
    private com.woocom.data.api.CartAPI apiService;
    private retrofit2.Retrofit retrofit;
    
    public WishlistRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.google.gson.JsonObject> getWishList(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
}
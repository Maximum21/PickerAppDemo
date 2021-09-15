package com.woocom.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0003J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocom/repo/ShippingMethodRepository;", "Lcom/woocom/repo/WooRepository;", "baseUrl", "", "consumerKey", "consumerSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "apiService", "Lcom/woocom/data/api/ShippingMethodAPI;", "shippingMethod", "Lretrofit2/Call;", "Lcom/woocom/models/ShippingMethod;", "id", "shippingMethods", "", "wooco_debug"})
public final class ShippingMethodRepository extends com.woocom.repo.WooRepository {
    private final com.woocom.data.api.ShippingMethodAPI apiService = null;
    
    public ShippingMethodRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerKey, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerSecret) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.ShippingMethod> shippingMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.ShippingMethod>> shippingMethods() {
        return null;
    }
}
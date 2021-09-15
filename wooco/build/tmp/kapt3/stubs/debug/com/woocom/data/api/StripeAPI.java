package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J4\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/woocom/data/api/StripeAPI;", "", "create", "Lretrofit2/Call;", "", "body", "Lcom/woocom/models/Stripe;", "filter", "", "Lcom/woocom/models/Product;", "id", "", "wooco_debug"})
public abstract interface StripeAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "stripe_secret")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<java.lang.String> create(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Stripe body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "home_tab/{id}")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Product>> filter(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
}
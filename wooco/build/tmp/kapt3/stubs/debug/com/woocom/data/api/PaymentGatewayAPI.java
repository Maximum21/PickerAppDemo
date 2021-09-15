package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/woocom/data/api/PaymentGatewayAPI;", "", "list", "Lretrofit2/Call;", "", "Lcom/woocom/models/PaymentGateway;", "update", "id", "", "body", "view", "", "wooco_debug"})
public abstract interface PaymentGatewayAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "payment_gateways/{id}")
    public abstract retrofit2.Call<com.woocom.models.PaymentGateway> view(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "payment_gateways")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.PaymentGateway>> list();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "payment_gateways")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.PaymentGateway> update(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.PaymentGateway body);
}
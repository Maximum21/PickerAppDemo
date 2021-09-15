package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J4\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/woocom/data/api/RefundAPI;", "", "create", "Lretrofit2/Call;", "Lcom/woocom/models/Refund;", "order_id", "", "body", "delete", "refund_id", "force", "", "filter", "", "", "", "list", "view", "wooco_debug"})
public abstract interface RefundAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "orders/{id}/refunds")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Refund> create(@retrofit2.http.Path(value = "id")
    int order_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Refund body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "orders/{id}/refunds/{refund_id}")
    public abstract retrofit2.Call<com.woocom.models.Refund> view(@retrofit2.http.Path(value = "id")
    int order_id, @retrofit2.http.Path(value = "refund_id")
    int refund_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "orders/{id}/refunds")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Refund>> list(@retrofit2.http.Path(value = "id")
    int order_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "orders/{id}/refunds/{refund_id}")
    public abstract retrofit2.Call<com.woocom.models.Refund> delete(@retrofit2.http.Path(value = "id")
    int order_id, @retrofit2.http.Path(value = "refund_id")
    int refund_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "orders/{id}/refunds/{refund_id}")
    public abstract retrofit2.Call<com.woocom.models.Refund> delete(@retrofit2.http.Path(value = "id")
    int order_id, @retrofit2.http.Path(value = "refund_id")
    int refund_id, @retrofit2.http.Query(value = "force")
    boolean force);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "orders/{id}/refunds")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Refund>> filter(@retrofit2.http.Path(value = "id")
    int order_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
}
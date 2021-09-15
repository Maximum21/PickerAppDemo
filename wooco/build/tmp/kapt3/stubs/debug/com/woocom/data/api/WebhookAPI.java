package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\bH\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\bH\'J*\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u00032\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013H\'J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u0003H\'J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u0018"}, d2 = {"Lcom/woocom/data/api/WebhookAPI;", "", "create", "Lretrofit2/Call;", "Lcom/woocom/models/Webhook;", "body", "delete", "id", "", "force", "", "deliveries", "", "Lcom/woocom/models/WebhookDelivery;", "webhook_id", "delivery", "delivery_id", "filter", "Ljava/util/ArrayList;", "", "", "list", "update", "view", "wooco_debug"})
public abstract interface WebhookAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "webhooks")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Webhook> create(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Webhook body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "webhooks")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Webhook>> list();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "webhooks/{id}")
    public abstract retrofit2.Call<com.woocom.models.Webhook> view(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "webhooks/{id}/deliveries/{delivery_id}")
    public abstract retrofit2.Call<com.woocom.models.WebhookDelivery> delivery(@retrofit2.http.Path(value = "id")
    int webhook_id, @retrofit2.http.Path(value = "delivery_id")
    int delivery_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "webhooks/{id}/deliveries")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.WebhookDelivery>> deliveries(@retrofit2.http.Path(value = "id")
    int webhook_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "webhooks/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Webhook> update(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Webhook body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "webhooks/{id}")
    public abstract retrofit2.Call<com.woocom.models.Webhook> delete(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "webhooks/{id}")
    public abstract retrofit2.Call<com.woocom.models.Webhook> delete(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "force")
    boolean force);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "webhooks")
    public abstract retrofit2.Call<java.util.ArrayList<com.woocom.models.Webhook>> filter(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
}
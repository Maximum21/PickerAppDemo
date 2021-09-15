package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u00032\u0014\b\u0001\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fH\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u0003H\'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u0013"}, d2 = {"Lcom/woocom/data/api/ShippingClassAPI;", "", "batch", "Lretrofit2/Call;", "", "body", "Lcom/woocom/models/ShippingClass;", "create", "delete", "id", "", "force", "", "filter", "", "", "list", "update", "view", "wooco_debug"})
public abstract interface ShippingClassAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "products/shipping_classes")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.ShippingClass> create(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.ShippingClass body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/shipping_classes/{id}")
    public abstract retrofit2.Call<com.woocom.models.ShippingClass> view(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/shipping_classes")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.ShippingClass>> list();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "products/shipping_classes/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.ShippingClass> update(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.ShippingClass body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "products/shipping_classes/{id}")
    public abstract retrofit2.Call<com.woocom.models.ShippingClass> delete(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "products/shipping_classes/{id}")
    public abstract retrofit2.Call<com.woocom.models.ShippingClass> delete(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "force")
    boolean force);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "products/shipping_classes/batch")
    public abstract retrofit2.Call<java.lang.String> batch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.ShippingClass body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/shipping_classes")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.ShippingClass>> filter(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
}
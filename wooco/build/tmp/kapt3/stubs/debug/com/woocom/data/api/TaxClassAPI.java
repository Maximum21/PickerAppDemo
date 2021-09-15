package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\'J*\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u00032\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u0003H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/woocom/data/api/TaxClassAPI;", "", "create", "Lretrofit2/Call;", "Lcom/woocom/models/TaxClass;", "body", "delete", "id", "", "force", "", "filter", "Ljava/util/ArrayList;", "", "", "list", "", "wooco_debug"})
public abstract interface TaxClassAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "taxes/classes")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.TaxClass> create(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.TaxClass body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "taxes/classes")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.TaxClass>> list();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "taxes/classes/{id}")
    public abstract retrofit2.Call<com.woocom.models.TaxClass> delete(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "taxes/classes/{id}")
    public abstract retrofit2.Call<com.woocom.models.TaxClass> delete(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "force")
    boolean force);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "coupons")
    public abstract retrofit2.Call<java.util.ArrayList<com.woocom.models.TaxClass>> filter(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
}
package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0004H\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\'J4\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0004H\'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/woocom/data/api/ProductVariationAPI;", "", "batch", "Lretrofit2/Call;", "Lcom/woocom/models/Variation;", "product_id", "", "variation_id", "body", "Lcom/woocom/models/Product;", "create", "delete", "force", "", "filter", "", "", "", "list", "update", "view", "wooco_debug"})
public abstract interface ProductVariationAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "products/{id}/variations")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Variation> create(@retrofit2.http.Path(value = "id")
    int product_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Variation body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/{id}/variations/{variation_id}")
    public abstract retrofit2.Call<com.woocom.models.Variation> view(@retrofit2.http.Path(value = "id")
    int product_id, @retrofit2.http.Path(value = "variation_id")
    int variation_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/{id}/variations")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Variation>> list(@retrofit2.http.Path(value = "id")
    int product_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "products/{id}/variations/{variation_id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Variation> update(@retrofit2.http.Path(value = "id")
    int product_id, @retrofit2.http.Path(value = "variation_id")
    int variation_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Variation body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "products/{id}/variations/{variation_id}")
    public abstract retrofit2.Call<com.woocom.models.Variation> delete(@retrofit2.http.Path(value = "id")
    int product_id, @retrofit2.http.Path(value = "variation_id")
    int variation_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "products/{id}/variations/{variation_id}")
    public abstract retrofit2.Call<com.woocom.models.Variation> delete(@retrofit2.http.Path(value = "id")
    int product_id, @retrofit2.http.Path(value = "variation_id")
    int variation_id, @retrofit2.http.Query(value = "force")
    boolean force);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "products/{id}/variations/{variation_id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Variation> batch(@retrofit2.http.Path(value = "id")
    int product_id, @retrofit2.http.Path(value = "variation_id")
    int variation_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Product body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/{id}/variations")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Variation>> filter(@retrofit2.http.Path(value = "id")
    int product_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
}
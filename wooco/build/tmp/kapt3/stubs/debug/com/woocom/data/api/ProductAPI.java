package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u0005H\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\r\u001a\u00020\u0005H\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J*\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00032\u0014\b\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0015H\'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\fH\'J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0003H\'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0019\u001a\u00020\fH\'J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u0005H\'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u001c\u001a\u00020\fH\'R \u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/woocom/data/api/ProductAPI;", "", "products", "Lretrofit2/Call;", "Ljava/util/ArrayList;", "Lcom/woocom/models/Product;", "getProducts", "()Lretrofit2/Call;", "productsCount", "", "getProductsCount", "batch", "", "body", "create", "delete", "id", "", "force", "", "filter", "", "getProduct", "category", "list", "search", "update", "view", "lang", "wooco_debug"})
public abstract interface ProductAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products")
    public abstract retrofit2.Call<java.util.ArrayList<com.woocom.models.Product>> getProducts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/count")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Product>> getProductsCount();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/{id}")
    public abstract retrofit2.Call<com.woocom.models.Product> getProduct(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products")
    public abstract retrofit2.Call<java.util.ArrayList<com.woocom.models.Product>> getProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "filter[category]")
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products")
    public abstract retrofit2.Call<java.util.ArrayList<com.woocom.models.Product>> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String search);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Product>> filter(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "products")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Product> create(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Product body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products/{id}")
    public abstract retrofit2.Call<com.woocom.models.Product> view(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "lang")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "products")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.Product>> list();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "products/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.Product> update(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Product body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "products/{id}")
    public abstract retrofit2.Call<com.woocom.models.Product> delete(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "products/{id}")
    public abstract retrofit2.Call<com.woocom.models.Product> delete(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "force")
    boolean force);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "products/batch")
    public abstract retrofit2.Call<java.lang.String> batch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.Product body);
}
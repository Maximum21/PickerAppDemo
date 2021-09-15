package com.woocom.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J.\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u0003J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\nJ\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0003J&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aJ*\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003J\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\n2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/woocom/repo/ProductRepository;", "Lcom/woocom/repo/WooRepository;", "baseUrl", "", "consumerKey", "consumerSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "apiService", "Lcom/woocom/data/api/ProductAPI;", "create", "Lretrofit2/Call;", "Lcom/woocom/models/Product;", "product", "delete", "id", "", "force", "", "filter", "", "filters", "", "lang", "products", "productFilter", "Lcom/woocom/models/filters/ProductFilter;", "Ljava/util/HashMap;", "page", "per_page", "search", "term", "update", "wooco_debug"})
public final class ProductRepository extends com.woocom.repo.WooRepository {
    private final com.woocom.data.api.ProductAPI apiService = null;
    
    public ProductRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerKey, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerSecret) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Product> create(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Product> product(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Product>> products() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Product>> filter(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> filters, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Product>> products(@org.jetbrains.annotations.NotNull()
    com.woocom.models.filters.ProductFilter productFilter, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Product>> search(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Product>> products(int page, int per_page, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Product>> products(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Product> update(int id, @org.jetbrains.annotations.NotNull()
    com.woocom.models.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Product> delete(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Product> delete(int id, boolean force) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Product>> products(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> filters) {
        return null;
    }
}
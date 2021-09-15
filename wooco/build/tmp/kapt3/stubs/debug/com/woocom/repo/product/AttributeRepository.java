package com.woocom.repo.product;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\nJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0013\u001a\u00020\u000bJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/woocom/repo/product/AttributeRepository;", "Lcom/woocom/repo/WooRepository;", "baseUrl", "", "consumerKey", "consumerSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "apiService", "Lcom/woocom/data/api/ProductAttributeAPI;", "attribute", "Lretrofit2/Call;", "Lcom/woocom/models/ProductAttribute;", "id", "", "attributes", "", "productAttributeFilter", "Lcom/woocom/models/filters/ProductAttributeFilter;", "create", "productAttribute", "delete", "force", "", "update", "wooco_debug"})
public final class AttributeRepository extends com.woocom.repo.WooRepository {
    private final com.woocom.data.api.ProductAttributeAPI apiService = null;
    
    public AttributeRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerKey, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerSecret) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.ProductAttribute> create(@org.jetbrains.annotations.NotNull()
    com.woocom.models.ProductAttribute productAttribute) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.ProductAttribute> attribute(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.ProductAttribute>> attributes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.ProductAttribute>> attributes(@org.jetbrains.annotations.NotNull()
    com.woocom.models.filters.ProductAttributeFilter productAttributeFilter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.ProductAttribute> update(int id, @org.jetbrains.annotations.NotNull()
    com.woocom.models.ProductAttribute productAttribute) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.ProductAttribute> delete(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.ProductAttribute> delete(int id, boolean force) {
        return null;
    }
}
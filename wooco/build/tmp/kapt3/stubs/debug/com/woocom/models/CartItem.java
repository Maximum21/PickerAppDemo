package com.woocom.models;

import java.lang.System;

/**
 * Created by gilo on 2/18/16.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/woocom/models/CartItem;", "", "()V", "options", "Ljava/util/ArrayList;", "Lcom/woocom/models/Option;", "getOptions", "()Ljava/util/ArrayList;", "setOptions", "(Ljava/util/ArrayList;)V", "product", "Lcom/woocom/models/Product;", "getProduct", "()Lcom/woocom/models/Product;", "setProduct", "(Lcom/woocom/models/Product;)V", "qty", "", "getQty", "()I", "setQty", "(I)V", "wooco_debug"})
public final class CartItem {
    public com.woocom.models.Product product;
    public java.util.ArrayList<com.woocom.models.Option> options;
    private int qty = 0;
    
    public CartItem() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.models.Product getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Product p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.Option> getOptions() {
        return null;
    }
    
    public final void setOptions(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.Option> p0) {
    }
    
    public final int getQty() {
        return 0;
    }
    
    public final void setQty(int p0) {
    }
}
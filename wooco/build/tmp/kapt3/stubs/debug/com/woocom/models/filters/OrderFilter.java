package com.woocom.models.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u001cJ\u000e\u0010%\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020&2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006+"}, d2 = {"Lcom/woocom/models/filters/OrderFilter;", "Lcom/woocom/models/filters/ListFilter;", "()V", "customer", "", "getCustomer$wooco_debug", "()I", "setCustomer$wooco_debug", "(I)V", "dp", "getDp$wooco_debug", "setDp$wooco_debug", "filter", "getFilter$wooco_debug", "setFilter$wooco_debug", "parent", "", "getParent", "()[I", "setParent", "([I)V", "parent_exclude", "getParent_exclude", "setParent_exclude", "product", "getProduct$wooco_debug", "setProduct$wooco_debug", "status", "", "getStatus$wooco_debug", "()Ljava/lang/String;", "setStatus$wooco_debug", "(Ljava/lang/String;)V", "getCustomer", "getDp", "getProduct", "getStatus", "setAccepted", "", "setCustomer", "setDp", "setProduct", "setStatus", "wooco_debug"})
public final class OrderFilter extends com.woocom.models.filters.ListFilter {
    @org.jetbrains.annotations.Nullable()
    private int[] parent;
    @org.jetbrains.annotations.Nullable()
    private int[] parent_exclude;
    public java.lang.String status;
    private int customer = 0;
    private int filter = -1;
    private int product = 0;
    private int dp = 0;
    
    public OrderFilter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final int[] getParent() {
        return null;
    }
    
    public final void setParent(@org.jetbrains.annotations.Nullable()
    int[] parent) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final int[] getParent_exclude() {
        return null;
    }
    
    public final void setParent_exclude(@org.jetbrains.annotations.Nullable()
    int[] parent_exclude) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus$wooco_debug() {
        return null;
    }
    
    public final void setStatus$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCustomer$wooco_debug() {
        return 0;
    }
    
    public final void setCustomer$wooco_debug(int p0) {
    }
    
    public final int getFilter$wooco_debug() {
        return 0;
    }
    
    public final void setFilter$wooco_debug(int p0) {
    }
    
    public final int getProduct$wooco_debug() {
        return 0;
    }
    
    public final void setProduct$wooco_debug(int p0) {
    }
    
    public final int getDp$wooco_debug() {
        return 0;
    }
    
    public final void setDp$wooco_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    public final int getCustomer() {
        return 0;
    }
    
    public final void setCustomer(int customer) {
    }
    
    public final void setAccepted(int customer) {
    }
    
    public final int getProduct() {
        return 0;
    }
    
    public final void setProduct(int product) {
    }
    
    public final int getDp() {
        return 0;
    }
    
    public final void setDp(int dp) {
    }
}
package com.woocom.models.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b \u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR(\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR(\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR(\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u001f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R(\u0010\'\u001a\u0004\u0018\u00010\u00042\b\u0010\'\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR(\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR(\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR(\u00100\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR(\u00103\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR(\u00106\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR(\u00109\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR(\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010<\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\b\u00a8\u0006?"}, d2 = {"Lcom/woocom/models/filters/ProductVariationFilter;", "Lcom/woocom/models/filters/ListFilter;", "()V", "attribute", "", "getAttribute", "()Ljava/lang/String;", "setAttribute", "(Ljava/lang/String;)V", "attribute_term", "getAttribute_term", "setAttribute_term", "category", "getCategory", "setCategory", "featured", "", "isFeatured", "()Z", "setFeatured", "(Z)V", "on_sale", "isOn_sale", "setOn_sale", "max_price", "getMax_price", "setMax_price", "min_price", "getMin_price", "setMin_price", "parent", "", "getParent", "()[I", "setParent", "([I)V", "parent_exclude", "getParent_exclude", "setParent_exclude", "shipping_class", "getShipping_class", "setShipping_class", "sku", "getSku", "setSku", "slug", "getSlug", "setSlug", "status", "getStatus", "setStatus", "stock_status", "getStock_status", "setStock_status", "tag", "getTag", "setTag", "tax_class", "getTax_class", "setTax_class", "type", "getType", "setType", "wooco_debug"})
public final class ProductVariationFilter extends com.woocom.models.filters.ListFilter {
    @org.jetbrains.annotations.Nullable()
    private int[] parent;
    @org.jetbrains.annotations.Nullable()
    private int[] parent_exclude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String slug;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sku;
    private boolean isFeatured = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String category;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tag;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shipping_class;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String attribute;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String attribute_term;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tax_class;
    private boolean isOn_sale = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String min_price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String max_price;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stock_status;
    
    public ProductVariationFilter() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final void setSlug(@org.jetbrains.annotations.Nullable()
    java.lang.String slug) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String status) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSku() {
        return null;
    }
    
    public final void setSku(@org.jetbrains.annotations.Nullable()
    java.lang.String sku) {
    }
    
    public final boolean isFeatured() {
        return false;
    }
    
    public final void setFeatured(boolean featured) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.Nullable()
    java.lang.String category) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShipping_class() {
        return null;
    }
    
    public final void setShipping_class(@org.jetbrains.annotations.Nullable()
    java.lang.String shipping_class) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAttribute() {
        return null;
    }
    
    public final void setAttribute(@org.jetbrains.annotations.Nullable()
    java.lang.String attribute) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAttribute_term() {
        return null;
    }
    
    public final void setAttribute_term(@org.jetbrains.annotations.Nullable()
    java.lang.String attribute_term) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTax_class() {
        return null;
    }
    
    public final void setTax_class(@org.jetbrains.annotations.Nullable()
    java.lang.String tax_class) {
    }
    
    public final boolean isOn_sale() {
        return false;
    }
    
    public final void setOn_sale(boolean on_sale) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMin_price() {
        return null;
    }
    
    public final void setMin_price(@org.jetbrains.annotations.Nullable()
    java.lang.String min_price) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMax_price() {
        return null;
    }
    
    public final void setMax_price(@org.jetbrains.annotations.Nullable()
    java.lang.String max_price) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStock_status() {
        return null;
    }
    
    public final void setStock_status(@org.jetbrains.annotations.Nullable()
    java.lang.String stock_status) {
    }
}
package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b#\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR$\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b/\u0010\'\"\u0004\b0\u0010)R$\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b2\u0010\'\"\u0004\b3\u0010)R\u001c\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001a\u00107\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001a\u0010@\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\u001c\u0010C\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001c\u0010F\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\bR$\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bJ\u0010\'\"\u0004\bK\u0010)R$\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bM\u0010\'\"\u0004\bN\u0010)R\u001c\u0010O\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0006\"\u0004\bQ\u0010\bR\u001a\u0010R\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\u001a\u0010U\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010:\"\u0004\bW\u0010<R$\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bY\u0010\'\"\u0004\bZ\u0010)\u00a8\u0006["}, d2 = {"Lcom/woocom/models/Coupon;", "Ljava/io/Serializable;", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "code", "getCode", "setCode", "date_created", "getDate_created", "setDate_created", "date_created_gmt", "getDate_created_gmt", "setDate_created_gmt", "date_expires", "getDate_expires", "setDate_expires", "date_expires_gmt", "getDate_expires_gmt", "setDate_expires_gmt", "date_modified", "getDate_modified", "setDate_modified", "date_modified_gmt", "getDate_modified_gmt", "setDate_modified_gmt", "description", "getDescription", "setDescription", "discount_type", "getDiscount_type", "setDiscount_type", "email_restrictions", "", "getEmail_restrictions", "()[Ljava/lang/String;", "setEmail_restrictions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "exclude_sale_items", "getExclude_sale_items", "setExclude_sale_items", "excluded_product_categories", "getExcluded_product_categories", "setExcluded_product_categories", "excluded_product_ids", "getExcluded_product_ids", "setExcluded_product_ids", "free_shipping", "getFree_shipping", "setFree_shipping", "id", "", "getId", "()I", "setId", "(I)V", "individual_use", "getIndividual_use", "setIndividual_use", "limit_usage_to_x_items", "getLimit_usage_to_x_items", "setLimit_usage_to_x_items", "maximum_amount", "getMaximum_amount", "setMaximum_amount", "minimum_amount", "getMinimum_amount", "setMinimum_amount", "product_categories", "getProduct_categories", "setProduct_categories", "product_ids", "getProduct_ids", "setProduct_ids", "usage_count", "getUsage_count", "setUsage_count", "usage_limit", "getUsage_limit", "setUsage_limit", "usage_limit_per_user", "getUsage_limit_per_user", "setUsage_limit_per_user", "used_by", "getUsed_by", "setUsed_by", "wooco_debug"})
public final class Coupon implements java.io.Serializable {
    private int usage_limit = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String code;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String free_shipping;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String minimum_amount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] email_restrictions;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String exclude_sale_items;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] excluded_product_ids;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usage_count;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String individual_use;
    private int usage_limit_per_user = 0;
    private int limit_usage_to_x_items = 0;
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_modified_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String amount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_created;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_created_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String maximum_amount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discount_type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] used_by;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_modified;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] product_ids;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] product_categories;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_expires;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String[] excluded_product_categories;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_expires_gmt;
    
    public Coupon() {
        super();
    }
    
    public final int getUsage_limit() {
        return 0;
    }
    
    public final void setUsage_limit(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFree_shipping() {
        return null;
    }
    
    public final void setFree_shipping(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMinimum_amount() {
        return null;
    }
    
    public final void setMinimum_amount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getEmail_restrictions() {
        return null;
    }
    
    public final void setEmail_restrictions(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExclude_sale_items() {
        return null;
    }
    
    public final void setExclude_sale_items(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getExcluded_product_ids() {
        return null;
    }
    
    public final void setExcluded_product_ids(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsage_count() {
        return null;
    }
    
    public final void setUsage_count(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIndividual_use() {
        return null;
    }
    
    public final void setIndividual_use(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getUsage_limit_per_user() {
        return 0;
    }
    
    public final void setUsage_limit_per_user(int p0) {
    }
    
    public final int getLimit_usage_to_x_items() {
        return 0;
    }
    
    public final void setLimit_usage_to_x_items(int p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_modified_gmt() {
        return null;
    }
    
    public final void setDate_modified_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_created() {
        return null;
    }
    
    public final void setDate_created(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_created_gmt() {
        return null;
    }
    
    public final void setDate_created_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaximum_amount() {
        return null;
    }
    
    public final void setMaximum_amount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscount_type() {
        return null;
    }
    
    public final void setDiscount_type(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getUsed_by() {
        return null;
    }
    
    public final void setUsed_by(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_modified() {
        return null;
    }
    
    public final void setDate_modified(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getProduct_ids() {
        return null;
    }
    
    public final void setProduct_ids(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getProduct_categories() {
        return null;
    }
    
    public final void setProduct_categories(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_expires() {
        return null;
    }
    
    public final void setDate_expires(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String[] getExcluded_product_categories() {
        return null;
    }
    
    public final void setExcluded_product_categories(@org.jetbrains.annotations.Nullable()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_expires_gmt() {
        return null;
    }
    
    public final void setDate_expires_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}
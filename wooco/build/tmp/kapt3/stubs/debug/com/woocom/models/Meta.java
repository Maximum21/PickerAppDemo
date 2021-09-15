package com.woocom.models;

import java.lang.System;

/**
 * Created by gilo on 1/19/16.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010/\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\b\u00a8\u00060"}, d2 = {"Lcom/woocom/models/Meta;", "", "()V", "currency", "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "currency_format", "getCurrency_format", "setCurrency_format", "currency_position", "getCurrency_position", "setCurrency_position", "decimal_separator", "getDecimal_separator", "setDecimal_separator", "dimension_unit", "getDimension_unit", "setDimension_unit", "isGenerate_password", "", "()Z", "setGenerate_password", "(Z)V", "isPermalinks_enabled", "setPermalinks_enabled", "isSsl_enabled", "setSsl_enabled", "isTax_included", "setTax_included", "price_num_decimals", "", "getPrice_num_decimals", "()I", "setPrice_num_decimals", "(I)V", "thousand_separator", "getThousand_separator", "setThousand_separator", "timezone", "getTimezone", "setTimezone", "weight_unit", "getWeight_unit", "setWeight_unit", "toString", "wooco_debug"})
public final class Meta {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String thousand_separator;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String decimal_separator;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currency_position;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String weight_unit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currency;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String timezone;
    private boolean isGenerate_password = false;
    private int price_num_decimals = 0;
    private boolean isTax_included = false;
    private boolean isSsl_enabled = false;
    private boolean isPermalinks_enabled = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dimension_unit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currency_format;
    
    public Meta() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThousand_separator() {
        return null;
    }
    
    public final void setThousand_separator(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDecimal_separator() {
        return null;
    }
    
    public final void setDecimal_separator(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency_position() {
        return null;
    }
    
    public final void setCurrency_position(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWeight_unit() {
        return null;
    }
    
    public final void setWeight_unit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimezone() {
        return null;
    }
    
    public final void setTimezone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isGenerate_password() {
        return false;
    }
    
    public final void setGenerate_password(boolean p0) {
    }
    
    public final int getPrice_num_decimals() {
        return 0;
    }
    
    public final void setPrice_num_decimals(int p0) {
    }
    
    public final boolean isTax_included() {
        return false;
    }
    
    public final void setTax_included(boolean p0) {
    }
    
    public final boolean isSsl_enabled() {
        return false;
    }
    
    public final void setSsl_enabled(boolean p0) {
    }
    
    public final boolean isPermalinks_enabled() {
        return false;
    }
    
    public final void setPermalinks_enabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDimension_unit() {
        return null;
    }
    
    public final void setDimension_unit(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency_format() {
        return null;
    }
    
    public final void setCurrency_format(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
}
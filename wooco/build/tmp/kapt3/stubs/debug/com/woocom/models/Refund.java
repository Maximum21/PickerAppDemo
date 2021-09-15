package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b\u00a8\u0006*"}, d2 = {"Lcom/woocom/models/Refund;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "date_created", "getDate_created", "setDate_created", "date_created_gmt", "getDate_created_gmt", "setDate_created_gmt", "id", "getId", "setId", "line_items", "", "Lcom/woocom/models/LineItem;", "getLine_items", "()[Lcom/woocom/models/LineItem;", "setLine_items", "([Lcom/woocom/models/LineItem;)V", "[Lcom/woocom/models/LineItem;", "meta_data", "Lcom/woocom/models/Metadata;", "getMeta_data", "()[Lcom/woocom/models/Metadata;", "setMeta_data", "([Lcom/woocom/models/Metadata;)V", "[Lcom/woocom/models/Metadata;", "reason", "getReason", "setReason", "refunded_by", "getRefunded_by", "setRefunded_by", "refunded_payment", "getRefunded_payment", "setRefunded_payment", "wooco_debug"})
public final class Refund {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String refunded_by;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String reason;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String amount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_created;
    @org.jetbrains.annotations.Nullable()
    private com.woocom.models.Metadata[] meta_data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date_created_gmt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    private com.woocom.models.LineItem[] line_items;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String refunded_payment;
    
    public Refund() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefunded_by() {
        return null;
    }
    
    public final void setRefunded_by(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReason() {
        return null;
    }
    
    public final void setReason(@org.jetbrains.annotations.Nullable()
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
    public final com.woocom.models.Metadata[] getMeta_data() {
        return null;
    }
    
    public final void setMeta_data(@org.jetbrains.annotations.Nullable()
    com.woocom.models.Metadata[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_created_gmt() {
        return null;
    }
    
    public final void setDate_created_gmt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocom.models.LineItem[] getLine_items() {
        return null;
    }
    
    public final void setLine_items(@org.jetbrains.annotations.Nullable()
    com.woocom.models.LineItem[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRefunded_payment() {
        return null;
    }
    
    public final void setRefunded_payment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}
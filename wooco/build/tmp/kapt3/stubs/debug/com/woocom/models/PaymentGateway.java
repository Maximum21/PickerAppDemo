package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\b\u00a8\u0006)"}, d2 = {"Lcom/woocom/models/PaymentGateway;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "id", "getId", "setId", "method_description", "getMethod_description", "setMethod_description", "method_supports", "", "getMethod_supports", "()[Ljava/lang/String;", "setMethod_supports", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "method_title", "getMethod_title", "setMethod_title", "settings", "", "Lcom/woocom/models/PaymentGatewaySetting;", "getSettings", "()Ljava/util/Map;", "setSettings", "(Ljava/util/Map;)V", "title", "getTitle", "setTitle", "wooco_debug"})
public final class PaymentGateway {
    public java.lang.String id;
    public java.lang.String title;
    public java.lang.String description;
    private boolean enabled = false;
    public java.lang.String method_title;
    public java.lang.String method_description;
    public java.lang.String[] method_supports;
    public java.util.Map<java.lang.String, com.woocom.models.PaymentGatewaySetting> settings;
    
    public PaymentGateway() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getEnabled() {
        return false;
    }
    
    public final void setEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMethod_title() {
        return null;
    }
    
    public final void setMethod_title(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMethod_description() {
        return null;
    }
    
    public final void setMethod_description(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getMethod_supports() {
        return null;
    }
    
    public final void setMethod_supports(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.woocom.models.PaymentGatewaySetting> getSettings() {
        return null;
    }
    
    public final void setSettings(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.woocom.models.PaymentGatewaySetting> p0) {
    }
}
package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR \u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001a\u00101\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001a\u00104\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001e\u00107\u001a\u0002088\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001a\u0010@\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\b\u00a8\u0006C"}, d2 = {"Lcom/woocom/models/Customer;", "Ljava/io/Serializable;", "()V", "avatarUrl", "", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", "billingAddress", "Lcom/woocom/models/BillingAddress;", "getBillingAddress", "()Lcom/woocom/models/BillingAddress;", "setBillingAddress", "(Lcom/woocom/models/BillingAddress;)V", "createdAt", "getCreatedAt", "setCreatedAt", "email", "getEmail", "setEmail", "firstName", "getFirstName", "setFirstName", "id", "", "getId", "()I", "setId", "(I)V", "lastName", "getLastName", "setLastName", "lastOrderDate", "getLastOrderDate", "setLastOrderDate", "lastOrderId", "getLastOrderId", "setLastOrderId", "meta_data", "Ljava/util/ArrayList;", "Lcom/woocom/models/Metadata;", "getMeta_data", "()Ljava/util/ArrayList;", "setMeta_data", "(Ljava/util/ArrayList;)V", "ordersCount", "getOrdersCount", "setOrdersCount", "password", "getPassword", "setPassword", "role", "getRole", "setRole", "shippingAddress", "Lcom/woocom/models/ShippingAddress;", "getShippingAddress", "()Lcom/woocom/models/ShippingAddress;", "setShippingAddress", "(Lcom/woocom/models/ShippingAddress;)V", "totalSpent", "getTotalSpent", "setTotalSpent", "username", "getUsername", "setUsername", "wooco_debug"})
public final class Customer implements java.io.Serializable {
    private int id = 0;
    @com.google.gson.annotations.SerializedName(value = "created_at")
    public java.lang.String createdAt;
    public java.lang.String email;
    @com.google.gson.annotations.SerializedName(value = "first_name")
    public java.lang.String firstName;
    @com.google.gson.annotations.SerializedName(value = "last_name")
    public java.lang.String lastName;
    public java.lang.String username;
    public java.lang.String password;
    public java.lang.String role;
    @com.google.gson.annotations.SerializedName(value = "last_order_id")
    public java.lang.String lastOrderId;
    @com.google.gson.annotations.SerializedName(value = "last_order_date")
    public java.lang.String lastOrderDate;
    @com.google.gson.annotations.SerializedName(value = "orders_count")
    private int ordersCount = 0;
    @com.google.gson.annotations.SerializedName(value = "total_spent")
    public java.lang.String totalSpent;
    @com.google.gson.annotations.SerializedName(value = "avatar_url")
    public java.lang.String avatarUrl;
    @com.google.gson.annotations.SerializedName(value = "billing")
    public com.woocom.models.BillingAddress billingAddress;
    @com.google.gson.annotations.SerializedName(value = "shipping")
    public com.woocom.models.ShippingAddress shippingAddress;
    public java.util.ArrayList<com.woocom.models.Metadata> meta_data;
    
    public Customer() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastOrderId() {
        return null;
    }
    
    public final void setLastOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastOrderDate() {
        return null;
    }
    
    public final void setLastOrderDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getOrdersCount() {
        return 0;
    }
    
    public final void setOrdersCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalSpent() {
        return null;
    }
    
    public final void setTotalSpent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatarUrl() {
        return null;
    }
    
    public final void setAvatarUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.models.BillingAddress getBillingAddress() {
        return null;
    }
    
    public final void setBillingAddress(@org.jetbrains.annotations.NotNull()
    com.woocom.models.BillingAddress p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.models.ShippingAddress getShippingAddress() {
        return null;
    }
    
    public final void setShippingAddress(@org.jetbrains.annotations.NotNull()
    com.woocom.models.ShippingAddress p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.woocom.models.Metadata> getMeta_data() {
        return null;
    }
    
    public final void setMeta_data(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.woocom.models.Metadata> p0) {
    }
}
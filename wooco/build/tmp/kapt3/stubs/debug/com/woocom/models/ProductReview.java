package com.woocom.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"\u00a8\u0006/"}, d2 = {"Lcom/woocom/models/ProductReview;", "Ljava/io/Serializable;", "()V", "date_created", "Ljava/util/Date;", "getDate_created", "()Ljava/util/Date;", "setDate_created", "(Ljava/util/Date;)V", "date_created_gmt", "getDate_created_gmt", "setDate_created_gmt", "id", "", "getId", "()I", "setId", "(I)V", "isVerified", "", "()Z", "setVerified", "(Z)V", "product_id", "getProduct_id", "setProduct_id", "rating", "getRating", "setRating", "review", "", "getReview", "()Ljava/lang/String;", "setReview", "(Ljava/lang/String;)V", "reviewer", "getReviewer", "setReviewer", "reviewer_avatar_urls", "", "getReviewer_avatar_urls", "()Ljava/util/Map;", "setReviewer_avatar_urls", "(Ljava/util/Map;)V", "reviewer_email", "getReviewer_email", "setReviewer_email", "wooco_debug"})
public final class ProductReview implements java.io.Serializable {
    private int id = 0;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date_created;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date date_created_gmt;
    private int product_id = 0;
    public java.lang.String reviewer;
    public java.lang.String reviewer_email;
    public java.util.Map<java.lang.String, java.lang.String> reviewer_avatar_urls;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String review;
    private int rating = 0;
    private boolean isVerified = false;
    
    public ProductReview() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate_created() {
        return null;
    }
    
    public final void setDate_created(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDate_created_gmt() {
        return null;
    }
    
    public final void setDate_created_gmt(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    public final int getProduct_id() {
        return 0;
    }
    
    public final void setProduct_id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReviewer() {
        return null;
    }
    
    public final void setReviewer(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReviewer_email() {
        return null;
    }
    
    public final void setReviewer_email(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getReviewer_avatar_urls() {
        return null;
    }
    
    public final void setReviewer_avatar_urls(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReview() {
        return null;
    }
    
    public final void setReview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getRating() {
        return 0;
    }
    
    public final void setRating(int p0) {
    }
    
    public final boolean isVerified() {
        return false;
    }
    
    public final void setVerified(boolean p0) {
    }
}
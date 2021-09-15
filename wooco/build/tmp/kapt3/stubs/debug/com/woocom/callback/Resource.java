package com.woocom.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0013\b\u0016\u0012\n\u0010\b\u001a\u00060\tj\u0002`\n\u00a2\u0006\u0002\u0010\u000bB!\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u00a2\u0006\u0002\u0010\rJ\r\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nJ\u0006\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/woocom/callback/Resource;", "T", "", "data", "(Ljava/lang/Object;)V", "status", "Lcom/woocom/callback/Status;", "(Lcom/woocom/callback/Status;)V", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "error", "(Ljava/lang/Object;Ljava/lang/Exception;)V", "Ljava/lang/Object;", "isSuccessful", "", "()Z", "getStatus$wooco_debug", "()Lcom/woocom/callback/Status;", "setStatus$wooco_debug", "()Ljava/lang/Object;", "wooco_debug"})
public final class Resource<T extends java.lang.Object> {
    private final T data = null;
    private final java.lang.Exception error = null;
    @org.jetbrains.annotations.NotNull()
    private com.woocom.callback.Status status = com.woocom.callback.Status.LOADING;
    
    private Resource(T data, java.lang.Exception error) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.callback.Status getStatus$wooco_debug() {
        return null;
    }
    
    public final void setStatus$wooco_debug(@org.jetbrains.annotations.NotNull()
    com.woocom.callback.Status p0) {
    }
    
    public final boolean isSuccessful() {
        return false;
    }
    
    public Resource(T data) {
        super();
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.woocom.callback.Status status) {
        super();
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    java.lang.Exception exception) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T data() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Exception error() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.callback.Status status() {
        return null;
    }
}
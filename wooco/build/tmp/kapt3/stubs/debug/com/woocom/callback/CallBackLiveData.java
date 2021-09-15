package com.woocom.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/woocom/callback/CallBackLiveData;", "T", "Landroidx/lifecycle/LiveData;", "Lcom/woocom/callback/Resource;", "Lretrofit2/Callback;", "()V", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "wooco_debug"})
public final class CallBackLiveData<T extends java.lang.Object> extends androidx.lifecycle.LiveData<com.woocom.callback.Resource<T>> implements retrofit2.Callback<T> {
    
    public CallBackLiveData() {
        super(null);
    }
    
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> response) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
}
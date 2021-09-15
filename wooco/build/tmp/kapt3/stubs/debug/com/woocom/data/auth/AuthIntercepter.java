package com.woocom.data.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0003J&\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocom/data/auth/AuthIntercepter;", "Lokhttp3/Interceptor;", "consumerKey", "", "consumerSecret", "(Ljava/lang/String;Ljava/lang/String;)V", "oauth_signature", "getOauthParams", "Ljava/util/ArrayList;", "Lorg/apache/http/NameValuePair;", "chain", "Lokhttp3/Interceptor$Chain;", "getOauth_nonce", "getOauth_signature", "method", "url", "parameters", "getOauth_timestamp", "getStringToSign", "intercept", "Lokhttp3/Response;", "Companion", "wooco_debug"})
public final class AuthIntercepter implements okhttp3.Interceptor {
    private final java.lang.String consumerKey = null;
    private final java.lang.String consumerSecret = null;
    private java.lang.String oauth_signature = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.woocom.data.auth.AuthIntercepter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String oauth_nonce = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String oauth_timestamp = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String oauth_signature_method = "HMAC-SHA1";
    
    public AuthIntercepter(@org.jetbrains.annotations.NotNull()
    java.lang.String consumerKey, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerSecret) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<org.apache.http.NameValuePair> getOauthParams(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOauth_nonce() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringToSign(@org.jetbrains.annotations.NotNull()
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String parameters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOauth_signature(@org.jetbrains.annotations.NotNull()
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String parameters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOauth_timestamp() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/woocom/data/auth/AuthIntercepter$Companion;", "", "()V", "oauth_nonce", "", "getOauth_nonce$wooco_debug", "()Ljava/lang/String;", "setOauth_nonce$wooco_debug", "(Ljava/lang/String;)V", "oauth_signature_method", "getOauth_signature_method$wooco_debug", "setOauth_signature_method$wooco_debug", "oauth_timestamp", "getOauth_timestamp$wooco_debug", "setOauth_timestamp$wooco_debug", "getQueryParams", "", "", "url", "wooco_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOauth_nonce$wooco_debug() {
            return null;
        }
        
        public final void setOauth_nonce$wooco_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOauth_timestamp$wooco_debug() {
            return null;
        }
        
        public final void setOauth_timestamp$wooco_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOauth_signature_method$wooco_debug() {
            return null;
        }
        
        public final void setOauth_signature_method$wooco_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getQueryParams(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
    }
}
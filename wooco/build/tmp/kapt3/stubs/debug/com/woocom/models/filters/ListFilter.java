package com.woocom.models.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0001J\u0006\u0010=\u001a\u00020\u0004J\u0006\u0010>\u001a\u00020\u0004J\u0006\u0010?\u001a\u00020\u0004J\u0006\u0010@\u001a\u00020\u0004J\u0006\u0010A\u001a\u00020\u0013J\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040CJ\u0006\u0010D\u001a\u00020\u0013J\u0006\u0010E\u001a\u00020\u0004J\u0006\u0010F\u001a\u00020%J\u0006\u0010G\u001a\u00020\u0004J\u0006\u0010H\u001a\u00020\u0004J\u0006\u0010I\u001a\u00020%J\u0006\u0010J\u001a\u00020%J\u0006\u0010K\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020NJ\u000e\u0010L\u001a\u00020:2\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010O\u001a\u00020:2\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020:2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010P\u001a\u00020:2\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010Q\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010R\u001a\u00020:2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010S\u001a\u00020:2\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010T\u001a\u00020:2\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010U\u001a\u00020:2\u0006\u0010$\u001a\u00020%J\u000e\u0010V\u001a\u00020:2\u0006\u0010*\u001a\u00020WJ\u000e\u0010V\u001a\u00020:2\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010X\u001a\u00020:2\u0006\u0010-\u001a\u00020\u0004J\u000e\u0010Y\u001a\u00020:2\u0006\u00100\u001a\u00020%J\u000e\u0010Z\u001a\u00020:2\u0006\u00103\u001a\u00020%J\u000e\u0010[\u001a\u00020:2\u0006\u00106\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0019X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0013X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020%X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020%X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\'\"\u0004\b2\u0010)R\u001a\u00103\u001a\u00020%X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\'\"\u0004\b5\u0010)R\u001a\u00106\u001a\u00020\u0004X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\b\u00a8\u0006\\"}, d2 = {"Lcom/woocom/models/filters/ListFilter;", "", "()V", "after", "", "getAfter$wooco_debug", "()Ljava/lang/String;", "setAfter$wooco_debug", "(Ljava/lang/String;)V", "before", "getBefore$wooco_debug", "setBefore$wooco_debug", "code", "getCode$wooco_debug", "setCode$wooco_debug", "context", "getContext$wooco_debug", "setContext$wooco_debug", "exclude", "", "getExclude$wooco_debug", "()[I", "setExclude$wooco_debug", "([I)V", "filters", "", "getFilters$wooco_debug", "()Ljava/util/Map;", "setFilters$wooco_debug", "(Ljava/util/Map;)V", "include", "getInclude$wooco_debug", "setInclude$wooco_debug", "lang", "getLang$wooco_debug", "setLang$wooco_debug", "offset", "", "getOffset$wooco_debug", "()I", "setOffset$wooco_debug", "(I)V", "order", "getOrder$wooco_debug", "setOrder$wooco_debug", "orderby", "getOrderby$wooco_debug", "setOrderby$wooco_debug", "page", "getPage$wooco_debug", "setPage$wooco_debug", "per_page", "getPer_page$wooco_debug", "setPer_page$wooco_debug", "search", "getSearch$wooco_debug", "setSearch$wooco_debug", "addFilter", "", "filter", "value", "getAfter", "getBefore", "getCode", "getContext", "getExclude", "getFilters", "", "getInclude", "getLang", "getOffset", "getOrder", "getOrderby", "getPage", "getPer_page", "getSearch", "setAfter", "date", "Ljava/util/Date;", "setBefore", "setCode", "setContext", "setExclude", "setInclude", "setLang", "setOffset", "setOrder", "Lcom/woocom/models/filters/Sort;", "setOrderby", "setPage", "setPer_page", "setSearch", "wooco_debug"})
public class ListFilter {
    public java.lang.String context;
    private int page = 0;
    private int per_page = 0;
    public java.lang.String search;
    public java.lang.String after;
    public java.lang.String before;
    public int[] exclude;
    public int[] include;
    private int offset = 0;
    public java.lang.String order;
    public java.lang.String orderby;
    public java.lang.String lang;
    public java.lang.String code;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.lang.String> filters;
    
    public ListFilter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContext$wooco_debug() {
        return null;
    }
    
    public final void setContext$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPage$wooco_debug() {
        return 0;
    }
    
    public final void setPage$wooco_debug(int p0) {
    }
    
    public final int getPer_page$wooco_debug() {
        return 0;
    }
    
    public final void setPer_page$wooco_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearch$wooco_debug() {
        return null;
    }
    
    public final void setSearch$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAfter$wooco_debug() {
        return null;
    }
    
    public final void setAfter$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBefore$wooco_debug() {
        return null;
    }
    
    public final void setBefore$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getExclude$wooco_debug() {
        return null;
    }
    
    public final void setExclude$wooco_debug(@org.jetbrains.annotations.NotNull()
    int[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getInclude$wooco_debug() {
        return null;
    }
    
    public final void setInclude$wooco_debug(@org.jetbrains.annotations.NotNull()
    int[] p0) {
    }
    
    public final int getOffset$wooco_debug() {
        return 0;
    }
    
    public final void setOffset$wooco_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder$wooco_debug() {
        return null;
    }
    
    public final void setOrder$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderby$wooco_debug() {
        return null;
    }
    
    public final void setOrderby$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang$wooco_debug() {
        return null;
    }
    
    public final void setLang$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode$wooco_debug() {
        return null;
    }
    
    public final void setCode$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getFilters$wooco_debug() {
        return null;
    }
    
    public final void setFilters$wooco_debug(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    java.lang.String context) {
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int page) {
    }
    
    public final int getPer_page() {
        return 0;
    }
    
    public final void setPer_page(int per_page) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAfter() {
        return null;
    }
    
    public final void setAfter(@org.jetbrains.annotations.NotNull()
    java.lang.String after) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBefore() {
        return null;
    }
    
    public final void setAfter(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    public final void setBefore(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    public final void setBefore(@org.jetbrains.annotations.NotNull()
    java.lang.String before) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getExclude() {
        return null;
    }
    
    public final void setExclude(@org.jetbrains.annotations.NotNull()
    int[] exclude) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getInclude() {
        return null;
    }
    
    public final void setInclude(@org.jetbrains.annotations.NotNull()
    int[] include) {
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public final void setOffset(int offset) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrder() {
        return null;
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String order) {
    }
    
    public final void setOrder(@org.jetbrains.annotations.NotNull()
    com.woocom.models.filters.Sort order) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderby() {
        return null;
    }
    
    public final void setOrderby(@org.jetbrains.annotations.NotNull()
    java.lang.String orderby) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    public final void addFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getFilters() {
        return null;
    }
}
package com.woocom.models.report;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR(\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020)\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\b\u00a8\u00061"}, d2 = {"Lcom/woocom/models/report/SalesTotal;", "", "()V", "average_sales", "", "getAverage_sales", "()Ljava/lang/String;", "setAverage_sales", "(Ljava/lang/String;)V", "net_sales", "getNet_sales", "setNet_sales", "total_customers", "getTotal_customers", "setTotal_customers", "total_discount", "", "getTotal_discount", "()I", "setTotal_discount", "(I)V", "total_items", "getTotal_items", "setTotal_items", "total_orders", "getTotal_orders", "setTotal_orders", "total_refunds", "getTotal_refunds", "setTotal_refunds", "total_sales", "getTotal_sales", "setTotal_sales", "total_shipping", "getTotal_shipping", "setTotal_shipping", "total_tax", "getTotal_tax", "setTotal_tax", "totals", "", "Lcom/woocom/models/report/SalesPeriodTotal;", "getTotals", "()Ljava/util/Map;", "setTotals", "(Ljava/util/Map;)V", "totals_grouped_by", "getTotals_grouped_by", "setTotals_grouped_by", "wooco_debug"})
public final class SalesTotal {
    private int total_discount = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String net_sales;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String total_customers;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, com.woocom.models.report.SalesPeriodTotal> totals;
    private int total_orders = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String total_tax;
    private int total_items = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String totals_grouped_by;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String total_shipping;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String average_sales;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String total_sales;
    private int total_refunds = 0;
    
    public SalesTotal() {
        super();
    }
    
    public final int getTotal_discount() {
        return 0;
    }
    
    public final void setTotal_discount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNet_sales() {
        return null;
    }
    
    public final void setNet_sales(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_customers() {
        return null;
    }
    
    public final void setTotal_customers(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.woocom.models.report.SalesPeriodTotal> getTotals() {
        return null;
    }
    
    public final void setTotals(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.woocom.models.report.SalesPeriodTotal> p0) {
    }
    
    public final int getTotal_orders() {
        return 0;
    }
    
    public final void setTotal_orders(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_tax() {
        return null;
    }
    
    public final void setTotal_tax(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getTotal_items() {
        return 0;
    }
    
    public final void setTotal_items(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotals_grouped_by() {
        return null;
    }
    
    public final void setTotals_grouped_by(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_shipping() {
        return null;
    }
    
    public final void setTotal_shipping(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAverage_sales() {
        return null;
    }
    
    public final void setAverage_sales(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal_sales() {
        return null;
    }
    
    public final void setTotal_sales(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getTotal_refunds() {
        return 0;
    }
    
    public final void setTotal_refunds(int p0) {
    }
}
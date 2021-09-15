package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003H\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003H\'J*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\'J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u0003H\'J*\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/woocom/data/api/ReportAPI;", "", "coupons_totals", "Lretrofit2/Call;", "", "Lcom/woocom/models/report/CouponsTotal;", "customers_totals", "Lcom/woocom/models/report/CustomersTotal;", "orders_totals", "Lcom/woocom/models/report/OrdersTotal;", "products_totals", "Lcom/woocom/models/report/ProductsTotal;", "reviews_totals", "Lcom/woocom/models/report/ReviewsTotal;", "sales", "Lcom/woocom/models/report/SalesTotal;", "filter", "", "", "top_sellers", "Lcom/woocom/models/report/TopSellerProducts;", "wooco_debug"})
public abstract interface ReportAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/sales")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.SalesTotal>> sales();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/sales")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.SalesTotal>> sales(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/top_sellers")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.TopSellerProducts>> top_sellers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = " /wp-json/wc/v3/reports/top_sellers")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.TopSellerProducts>> top_sellers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.String> filter);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/coupons/totals")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.CouponsTotal>> coupons_totals();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/customers/totals")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.CustomersTotal>> customers_totals();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/orders/totals")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.OrdersTotal>> orders_totals();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/products/totals")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.ProductsTotal>> products_totals();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "reports/reviews/totals")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.report.ReviewsTotal>> reviews_totals();
}
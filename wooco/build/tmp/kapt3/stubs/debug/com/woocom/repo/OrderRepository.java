package com.woocom.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u0016J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001e\u001a\u00020\u0017J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010#\u001a\u00020\u0019J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0019J$\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%J\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u001c0\u00162\u0006\u0010)\u001a\u00020*J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0019J\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u00162\u0006\u0010\u001e\u001a\u00020\u0017J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010#\u001a\u00020\u0019J\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u0016J\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u00162\u0006\u0010)\u001a\u00020*J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006."}, d2 = {"Lcom/woocom/repo/OrderRepository;", "Lcom/woocom/repo/WooRepository;", "baseUrl", "", "consumerKey", "consumerSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "apiService", "Lcom/woocom/data/api/OrderAPI;", "orderNoteRepository", "Lcom/woocom/repo/order/OrderNoteRepository;", "getOrderNoteRepository$wooco_debug", "()Lcom/woocom/repo/order/OrderNoteRepository;", "setOrderNoteRepository$wooco_debug", "(Lcom/woocom/repo/order/OrderNoteRepository;)V", "refundRepository", "Lcom/woocom/repo/order/RefundRepository;", "getRefundRepository$wooco_debug", "()Lcom/woocom/repo/order/RefundRepository;", "setRefundRepository$wooco_debug", "(Lcom/woocom/repo/order/RefundRepository;)V", "addToCart", "Lretrofit2/Call;", "Lcom/woocom/models/Order;", "productId", "", "cartOrder", "cart", "", "create", "order", "createNote", "Lcom/woocom/models/OrderNote;", "note", "delete", "id", "force", "", "deleteNote", "myOrders", "Lcom/woocom/models/MyOrder;", "orderFilter", "Lcom/woocom/models/filters/OrderFilter;", "notes", "orders", "update", "wooco_debug"})
public final class OrderRepository extends com.woocom.repo.WooRepository {
    private final com.woocom.data.api.OrderAPI apiService = null;
    @org.jetbrains.annotations.NotNull()
    private com.woocom.repo.order.OrderNoteRepository orderNoteRepository;
    @org.jetbrains.annotations.NotNull()
    private com.woocom.repo.order.RefundRepository refundRepository;
    
    public OrderRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerKey, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerSecret) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.repo.order.OrderNoteRepository getOrderNoteRepository$wooco_debug() {
        return null;
    }
    
    public final void setOrderNoteRepository$wooco_debug(@org.jetbrains.annotations.NotNull()
    com.woocom.repo.order.OrderNoteRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocom.repo.order.RefundRepository getRefundRepository$wooco_debug() {
        return null;
    }
    
    public final void setRefundRepository$wooco_debug(@org.jetbrains.annotations.NotNull()
    com.woocom.repo.order.RefundRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Order> create(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Order order) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Order> addToCart(int productId, @org.jetbrains.annotations.Nullable()
    com.woocom.models.Order cartOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Order>> cart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Order> order(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Order>> orders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.Order>> orders(@org.jetbrains.annotations.NotNull()
    com.woocom.models.filters.OrderFilter orderFilter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.MyOrder>> myOrders(@org.jetbrains.annotations.NotNull()
    com.woocom.models.filters.OrderFilter orderFilter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Order> update(int id, @org.jetbrains.annotations.NotNull()
    com.woocom.models.Order order) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Order> delete(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.Order> delete(int id, boolean force) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.OrderNote> createNote(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Order order, @org.jetbrains.annotations.NotNull()
    com.woocom.models.OrderNote note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.OrderNote> note(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Order order, int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.woocom.models.OrderNote>> notes(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Order order) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.OrderNote> deleteNote(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Order order, int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.woocom.models.OrderNote> deleteNote(@org.jetbrains.annotations.NotNull()
    com.woocom.models.Order order, int id, boolean force) {
        return null;
    }
}
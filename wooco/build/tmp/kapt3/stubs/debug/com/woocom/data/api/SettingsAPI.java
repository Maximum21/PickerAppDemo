package com.woocom.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\u0003H\'J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0004H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/woocom/data/api/SettingsAPI;", "", "option", "Lretrofit2/Call;", "Lcom/woocom/models/SettingOption;", "group_id", "", "option_id", "options", "", "settings", "Lcom/woocom/models/SettingGroup;", "update", "body", "wooco_debug"})
public abstract interface SettingsAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "settings")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.SettingGroup>> settings();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "settings/{group_id}/{id}")
    public abstract retrofit2.Call<com.woocom.models.SettingOption> option(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "group_id")
    java.lang.String group_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String option_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "settings/{id}")
    public abstract retrofit2.Call<java.util.List<com.woocom.models.SettingOption>> options(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String group_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "settings/{group_id}/{id}")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.woocom.models.SettingOption> update(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "group_id")
    java.lang.String group_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String option_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.woocom.models.SettingOption body);
}
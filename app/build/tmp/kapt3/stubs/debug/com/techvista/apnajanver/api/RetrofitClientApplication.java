package com.techvista.apnajanver.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/techvista/apnajanver/api/RetrofitClientApplication;", "Landroid/app/Application;", "()V", "Base_Url", "", "getBase_Url", "()Ljava/lang/String;", "setBase_Url", "(Ljava/lang/String;)V", "api", "Lcom/techvista/apnajanver/api/API;", "getApi", "()Lcom/techvista/apnajanver/api/API;", "setApi", "(Lcom/techvista/apnajanver/api/API;)V", "repository", "Lcom/techvista/apnajanver/repository/Repository;", "getRepository", "()Lcom/techvista/apnajanver/repository/Repository;", "setRepository", "(Lcom/techvista/apnajanver/repository/Repository;)V", "retrofit", "Lretrofit2/Retrofit;", "getClient", "onCreate", "", "app_debug"})
public final class RetrofitClientApplication extends android.app.Application {
    public com.techvista.apnajanver.api.API api;
    public com.techvista.apnajanver.repository.Repository repository;
    private retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull
    private java.lang.String Base_Url = "https://devclientserver.com/geauxchef/api/v1/chef/";
    
    public RetrofitClientApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.techvista.apnajanver.api.API getApi() {
        return null;
    }
    
    public final void setApi(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.api.API p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.techvista.apnajanver.repository.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.repository.Repository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBase_Url() {
        return null;
    }
    
    public final void setBase_Url(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final retrofit2.Retrofit getClient() {
        return null;
    }
}
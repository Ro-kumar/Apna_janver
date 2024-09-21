package com.techvista.apnajanver.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/techvista/apnajanver/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/techvista/apnajanver/repository/Repository;", "(Lcom/techvista/apnajanver/repository/Repository;)V", "_login", "Landroidx/lifecycle/MutableLiveData;", "Lcom/techvista/apnajanver/utils/NetworkResult;", "Lcom/techvista/apnajanver/models/Login/loginResponse;", "_products", "", "Lcom/techvista/apnajanver/models/ProductListItem;", "login", "Landroidx/lifecycle/LiveData;", "getLogin", "()Landroidx/lifecycle/LiveData;", "products", "getProducts", "getlogin", "", "loginRequest", "Lcom/techvista/apnajanver/models/Login/loginRequest;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.techvista.apnajanver.repository.Repository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.techvista.apnajanver.utils.NetworkResult<java.util.List<com.techvista.apnajanver.models.ProductListItem>>> _products = null;
    private final androidx.lifecycle.MutableLiveData<com.techvista.apnajanver.utils.NetworkResult<com.techvista.apnajanver.models.Login.loginResponse>> _login = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.techvista.apnajanver.utils.NetworkResult<java.util.List<com.techvista.apnajanver.models.ProductListItem>>> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.techvista.apnajanver.utils.NetworkResult<com.techvista.apnajanver.models.Login.loginResponse>> getLogin() {
        return null;
    }
    
    public final void getlogin(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.models.Login.loginRequest loginRequest) {
    }
}
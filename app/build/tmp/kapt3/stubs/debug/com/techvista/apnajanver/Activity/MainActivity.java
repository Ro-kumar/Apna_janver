package com.techvista.apnajanver.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/techvista/apnajanver/Activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "binding", "Lcom/techvista/apnajanver/databinding/ActivityMainBinding;", "getBinding", "()Lcom/techvista/apnajanver/databinding/ActivityMainBinding;", "setBinding", "(Lcom/techvista/apnajanver/databinding/ActivityMainBinding;)V", "mainViewModel", "Lcom/techvista/apnajanver/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/techvista/apnajanver/viewmodels/MainViewModel;", "setMainViewModel", "(Lcom/techvista/apnajanver/viewmodels/MainViewModel;)V", "alerdiloag", "", "loadFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "setLocal", "language", "", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener {
    public com.techvista.apnajanver.viewmodels.MainViewModel mainViewModel;
    public com.techvista.apnajanver.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull
    public static final com.techvista.apnajanver.Activity.MainActivity.Companion Companion = null;
    public static com.techvista.apnajanver.Activity.MainActivity activity;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.techvista.apnajanver.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.viewmodels.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.techvista.apnajanver.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.databinding.ActivityMainBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean loadFragment(androidx.fragment.app.Fragment fragment) {
        return false;
    }
    
    @java.lang.Override
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    public final void setLocal(@org.jetbrains.annotations.NotNull
    java.lang.String language) {
    }
    
    public final void alerdiloag() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/techvista/apnajanver/Activity/MainActivity$Companion;", "", "()V", "activity", "Lcom/techvista/apnajanver/Activity/MainActivity;", "getActivity", "()Lcom/techvista/apnajanver/Activity/MainActivity;", "setActivity", "(Lcom/techvista/apnajanver/Activity/MainActivity;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.techvista.apnajanver.Activity.MainActivity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.NotNull
        com.techvista.apnajanver.Activity.MainActivity p0) {
        }
    }
}
package com.techvista.apnajanver.Fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0006\u0010\u001e\u001a\u00020\u001aJ&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u000e\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/techvista/apnajanver/Fragment/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "animationDelay", "", "binding", "Lcom/techvista/apnajanver/databinding/FragmentHomeBinding;", "getBinding", "()Lcom/techvista/apnajanver/databinding/FragmentHomeBinding;", "setBinding", "(Lcom/techvista/apnajanver/databinding/FragmentHomeBinding;)V", "categoryModel", "", "Lcom/techvista/mvvmtest/models/Category/CategoryModel;", "getCategoryModel", "()Ljava/util/List;", "setCategoryModel", "(Ljava/util/List;)V", "hasNextPage", "", "textToAnimate", "alerdiloag", "", "animateText", "banner", "category", "nearby", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setLocal", "language", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    public com.techvista.apnajanver.databinding.FragmentHomeBinding binding;
    private final java.lang.String textToAnimate = "Cow, Hen, Goat, Buffalo";
    private final long animationDelay = 100L;
    private boolean hasNextPage = true;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.techvista.mvvmtest.models.Category.CategoryModel> categoryModel;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.techvista.apnajanver.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.databinding.FragmentHomeBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.techvista.mvvmtest.models.Category.CategoryModel> getCategoryModel() {
        return null;
    }
    
    public final void setCategoryModel(@org.jetbrains.annotations.NotNull
    java.util.List<com.techvista.mvvmtest.models.Category.CategoryModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void animateText() {
    }
    
    public final void banner() {
    }
    
    public final void category() {
    }
    
    public final void nearby() {
    }
    
    public final void setLocal(@org.jetbrains.annotations.NotNull
    java.lang.String language) {
    }
    
    public final void alerdiloag() {
    }
}
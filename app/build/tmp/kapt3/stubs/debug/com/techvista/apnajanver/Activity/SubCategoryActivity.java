package com.techvista.apnajanver.Activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J*\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010%\u001a\u00060&R\u00020\u0018H\u0017J\u0012\u0010\'\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0006\u0010*\u001a\u00020!J\b\u0010+\u001a\u00020!H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016\u00a8\u0006,"}, d2 = {"Lcom/techvista/apnajanver/Activity/SubCategoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/techvista/apnajanver/adapter/TabCategoryAdapter$OnTabSelectedListener;", "()V", "binding", "Lcom/techvista/apnajanver/databinding/ActivitySubCategoryBinding;", "getBinding", "()Lcom/techvista/apnajanver/databinding/ActivitySubCategoryBinding;", "setBinding", "(Lcom/techvista/apnajanver/databinding/ActivitySubCategoryBinding;)V", "categoryModel", "", "Lcom/techvista/mvvmtest/models/Category/CategoryModel;", "getCategoryModel", "()Ljava/util/List;", "setCategoryModel", "(Ljava/util/List;)V", "postion", "", "getPostion", "()Ljava/lang/String;", "setPostion", "(Ljava/lang/String;)V", "tabCategoryAdapter", "Lcom/techvista/apnajanver/adapter/TabCategoryAdapter;", "getTabCategoryAdapter", "()Lcom/techvista/apnajanver/adapter/TabCategoryAdapter;", "setTabCategoryAdapter", "(Lcom/techvista/apnajanver/adapter/TabCategoryAdapter;)V", "title", "getTitle", "setTitle", "OnTabSelectedListener", "", "position", "", "list", "holder", "Lcom/techvista/apnajanver/adapter/TabCategoryAdapter$ViewHolder;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "subcategory", "tabCategory", "app_debug"})
public final class SubCategoryActivity extends androidx.appcompat.app.AppCompatActivity implements com.techvista.apnajanver.adapter.TabCategoryAdapter.OnTabSelectedListener {
    public com.techvista.apnajanver.databinding.ActivitySubCategoryBinding binding;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.techvista.mvvmtest.models.Category.CategoryModel> categoryModel;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String postion = "";
    public com.techvista.apnajanver.adapter.TabCategoryAdapter tabCategoryAdapter;
    
    public SubCategoryActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.techvista.apnajanver.databinding.ActivitySubCategoryBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.databinding.ActivitySubCategoryBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.techvista.mvvmtest.models.Category.CategoryModel> getCategoryModel() {
        return null;
    }
    
    public final void setCategoryModel(@org.jetbrains.annotations.NotNull
    java.util.List<com.techvista.mvvmtest.models.Category.CategoryModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPostion() {
        return null;
    }
    
    public final void setPostion(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.techvista.apnajanver.adapter.TabCategoryAdapter getTabCategoryAdapter() {
        return null;
    }
    
    public final void setTabCategoryAdapter(@org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.adapter.TabCategoryAdapter p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void subcategory() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void tabCategory() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override
    public void OnTabSelectedListener(int position, @org.jetbrains.annotations.NotNull
    java.util.List<com.techvista.mvvmtest.models.Category.CategoryModel> list, @org.jetbrains.annotations.NotNull
    com.techvista.apnajanver.adapter.TabCategoryAdapter.ViewHolder holder) {
    }
}
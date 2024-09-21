package com.techvista.apnajanver.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\rR\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u001c\u0010\u0013\u001a\u00060\rR\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0018\u00010\rR\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/techvista/apnajanver/adapter/SampleAdapter;", "Lalirezat775/lib/carouselview/CarouselAdapter;", "()V", "EMPTY_ITEM", "", "NORMAL_ITEM", "onClick", "Lcom/techvista/apnajanver/adapter/SampleAdapter$OnClick;", "getOnClick", "()Lcom/techvista/apnajanver/adapter/SampleAdapter$OnClick;", "setOnClick", "(Lcom/techvista/apnajanver/adapter/SampleAdapter$OnClick;)V", "vh", "Lalirezat775/lib/carouselview/CarouselAdapter$CarouselViewHolder;", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnClickListener", "EmptyMyViewHolder", "MyViewHolder", "OnClick", "app_debug"})
public final class SampleAdapter extends alirezat775.lib.carouselview.CarouselAdapter {
    private final int EMPTY_ITEM = 0;
    private final int NORMAL_ITEM = 1;
    private alirezat775.lib.carouselview.CarouselAdapter.CarouselViewHolder vh;
    @org.jetbrains.annotations.Nullable
    private com.techvista.apnajanver.adapter.SampleAdapter.OnClick onClick;
    
    public SampleAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.techvista.apnajanver.adapter.SampleAdapter.OnClick getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable
    com.techvista.apnajanver.adapter.SampleAdapter.OnClick p0) {
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.Nullable
    com.techvista.apnajanver.adapter.SampleAdapter.OnClick onClick) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public alirezat775.lib.carouselview.CarouselAdapter.CarouselViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    alirezat775.lib.carouselview.CarouselAdapter.CarouselViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/techvista/apnajanver/adapter/SampleAdapter$MyViewHolder;", "Lalirezat775/lib/carouselview/CarouselAdapter$CarouselViewHolder;", "Lalirezat775/lib/carouselview/CarouselAdapter;", "itemView", "Landroid/view/View;", "(Lcom/techvista/apnajanver/adapter/SampleAdapter;Landroid/view/View;)V", "title", "Landroid/widget/ImageView;", "getTitle", "()Landroid/widget/ImageView;", "setTitle", "(Landroid/widget/ImageView;)V", "app_debug"})
    public final class MyViewHolder extends alirezat775.lib.carouselview.CarouselAdapter.CarouselViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView title;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/techvista/apnajanver/adapter/SampleAdapter$EmptyMyViewHolder;", "Lalirezat775/lib/carouselview/CarouselAdapter$CarouselViewHolder;", "Lalirezat775/lib/carouselview/CarouselAdapter;", "itemView", "Landroid/view/View;", "(Lcom/techvista/apnajanver/adapter/SampleAdapter;Landroid/view/View;)V", "titleEmpty", "Landroid/widget/TextView;", "getTitleEmpty", "()Landroid/widget/TextView;", "setTitleEmpty", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class EmptyMyViewHolder extends alirezat775.lib.carouselview.CarouselAdapter.CarouselViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView titleEmpty;
        
        public EmptyMyViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTitleEmpty() {
            return null;
        }
        
        public final void setTitleEmpty(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/techvista/apnajanver/adapter/SampleAdapter$OnClick;", "", "click", "", "model", "Lalirezat775/carouselview/sample/SampleModel;", "app_debug"})
    public static abstract interface OnClick {
        
        public abstract void click(@org.jetbrains.annotations.NotNull
        alirezat775.carouselview.sample.SampleModel model);
    }
}
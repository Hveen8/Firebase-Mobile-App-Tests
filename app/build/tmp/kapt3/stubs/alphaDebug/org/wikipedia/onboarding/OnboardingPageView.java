package org.wikipedia.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003$%&B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0014J\u0006\u0010\u001e\u001a\u00020\u0017J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0012J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewOnboardingPageBinding;", "callback", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "getCallback", "()Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "setCallback", "(Lorg/wikipedia/onboarding/OnboardingPageView$Callback;)V", "listDataType", "", "viewHeightDetected", "", "getListData", "", "dataType", "onLayout", "", "changed", "left", "", "top", "right", "bottom", "refreshLanguageList", "removeScrollViewContainerGravity", "setSwitchChecked", "checked", "setUpLanguageListContainer", "showListView", "Callback", "DefaultCallback", "LanguageListAdapter", "app_alphaDebug"})
public final class OnboardingPageView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.onboarding.OnboardingPageView.Callback callback;
    private final org.wikipedia.databinding.ViewOnboardingPageBinding binding = null;
    private java.lang.String listDataType;
    private boolean viewHeightDetected = false;
    
    public OnboardingPageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.onboarding.OnboardingPageView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.onboarding.OnboardingPageView.Callback p0) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    private final void removeScrollViewContainerGravity() {
    }
    
    public final void setSwitchChecked(boolean checked) {
    }
    
    private final void setUpLanguageListContainer(boolean showListView, java.lang.String dataType) {
    }
    
    private final java.util.List<java.lang.String> getListData(java.lang.String dataType) {
        return null;
    }
    
    public final void refreshLanguageList() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "", "onLinkClick", "", "view", "Lorg/wikipedia/onboarding/OnboardingPageView;", "url", "", "onListActionButtonClicked", "onSwitchChange", "checked", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSwitchChange(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view, boolean checked);
        
        public abstract void onLinkClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void onListActionButtonClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$DefaultCallback;", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "()V", "onLinkClick", "", "view", "Lorg/wikipedia/onboarding/OnboardingPageView;", "url", "", "onListActionButtonClicked", "onSwitchChange", "checked", "", "app_alphaDebug"})
    public static final class DefaultCallback implements org.wikipedia.onboarding.OnboardingPageView.Callback {
        
        public DefaultCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSwitchChange(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view, boolean checked) {
        }
        
        @java.lang.Override()
        public void onLinkClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @java.lang.Override()
        public void onListActionButtonClicked(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0012B\u0015\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter$OptionsViewHolder;", "Lorg/wikipedia/onboarding/OnboardingPageView;", "items", "", "", "(Lorg/wikipedia/onboarding/OnboardingPageView;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OptionsViewHolder", "app_alphaDebug"})
    public final class LanguageListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.onboarding.OnboardingPageView.LanguageListAdapter.OptionsViewHolder> {
        private final java.util.List<java.lang.String> items = null;
        
        public LanguageListAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> items) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.onboarding.OnboardingPageView.LanguageListAdapter.OptionsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.onboarding.OnboardingPageView.LanguageListAdapter.OptionsViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter$OptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/onboarding/OnboardingPageView$LanguageListAdapter;Landroid/view/View;)V", "optionLabelTextView", "Landroid/widget/TextView;", "getOptionLabelTextView", "()Landroid/widget/TextView;", "setOptionLabelTextView", "(Landroid/widget/TextView;)V", "app_alphaDebug"})
        public final class OptionsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private android.widget.TextView optionLabelTextView;
            
            public OptionsViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View itemView) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.widget.TextView getOptionLabelTextView() {
                return null;
            }
            
            public final void setOptionLabelTextView(@org.jetbrains.annotations.NotNull()
            android.widget.TextView p0) {
            }
        }
    }
}
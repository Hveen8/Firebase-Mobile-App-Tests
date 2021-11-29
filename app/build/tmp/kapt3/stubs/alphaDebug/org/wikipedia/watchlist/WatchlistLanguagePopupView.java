package org.wikipedia.watchlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0003 !\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistLanguagePopupView;", "Landroid/widget/FrameLayout;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewWatchlistLanguagePopupBinding;", "getBinding", "()Lorg/wikipedia/databinding/ViewWatchlistLanguagePopupBinding;", "callback", "Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$Callback;", "getCallback", "()Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$Callback;", "setCallback", "(Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$Callback;)V", "disabledLangCodes", "", "", "popupWindowHost", "Landroid/widget/PopupWindow;", "onCheckedChanged", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "show", "anchorView", "Landroid/view/View;", "Callback", "RecyclerAdapter", "WatchlistLangViewHolder", "app_alphaDebug"})
public final class WatchlistLanguagePopupView extends android.widget.FrameLayout implements android.widget.CompoundButton.OnCheckedChangeListener {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.databinding.ViewWatchlistLanguagePopupBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.watchlist.WatchlistLanguagePopupView.Callback callback;
    private android.widget.PopupWindow popupWindowHost;
    private final java.util.Set<java.lang.String> disabledLangCodes = null;
    
    public WatchlistLanguagePopupView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ViewWatchlistLanguagePopupBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.watchlist.WatchlistLanguagePopupView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.watchlist.WatchlistLanguagePopupView.Callback p0) {
    }
    
    public final void show(@org.jetbrains.annotations.Nullable()
    android.view.View anchorView, @org.jetbrains.annotations.Nullable()
    org.wikipedia.watchlist.WatchlistLanguagePopupView.Callback callback) {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$WatchlistLangViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lorg/wikipedia/watchlist/WatchlistLanguagePopupView;Landroid/view/View;)V", "bindItem", "", "position", "", "app_alphaDebug"})
    public final class WatchlistLangViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public WatchlistLangViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindItem(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$WatchlistLangViewHolder;", "Lorg/wikipedia/watchlist/WatchlistLanguagePopupView;", "(Lorg/wikipedia/watchlist/WatchlistLanguagePopupView;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_alphaDebug"})
    public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.watchlist.WatchlistLanguagePopupView.WatchlistLangViewHolder> {
        
        public RecyclerAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.watchlist.WatchlistLanguagePopupView.WatchlistLangViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistLanguagePopupView.WatchlistLangViewHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$Callback;", "", "onLanguageChanged", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onLanguageChanged();
    }
}
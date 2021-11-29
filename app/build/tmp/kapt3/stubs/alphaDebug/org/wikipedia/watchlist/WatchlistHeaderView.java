package org.wikipedia.watchlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ItemWatchlistHeaderBinding;", "getBinding", "()Lorg/wikipedia/databinding/ItemWatchlistHeaderBinding;", "callback", "Lorg/wikipedia/watchlist/WatchlistHeaderView$Callback;", "getCallback", "()Lorg/wikipedia/watchlist/WatchlistHeaderView$Callback;", "setCallback", "(Lorg/wikipedia/watchlist/WatchlistHeaderView$Callback;)V", "enableByFilterMode", "", "mode", "", "enableFilterButton", "button", "Landroid/widget/TextView;", "onClick", "v", "Landroid/view/View;", "setFilterButtonDisabled", "setFilterButtonEnabled", "Callback", "app_alphaDebug"})
public final class WatchlistHeaderView extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.databinding.ItemWatchlistHeaderBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.watchlist.WatchlistHeaderView.Callback callback;
    
    public WatchlistHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ItemWatchlistHeaderBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.watchlist.WatchlistHeaderView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.watchlist.WatchlistHeaderView.Callback p0) {
    }
    
    public final void enableByFilterMode(int mode) {
    }
    
    private final void enableFilterButton(android.widget.TextView button) {
    }
    
    private final void setFilterButtonEnabled(android.widget.TextView button) {
    }
    
    private final void setFilterButtonDisabled(android.widget.TextView button) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistHeaderView$Callback;", "", "onSelectFilterAll", "", "onSelectFilterOther", "onSelectFilterPages", "onSelectFilterTalk", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSelectFilterAll();
        
        public abstract void onSelectFilterTalk();
        
        public abstract void onSelectFilterPages();
        
        public abstract void onSelectFilterOther();
    }
}
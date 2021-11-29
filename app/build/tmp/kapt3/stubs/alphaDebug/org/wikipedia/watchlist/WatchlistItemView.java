package org.wikipedia.watchlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J+\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ItemWatchlistBinding;", "getBinding", "()Lorg/wikipedia/databinding/ItemWatchlistBinding;", "callback", "Lorg/wikipedia/watchlist/WatchlistItemView$Callback;", "getCallback", "()Lorg/wikipedia/watchlist/WatchlistItemView$Callback;", "setCallback", "(Lorg/wikipedia/watchlist/WatchlistItemView$Callback;)V", "clickListener", "Landroid/view/View$OnClickListener;", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$WatchlistItem;", "setButtonTextAndIconColor", "", "text", "", "backgroundTint", "", "iconResourceDrawable", "(Ljava/lang/String;ILjava/lang/Integer;)V", "setItem", "Callback", "app_alphaDebug"})
public final class WatchlistItemView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.databinding.ItemWatchlistBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.watchlist.WatchlistItemView.Callback callback;
    private org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem item;
    private android.view.View.OnClickListener clickListener;
    
    public WatchlistItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ItemWatchlistBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.watchlist.WatchlistItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.watchlist.WatchlistItemView.Callback p0) {
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem item) {
    }
    
    private final void setButtonTextAndIconColor(java.lang.String text, @androidx.annotation.AttrRes()
    int backgroundTint, @androidx.annotation.DrawableRes()
    java.lang.Integer iconResourceDrawable) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistItemView$Callback;", "", "onItemClick", "", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$WatchlistItem;", "onUserClick", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem item);
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem item);
    }
}
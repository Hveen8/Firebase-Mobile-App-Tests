package org.wikipedia.feed.view;

import java.lang.System;

@kotlin.Suppress(names = {"LeakingThis"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001)B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\'H\u0004J\b\u0010(\u001a\u00020%H\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/feed/view/ListCardView;", "T", "Lorg/wikipedia/feed/model/Card;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ViewListCardBinding;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "footerView", "Lorg/wikipedia/feed/view/CardFooterView;", "getFooterView", "()Lorg/wikipedia/feed/view/CardFooterView;", "headerView", "Lorg/wikipedia/feed/view/CardHeaderView;", "getHeaderView", "()Lorg/wikipedia/feed/view/CardHeaderView;", "largeHeaderContainer", "Lorg/wikipedia/views/WikiCardView;", "getLargeHeaderContainer", "()Lorg/wikipedia/views/WikiCardView;", "largeHeaderView", "Lorg/wikipedia/feed/view/CardLargeHeaderView;", "getLargeHeaderView", "()Lorg/wikipedia/feed/view/CardLargeHeaderView;", "layoutDirectionView", "Landroidx/recyclerview/widget/RecyclerView;", "getLayoutDirectionView", "()Landroidx/recyclerview/widget/RecyclerView;", "set", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "update", "Callback", "app_alphaDebug"})
public abstract class ListCardView<T extends org.wikipedia.feed.model.Card> extends org.wikipedia.feed.view.DefaultFeedCardView<T> {
    private final org.wikipedia.databinding.ViewListCardBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public ListCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback value) {
    }
    
    protected final void set(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    protected final void update() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.wikipedia.feed.view.CardHeaderView getHeaderView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.wikipedia.feed.view.CardFooterView getFooterView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.wikipedia.views.WikiCardView getLargeHeaderContainer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.wikipedia.feed.view.CardLargeHeaderView getLargeHeaderView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.recyclerview.widget.RecyclerView getLayoutDirectionView() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/view/ListCardView$Callback;", "", "onFooterClick", "", "card", "Lorg/wikipedia/feed/model/Card;", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onFooterClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card);
    }
}
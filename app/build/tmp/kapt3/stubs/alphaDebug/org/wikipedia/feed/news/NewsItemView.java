package org.wikipedia.feed.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/feed/news/NewsItemView;", "Lorg/wikipedia/views/WikiCardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ViewHorizontalScrollListItemCardBinding;", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "imageView", "Lorg/wikipedia/views/FaceAndColorDetectImageView;", "getImageView", "()Lorg/wikipedia/views/FaceAndColorDetectImageView;", "newsItem", "Lorg/wikipedia/feed/news/NewsItem;", "getNewsItem", "()Lorg/wikipedia/feed/news/NewsItem;", "setNewsItem", "(Lorg/wikipedia/feed/news/NewsItem;)V", "removeImageCaption", "", "text", "Landroid/text/Spanned;", "setContents", "", "app_alphaDebug"})
public final class NewsItemView extends org.wikipedia.views.WikiCardView {
    private final org.wikipedia.databinding.ViewHorizontalScrollListItemCardBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.news.NewsItem newsItem;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.views.FaceAndColorDetectImageView imageView = null;
    
    public NewsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.news.NewsItem getNewsItem() {
        return null;
    }
    
    public final void setNewsItem(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.news.NewsItem p0) {
    }
    
    private final java.lang.CharSequence removeImageCaption(android.text.Spanned text) {
        return null;
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.news.NewsItem newsItem) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.views.FaceAndColorDetectImageView getImageView() {
        return null;
    }
}
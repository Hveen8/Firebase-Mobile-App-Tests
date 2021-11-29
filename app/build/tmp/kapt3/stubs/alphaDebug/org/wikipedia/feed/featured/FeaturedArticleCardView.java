package org.wikipedia.feed.featured;

import java.lang.System;

@kotlin.Suppress(names = {"LeakingThis"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/feed/featured/FeaturedArticleCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/featured/FeaturedArticleCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ViewCardFeaturedArticleBinding;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/featured/FeaturedArticleCard;", "setCard", "(Lorg/wikipedia/feed/featured/FeaturedArticleCard;)V", "footerCallback", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "getFooterCallback", "()Lorg/wikipedia/feed/view/CardFooterView$Callback;", "articleSubtitle", "", "", "articleTitle", "extract", "footer", "header", "image", "uri", "Landroid/net/Uri;", "Companion", "app_alphaDebug"})
public class FeaturedArticleCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.featured.FeaturedArticleCard> {
    private final org.wikipedia.databinding.ViewCardFeaturedArticleBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.featured.FeaturedArticleCard card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.featured.FeaturedArticleCardView.Companion Companion = null;
    public static final int EXTRACT_MAX_LINES = 8;
    
    public FeaturedArticleCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wikipedia.feed.featured.FeaturedArticleCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.featured.FeaturedArticleCard value) {
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
    
    private final void articleTitle(java.lang.String articleTitle) {
    }
    
    private final void articleSubtitle(java.lang.String articleSubtitle) {
    }
    
    private final void extract(java.lang.String extract) {
    }
    
    private final void header(org.wikipedia.feed.featured.FeaturedArticleCard card) {
    }
    
    private final void footer(org.wikipedia.feed.featured.FeaturedArticleCard card) {
    }
    
    private final void image(android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.wikipedia.feed.view.CardFooterView.Callback getFooterCallback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/featured/FeaturedArticleCardView$Companion;", "", "()V", "EXTRACT_MAX_LINES", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
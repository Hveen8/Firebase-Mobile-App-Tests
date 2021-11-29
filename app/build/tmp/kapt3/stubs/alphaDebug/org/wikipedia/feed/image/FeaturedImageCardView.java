package org.wikipedia.feed.image;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/feed/image/FeaturedImageCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/image/FeaturedImageCard;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ViewCardFeaturedImageBinding;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/image/FeaturedImageCard;", "setCard", "(Lorg/wikipedia/feed/image/FeaturedImageCard;)V", "description", "", "text", "", "header", "image", "Lorg/wikipedia/feed/image/FeaturedImage;", "loadImage", "setClickListeners", "Callback", "app_alphaDebug"})
public final class FeaturedImageCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.image.FeaturedImageCard> {
    private final org.wikipedia.databinding.ViewCardFeaturedImageBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.image.FeaturedImageCard card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public FeaturedImageCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wikipedia.feed.image.FeaturedImageCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.image.FeaturedImageCard value) {
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
    
    private final void image(org.wikipedia.feed.image.FeaturedImage image) {
    }
    
    private final void loadImage(org.wikipedia.feed.image.FeaturedImage image) {
    }
    
    private final void description(java.lang.String text) {
    }
    
    private final void setClickListeners() {
    }
    
    private final void header(org.wikipedia.feed.image.FeaturedImageCard card) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/image/FeaturedImageCardView$Callback;", "", "onDownloadImage", "", "image", "Lorg/wikipedia/feed/image/FeaturedImage;", "onFeaturedImageSelected", "card", "Lorg/wikipedia/feed/image/FeaturedImageCard;", "onShareImage", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onShareImage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImageCard card);
        
        public abstract void onDownloadImage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImage image);
        
        public abstract void onFeaturedImageSelected(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.image.FeaturedImageCard card);
    }
}
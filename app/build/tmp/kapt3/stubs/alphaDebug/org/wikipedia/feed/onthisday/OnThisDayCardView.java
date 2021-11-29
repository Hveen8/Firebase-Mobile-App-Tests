package org.wikipedia.feed.onthisday;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/onthisday/OnThisDayCard;", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "age", "", "binding", "Lorg/wikipedia/databinding/ViewCardOnThisDayBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/onthisday/OnThisDayCard;", "setCard", "(Lorg/wikipedia/feed/onthisday/OnThisDayCard;)V", "funnel", "Lorg/wikipedia/analytics/FeedFunnel;", "footer", "", "header", "onCardClicked", "view", "Landroid/view/View;", "onFooterClicked", "updateOtdEventUI", "app_alphaDebug"})
public final class OnThisDayCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.onthisday.OnThisDayCard> implements org.wikipedia.feed.view.CardFooterView.Callback {
    private final org.wikipedia.databinding.ViewCardOnThisDayBinding binding = null;
    private final org.wikipedia.analytics.FeedFunnel funnel = null;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private int age = 0;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.onthisday.OnThisDayCard card;
    
    public OnThisDayCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    public void onFooterClicked() {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wikipedia.feed.onthisday.OnThisDayCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.onthisday.OnThisDayCard value) {
    }
    
    private final void header(org.wikipedia.feed.onthisday.OnThisDayCard card) {
    }
    
    private final void footer(org.wikipedia.feed.onthisday.OnThisDayCard card) {
    }
    
    private final void onCardClicked(android.view.View view) {
    }
    
    private final void updateOtdEventUI(org.wikipedia.feed.onthisday.OnThisDayCard card) {
    }
}
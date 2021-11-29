package org.wikipedia.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/feed/FeedCoordinator;", "Lorg/wikipedia/feed/FeedCoordinatorBase;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "buildScript", "", "age", "", "reset", "Companion", "app_alphaDebug"})
public final class FeedCoordinator extends org.wikipedia.feed.FeedCoordinatorBase {
    private final org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.FeedCoordinator.Companion Companion = null;
    
    public FeedCoordinator(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override()
    public void reset() {
    }
    
    @java.lang.Override()
    protected void buildScript(int age) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void postCardsToCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.dataclient.FeedClient.Callback cb, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.wikipedia.feed.model.Card> cards) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/FeedCoordinator$Companion;", "", "()V", "postCardsToCallback", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "cards", "", "Lorg/wikipedia/feed/model/Card;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void postCardsToCallback(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.dataclient.FeedClient.Callback cb, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.feed.model.Card> cards) {
        }
    }
}
package org.wikipedia.feed.aggregated;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "", "()V", "aggregatedResponseAge", "", "aggregatedResponses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "cancel", "", "invalidate", "BaseClient", "FeaturedArticle", "FeaturedImage", "InTheNews", "OnThisDayFeed", "TopReadArticles", "app_alphaDebug"})
public final class AggregatedFeedContentClient {
    private final java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> aggregatedResponses = null;
    private int aggregatedResponseAge = -1;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    
    public AggregatedFeedContentClient() {
        super();
    }
    
    public final void invalidate() {
    }
    
    public final void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$OnThisDayFeed;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app_alphaDebug"})
    public static final class OnThisDayFeed extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public OnThisDayFeed(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$InTheNews;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app_alphaDebug"})
    public static final class InTheNews extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public InTheNews(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$FeaturedArticle;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app_alphaDebug"})
    public static final class FeaturedArticle extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public FeaturedArticle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$TopReadArticles;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app_alphaDebug"})
    public static final class TopReadArticles extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public TopReadArticles(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$FeaturedImage;", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "getCardFromResponse", "", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "app_alphaDebug"})
    public static final class FeaturedImage extends org.wikipedia.feed.aggregated.AggregatedFeedContentClient.BaseClient {
        
        public FeaturedImage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super(null);
        }
        
        @java.lang.Override()
        public void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J:\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J(\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient$BaseClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "aggregatedClient", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;", "(Lorg/wikipedia/feed/aggregated/AggregatedFeedContentClient;)V", "age", "", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "cancel", "", "getCardFromResponse", "responses", "", "", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "outCards", "", "Lorg/wikipedia/feed/model/Card;", "request", "context", "Landroid/content/Context;", "requestAggregated", "app_alphaDebug"})
    public static abstract class BaseClient implements org.wikipedia.feed.dataclient.FeedClient {
        private final org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient = null;
        private org.wikipedia.feed.dataclient.FeedClient.Callback cb;
        private org.wikipedia.dataclient.WikiSite wiki;
        private int age = 0;
        
        public BaseClient(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.aggregated.AggregatedFeedContentClient aggregatedClient) {
            super();
        }
        
        public abstract void getCardFromResponse(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, org.wikipedia.feed.aggregated.AggregatedFeedContent> responses, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.model.Card> outCards);
        
        @java.lang.Override()
        public void request(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.dataclient.FeedClient.Callback cb) {
        }
        
        @java.lang.Override()
        public void cancel() {
        }
        
        private final void requestAggregated() {
        }
    }
}
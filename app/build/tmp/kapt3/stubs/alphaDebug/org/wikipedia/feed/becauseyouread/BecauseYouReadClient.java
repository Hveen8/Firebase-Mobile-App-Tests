package org.wikipedia.feed.becauseyouread;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/feed/becauseyouread/BecauseYouReadClient;", "Lorg/wikipedia/feed/dataclient/FeedClient;", "()V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "cancel", "", "getCardForHistoryEntry", "entry", "Lorg/wikipedia/history/HistoryEntry;", "cb", "Lorg/wikipedia/feed/dataclient/FeedClient$Callback;", "request", "context", "Landroid/content/Context;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "toBecauseYouReadCard", "Lorg/wikipedia/feed/becauseyouread/BecauseYouReadCard;", "results", "", "Lorg/wikipedia/dataclient/page/PageSummary;", "pageSummary", "wikiSite", "app_alphaDebug"})
public final class BecauseYouReadClient implements org.wikipedia.feed.dataclient.FeedClient {
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    
    public BecauseYouReadClient() {
        super();
    }
    
    @java.lang.Override()
    public void request(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.dataclient.FeedClient.Callback cb) {
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    private final void getCardForHistoryEntry(org.wikipedia.history.HistoryEntry entry, org.wikipedia.feed.dataclient.FeedClient.Callback cb) {
    }
    
    private final org.wikipedia.feed.becauseyouread.BecauseYouReadCard toBecauseYouReadCard(java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> results, org.wikipedia.dataclient.page.PageSummary pageSummary, org.wikipedia.dataclient.WikiSite wikiSite) {
        return null;
    }
}
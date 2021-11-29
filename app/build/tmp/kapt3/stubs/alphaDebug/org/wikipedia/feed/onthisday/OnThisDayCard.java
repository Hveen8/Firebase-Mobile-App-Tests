package org.wikipedia.feed.onthisday;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\bH\u0014J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0003J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "events", "", "Lorg/wikipedia/feed/onthisday/OnThisDay$Event;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "(Ljava/util/List;Lorg/wikipedia/dataclient/WikiSite;I)V", "getAge", "()I", "callback", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "date", "Ljava/util/Calendar;", "eventShownOnCard", "nextYear", "dismissHashCode", "footerActionText", "", "pages", "Lorg/wikipedia/dataclient/page/PageSummary;", "subtitle", "text", "", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "year", "app_alphaDebug"})
public final class OnThisDayCard extends org.wikipedia.feed.model.WikiSiteCard {
    private final int age = 0;
    private final int nextYear = 0;
    private final java.util.Calendar date = null;
    private final org.wikipedia.feed.onthisday.OnThisDay.Event eventShownOnCard = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public OnThisDayCard(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.feed.onthisday.OnThisDay.Event> events, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age) {
        super(null);
    }
    
    public final int getAge() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String subtitle() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String footerActionText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence text() {
        return null;
    }
    
    public final int year() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary> pages() {
        return null;
    }
}
package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/analytics/FeedFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "app", "Lorg/wikipedia/WikipediaApp;", "(Lorg/wikipedia/WikipediaApp;)V", "entered", "", "cardClicked", "", "cardType", "Lorg/wikipedia/feed/model/CardType;", "languageCode", "", "cardShown", "dismissCard", "position", "", "enter", "exit", "refresh", "age", "requestMore", "Companion", "app_alphaDebug"})
public final class FeedFunnel extends org.wikipedia.analytics.TimedFunnel {
    private boolean entered = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.FeedFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppFeed";
    private static final int REVISION = 18115458;
    private static final java.util.List<org.wikipedia.feed.model.CardType> EXCLUDED_CARDS = null;
    
    public FeedFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app) {
        super(null, null, 0, 0, null);
    }
    
    public final void enter() {
    }
    
    public final void exit() {
    }
    
    public final void cardShown(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.CardType cardType, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void cardClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.CardType cardType, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void requestMore(int age) {
    }
    
    public final void refresh(int age) {
    }
    
    public final void dismissCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.CardType cardType, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/analytics/FeedFunnel$Companion;", "", "()V", "EXCLUDED_CARDS", "", "Lorg/wikipedia/feed/model/CardType;", "REVISION", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
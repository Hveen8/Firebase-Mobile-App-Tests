package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/analytics/RandomizerFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "app", "Lorg/wikipedia/WikipediaApp;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/dataclient/WikiSite;Lorg/wikipedia/Constants$InvokeSource;)V", "numClicksBack", "", "numClicksForward", "numSwipesBack", "numSwipesForward", "clickedBack", "", "clickedForward", "done", "preprocessSessionToken", "eventData", "Lorg/json/JSONObject;", "swipedBack", "swipedForward", "Companion", "app_alphaDebug"})
public final class RandomizerFunnel extends org.wikipedia.analytics.TimedFunnel {
    private final org.wikipedia.Constants.InvokeSource source = null;
    private int numSwipesForward = 0;
    private int numSwipesBack = 0;
    private int numClicksForward = 0;
    private int numClicksBack = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.RandomizerFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppRandomizer";
    private static final int REV_ID = 18118733;
    
    public RandomizerFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
        super(null, null, 0, 0, null);
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    public final void swipedForward() {
    }
    
    public final void swipedBack() {
    }
    
    public final void clickedForward() {
    }
    
    public final void clickedBack() {
    }
    
    public final void done() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/RandomizerFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
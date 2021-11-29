package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFeedFunnel;", "Lorg/wikipedia/analytics/Funnel;", "type", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "(Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;Lorg/wikipedia/Constants$InvokeSource;)V", "editSuccess", "", "preprocessData", "Lorg/json/JSONObject;", "eventData", "preprocessSessionToken", "start", "stop", "Companion", "app_alphaDebug"})
public final class SuggestedEditsFeedFunnel extends org.wikipedia.analytics.Funnel {
    private final org.wikipedia.descriptions.DescriptionEditActivity.Action type = null;
    private final org.wikipedia.Constants.InvokeSource source = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.SuggestedEditsFeedFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppSuggestedEditsFeed";
    private static final int REVISION = 20437611;
    
    public SuggestedEditsFeedFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action type, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
        super(null, null, 0, null);
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void editSuccess() {
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFeedFunnel$Companion;", "", "()V", "REVISION", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
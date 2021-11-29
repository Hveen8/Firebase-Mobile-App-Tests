package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0014\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/analytics/IntentFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "(Lorg/wikipedia/WikipediaApp;)V", "logFeaturedArticleWidgetTap", "", "logProcessTextIntent", "logSearchWidgetTap", "logShareIntent", "preprocessSessionToken", "eventData", "Lorg/json/JSONObject;", "Companion", "app_alphaDebug"})
public final class IntentFunnel extends org.wikipedia.analytics.Funnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.IntentFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppIntents";
    private static final int REV_ID = 18115555;
    
    public IntentFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app) {
        super(null, null, 0, null);
    }
    
    public final void logSearchWidgetTap() {
    }
    
    public final void logFeaturedArticleWidgetTap() {
    }
    
    public final void logShareIntent() {
    }
    
    public final void logProcessTextIntent() {
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/IntentFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
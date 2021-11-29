package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/analytics/WiktionaryDialogFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "app", "Lorg/wikipedia/WikipediaApp;", "text", "", "(Lorg/wikipedia/WikipediaApp;Ljava/lang/String;)V", "logClose", "", "preprocessSessionToken", "eventData", "Lorg/json/JSONObject;", "Companion", "app_alphaDebug"})
public final class WiktionaryDialogFunnel extends org.wikipedia.analytics.TimedFunnel {
    private final java.lang.String text = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.WiktionaryDialogFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppWiktionaryPopup";
    private static final int REV_ID = 18118768;
    
    public WiktionaryDialogFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        super(null, null, 0, 0, null);
    }
    
    public final void logClose() {
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/WiktionaryDialogFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
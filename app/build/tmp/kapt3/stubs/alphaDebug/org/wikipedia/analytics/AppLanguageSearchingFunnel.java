package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/AppLanguageSearchingFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "settingsSessionToken", "", "(Ljava/lang/String;)V", "logLanguageAdded", "", "languageAdded", "", "languageCode", "searchString", "logNoLanguageAdded", "preprocessSessionToken", "eventData", "Lorg/json/JSONObject;", "Companion", "app_alphaDebug"})
public final class AppLanguageSearchingFunnel extends org.wikipedia.analytics.TimedFunnel {
    private final java.lang.String settingsSessionToken = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.AppLanguageSearchingFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppLanguageSearching";
    private static final int REV_ID = 18204518;
    
    public AppLanguageSearchingFunnel(@org.jetbrains.annotations.NotNull()
    java.lang.String settingsSessionToken) {
        super(null, null, 0, 0, null);
    }
    
    public final void logLanguageAdded(boolean languageAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString) {
    }
    
    public final void logNoLanguageAdded(boolean languageAdded, @org.jetbrains.annotations.Nullable()
    java.lang.String searchString) {
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/AppLanguageSearchingFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
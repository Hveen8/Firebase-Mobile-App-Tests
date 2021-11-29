package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rJ(\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u001b\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/analytics/SearchFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/Constants$InvokeSource;)V", "preprocessData", "Lorg/json/JSONObject;", "eventData", "searchCancel", "", "languageCode", "", "searchClick", "position", "", "searchDidYouMean", "searchError", "fullText", "", "delayMillis", "searchLanguageSwitch", "previousLanguage", "currentLanguage", "searchResults", "numResults", "searchStart", "Companion", "app_alphaDebug"})
public final class SearchFunnel extends org.wikipedia.analytics.Funnel {
    private final org.wikipedia.Constants.InvokeSource source = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.SearchFunnel.Companion Companion = null;
    
    /**
     * Please email someone in Discovery (Search Team's Product Manager or a Data Analyst)
     * if you change the schema name or version.
     */
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppSearch";
    private static final int REVISION = 18204643;
    
    public SearchFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
        super(null, null, 0, null);
    }
    
    public final void searchStart() {
    }
    
    public final void searchCancel(@org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void searchClick(int position, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void searchDidYouMean(@org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void searchResults(boolean fullText, int numResults, int delayMillis, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void searchError(boolean fullText, int delayMillis, @org.jetbrains.annotations.Nullable()
    java.lang.String languageCode) {
    }
    
    public final void searchLanguageSwitch(@org.jetbrains.annotations.NotNull()
    java.lang.String previousLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String currentLanguage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/SearchFunnel$Companion;", "", "()V", "REVISION", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ&\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\rJ\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/analytics/ShareAFactFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "pageId", "", "revisionId", "", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/page/PageTitle;IJ)V", "", "logAbandoned", "", "text", "logAction", "action", "shareMode", "Lorg/wikipedia/analytics/ShareAFactFunnel$ShareMode;", "logHighlight", "logShareIntent", "logShareTap", "preprocessData", "Lorg/json/JSONObject;", "eventData", "Companion", "ShareMode", "app_alphaDebug"})
public final class ShareAFactFunnel extends org.wikipedia.analytics.Funnel {
    private final int pageId = 0;
    private final long revisionId = 0L;
    private final java.lang.String pageTitle = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.ShareAFactFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppShareAFact";
    private static final int REV_ID = 18144594;
    
    /**
     * The length value of 99 is somewhat arbitrary right now. We need to restrict the
     * total length of the event data somewhat to avoid the event getting dropped.
     */
    private static final int MAX_LENGTH = 99;
    
    public ShareAFactFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, int pageId, long revisionId) {
        super(null, null, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    private final void logAction(java.lang.String action, java.lang.String text, org.wikipedia.analytics.ShareAFactFunnel.ShareMode shareMode) {
    }
    
    /**
     * Text in the web view was highlighted.
     */
    public final void logHighlight() {
    }
    
    /**
     * The share button in the UI was tapped.
     */
    public final void logShareTap(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * 'Share as image' or 'Share as text' was tapped.
     */
    public final void logShareIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.ShareAFactFunnel.ShareMode shareMode) {
    }
    
    /**
     * 'Share as text' and 'Share as image' was shown but cancelled and neither was chosen.
     */
    public final void logAbandoned(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/analytics/ShareAFactFunnel$ShareMode;", "", "(Ljava/lang/String;I)V", "IMAGE", "TEXT", "app_alphaDebug"})
    public static enum ShareMode {
        /*public static final*/ IMAGE /* = new IMAGE() */,
        /*public static final*/ TEXT /* = new TEXT() */;
        
        ShareMode() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/analytics/ShareAFactFunnel$Companion;", "", "()V", "MAX_LENGTH", "", "REV_ID", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
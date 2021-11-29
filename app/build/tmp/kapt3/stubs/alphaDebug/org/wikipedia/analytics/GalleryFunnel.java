package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0018\u0010\u0012\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0018\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0018\u0010\u0015\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/analytics/GalleryFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "app", "Lorg/wikipedia/WikipediaApp;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "source", "", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/dataclient/WikiSite;I)V", "logGalleryAction", "", "action", "", "currentPageTitle", "Lorg/wikipedia/page/PageTitle;", "currentMediaTitle", "logGalleryClose", "logGalleryOpen", "logGallerySave", "logGalleryShare", "logGallerySwipeLeft", "logGallerySwipeRight", "preprocessData", "Lorg/json/JSONObject;", "eventData", "Companion", "app_alphaDebug"})
public final class GalleryFunnel extends org.wikipedia.analytics.TimedFunnel {
    private final int source = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.GalleryFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppMediaGallery";
    private static final int REV_ID = 18115560;
    public static final int SOURCE_LEAD_IMAGE = 0;
    public static final int SOURCE_NON_LEAD_IMAGE = 1;
    public static final int SOURCE_LINK_PREVIEW = 2;
    public static final int SOURCE_FEED_FEATURED_IMAGE = 3;
    
    public GalleryFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki, int source) {
        super(null, null, 0, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    private final void logGalleryAction(java.lang.String action, org.wikipedia.page.PageTitle currentPageTitle, java.lang.String currentMediaTitle) {
    }
    
    public final void logGalleryOpen(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle currentPageTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String currentMediaTitle) {
    }
    
    public final void logGalleryClose(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle currentPageTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String currentMediaTitle) {
    }
    
    public final void logGallerySwipeLeft(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle currentPageTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String currentMediaTitle) {
    }
    
    public final void logGallerySwipeRight(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle currentPageTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String currentMediaTitle) {
    }
    
    public final void logGalleryShare(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle currentPageTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String currentMediaTitle) {
    }
    
    public final void logGallerySave(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle currentPageTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String currentMediaTitle) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/analytics/GalleryFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "SOURCE_FEED_FEATURED_IMAGE", "SOURCE_LEAD_IMAGE", "SOURCE_LINK_PREVIEW", "SOURCE_NON_LEAD_IMAGE", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
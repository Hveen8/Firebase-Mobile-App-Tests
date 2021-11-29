package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/analytics/LinkPreviewFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "app", "Lorg/wikipedia/WikipediaApp;", "source", "", "(Lorg/wikipedia/WikipediaApp;I)V", "pageId", "logCancel", "", "logLinkClick", "logNavigate", "preprocessData", "Lorg/json/JSONObject;", "eventData", "setPageId", "Companion", "app_alphaDebug"})
public final class LinkPreviewFunnel extends org.wikipedia.analytics.TimedFunnel {
    private final int source = 0;
    private int pageId = 0;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.LinkPreviewFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppLinkPreview";
    private static final int REV_ID = 18531254;
    private static final int PROD_LINK_PREVIEW_VERSION = 3;
    
    public LinkPreviewFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, int source) {
        super(null, null, 0, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    public final void setPageId(int pageId) {
    }
    
    public final void logLinkClick() {
    }
    
    public final void logNavigate() {
    }
    
    public final void logCancel() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/analytics/LinkPreviewFunnel$Companion;", "", "()V", "PROD_LINK_PREVIEW_VERSION", "", "REV_ID", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
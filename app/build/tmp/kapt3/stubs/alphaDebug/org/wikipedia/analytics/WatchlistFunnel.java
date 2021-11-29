package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/analytics/WatchlistFunnel;", "Lorg/wikipedia/analytics/Funnel;", "()V", "logAction", "", "action", "", "logAddArticle", "logAddExpiry", "logAddSuccess", "logChangeLanguage", "languagesList", "", "logOpenWatchlist", "logRemoveArticle", "logRemoveSuccess", "logShowTooltip", "logShowTooltipMore", "logViewWatchlist", "Companion", "app_alphaDebug"})
public final class WatchlistFunnel extends org.wikipedia.analytics.Funnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.WatchlistFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppWatchlist";
    private static final int REV_ID = 20936401;
    
    public WatchlistFunnel() {
        super(null, null, 0, null);
    }
    
    private final void logAction(java.lang.String action) {
    }
    
    public final void logShowTooltipMore() {
    }
    
    public final void logShowTooltip() {
    }
    
    public final void logAddArticle() {
    }
    
    public final void logAddExpiry() {
    }
    
    public final void logAddSuccess() {
    }
    
    public final void logViewWatchlist() {
    }
    
    public final void logOpenWatchlist() {
    }
    
    public final void logRemoveArticle() {
    }
    
    public final void logRemoveSuccess() {
    }
    
    public final void logChangeLanguage(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> languagesList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/WatchlistFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
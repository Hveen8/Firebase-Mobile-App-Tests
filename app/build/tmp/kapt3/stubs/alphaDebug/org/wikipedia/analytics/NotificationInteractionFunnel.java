package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u000eJ\u0015\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/analytics/NotificationInteractionFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "notification", "Lorg/wikipedia/notifications/db/Notification;", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/notifications/db/Notification;)V", "id", "", "wiki", "", "type", "(Lorg/wikipedia/WikipediaApp;JLjava/lang/String;Ljava/lang/String;)V", "logAction", "", "index", "", "link", "Lorg/wikipedia/notifications/db/Notification$Link;", "logClicked", "logDismissed", "logIncoming", "logMarkRead", "selectionToken", "(Ljava/lang/Long;)V", "preprocessData", "Lorg/json/JSONObject;", "eventData", "preprocessSessionToken", "Companion", "app_alphaDebug"})
public final class NotificationInteractionFunnel extends org.wikipedia.analytics.Funnel {
    private final long id = 0L;
    private final java.lang.String wiki = null;
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.NotificationInteractionFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppNotificationInteraction";
    private static final int REV_ID = 21794376;
    private static final int ACTION_CLICKED = 10;
    private static final int ACTION_DISMISSED = 11;
    
    public NotificationInteractionFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String type) {
        super(null, null, 0, null);
    }
    
    public NotificationInteractionFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification) {
        super(null, null, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    public final void logMarkRead(@org.jetbrains.annotations.Nullable()
    java.lang.Long selectionToken) {
    }
    
    public final void logIncoming() {
    }
    
    public final void logAction(int index, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification.Link link) {
    }
    
    public final void logClicked() {
    }
    
    public final void logDismissed() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/analytics/NotificationInteractionFunnel$Companion;", "", "()V", "ACTION_CLICKED", "", "ACTION_DISMISSED", "REV_ID", "SCHEMA_NAME", "", "processIntent", "", "intent", "Landroid/content/Intent;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void processIntent(@org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
}
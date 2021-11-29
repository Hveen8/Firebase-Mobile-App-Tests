package org.wikipedia.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J0\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012J,\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u00142\b\b\u0001\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J*\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0014J\\\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u001d\u001a\u00020\u00142\b\b\u0001\u0010\u001c\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0016J&\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/notifications/NotificationPresenter;", "", "()V", "addAction", "", "context", "Landroid/content/Context;", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "link", "Lorg/wikipedia/notifications/db/Notification$Link;", "n", "Lorg/wikipedia/notifications/db/Notification;", "addActionForTalkPage", "addActionWithDirectReply", "title", "Lorg/wikipedia/page/PageTitle;", "replyTo", "", "id", "", "addIntentExtras", "Landroid/content/Intent;", "intent", "", "type", "drawNotificationBitmap", "Landroid/graphics/Bitmap;", "color", "icon", "lang", "getDefaultBuilder", "notificationCategory", "Lorg/wikipedia/notifications/NotificationCategory;", "showMultipleUnread", "unreadCount", "showNotification", "text", "longText", "", "bodyIntent", "wikiSiteName", "app_alphaDebug"})
public final class NotificationPresenter {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationPresenter INSTANCE = null;
    
    private NotificationPresenter() {
        super();
    }
    
    public final void showNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification n, @org.jetbrains.annotations.NotNull()
    java.lang.String wikiSiteName, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    public final void showMultipleUnread(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int unreadCount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent addIntentExtras(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, long id, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder getDefaultBuilder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long id, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.NotificationCategory notificationCategory) {
        return null;
    }
    
    public final void showNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder builder, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence longText, @org.jetbrains.annotations.Nullable()
    java.lang.String lang, @androidx.annotation.DrawableRes()
    int icon, @androidx.annotation.ColorRes()
    int color, @org.jetbrains.annotations.NotNull()
    android.content.Intent bodyIntent) {
    }
    
    private final void addAction(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, org.wikipedia.notifications.db.Notification.Link link, org.wikipedia.notifications.db.Notification n) {
    }
    
    private final void addActionForTalkPage(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, org.wikipedia.notifications.db.Notification.Link link, org.wikipedia.notifications.db.Notification n) {
    }
    
    private final void addActionWithDirectReply(android.content.Context context, androidx.core.app.NotificationCompat.Builder builder, org.wikipedia.page.PageTitle title, java.lang.String replyTo, int id) {
    }
    
    private final android.graphics.Bitmap drawNotificationBitmap(android.content.Context context, @androidx.annotation.ColorRes()
    int color, @androidx.annotation.DrawableRes()
    int icon, java.lang.String lang) {
        return null;
    }
}
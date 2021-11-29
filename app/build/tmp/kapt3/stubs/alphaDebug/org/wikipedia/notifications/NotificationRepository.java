package org.wikipedia.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ3\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00150\u0014J\u0014\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0015J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/notifications/NotificationRepository;", "", "notificationDao", "Lorg/wikipedia/notifications/db/NotificationDao;", "(Lorg/wikipedia/notifications/db/NotificationDao;)V", "deleteNotification", "", "notification", "Lorg/wikipedia/notifications/db/Notification;", "fetchAndSave", "", "wikiList", "filter", "continueStr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUnreadWikiDbNames", "", "Lorg/wikipedia/dataclient/WikiSite;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "insertNotifications", "notifications", "updateNotification", "app_alphaDebug"})
public final class NotificationRepository {
    private final org.wikipedia.notifications.db.NotificationDao notificationDao = null;
    
    public NotificationRepository(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.NotificationDao notificationDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<org.wikipedia.notifications.db.Notification>> getAllNotifications() {
        return null;
    }
    
    public final void insertNotifications(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.notifications.db.Notification> notifications) {
    }
    
    public final void updateNotification(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification) {
    }
    
    public final void deleteNotification(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchUnreadWikiDbNames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, org.wikipedia.dataclient.WikiSite>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchAndSave(@org.jetbrains.annotations.Nullable()
    java.lang.String wikiList, @org.jetbrains.annotations.Nullable()
    java.lang.String filter, @org.jetbrains.annotations.Nullable()
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}
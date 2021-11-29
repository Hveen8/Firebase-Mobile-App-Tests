package org.wikipedia.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/notifications/NotificationPollBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_alphaDebug"})
public final class NotificationPollBroadcastReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.notifications.NotificationPollBroadcastReceiver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_POLL = "action_notification_poll";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CANCEL = "action_notification_cancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DIRECT_REPLY = "action_direct_reply";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_KEY_DIRECT_REPLY = "key_direct_reply";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_EXTRA_WIKI = "extra_wiki";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_EXTRA_TITLE = "extra_title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_EXTRA_REPLY_TO = "extra_reply_to";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESULT_EXTRA_ID = "extra_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_MULTIPLE = "multiple";
    private static final java.lang.String TYPE_LOCAL = "local";
    private static final int MAX_LOCALLY_KNOWN_NOTIFICATIONS = 32;
    private static final int FIRST_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY = 3;
    private static final int SECOND_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY = 7;
    private static final org.wikipedia.notifications.NotificationRepository notificationRepository = null;
    private static final java.util.Map<java.lang.String, org.wikipedia.dataclient.WikiSite> DBNAME_WIKI_SITE_MAP = null;
    private static final java.util.Map<java.lang.String, java.lang.String> DBNAME_WIKI_NAME_MAP = null;
    private static java.util.List<java.lang.Long> LOCALLY_KNOWN_NOTIFICATIONS;
    
    public NotificationPollBroadcastReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void startPollTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void pollNotifications(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J \u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0004J)\u0010$\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040&H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0016\u0010(\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0&H\u0002J$\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020*0&2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u001e\u00101\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020*0&H\u0002J\u0010\u00102\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0019\u00103\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u0018\u00105\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0001\u00106\u001a\u00020\fJ\u0010\u00107\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u000e\u00108\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lorg/wikipedia/notifications/NotificationPollBroadcastReceiver$Companion;", "", "()V", "ACTION_CANCEL", "", "ACTION_DIRECT_REPLY", "ACTION_POLL", "DBNAME_WIKI_NAME_MAP", "", "DBNAME_WIKI_SITE_MAP", "Lorg/wikipedia/dataclient/WikiSite;", "FIRST_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY", "", "LOCALLY_KNOWN_NOTIFICATIONS", "", "", "MAX_LOCALLY_KNOWN_NOTIFICATIONS", "RESULT_EXTRA_ID", "RESULT_EXTRA_REPLY_TO", "RESULT_EXTRA_TITLE", "RESULT_EXTRA_WIKI", "RESULT_KEY_DIRECT_REPLY", "SECOND_EDITOR_REACTIVATION_NOTIFICATION_SHOW_ON_DAY", "TYPE_LOCAL", "TYPE_MULTIPLE", "notificationRepository", "Lorg/wikipedia/notifications/NotificationRepository;", "assertLoggedIn", "", "getAlarmPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "getCancelNotificationPendingIntent", "id", "type", "getFullNotifications", "foreignWikis", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markItemsAsRead", "items", "Lorg/wikipedia/notifications/db/Notification;", "markRead", "wiki", "notifications", "unread", "", "maybeShowLocalNotificationForEditorReactivation", "onNotificationsComplete", "pollNotifications", "retrieveNotifications", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showSuggestedEditsLocalNotification", "description", "startPollTask", "stopPollTask", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void startPollTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void stopPollTask(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final android.app.PendingIntent getAlarmPendingIntent(android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.PendingIntent getCancelNotificationPendingIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, long id, @org.jetbrains.annotations.Nullable()
        java.lang.String type) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public final void pollNotifications(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final void assertLoggedIn() {
        }
        
        private final java.lang.Object retrieveNotifications(android.content.Context context, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        private final java.lang.Object getFullNotifications(android.content.Context context, java.util.List<java.lang.String> foreignWikis, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return null;
        }
        
        private final void onNotificationsComplete(android.content.Context context, java.util.List<org.wikipedia.notifications.db.Notification> notifications) {
        }
        
        private final void markItemsAsRead(java.util.List<org.wikipedia.notifications.db.Notification> items) {
        }
        
        public final void markRead(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.notifications.db.Notification> notifications, boolean unread) {
        }
        
        private final void maybeShowLocalNotificationForEditorReactivation(android.content.Context context) {
        }
        
        public final void showSuggestedEditsLocalNotification(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @androidx.annotation.StringRes()
        int description) {
        }
    }
}
package org.wikipedia.talk;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J6\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ0\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/talk/NotificationDirectReplyHelper;", "", "()V", "DIRECT_REPLY_EDIT_COMMENT", "", "cancelNotification", "", "context", "Landroid/content/Context;", "notificationId", "", "fallBackToTalkPage", "title", "Lorg/wikipedia/page/PageTitle;", "handleReply", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "replyText", "replyTo", "waitForUpdatedRevision", "newRevision", "", "app_alphaDebug"})
public final class NotificationDirectReplyHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.talk.NotificationDirectReplyHelper INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIRECT_REPLY_EDIT_COMMENT = "#directreply-1.0";
    
    private NotificationDirectReplyHelper() {
        super();
    }
    
    public final void handleReply(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.lang.String replyText, @org.jetbrains.annotations.NotNull()
    java.lang.String replyTo, int notificationId) {
    }
    
    private final void waitForUpdatedRevision(android.content.Context context, org.wikipedia.dataclient.WikiSite wiki, org.wikipedia.page.PageTitle title, long newRevision, int notificationId) {
    }
    
    private final void fallBackToTalkPage(android.content.Context context, org.wikipedia.page.PageTitle title) {
    }
    
    private final void cancelNotification(android.content.Context context, int notificationId) {
    }
}
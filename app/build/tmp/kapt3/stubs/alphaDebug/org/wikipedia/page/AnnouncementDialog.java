package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/page/AnnouncementDialog;", "Landroid/app/AlertDialog;", "Lorg/wikipedia/feed/announcement/AnnouncementCardView$Callback;", "context", "Landroid/content/Context;", "announcement", "Lorg/wikipedia/feed/announcement/Announcement;", "(Landroid/content/Context;Lorg/wikipedia/feed/announcement/Announcement;)V", "getAnnouncement", "()Lorg/wikipedia/feed/announcement/Announcement;", "funnel", "Lorg/wikipedia/analytics/FeedFunnel;", "dismissDialog", "", "onAnnouncementNegativeAction", "card", "Lorg/wikipedia/feed/model/Card;", "onAnnouncementPositiveAction", "uri", "Landroid/net/Uri;", "show", "app_alphaDebug"})
public final class AnnouncementDialog extends android.app.AlertDialog implements org.wikipedia.feed.announcement.AnnouncementCardView.Callback {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.feed.announcement.Announcement announcement = null;
    private final org.wikipedia.analytics.FeedFunnel funnel = null;
    
    public AnnouncementDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.announcement.Announcement announcement) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.announcement.Announcement getAnnouncement() {
        return null;
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @java.lang.Override()
    public void onAnnouncementPositiveAction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void onAnnouncementNegativeAction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.model.Card card) {
    }
    
    private final void dismissDialog() {
    }
}
package org.wikipedia.feed.announcement;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0006J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0006\u0010\u0015\u001a\u00020\rJ\b\u0010\u0016\u001a\u0004\u0018\u00010\tJ\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/feed/announcement/AnnouncementCard;", "Lorg/wikipedia/feed/model/Card;", "announcement", "Lorg/wikipedia/feed/announcement/Announcement;", "(Lorg/wikipedia/feed/announcement/Announcement;)V", "isArticlePlacement", "", "()Z", "actionTitle", "", "actionUri", "Landroid/net/Uri;", "dismissHashCode", "", "extract", "footerCaption", "hasAction", "hasBorder", "hasFooterCaption", "hasImage", "image", "imageHeight", "negativeText", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app_alphaDebug"})
public class AnnouncementCard extends org.wikipedia.feed.model.Card {
    private final org.wikipedia.feed.announcement.Announcement announcement = null;
    
    public AnnouncementCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.announcement.Announcement announcement) {
        super();
    }
    
    public final boolean isArticlePlacement() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String extract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.net.Uri image() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
    
    public final int imageHeight() {
        return 0;
    }
    
    public final boolean hasAction() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String actionTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri actionUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String negativeText() {
        return null;
    }
    
    public final boolean hasFooterCaption() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String footerCaption() {
        return null;
    }
    
    public final boolean hasImage() {
        return false;
    }
    
    public final boolean hasBorder() {
        return false;
    }
}
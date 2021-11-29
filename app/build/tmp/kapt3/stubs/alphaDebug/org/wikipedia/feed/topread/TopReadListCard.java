package org.wikipedia.feed.topread;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\b\u0010\r\u001a\u00020\fH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadListCard;", "Lorg/wikipedia/feed/model/ListCard;", "Lorg/wikipedia/feed/topread/TopReadItemCard;", "Landroid/os/Parcelable;", "articles", "Lorg/wikipedia/feed/topread/TopRead;", "site", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/feed/topread/TopRead;Lorg/wikipedia/dataclient/WikiSite;)V", "getSite", "()Lorg/wikipedia/dataclient/WikiSite;", "describeContents", "", "dismissHashCode", "footerActionText", "", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_alphaDebug"})
public final class TopReadListCard extends org.wikipedia.feed.model.ListCard<org.wikipedia.feed.topread.TopReadItemCard> implements android.os.Parcelable {
    private final org.wikipedia.feed.topread.TopRead articles = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.dataclient.WikiSite site = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.topread.TopReadListCard.Companion Companion = null;
    public static final android.os.Parcelable.Creator<org.wikipedia.feed.topread.TopReadListCard> CREATOR = null;
    
    public TopReadListCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.topread.TopRead articles, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite site) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getSite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String subtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String footerActionText() {
        return null;
    }
    
    @java.lang.Override()
    protected int dismissHashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<org.wikipedia.feed.topread.TopReadItemCard> toItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> articles, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.feed.topread.TopReadListCard> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.feed.topread.TopReadListCard createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.feed.topread.TopReadListCard[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadListCard$Companion;", "", "()V", "toItems", "", "Lorg/wikipedia/feed/topread/TopReadItemCard;", "articles", "Lorg/wikipedia/dataclient/page/PageSummary;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.VisibleForTesting()
        @kotlin.jvm.JvmStatic()
        public final java.util.List<org.wikipedia.feed.topread.TopReadItemCard> toItems(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.dataclient.page.PageSummary> articles, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
    }
}
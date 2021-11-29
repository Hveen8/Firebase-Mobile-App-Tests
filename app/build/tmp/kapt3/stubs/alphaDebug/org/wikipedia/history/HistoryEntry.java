package org.wikipedia.history;

import java.lang.System;

@androidx.room.Entity()
@kotlinx.parcelize.TypeParceler()
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002DEB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tBo\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014B_\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0015J\t\u00108\u001a\u00020\u0005H\u00d6\u0001J!\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u00c7\u0001J\u0019\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\'\u0010(R&\u0010)\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R$\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b1\u0010(\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b6\u00107\u00a8\u0006F"}, d2 = {"Lorg/wikipedia/history/HistoryEntry;", "Landroid/os/Parcelable;", "title", "Lorg/wikipedia/page/PageTitle;", "source", "", "timestamp", "Ljava/util/Date;", "timeSpentSec", "(Lorg/wikipedia/page/PageTitle;ILjava/util/Date;I)V", "seen1", "authority", "", "lang", "apiTitle", "displayTitle", "id", "namespace", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;II)V", "getApiTitle", "()Ljava/lang/String;", "setApiTitle", "(Ljava/lang/String;)V", "getAuthority", "setAuthority", "getDisplayTitle", "setDisplayTitle", "getId", "()I", "setId", "(I)V", "getLang", "setLang", "getNamespace", "setNamespace", "pageTitle", "getPageTitle$annotations", "()V", "referrer", "getReferrer$annotations", "getReferrer", "setReferrer", "getSource", "setSource", "getTimeSpentSec", "setTimeSpentSec", "getTimestamp$annotations", "getTimestamp", "()Ljava/util/Date;", "setTimestamp", "(Ljava/util/Date;)V", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "describeContents", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class HistoryEntry implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String authority;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lang;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayTitle;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String namespace;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date timestamp;
    private int source;
    private int timeSpentSec;
    @androidx.room.Ignore()
    private org.wikipedia.page.PageTitle pageTitle;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private java.lang.String referrer;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.history.HistoryEntry.Companion Companion = null;
    public static final int SOURCE_SEARCH = 1;
    public static final int SOURCE_INTERNAL_LINK = 2;
    public static final int SOURCE_EXTERNAL_LINK = 3;
    public static final int SOURCE_HISTORY = 4;
    public static final int SOURCE_LANGUAGE_LINK = 6;
    public static final int SOURCE_RANDOM = 7;
    public static final int SOURCE_MAIN_PAGE = 8;
    public static final int SOURCE_DISAMBIG = 10;
    public static final int SOURCE_READING_LIST = 11;
    public static final int SOURCE_FEED_CONTINUE_READING = 12;
    public static final int SOURCE_FEED_BECAUSE_YOU_READ = 13;
    public static final int SOURCE_FEED_MOST_READ = 14;
    public static final int SOURCE_FEED_FEATURED = 15;
    public static final int SOURCE_NEWS = 16;
    public static final int SOURCE_FEED_MAIN_PAGE = 17;
    public static final int SOURCE_FEED_RANDOM = 18;
    public static final int SOURCE_GALLERY = 19;
    public static final int SOURCE_APP_SHORTCUT_RANDOM = 20;
    public static final int SOURCE_APP_SHORTCUT_CONTINUE_READING = 21;
    public static final int SOURCE_FEED_MOST_READ_ACTIVITY = 22;
    public static final int SOURCE_ON_THIS_DAY_CARD = 23;
    public static final int SOURCE_ON_THIS_DAY_ACTIVITY = 24;
    public static final int SOURCE_NOTIFICATION = 25;
    public static final int SOURCE_NOTIFICATION_SYSTEM = 26;
    public static final int SOURCE_FLOATING_QUEUE = 27;
    public static final int SOURCE_EDIT_DESCRIPTION = 28;
    public static final int SOURCE_WIDGET = 29;
    public static final int SOURCE_SUGGESTED_EDITS = 30;
    public static final int SOURCE_TALK_TOPIC = 31;
    public static final int SOURCE_WATCHLIST = 32;
    public static final int SOURCE_EDIT_DIFF_DETAILS = 33;
    public static final int SOURCE_ERROR = 34;
    public static final android.os.Parcelable.Creator<org.wikipedia.history.HistoryEntry> CREATOR = null;
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public HistoryEntry() {
        super();
    }
    
    public HistoryEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.util.Date timestamp, int source, int timeSpentSec) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthority() {
        return null;
    }
    
    public final void setAuthority(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiTitle() {
        return null;
    }
    
    public final void setApiTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final void setDisplayTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamespace() {
        return null;
    }
    
    public final void setNamespace(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTimestamp() {
        return null;
    }
    
    @kotlinx.serialization.Serializable(with = org.wikipedia.json.DateSerializer.class)
    @java.lang.Deprecated()
    public static void getTimestamp$annotations() {
    }
    
    public final void setTimestamp(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getSource() {
        return 0;
    }
    
    public final void setSource(int p0) {
    }
    
    public final int getTimeSpentSec() {
        return 0;
    }
    
    public final void setTimeSpentSec(int p0) {
    }
    
    public HistoryEntry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, int source, @org.jetbrains.annotations.NotNull()
    java.util.Date timestamp, int timeSpentSec) {
        super();
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    private static void getPageTitle$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReferrer() {
        return null;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    public static void getReferrer$annotations() {
    }
    
    public final void setReferrer(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.history.HistoryEntry> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.history.HistoryEntry createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.history.HistoryEntry[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/history/HistoryEntry$Companion;", "", "()V", "SOURCE_APP_SHORTCUT_CONTINUE_READING", "", "SOURCE_APP_SHORTCUT_RANDOM", "SOURCE_DISAMBIG", "SOURCE_EDIT_DESCRIPTION", "SOURCE_EDIT_DIFF_DETAILS", "SOURCE_ERROR", "SOURCE_EXTERNAL_LINK", "SOURCE_FEED_BECAUSE_YOU_READ", "SOURCE_FEED_CONTINUE_READING", "SOURCE_FEED_FEATURED", "SOURCE_FEED_MAIN_PAGE", "SOURCE_FEED_MOST_READ", "SOURCE_FEED_MOST_READ_ACTIVITY", "SOURCE_FEED_RANDOM", "SOURCE_FLOATING_QUEUE", "SOURCE_GALLERY", "SOURCE_HISTORY", "SOURCE_INTERNAL_LINK", "SOURCE_LANGUAGE_LINK", "SOURCE_MAIN_PAGE", "SOURCE_NEWS", "SOURCE_NOTIFICATION", "SOURCE_NOTIFICATION_SYSTEM", "SOURCE_ON_THIS_DAY_ACTIVITY", "SOURCE_ON_THIS_DAY_CARD", "SOURCE_RANDOM", "SOURCE_READING_LIST", "SOURCE_SEARCH", "SOURCE_SUGGESTED_EDITS", "SOURCE_TALK_TOPIC", "SOURCE_WATCHLIST", "SOURCE_WIDGET", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/history/HistoryEntry;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.history.HistoryEntry> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/history/HistoryEntry.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/history/HistoryEntry;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.history.HistoryEntry> {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.history.HistoryEntry.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.history.HistoryEntry deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
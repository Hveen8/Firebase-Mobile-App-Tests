package org.wikipedia.dataclient.page;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 s2\u00020\u0001:\u0006rstuvwB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tB\u00d7\u0001\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0010\b\u0001\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0002\u0010#B\u00d3\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u00a2\u0006\u0002\u0010$J\u0010\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020^H\u0002J\t\u0010`\u001a\u00020\u000bH\u00d6\u0001J\u000e\u0010a\u001a\u00020^2\u0006\u0010b\u001a\u00020cJ\u000e\u0010d\u001a\u00020e2\u0006\u0010_\u001a\u00020^J\b\u0010f\u001a\u00020\u0003H\u0016J!\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u00002\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mH\u00c7\u0001J\u0019\u0010n\u001a\u00020h2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010%\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\'\"\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010\'R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\'\"\u0004\b0\u0010*R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b1\u0010,\u001a\u0004\b2\u0010\'R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u0010,\u001a\u0004\b4\u00105R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\'\"\u0004\b7\u0010*R\u0013\u00108\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b9\u0010\'R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\b>\u0010?R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b@\u0010,R\u0013\u0010A\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\bB\u0010\'R\u0011\u0010\u0018\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0011\u0010K\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\bL\u0010DR\u0013\u0010M\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\bN\u0010\'R\u0011\u0010O\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\bP\u0010DR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\'R$\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bW\u0010,\u001a\u0004\bX\u0010YR\u0011\u0010\u001c\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010FR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b[\u0010,\u001a\u0004\b\\\u0010\'\u00a8\u0006x\u0080\u00e5\b\f\u0080\u00e5\b\u000e\u0080\u00e5\b\b\u0080\u00e5\b\u0007\u0080\u00e5\b\u0006\u0080\u00e5\b\u0005\u0080\u00e5\b\u0011\u0080\u00e5\b\u0012\u0080\u00e5\b\u0013\u0080\u00e5\b\u0014\u0080\u00e5\b\u0015\u0080\u00e5\b\u0017\u0080\u00e5\b\u0018\u0080\u00e5\b\u0019\u0080\u00e5\b\u001b\u0080\u00e5\b\u001c\u0080\u00e5\b\u001d\u0080\u00e5\b\u001e"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary;", "Landroid/os/Parcelable;", "displayTitle", "", "prefixTitle", "description", "extract", "thumbnail", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "", "namespace", "Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "titles", "Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "originalImage", "wikiBaseItem", "extractHtml", "descriptionSource", "geo", "Landroid/location/Location;", "type", "pageId", "revision", "", "timestamp", "views", "rank", "viewHistory", "", "Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;Lorg/wikipedia/dataclient/page/PageSummary$Titles;Ljava/lang/String;Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;Ljava/lang/String;IJLjava/lang/String;JJLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;Lorg/wikipedia/dataclient/page/PageSummary$Titles;Ljava/lang/String;Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;Ljava/lang/String;IJLjava/lang/String;JJLjava/util/List;)V", "apiTitle", "getApiTitle", "()Ljava/lang/String;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getDescriptionSource$annotations", "()V", "getDescriptionSource", "getDisplayTitle", "getExtract", "setExtract", "getExtractHtml$annotations", "getExtractHtml", "getGeo$annotations", "getGeo", "()Landroid/location/Location;", "getLang", "setLang", "leadImageName", "getLeadImageName", "getNamespace", "()Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "ns", "Lorg/wikipedia/page/Namespace;", "getNs", "()Lorg/wikipedia/page/Namespace;", "getOriginalImage$annotations", "originalImageUrl", "getOriginalImageUrl", "getPageId", "()I", "getRevision", "()J", "getThumbnail", "()Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "setThumbnail", "(Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;)V", "thumbnailHeight", "getThumbnailHeight", "thumbnailUrl", "getThumbnailUrl", "thumbnailWidth", "getThumbnailWidth", "getTimestamp", "getTitles", "()Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "setTitles", "(Lorg/wikipedia/dataclient/page/PageSummary$Titles;)V", "getType", "getViewHistory$annotations", "getViewHistory", "()Ljava/util/List;", "getViews", "getWikiBaseItem$annotations", "getWikiBaseItem", "adjustPageTitle", "Lorg/wikipedia/page/PageTitle;", "title", "describeContents", "getPageTitle", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "toPage", "Lorg/wikipedia/page/Page;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "NamespaceContainer", "Thumbnail", "Titles", "ViewHistory", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public class PageSummary implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer namespace = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.page.PageSummary.Titles titles;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lang;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.dataclient.page.PageSummary.Thumbnail thumbnail;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String extract;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    private final org.wikipedia.dataclient.page.PageSummary.Thumbnail originalImage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String wikiBaseItem = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String extractHtml = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String descriptionSource = null;
    @org.jetbrains.annotations.Nullable()
    private final android.location.Location geo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    private final int pageId = 0;
    private final long revision = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timestamp = null;
    private final long views = 0L;
    private final long rank = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<org.wikipedia.dataclient.page.PageSummary.ViewHistory> viewHistory = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.page.PageSummary.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_STANDARD = "standard";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_DISAMBIGUATION = "disambiguation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_MAIN_PAGE = "mainpage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_NO_EXTRACT = "no-extract";
    public static final android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary> CREATOR = null;
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public PageSummary() {
        super();
    }
    
    public PageSummary(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.NamespaceContainer namespace, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Titles titles, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Thumbnail thumbnail, @org.jetbrains.annotations.Nullable()
    java.lang.String extract, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Thumbnail originalImage, @org.jetbrains.annotations.Nullable()
    java.lang.String wikiBaseItem, @org.jetbrains.annotations.Nullable()
    java.lang.String extractHtml, @org.jetbrains.annotations.NotNull()
    java.lang.String descriptionSource, @org.jetbrains.annotations.Nullable()
    android.location.Location geo, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int pageId, long revision, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp, long views, long rank, @org.jetbrains.annotations.Nullable()
    java.util.List<org.wikipedia.dataclient.page.PageSummary.ViewHistory> viewHistory) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer getNamespace() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary.Titles getTitles() {
        return null;
    }
    
    public final void setTitles(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Titles p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.dataclient.page.PageSummary.Thumbnail getThumbnail() {
        return null;
    }
    
    public final void setThumbnail(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.page.PageSummary.Thumbnail p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtract() {
        return null;
    }
    
    public final void setExtract(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @kotlinx.serialization.SerialName(value = "originalimage")
    @java.lang.Deprecated()
    private static void getOriginalImage$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWikiBaseItem() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "wikibase_item")
    @java.lang.Deprecated()
    public static void getWikiBaseItem$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtractHtml() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "extract_html")
    @java.lang.Deprecated()
    public static void getExtractHtml$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescriptionSource() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "description_source")
    @java.lang.Deprecated()
    public static void getDescriptionSource$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getGeo() {
        return null;
    }
    
    @kotlinx.serialization.Serializable(with = org.wikipedia.json.LocationSerializer.class)
    @java.lang.Deprecated()
    public static void getGeo$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final int getPageId() {
        return 0;
    }
    
    public final long getRevision() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimestamp() {
        return null;
    }
    
    public final long getViews() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<org.wikipedia.dataclient.page.PageSummary.ViewHistory> getViewHistory() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "view_history")
    @java.lang.Deprecated()
    public static void getViewHistory$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbnailUrl() {
        return null;
    }
    
    public final int getThumbnailWidth() {
        return 0;
    }
    
    public final int getThumbnailHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLeadImageName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace getNs() {
        return null;
    }
    
    public PageSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String prefixTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String extract, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Page toPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        return null;
    }
    
    private final org.wikipedia.page.PageTitle adjustPageTitle(org.wikipedia.page.PageTitle title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.dataclient.page.PageSummary createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.dataclient.page.PageSummary[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u00c7\u0001J\u0019\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "Landroid/os/Parcelable;", "seen1", "", "id", "text", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;)V", "getId", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    public static final class NamespaceContainer implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer.Companion Companion = null;
        private final int id = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        public static final android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.NamespaceContainer> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer copy(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary.NamespaceContainer self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public NamespaceContainer() {
            super();
        }
        
        public NamespaceContainer(int id, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
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
        public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.NamespaceContainer> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.dataclient.page.PageSummary.NamespaceContainer> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/dataclient/page/PageSummary.NamespaceContainer.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$NamespaceContainer;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.dataclient.page.PageSummary.NamespaceContainer> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.dataclient.page.PageSummary.NamespaceContainer.$serializer INSTANCE = null;
            
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
            public org.wikipedia.dataclient.page.PageSummary.NamespaceContainer deserialize(@org.jetbrains.annotations.NotNull()
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
            org.wikipedia.dataclient.page.PageSummary.NamespaceContainer value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tB\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u00c7\u0001J\u0019\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "Landroid/os/Parcelable;", "seen1", "", "canonical", "", "display", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getCanonical", "()Ljava/lang/String;", "getDisplay", "describeContents", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    public static final class Titles implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.dataclient.page.PageSummary.Titles.Companion Companion = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String canonical = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String display = null;
        public static final android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.Titles> CREATOR = null;
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary.Titles self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public Titles(@org.jetbrains.annotations.Nullable()
        java.lang.String canonical, @org.jetbrains.annotations.Nullable()
        java.lang.String display) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCanonical() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDisplay() {
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
        public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.Titles> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.Titles createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.Titles[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Titles$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.dataclient.page.PageSummary.Titles> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/dataclient/page/PageSummary.Titles.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$Titles;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.dataclient.page.PageSummary.Titles> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.dataclient.page.PageSummary.Titles.$serializer INSTANCE = null;
            
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
            public org.wikipedia.dataclient.page.PageSummary.Titles deserialize(@org.jetbrains.annotations.NotNull()
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
            org.wikipedia.dataclient.page.PageSummary.Titles value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB3\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u00c7\u0001J\u0019\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "Landroid/os/Parcelable;", "seen1", "", "source", "", "width", "height", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;II)V", "getHeight", "()I", "getSource", "()Ljava/lang/String;", "getWidth", "describeContents", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    public static final class Thumbnail implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.dataclient.page.PageSummary.Thumbnail.Companion Companion = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String source = null;
        private final int width = 0;
        private final int height = 0;
        public static final android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.Thumbnail> CREATOR = null;
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary.Thumbnail self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public Thumbnail(@org.jetbrains.annotations.Nullable()
        java.lang.String source, int width, int height) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSource() {
            return null;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
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
        public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.Thumbnail> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.Thumbnail createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.Thumbnail[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.dataclient.page.PageSummary.Thumbnail> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/dataclient/page/PageSummary.Thumbnail.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$Thumbnail;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.dataclient.page.PageSummary.Thumbnail> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.dataclient.page.PageSummary.Thumbnail.$serializer INSTANCE = null;
            
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
            public org.wikipedia.dataclient.page.PageSummary.Thumbnail deserialize(@org.jetbrains.annotations.NotNull()
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
            org.wikipedia.dataclient.page.PageSummary.Thumbnail value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u00c7\u0001J\u0019\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory;", "Landroid/os/Parcelable;", "seen1", "", "date", "", "views", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;F)V", "getDate", "()Ljava/lang/String;", "getViews", "()F", "describeContents", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    public static final class ViewHistory implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.dataclient.page.PageSummary.ViewHistory.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String date = null;
        private final float views = 0.0F;
        public static final android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.ViewHistory> CREATOR = null;
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.page.PageSummary.ViewHistory self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public ViewHistory(@org.jetbrains.annotations.NotNull()
        java.lang.String date, float views) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final float getViews() {
            return 0.0F;
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
        public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.dataclient.page.PageSummary.ViewHistory> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.ViewHistory createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.dataclient.page.PageSummary.ViewHistory[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.dataclient.page.PageSummary.ViewHistory> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/dataclient/page/PageSummary.ViewHistory.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.dataclient.page.PageSummary.ViewHistory> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.dataclient.page.PageSummary.ViewHistory.$serializer INSTANCE = null;
            
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
            public org.wikipedia.dataclient.page.PageSummary.ViewHistory deserialize(@org.jetbrains.annotations.NotNull()
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
            org.wikipedia.dataclient.page.PageSummary.ViewHistory value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/page/PageSummary$Companion;", "", "()V", "TYPE_DISAMBIGUATION", "", "TYPE_MAIN_PAGE", "TYPE_NO_EXTRACT", "TYPE_STANDARD", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.dataclient.page.PageSummary> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/dataclient/page/PageSummary.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/dataclient/page/PageSummary;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.dataclient.page.PageSummary> {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.dataclient.page.PageSummary.$serializer INSTANCE = null;
        
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
        public org.wikipedia.dataclient.page.PageSummary deserialize(@org.jetbrains.annotations.NotNull()
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
        org.wikipedia.dataclient.page.PageSummary value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
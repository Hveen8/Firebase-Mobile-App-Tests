package org.wikipedia.page;

import java.lang.System;

/**
 * Represents certain vital information about a page, including the title, namespace,
 * and fragment (section anchor target).  It can also contain a thumbnail URL for the
 * page, and a short description retrieved from Wikidata.
 *
 * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
 * description can be altered after construction. Therefore do NOT rely on all the fields
 * of a PageTitle to remain constant for the lifetime of the object.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002`aB5\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB7\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fBA\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eB!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000fB%\b\u0017\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011Bq\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aB_\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\t\u0010B\u001a\u00020\bH\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Je\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010J\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010K\u001a\u00020,2\b\u0010L\u001a\u0004\u0018\u00010MH\u00d6\u0003J\u0010\u0010N\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u0003H\u0002J\u0010\u0010P\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\t\u0010Q\u001a\u00020\u0013H\u00d6\u0001J\u0006\u0010\u0002\u001a\u00020RJ\u0006\u0010S\u001a\u00020\u0000J\b\u0010T\u001a\u00020\u0003H\u0016J!\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u00002\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u00c7\u0001J\u0019\u0010\\\u001a\u00020V2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0013H\u00d6\u0001R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001f\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\u000b\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010!\"\u0004\b(\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010!\"\u0004\b*\u0010#R\u0011\u0010+\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010-R\u0011\u0010.\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010-R\u0011\u0010/\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00100\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b0\u0010-R\u0011\u00101\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b2\u0010!R\u0011\u0010\u0002\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b3\u0010!R\u0011\u00104\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b5\u0010!R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u0011\u0010:\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b;\u0010!R$\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006b"}, d2 = {"Lorg/wikipedia/page/PageTitle;", "Landroid/os/Parcelable;", "namespace", "", "text", "fragment", "thumbUrl", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;)V", "description", "displayText", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "extract", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;)V", "title", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;)V", "seen1", "", "_namespace", "wikiSite", "_text", "_displayText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lorg/wikipedia/dataclient/WikiSite;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_displayText$annotations", "()V", "get_namespace$annotations", "get_text$annotations", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "value", "getDisplayText", "setDisplayText", "getExtract", "setExtract", "getFragment", "setFragment", "isFilePage", "", "()Z", "isMainPage", "isSpecial", "isUserPage", "mobileUri", "getMobileUri", "getNamespace", "prefixedText", "getPrefixedText", "getText", "setText", "getThumbUrl", "setThumbUrl", "uri", "getUri", "getWikiSite$annotations", "getWikiSite", "()Lorg/wikipedia/dataclient/WikiSite;", "setWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "getUriForDomain", "domain", "getWebApiUrl", "hashCode", "Lorg/wikipedia/page/Namespace;", "pageTitleForTalkPage", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class PageTitle implements android.os.Parcelable {
    private java.lang.String _namespace;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.dataclient.WikiSite wikiSite;
    private java.lang.String _text;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fragment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String thumbUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String description;
    private java.lang.String _displayText;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String extract;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.PageTitle.Companion Companion = null;
    public static final android.os.Parcelable.Creator<org.wikipedia.page.PageTitle> CREATOR = null;
    
    /**
     * Represents certain vital information about a page, including the title, namespace,
     * and fragment (section anchor target).  It can also contain a thumbnail URL for the
     * page, and a short description retrieved from Wikidata.
     *
     * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
     * description can be altered after construction. Therefore do NOT rely on all the fields
     * of a PageTitle to remain constant for the lifetime of the object.
     */
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle copy(@org.jetbrains.annotations.Nullable()
    java.lang.String _namespace, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    java.lang.String _text, @org.jetbrains.annotations.Nullable()
    java.lang.String fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String _displayText, @org.jetbrains.annotations.Nullable()
    java.lang.String extract) {
        return null;
    }
    
    /**
     * Represents certain vital information about a page, including the title, namespace,
     * and fragment (section anchor target).  It can also contain a thumbnail URL for the
     * page, and a short description retrieved from Wikidata.
     *
     * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
     * description can be altered after construction. Therefore do NOT rely on all the fields
     * of a PageTitle to remain constant for the lifetime of the object.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Represents certain vital information about a page, including the title, namespace,
     * and fragment (section anchor target).  It can also contain a thumbnail URL for the
     * page, and a short description retrieved from Wikidata.
     *
     * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
     * description can be altered after construction. Therefore do NOT rely on all the fields
     * of a PageTitle to remain constant for the lifetime of the object.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Represents certain vital information about a page, including the title, namespace,
     * and fragment (section anchor target).  It can also contain a thumbnail URL for the
     * page, and a short description retrieved from Wikidata.
     *
     * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
     * description can be altered after construction. Therefore do NOT rely on all the fields
     * of a PageTitle to remain constant for the lifetime of the object.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String _namespace, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
    java.lang.String _text, @org.jetbrains.annotations.Nullable()
    java.lang.String fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String _displayText, @org.jetbrains.annotations.Nullable()
    java.lang.String extract) {
        super();
    }
    
    private final java.lang.String component1() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "namespace")
    @java.lang.Deprecated()
    private static void get_namespace$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite getWikiSite() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "site")
    @java.lang.Deprecated()
    public static void getWikiSite$annotations() {
    }
    
    public final void setWikiSite(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite p0) {
    }
    
    private final java.lang.String component3() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "text")
    @java.lang.Deprecated()
    private static void get_text$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFragment() {
        return null;
    }
    
    public final void setFragment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getThumbUrl() {
        return null;
    }
    
    public final void setThumbUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    private final java.lang.String component7() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "displayText")
    @java.lang.Deprecated()
    private static void get_displayText$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExtract() {
        return null;
    }
    
    public final void setExtract(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayText() {
        return null;
    }
    
    public final void setDisplayText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefixedText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamespace() {
        return null;
    }
    
    public final boolean isFilePage() {
        return false;
    }
    
    public final boolean isSpecial() {
        return false;
    }
    
    public final boolean isUserPage() {
        return false;
    }
    
    public final boolean isMainPage() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileUri() {
        return null;
    }
    
    /**
     * Notes on the `namespace` field:
     * The localised namespace of the page as a string, or null if the page is in mainspace.
     *
     * This field contains the prefix of the page's title, as opposed to the namespace ID used by
     * MediaWiki. Therefore, mainspace pages always have a null namespace, as they have no prefix,
     * and the namespace of a page will depend on the language of the wiki the user is currently
     * looking at.
     *
     * Examples:
     * * [[Manchester]] on enwiki will have a namespace of null
     * * [[Deutschland]] on dewiki will have a namespace of null
     * * [[User:Deskana]] on enwiki will have a namespace of "User"
     * * [[Utilisateur:Deskana]] on frwiki will have a namespace of "Utilisateur", even if you got
     * to the page by going to [[User:Deskana]] and having MediaWiki automatically redirect you.
     */
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String displayText) {
        super();
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String displayText, @org.jetbrains.annotations.Nullable()
    java.lang.String extract) {
        super();
    }
    
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public PageTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.Namespace namespace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebApiUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String fragment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle pageTitleForTalkPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private final java.lang.String getUriForDomain(java.lang.String domain) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.page.PageTitle> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.page.PageTitle createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.page.PageTitle[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/PageTitle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/page/PageTitle;", "withSeparateFragment", "prefixedText", "", "fragment", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.page.PageTitle> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.page.PageTitle withSeparateFragment(@org.jetbrains.annotations.NotNull()
        java.lang.String prefixedText, @org.jetbrains.annotations.Nullable()
        java.lang.String fragment, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki) {
            return null;
        }
    }
    
    /**
     * Represents certain vital information about a page, including the title, namespace,
     * and fragment (section anchor target).  It can also contain a thumbnail URL for the
     * page, and a short description retrieved from Wikidata.
     *
     * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
     * description can be altered after construction. Therefore do NOT rely on all the fields
     * of a PageTitle to remain constant for the lifetime of the object.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/page/PageTitle.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/page/PageTitle;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.page.PageTitle> {
        
        /**
         * Represents certain vital information about a page, including the title, namespace,
         * and fragment (section anchor target).  It can also contain a thumbnail URL for the
         * page, and a short description retrieved from Wikidata.
         *
         * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
         * description can be altered after construction. Therefore do NOT rely on all the fields
         * of a PageTitle to remain constant for the lifetime of the object.
         */
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.page.PageTitle.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Represents certain vital information about a page, including the title, namespace,
         * and fragment (section anchor target).  It can also contain a thumbnail URL for the
         * page, and a short description retrieved from Wikidata.
         *
         * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
         * description can be altered after construction. Therefore do NOT rely on all the fields
         * of a PageTitle to remain constant for the lifetime of the object.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Represents certain vital information about a page, including the title, namespace,
         * and fragment (section anchor target).  It can also contain a thumbnail URL for the
         * page, and a short description retrieved from Wikidata.
         *
         * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
         * description can be altered after construction. Therefore do NOT rely on all the fields
         * of a PageTitle to remain constant for the lifetime of the object.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.page.PageTitle deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Represents certain vital information about a page, including the title, namespace,
         * and fragment (section anchor target).  It can also contain a thumbnail URL for the
         * page, and a short description retrieved from Wikidata.
         *
         * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
         * description can be altered after construction. Therefore do NOT rely on all the fields
         * of a PageTitle to remain constant for the lifetime of the object.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Represents certain vital information about a page, including the title, namespace,
         * and fragment (section anchor target).  It can also contain a thumbnail URL for the
         * page, and a short description retrieved from Wikidata.
         *
         * WARNING: This class is not immutable! Specifically, the thumbnail URL and the Wikidata
         * description can be altered after construction. Therefore do NOT rely on all the fields
         * of a PageTitle to remain constant for the lifetime of the object.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
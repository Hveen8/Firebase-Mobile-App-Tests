package org.wikipedia.dataclient;

import java.lang.System;

/**
 * The base URL and Wikipedia language code for a MediaWiki site. Examples:
 *
 *
 * <lh>Name: scheme / authority / language code</lh>
 * * English Wikipedia: HTTPS / en.wikipedia.org / en
 * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
 * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
 * * Test Wikipedia: HTTPS / test.wikipedia.org / test
 * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
 * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
 * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
 * * Development: HTTP / 192.168.1.11:8080 / (none)
 *
 *
 * **As shown above, the language code or mapping is part of the authority:**
 *
 * <lh>Validity: authority / language code</lh>
 * * Correct: "test.wikipedia.org" / "test"
 * * Correct: "wikipedia.org", ""
 * * Correct: "no.wikipedia.org", "nb"
 * * Incorrect: "wikipedia.org", "test"
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nB/\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\b\u001a\u00020\u0006J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010\u001c\u001a\u00020\u0006J\t\u0010\u001d\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\fH\u00d6\u0001J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0006J\u0010\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0006J\u000e\u0010*\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010+\u001a\u00020\u0006H\u00d6\u0001J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u00c7\u0001J\u0019\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\fH\u00d6\u0001R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0007R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0004\u00a8\u00069"}, d2 = {"Lorg/wikipedia/dataclient/WikiSite;", "Landroid/os/Parcelable;", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "url", "", "(Ljava/lang/String;)V", "authority", "languageCode", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILandroid/net/Uri;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Landroid/net/Uri;Ljava/lang/String;)V", "getLanguageCode", "()Ljava/lang/String;", "setLanguageCode", "getUri$annotations", "()V", "getUri", "()Landroid/net/Uri;", "setUri", "component1", "component2", "copy", "dbName", "describeContents", "equals", "", "other", "", "hashCode", "path", "segment", "scheme", "subdomain", "titleForInternalLink", "Lorg/wikipedia/page/PageTitle;", "internalLink", "titleForUri", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class WikiSite implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private android.net.Uri uri;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String languageCode;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.WikiSite.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_SCHEME = "https";
    private static java.lang.String DEFAULT_BASE_URL;
    public static final android.os.Parcelable.Creator<org.wikipedia.dataclient.WikiSite> CREATOR = null;
    
    /**
     * The base URL and Wikipedia language code for a MediaWiki site. Examples:
     *
     *
     * <lh>Name: scheme / authority / language code</lh>
     * * English Wikipedia: HTTPS / en.wikipedia.org / en
     * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
     * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
     * * Test Wikipedia: HTTPS / test.wikipedia.org / test
     * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
     * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
     * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
     * * Development: HTTP / 192.168.1.11:8080 / (none)
     *
     *
     * **As shown above, the language code or mapping is part of the authority:**
     *
     * <lh>Validity: authority / language code</lh>
     * * Correct: "test.wikipedia.org" / "test"
     * * Correct: "wikipedia.org", ""
     * * Correct: "no.wikipedia.org", "nb"
     * * Incorrect: "wikipedia.org", "test"
     */
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.dataclient.WikiSite copy(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    /**
     * The base URL and Wikipedia language code for a MediaWiki site. Examples:
     *
     *
     * <lh>Name: scheme / authority / language code</lh>
     * * English Wikipedia: HTTPS / en.wikipedia.org / en
     * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
     * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
     * * Test Wikipedia: HTTPS / test.wikipedia.org / test
     * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
     * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
     * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
     * * Development: HTTP / 192.168.1.11:8080 / (none)
     *
     *
     * **As shown above, the language code or mapping is part of the authority:**
     *
     * <lh>Validity: authority / language code</lh>
     * * Correct: "test.wikipedia.org" / "test"
     * * Correct: "wikipedia.org", ""
     * * Correct: "no.wikipedia.org", "nb"
     * * Incorrect: "wikipedia.org", "test"
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * The base URL and Wikipedia language code for a MediaWiki site. Examples:
     *
     *
     * <lh>Name: scheme / authority / language code</lh>
     * * English Wikipedia: HTTPS / en.wikipedia.org / en
     * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
     * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
     * * Test Wikipedia: HTTPS / test.wikipedia.org / test
     * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
     * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
     * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
     * * Development: HTTP / 192.168.1.11:8080 / (none)
     *
     *
     * **As shown above, the language code or mapping is part of the authority:**
     *
     * <lh>Validity: authority / language code</lh>
     * * Correct: "test.wikipedia.org" / "test"
     * * Correct: "wikipedia.org", ""
     * * Correct: "no.wikipedia.org", "nb"
     * * Incorrect: "wikipedia.org", "test"
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * The base URL and Wikipedia language code for a MediaWiki site. Examples:
     *
     *
     * <lh>Name: scheme / authority / language code</lh>
     * * English Wikipedia: HTTPS / en.wikipedia.org / en
     * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
     * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
     * * Test Wikipedia: HTTPS / test.wikipedia.org / test
     * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
     * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
     * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
     * * Development: HTTP / 192.168.1.11:8080 / (none)
     *
     *
     * **As shown above, the language code or mapping is part of the authority:**
     *
     * <lh>Validity: authority / language code</lh>
     * * Correct: "test.wikipedia.org" / "test"
     * * Correct: "wikipedia.org", ""
     * * Correct: "no.wikipedia.org", "nb"
     * * Incorrect: "wikipedia.org", "test"
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * The base URL and Wikipedia language code for a MediaWiki site. Examples:
     *
     *
     * <lh>Name: scheme / authority / language code</lh>
     * * English Wikipedia: HTTPS / en.wikipedia.org / en
     * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
     * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
     * * Test Wikipedia: HTTPS / test.wikipedia.org / test
     * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
     * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
     * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
     * * Development: HTTP / 192.168.1.11:8080 / (none)
     *
     *
     * **As shown above, the language code or mapping is part of the authority:**
     *
     * <lh>Validity: authority / language code</lh>
     * * Correct: "test.wikipedia.org" / "test"
     * * Correct: "wikipedia.org", ""
     * * Correct: "no.wikipedia.org", "nb"
     * * Incorrect: "wikipedia.org", "test"
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    @kotlinx.serialization.Serializable(with = org.wikipedia.json.UriSerializer.class)
    @kotlinx.serialization.SerialName(value = "domain")
    @java.lang.Deprecated()
    public static void getUri$annotations() {
    }
    
    public final void setUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguageCode() {
        return null;
    }
    
    public final void setLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        super();
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        super();
    }
    
    public WikiSite(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String scheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String authority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String subdomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String path(@org.jetbrains.annotations.NotNull()
    java.lang.String segment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String url(@org.jetbrains.annotations.NotNull()
    java.lang.String segment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle titleForInternalLink(@org.jetbrains.annotations.Nullable()
    java.lang.String internalLink) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle titleForUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dbName() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean supportedAuthority(@org.jetbrains.annotations.NotNull()
    java.lang.String authority) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setDefaultBaseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.dataclient.WikiSite forLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
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
    public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.dataclient.WikiSite> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.dataclient.WikiSite createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.dataclient.WikiSite[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u00c6\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/dataclient/WikiSite$Companion;", "", "()V", "DEFAULT_BASE_URL", "", "DEFAULT_SCHEME", "authorityToLanguageCode", "authority", "ensureScheme", "Landroid/net/Uri;", "uri", "forLanguageCode", "Lorg/wikipedia/dataclient/WikiSite;", "languageCode", "languageCodeToSubdomain", "normalizeLanguageCode", "serializer", "Lkotlinx/serialization/KSerializer;", "setDefaultBaseUrl", "", "url", "supportedAuthority", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.dataclient.WikiSite> serializer() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public final boolean supportedAuthority(@org.jetbrains.annotations.NotNull()
        java.lang.String authority) {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setDefaultBaseUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.wikipedia.dataclient.WikiSite forLanguageCode(@org.jetbrains.annotations.NotNull()
        java.lang.String languageCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String normalizeLanguageCode(@org.jetbrains.annotations.NotNull()
        java.lang.String languageCode) {
            return null;
        }
        
        private final java.lang.String languageCodeToSubdomain(java.lang.String languageCode) {
            return null;
        }
        
        private final java.lang.String authorityToLanguageCode(java.lang.String authority) {
            return null;
        }
        
        private final android.net.Uri ensureScheme(android.net.Uri uri) {
            return null;
        }
    }
    
    /**
     * The base URL and Wikipedia language code for a MediaWiki site. Examples:
     *
     *
     * <lh>Name: scheme / authority / language code</lh>
     * * English Wikipedia: HTTPS / en.wikipedia.org / en
     * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
     * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
     * * Test Wikipedia: HTTPS / test.wikipedia.org / test
     * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
     * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
     * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
     * * Development: HTTP / 192.168.1.11:8080 / (none)
     *
     *
     * **As shown above, the language code or mapping is part of the authority:**
     *
     * <lh>Validity: authority / language code</lh>
     * * Correct: "test.wikipedia.org" / "test"
     * * Correct: "wikipedia.org", ""
     * * Correct: "no.wikipedia.org", "nb"
     * * Incorrect: "wikipedia.org", "test"
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/dataclient/WikiSite.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/dataclient/WikiSite;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.dataclient.WikiSite> {
        
        /**
         * The base URL and Wikipedia language code for a MediaWiki site. Examples:
         *
         *
         * <lh>Name: scheme / authority / language code</lh>
         * * English Wikipedia: HTTPS / en.wikipedia.org / en
         * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
         * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
         * * Test Wikipedia: HTTPS / test.wikipedia.org / test
         * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
         * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
         * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
         * * Development: HTTP / 192.168.1.11:8080 / (none)
         *
         *
         * **As shown above, the language code or mapping is part of the authority:**
         *
         * <lh>Validity: authority / language code</lh>
         * * Correct: "test.wikipedia.org" / "test"
         * * Correct: "wikipedia.org", ""
         * * Correct: "no.wikipedia.org", "nb"
         * * Incorrect: "wikipedia.org", "test"
         */
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.dataclient.WikiSite.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * The base URL and Wikipedia language code for a MediaWiki site. Examples:
         *
         *
         * <lh>Name: scheme / authority / language code</lh>
         * * English Wikipedia: HTTPS / en.wikipedia.org / en
         * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
         * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
         * * Test Wikipedia: HTTPS / test.wikipedia.org / test
         * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
         * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
         * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
         * * Development: HTTP / 192.168.1.11:8080 / (none)
         *
         *
         * **As shown above, the language code or mapping is part of the authority:**
         *
         * <lh>Validity: authority / language code</lh>
         * * Correct: "test.wikipedia.org" / "test"
         * * Correct: "wikipedia.org", ""
         * * Correct: "no.wikipedia.org", "nb"
         * * Incorrect: "wikipedia.org", "test"
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * The base URL and Wikipedia language code for a MediaWiki site. Examples:
         *
         *
         * <lh>Name: scheme / authority / language code</lh>
         * * English Wikipedia: HTTPS / en.wikipedia.org / en
         * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
         * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
         * * Test Wikipedia: HTTPS / test.wikipedia.org / test
         * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
         * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
         * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
         * * Development: HTTP / 192.168.1.11:8080 / (none)
         *
         *
         * **As shown above, the language code or mapping is part of the authority:**
         *
         * <lh>Validity: authority / language code</lh>
         * * Correct: "test.wikipedia.org" / "test"
         * * Correct: "wikipedia.org", ""
         * * Correct: "no.wikipedia.org", "nb"
         * * Incorrect: "wikipedia.org", "test"
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.dataclient.WikiSite deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * The base URL and Wikipedia language code for a MediaWiki site. Examples:
         *
         *
         * <lh>Name: scheme / authority / language code</lh>
         * * English Wikipedia: HTTPS / en.wikipedia.org / en
         * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
         * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
         * * Test Wikipedia: HTTPS / test.wikipedia.org / test
         * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
         * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
         * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
         * * Development: HTTP / 192.168.1.11:8080 / (none)
         *
         *
         * **As shown above, the language code or mapping is part of the authority:**
         *
         * <lh>Validity: authority / language code</lh>
         * * Correct: "test.wikipedia.org" / "test"
         * * Correct: "wikipedia.org", ""
         * * Correct: "no.wikipedia.org", "nb"
         * * Incorrect: "wikipedia.org", "test"
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * The base URL and Wikipedia language code for a MediaWiki site. Examples:
         *
         *
         * <lh>Name: scheme / authority / language code</lh>
         * * English Wikipedia: HTTPS / en.wikipedia.org / en
         * * Chinese Wikipedia: HTTPS / zh.wikipedia.org / zh-hans or zh-hant
         * * Meta-Wiki: HTTPS / meta.wikimedia.org / (none)
         * * Test Wikipedia: HTTPS / test.wikipedia.org / test
         * * Võro Wikipedia: HTTPS / fiu-vro.wikipedia.org / fiu-vro
         * * Simple English Wikipedia: HTTPS / simple.wikipedia.org / simple
         * * Simple English Wikipedia (beta cluster mirror): HTTP / simple.wikipedia.beta.wmflabs.org / simple
         * * Development: HTTP / 192.168.1.11:8080 / (none)
         *
         *
         * **As shown above, the language code or mapping is part of the authority:**
         *
         * <lh>Validity: authority / language code</lh>
         * * Correct: "test.wikipedia.org" / "test"
         * * Correct: "wikipedia.org", ""
         * * Correct: "no.wikipedia.org", "nb"
         * * Incorrect: "wikipedia.org", "test"
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
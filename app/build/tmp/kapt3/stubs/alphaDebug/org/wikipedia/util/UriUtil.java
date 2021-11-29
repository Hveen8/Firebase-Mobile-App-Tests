package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\'\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/wikipedia/util/UriUtil;", "", "()V", "LOCAL_URL_CUSTOMIZE_FEED", "", "LOCAL_URL_LANGUAGES", "LOCAL_URL_LOGIN", "LOCAL_URL_SETTINGS", "WIKI_REGEX", "decodeURL", "url", "encodeURL", "getFilenameFromUploadUrl", "getLanguageVariantFromUri", "uri", "Landroid/net/Uri;", "getTitleFromUrl", "getUrlWithProvenance", "context", "Landroid/content/Context;", "title", "Lorg/wikipedia/page/PageTitle;", "provId", "", "handleExternalLink", "", "isAppSupportedLink", "", "isValidPageLink", "parseTalkTopicFromFragment", "fragment", "removeFragment", "link", "removeInternalLinkPrefix", "removeLinkPrefix", "resolveProtocolRelativeUrl", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "visitInExternalBrowser", "visitInExternalBrowserExplicit", "app_alphaDebug"})
public final class UriUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.UriUtil INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_SETTINGS = "#settings";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_LOGIN = "#login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_CUSTOMIZE_FEED = "#customizefeed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_URL_LANGUAGES = "#languages";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKI_REGEX = "/(wiki|[a-z]{2,3}|[a-z]{2,3}-.*)/";
    
    private UriUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String decodeURL(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String encodeURL(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void visitInExternalBrowser(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    private final void visitInExternalBrowserExplicit(android.content.Context context, android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String resolveProtocolRelativeUrl(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String resolveProtocolRelativeUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isValidPageLink(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isAppSupportedLink(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void handleExternalLink(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getUrlWithProvenance(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @androidx.annotation.StringRes()
    int provId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getFilenameFromUploadUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getTitleFromUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    /**
     * Get language variant code from a Uri, e.g. "zh.*", otherwise returns empty string.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getLanguageVariantFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * For internal links only
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeInternalLinkPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        return null;
    }
    
    /**
     * For links that could be internal or external links
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeLinkPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        return null;
    }
    
    /**
     * Removes an optional fragment portion of a URL
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String link) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String parseTalkTopicFromFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String fragment) {
        return null;
    }
}
package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u001bJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u001d\u001a\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u001bH\u0002J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\fH\u0007J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\fH\u0007J\u0018\u0010\'\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\fH\u0007J\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\b8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\u0007\u0010\n\u00a8\u0006*"}, d2 = {"Lorg/wikipedia/util/L10nUtil;", "", "()V", "currentConfiguration", "Landroid/content/res/Configuration;", "getCurrentConfiguration", "()Landroid/content/res/Configuration;", "isDeviceRTL", "", "isDeviceRTL$annotations", "()Z", "getDesiredLanguageCode", "", "langCode", "getDesiredLocale", "Ljava/util/Locale;", "desiredLocale", "getResourcesForWikiLang", "Landroid/content/res/Resources;", "languageCode", "getStringForArticleLanguage", "resId", "", "title", "Lorg/wikipedia/page/PageTitle;", "getStringsForArticleLanguage", "Landroid/util/SparseArray;", "", "getStringsForLocale", "targetLocale", "strings", "getTargetStrings", "altConfig", "isLangRTL", "lang", "setConditionalLayoutDirection", "", "view", "Landroid/view/View;", "setConditionalTextDirection", "setDesiredLocale", "config", "app_alphaDebug"})
public final class L10nUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.L10nUtil INSTANCE = null;
    
    private L10nUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void isDeviceRTL$annotations() {
    }
    
    public static final boolean isDeviceRTL() {
        return false;
    }
    
    private final android.content.res.Configuration getCurrentConfiguration() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isLangRTL(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setConditionalTextDirection(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setConditionalLayoutDirection(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getStringForArticleLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode, int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getStringForArticleLanguage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, int resId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.SparseArray<java.lang.String> getStringsForArticleLanguage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    int[] resId) {
        return null;
    }
    
    private final android.util.SparseArray<java.lang.String> getStringsForLocale(java.util.Locale targetLocale, @androidx.annotation.StringRes()
    int[] strings) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.res.Resources getResourcesForWikiLang(@org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
    
    private final android.util.SparseArray<java.lang.String> getTargetStrings(@androidx.annotation.StringRes()
    int[] strings, android.content.res.Configuration altConfig) {
        return null;
    }
    
    private final java.util.Locale getDesiredLocale(java.util.Locale desiredLocale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getDesiredLanguageCode(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setDesiredLocale(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration config, @org.jetbrains.annotations.NotNull()
    java.util.Locale desiredLocale) {
    }
}
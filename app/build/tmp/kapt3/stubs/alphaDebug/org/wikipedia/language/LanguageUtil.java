package org.wikipedia.language;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00040\u00040\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/language/LanguageUtil;", "", "()V", "HONG_KONG_COUNTRY_CODE", "", "MACAU_COUNTRY_CODE", "TRADITIONAL_CHINESE_COUNTRY_CODES", "", "kotlin.jvm.PlatformType", "availableLanguages", "getAvailableLanguages$annotations", "getAvailableLanguages", "()Ljava/util/List;", "firstSelectedChineseVariant", "getFirstSelectedChineseVariant$annotations", "getFirstSelectedChineseVariant", "()Ljava/lang/String;", "chineseLanguageCodeToWikiLanguageCode", "locale", "Ljava/util/Locale;", "isTraditionalChinesePredominantInCountry", "", "country", "localeToWikiLanguageCode", "startsWithArticle", "text", "language", "app_alphaDebug"})
public final class LanguageUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.language.LanguageUtil INSTANCE = null;
    private static final java.lang.String HONG_KONG_COUNTRY_CODE = "HK";
    private static final java.lang.String MACAU_COUNTRY_CODE = "MO";
    private static final java.util.List<java.lang.String> TRADITIONAL_CHINESE_COUNTRY_CODES = null;
    
    private LanguageUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getAvailableLanguages$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getAvailableLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String localeToWikiLanguageCode(@org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    private final java.lang.String chineseLanguageCodeToWikiLanguageCode(java.util.Locale locale) {
        return null;
    }
    
    private final boolean isTraditionalChinesePredominantInCountry(java.lang.String country) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getFirstSelectedChineseVariant$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFirstSelectedChineseVariant() {
        return null;
    }
    
    public final boolean startsWithArticle(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return false;
    }
}
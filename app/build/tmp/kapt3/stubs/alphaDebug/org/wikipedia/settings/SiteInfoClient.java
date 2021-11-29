package org.wikipedia.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\b8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/settings/SiteInfoClient;", "", "()V", "SITE_INFO_MAP", "", "", "Lorg/wikipedia/settings/SiteInfo;", "maxPagesPerReadingList", "", "getMaxPagesPerReadingList$annotations", "getMaxPagesPerReadingList", "()I", "getMainPageForLang", "lang", "getSiteInfoForLang", "updateFor", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app_alphaDebug"})
public final class SiteInfoClient {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.SiteInfoClient INSTANCE = null;
    private static final java.util.Map<java.lang.String, org.wikipedia.settings.SiteInfo> SITE_INFO_MAP = null;
    
    private SiteInfoClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getMainPageForLang(@org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getMaxPagesPerReadingList$annotations() {
    }
    
    public static final int getMaxPagesPerReadingList() {
        return 0;
    }
    
    private final org.wikipedia.settings.SiteInfo getSiteInfoForLang(java.lang.String lang) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void updateFor(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
    }
}
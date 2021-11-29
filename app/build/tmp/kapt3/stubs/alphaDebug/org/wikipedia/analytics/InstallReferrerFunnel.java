package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0014\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/InstallReferrerFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "(Lorg/wikipedia/WikipediaApp;)V", "logInstall", "", "referrerUrl", "", "utfMedium", "utfCampaign", "utfSource", "preprocessSessionToken", "eventData", "Lorg/json/JSONObject;", "Companion", "app_alphaDebug"})
public final class InstallReferrerFunnel extends org.wikipedia.analytics.Funnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.InstallReferrerFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppInstallReferrer";
    private static final int REV_ID = 18115554;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_REFERRER_URL = "referrer_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_UTM_MEDIUM = "utm_medium";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_UTM_CAMPAIGN = "utm_campaign";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_UTM_SOURCE = "utm_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_CHANNEL = "channel";
    
    public InstallReferrerFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app) {
        super(null, null, 0, null);
    }
    
    public final void logInstall(@org.jetbrains.annotations.Nullable()
    java.lang.String referrerUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String utfMedium, @org.jetbrains.annotations.Nullable()
    java.lang.String utfCampaign, @org.jetbrains.annotations.Nullable()
    java.lang.String utfSource) {
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/analytics/InstallReferrerFunnel$Companion;", "", "()V", "PARAM_CHANNEL", "", "PARAM_REFERRER_URL", "PARAM_UTM_CAMPAIGN", "PARAM_UTM_MEDIUM", "PARAM_UTM_SOURCE", "REV_ID", "", "SCHEMA_NAME", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
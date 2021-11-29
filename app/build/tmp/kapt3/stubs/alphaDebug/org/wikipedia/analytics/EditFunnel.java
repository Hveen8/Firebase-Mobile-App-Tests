package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\bJ\b\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\nJ\b\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/analytics/EditFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "title", "Lorg/wikipedia/page/PageTitle;", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/page/PageTitle;)V", "logAbuseFilterError", "", "code", "", "logAbuseFilterWarning", "logAbuseFilterWarningBack", "logAbuseFilterWarningIgnore", "logCaptchaFailure", "logCaptchaShown", "logEditSummaryTap", "summaryTagStringID", "", "logError", "logLoginAttempt", "logLoginFailure", "logLoginSuccess", "logPreview", "logSaveAttempt", "logSaved", "revID", "", "source", "logStart", "preprocessData", "Lorg/json/JSONObject;", "eventData", "Companion", "app_alphaDebug"})
public class EditFunnel extends org.wikipedia.analytics.Funnel {
    private final org.wikipedia.page.PageTitle title = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.EditFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppEdit";
    private static final int REV_ID = 20710930;
    
    public EditFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        super(null, null, 0, null);
    }
    
    public void logStart() {
    }
    
    public final void logPreview() {
    }
    
    public final void logSaved(long revID, @org.jetbrains.annotations.Nullable()
    java.lang.String source) {
    }
    
    public void logSaved(long revID) {
    }
    
    public final void logLoginAttempt() {
    }
    
    public final void logLoginSuccess() {
    }
    
    public final void logLoginFailure() {
    }
    
    public final void logCaptchaShown() {
    }
    
    public final void logCaptchaFailure() {
    }
    
    public void logAbuseFilterWarning(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    public final void logAbuseFilterWarningIgnore(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    public final void logAbuseFilterWarningBack(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    public final void logAbuseFilterError(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    public void logError(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    public final void logEditSummaryTap(int summaryTagStringID) {
    }
    
    public void logSaveAttempt() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/EditFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
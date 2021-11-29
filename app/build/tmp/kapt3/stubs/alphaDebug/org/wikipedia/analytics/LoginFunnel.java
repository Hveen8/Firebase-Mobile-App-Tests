package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001c\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bH\u0007J\u0006\u0010\u000f\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/analytics/LoginFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "(Lorg/wikipedia/WikipediaApp;)V", "logCreateAccountAttempt", "", "logCreateAccountFailure", "logCreateAccountSuccess", "logError", "code", "", "logStart", "source", "editSessionToken", "logSuccess", "Companion", "app_alphaDebug"})
public final class LoginFunnel extends org.wikipedia.analytics.Funnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.LoginFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppLogin";
    private static final int REVISION = 20710032;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_NAV = "navigation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_EDIT = "edit";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_BLOCKED = "blocked";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_SYSTEM = "system";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_ONBOARDING = "onboarding";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_SETTINGS = "settings";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_READING_MANUAL_SYNC = "reading_lists_manual_sync";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_LOGOUT_BACKGROUND = "logout_background";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOURCE_SUGGESTED_EDITS = "suggestededits";
    
    public LoginFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void logStart() {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void logStart(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void logStart(@org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    java.lang.String editSessionToken) {
    }
    
    public final void logCreateAccountAttempt() {
    }
    
    public final void logCreateAccountFailure() {
    }
    
    public final void logCreateAccountSuccess() {
    }
    
    public final void logError(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    public final void logSuccess() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/LoginFunnel$Companion;", "", "()V", "REVISION", "", "SCHEMA_NAME", "", "SOURCE_BLOCKED", "SOURCE_EDIT", "SOURCE_LOGOUT_BACKGROUND", "SOURCE_NAV", "SOURCE_ONBOARDING", "SOURCE_READING_MANUAL_SYNC", "SOURCE_SETTINGS", "SOURCE_SUGGESTED_EDITS", "SOURCE_SYSTEM", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
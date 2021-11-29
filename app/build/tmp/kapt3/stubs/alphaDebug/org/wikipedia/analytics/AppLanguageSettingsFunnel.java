package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/analytics/AppLanguageSettingsFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "()V", "logLanguageSetting", "", "source", "Lorg/wikipedia/Constants$InvokeSource;", "initialLanguageList", "", "finalLanguageList", "interactionsCount", "", "searched", "", "Companion", "app_alphaDebug"})
public final class AppLanguageSettingsFunnel extends org.wikipedia.analytics.TimedFunnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.AppLanguageSettingsFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppLanguageSettings";
    private static final int REV_ID = 18113720;
    
    public AppLanguageSettingsFunnel() {
        super(null, null, 0, 0, null);
    }
    
    public final void logLanguageSetting(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.NotNull()
    java.lang.String initialLanguageList, @org.jetbrains.annotations.NotNull()
    java.lang.String finalLanguageList, int interactionsCount, boolean searched) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/AppLanguageSettingsFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
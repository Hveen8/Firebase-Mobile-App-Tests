package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/analytics/TabFunnel;", "Lorg/wikipedia/analytics/Funnel;", "()V", "log", "", "action", "", "size", "", "index", "(Ljava/lang/String;ILjava/lang/Integer;)V", "logCancel", "logClose", "logCreateNew", "logEnterList", "logOpenInNew", "logSelect", "Companion", "app_alphaDebug"})
public final class TabFunnel extends org.wikipedia.analytics.Funnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.TabFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppTabs";
    private static final int SCHEMA_REVISION = 18118767;
    
    public TabFunnel() {
        super(null, null, 0, null);
    }
    
    public final void logOpenInNew(int size) {
    }
    
    public final void logEnterList(int size) {
    }
    
    public final void logCreateNew(int size) {
    }
    
    public final void logClose(int size, int index) {
    }
    
    public final void logSelect(int size, int index) {
    }
    
    public final void logCancel(int size) {
    }
    
    private final void log(java.lang.String action, int size, java.lang.Integer index) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/TabFunnel$Companion;", "", "()V", "SCHEMA_NAME", "", "SCHEMA_REVISION", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
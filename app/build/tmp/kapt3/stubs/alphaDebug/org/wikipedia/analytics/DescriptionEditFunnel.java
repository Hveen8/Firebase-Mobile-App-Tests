package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0006\u0010\u0010\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/analytics/DescriptionEditFunnel;", "Lorg/wikipedia/analytics/EditFunnel;", "app", "Lorg/wikipedia/WikipediaApp;", "title", "Lorg/wikipedia/page/PageTitle;", "type", "Lorg/wikipedia/analytics/DescriptionEditFunnel$Type;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/analytics/DescriptionEditFunnel$Type;Lorg/wikipedia/Constants$InvokeSource;)V", "logAbuseFilterWarning", "", "code", "", "logError", "logReady", "logSaveAttempt", "logSaved", "revID", "", "logStart", "preprocessData", "Lorg/json/JSONObject;", "eventData", "Type", "app_alphaDebug"})
public final class DescriptionEditFunnel extends org.wikipedia.analytics.EditFunnel {
    private final org.wikipedia.analytics.DescriptionEditFunnel.Type type = null;
    private final org.wikipedia.Constants.InvokeSource source = null;
    
    public DescriptionEditFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.DescriptionEditFunnel.Type type, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    @java.lang.Override()
    public void logStart() {
    }
    
    public final void logReady() {
    }
    
    @java.lang.Override()
    public void logSaveAttempt() {
    }
    
    @java.lang.Override()
    public void logSaved(long revID) {
    }
    
    @java.lang.Override()
    public void logAbuseFilterWarning(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    @java.lang.Override()
    public void logError(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/analytics/DescriptionEditFunnel$Type;", "", "logString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toLogString", "NEW", "EXISTING", "app_alphaDebug"})
    public static enum Type {
        /*public static final*/ NEW /* = new NEW(null) */,
        /*public static final*/ EXISTING /* = new EXISTING(null) */;
        private final java.lang.String logString = null;
        
        Type(java.lang.String logString) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String toLogString() {
            return null;
        }
    }
}
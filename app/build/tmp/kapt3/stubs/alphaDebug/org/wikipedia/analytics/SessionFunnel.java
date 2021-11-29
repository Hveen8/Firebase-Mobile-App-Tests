package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\nH\u0002J\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/analytics/SessionFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "(Lorg/wikipedia/WikipediaApp;)V", "leadSectionStartTime", "", "sessionData", "Lorg/wikipedia/analytics/SessionData;", "backPressed", "", "hasTimedOut", "", "leadSectionFetchEnd", "leadSectionFetchStart", "logSessionData", "noDescription", "pageViewed", "entry", "Lorg/wikipedia/history/HistoryEntry;", "persistSession", "touchSession", "Companion", "app_alphaDebug"})
public final class SessionFunnel extends org.wikipedia.analytics.Funnel {
    private org.wikipedia.analytics.SessionData sessionData;
    private long leadSectionStartTime = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.SessionFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppSessions";
    private static final int REVISION = 19851683;
    
    /**
     * Definition of a "session timeout", as agreed upon by the Apps and Analytics teams.
     * (currently 30 minutes)
     */
    public static final int DEFAULT_SESSION_TIMEOUT = 30;
    public static final int MIN_SESSION_TIMEOUT = 1;
    
    public SessionFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app) {
        super(null, null, 0, null);
    }
    
    /**
     * Save the state of the current session. To be called when the main Activity is stopped,
     * so that we don't have to save its state every time a single parameter is modified.
     */
    public final void persistSession() {
    }
    
    /**
     * Update the timestamp for the current session. If the last-updated time is older than the
     * defined timeout period, then consider the current session as over, and send the event!
     */
    public final void touchSession() {
    }
    
    public final void pageViewed(@org.jetbrains.annotations.Nullable()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void backPressed() {
    }
    
    public final void noDescription() {
    }
    
    public final void leadSectionFetchStart() {
    }
    
    public final void leadSectionFetchEnd() {
    }
    
    private final boolean hasTimedOut() {
        return false;
    }
    
    private final void logSessionData() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/analytics/SessionFunnel$Companion;", "", "()V", "DEFAULT_SESSION_TIMEOUT", "", "MIN_SESSION_TIMEOUT", "REVISION", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
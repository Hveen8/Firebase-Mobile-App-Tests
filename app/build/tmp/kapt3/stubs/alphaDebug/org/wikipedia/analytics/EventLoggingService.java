package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/analytics/EventLoggingService;", "", "()V", "log", "", "event", "Lorg/json/JSONObject;", "Companion", "app_alphaDebug"})
public final class EventLoggingService {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.EventLoggingService.Companion Companion = null;
    private static final java.lang.String EVENTLOG_URL_PROD = "https://meta.wikimedia.org/beacon/event";
    private static final java.lang.String EVENTLOG_URL_DEV = "https://deployment.wikimedia.beta.wmflabs.org/beacon/event";
    private static final int MAX_URL_LEN = 2000;
    private static final okhttp3.RequestBody EMPTY_REQ = null;
    private static final java.lang.String EVENTLOG_URL = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.wikipedia.analytics.EventLoggingService instance = null;
    
    private EventLoggingService() {
        super();
    }
    
    public final void log(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/analytics/EventLoggingService$Companion;", "", "()V", "EMPTY_REQ", "Lokhttp3/RequestBody;", "EVENTLOG_URL", "", "EVENTLOG_URL_DEV", "EVENTLOG_URL_PROD", "MAX_URL_LEN", "", "instance", "Lorg/wikipedia/analytics/EventLoggingService;", "getInstance", "()Lorg/wikipedia/analytics/EventLoggingService;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.EventLoggingService getInstance() {
            return null;
        }
    }
}
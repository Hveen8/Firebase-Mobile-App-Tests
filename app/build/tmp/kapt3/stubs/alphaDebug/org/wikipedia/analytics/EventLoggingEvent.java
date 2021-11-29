package org.wikipedia.analytics;

import java.lang.System;

/**
 * Base class for all various types of events that are logged to EventLogging.
 *
 * Each Schema has its own class, and has its own constructor that makes it easy
 * to call from everywhere without having to duplicate param info at all places.
 * Updating schemas / revisions is also easier this way.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/analytics/EventLoggingEvent;", "", "schema", "", "revID", "", "wiki", "eventData", "Lorg/json/JSONObject;", "(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V", "data", "getData", "()Lorg/json/JSONObject;", "app_alphaDebug"})
public final class EventLoggingEvent {
    @org.jetbrains.annotations.NotNull()
    private final org.json.JSONObject data = null;
    
    public EventLoggingEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String schema, int revID, @org.jetbrains.annotations.NotNull()
    java.lang.String wiki, @org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject getData() {
        return null;
    }
}
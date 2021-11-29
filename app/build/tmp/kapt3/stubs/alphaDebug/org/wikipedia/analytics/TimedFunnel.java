package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0004J\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/analytics/TimedFunnel;", "Lorg/wikipedia/analytics/Funnel;", "app", "Lorg/wikipedia/WikipediaApp;", "schemaName", "", "revision", "", "sampleRate", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/WikipediaApp;Ljava/lang/String;IILorg/wikipedia/dataclient/WikiSite;)V", "duration", "", "durationFieldName", "durationSeconds", "pauseTime", "startTime", "pause", "", "preprocessData", "Lorg/json/JSONObject;", "eventData", "resetDuration", "resume", "app_alphaDebug"})
public abstract class TimedFunnel extends org.wikipedia.analytics.Funnel {
    private long startTime;
    private long pauseTime = 0L;
    
    /**
     * Override me for deviant implementations.
     */
    private final java.lang.String durationFieldName = "time_spent";
    private final long duration = 0L;
    private final long durationSeconds = 0L;
    
    @kotlin.jvm.JvmOverloads()
    public TimedFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    java.lang.String schemaName, int revision, int sampleRate) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public TimedFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    java.lang.String schemaName, int revision, int sampleRate, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki) {
        super(null, null, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    public final void pause() {
    }
    
    public final void resume() {
    }
    
    protected final void resetDuration() {
    }
}
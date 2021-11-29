package org.wikipedia.analytics;

import java.lang.System;

/**
 * Schemas for this abstract funnel are expected to have appInstallID and sessionToken fields. When
 * these fields are not present or differently named, preprocess* or get*Field should be overridden.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB5\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0007H\u0002J%\u0010\u0014\u001a\u00020\u00152\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u0001H\u0004\u00a2\u0006\u0002\u0010\u0018J/\u0010\u0014\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0017\"\u0004\u0018\u00010\u0001H\u0004\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014J+\u0010\u001a\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u0002H\u001dH\u0004\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/analytics/Funnel;", "", "app", "Lorg/wikipedia/WikipediaApp;", "schemaName", "", "revision", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/WikipediaApp;Ljava/lang/String;ILorg/wikipedia/dataclient/WikiSite;)V", "sampleRate", "(Lorg/wikipedia/WikipediaApp;Ljava/lang/String;IILorg/wikipedia/dataclient/WikiSite;)V", "getApp", "()Lorg/wikipedia/WikipediaApp;", "sampleRateRemoteParamName", "sessionToken", "getSessionToken", "()Ljava/lang/String;", "getSampleRate", "log", "", "params", "", "([Ljava/lang/Object;)V", "(Lorg/wikipedia/dataclient/WikiSite;[Ljava/lang/Object;)V", "preprocessData", "Lorg/json/JSONObject;", "eventData", "T", "key", "value", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V", "preprocessSessionToken", "Companion", "app_alphaDebug"})
public abstract class Funnel {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.WikipediaApp app = null;
    private final java.lang.String schemaName = null;
    private final int revision = 0;
    private final int sampleRate = 0;
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    private final java.lang.String sampleRateRemoteParamName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sessionToken = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.Funnel.Companion Companion = null;
    private static final java.lang.String DEFAULT_TIMESTAMP_KEY = "client_dt";
    private static final java.lang.String DEFAULT_APP_INSTALL_ID_KEY = "app_install_id";
    private static final java.lang.String DEFAULT_SESSION_TOKEN_KEY = "session_token";
    public static final int SAMPLE_LOG_1K = 1000;
    public static final int SAMPLE_LOG_100 = 100;
    public static final int SAMPLE_LOG_10 = 10;
    public static final int SAMPLE_LOG_ALL = 1;
    
    @kotlin.jvm.JvmOverloads()
    public Funnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    java.lang.String schemaName, int revision) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public Funnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    java.lang.String schemaName, int revision, int sampleRate) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public Funnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    java.lang.String schemaName, int revision, int sampleRate, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.wikipedia.WikipediaApp getApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionToken() {
        return null;
    }
    
    public Funnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app, @org.jetbrains.annotations.NotNull()
    java.lang.String schemaName, int revision, @org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    protected final <T extends java.lang.Object>void preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T value) {
    }
    
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    protected final void log(@org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
    }
    
    /**
     * Logs an event.
     *
     * @param params        Actual data for the event. Considered to be an array
     * of alternating key and value items (for easier
     * use in subclass constructors).
     *
     * For example, what would be expressed in a more sane
     * language as:
     *
     * .log({
     * "page": "List of mass murderers",
     * "section": "2014"
     * });
     *
     * would be expressed here as
     *
     * .log(
     * "page", "List of mass murderers",
     * "section", "2014"
     * );
     *
     * This format should be only used in subclass methods directly.
     * The subclass methods should take more explicit parameters
     * depending on what they are logging.
     */
    protected final void log(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.Object... params) {
    }
    
    /**
     * @return Sampling rate for this funnel, as given by the remote config parameter for this
     * funnel (the name of which is defined as "[schema name]_rate"), with a fallback to the
     * hard-coded sampling rate passed into the constructor.
     */
    private final int getSampleRate() {
        return 0;
    }
    
    /**
     * Determines whether the current user belongs in a particular sampling bucket. This is
     * determined by taking the last four hex digits of the appInstallID and testing them modulo
     * the sampling rate that is provided.
     *
     * Don't use this method when running to determine whether or not the user falls into a control
     * or test group in any kind of tests (such as A/B tests), as that would introduce sampling
     * biases which would invalidate the test.
     * @return Whether the current user is part of the requested sampling rate bucket.
     */
    @androidx.annotation.VisibleForTesting()
    @kotlin.jvm.JvmStatic()
    public static final boolean isUserInSamplingGroup(@org.jetbrains.annotations.Nullable()
    java.lang.String appInstallID, int sampleRate) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/analytics/Funnel$Companion;", "", "()V", "DEFAULT_APP_INSTALL_ID_KEY", "", "DEFAULT_SESSION_TOKEN_KEY", "DEFAULT_TIMESTAMP_KEY", "SAMPLE_LOG_10", "", "SAMPLE_LOG_100", "SAMPLE_LOG_1K", "SAMPLE_LOG_ALL", "isUserInSamplingGroup", "", "appInstallID", "sampleRate", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Determines whether the current user belongs in a particular sampling bucket. This is
         * determined by taking the last four hex digits of the appInstallID and testing them modulo
         * the sampling rate that is provided.
         *
         * Don't use this method when running to determine whether or not the user falls into a control
         * or test group in any kind of tests (such as A/B tests), as that would introduce sampling
         * biases which would invalidate the test.
         * @return Whether the current user is part of the requested sampling rate bucket.
         */
        @androidx.annotation.VisibleForTesting()
        @kotlin.jvm.JvmStatic()
        public final boolean isUserInSamplingGroup(@org.jetbrains.annotations.Nullable()
        java.lang.String appInstallID, int sampleRate) {
            return false;
        }
    }
}
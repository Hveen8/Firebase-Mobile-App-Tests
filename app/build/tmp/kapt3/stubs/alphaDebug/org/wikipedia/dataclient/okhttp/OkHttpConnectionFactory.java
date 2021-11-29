package org.wikipedia.dataclient.okhttp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OkHttpConnectionFactory;", "", "()V", "CACHE_CONTROL_FORCE_NETWORK", "Lokhttp3/CacheControl;", "CACHE_CONTROL_MAX_STALE", "CACHE_CONTROL_NONE", "CACHE_DIR_NAME", "", "NET_CACHE", "Lokhttp3/Cache;", "NET_CACHE_SIZE", "", "client", "Lokhttp3/OkHttpClient;", "getClient$annotations", "getClient", "()Lokhttp3/OkHttpClient;", "createClient", "app_alphaDebug"})
public final class OkHttpConnectionFactory {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.okhttp.OkHttpConnectionFactory INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final okhttp3.CacheControl CACHE_CONTROL_FORCE_NETWORK = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final okhttp3.CacheControl CACHE_CONTROL_MAX_STALE = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final okhttp3.CacheControl CACHE_CONTROL_NONE = null;
    private static final java.lang.String CACHE_DIR_NAME = "okhttp-cache";
    private static final long NET_CACHE_SIZE = 67108864L;
    private static final okhttp3.Cache NET_CACHE = null;
    @org.jetbrains.annotations.NotNull()
    private static final okhttp3.OkHttpClient client = null;
    
    private OkHttpConnectionFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getClient$annotations() {
    }
    
    private final okhttp3.OkHttpClient createClient() {
        return null;
    }
}
package org.wikipedia.dataclient.okhttp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor;", "Lokhttp3/Interceptor;", "()V", "getCacheWritingResponse", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "response", "lang", "", "title", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "CacheWritingResponseBody", "CacheWritingSource", "CachedResponseBody", "Companion", "app_alphaDebug"})
public final class OfflineCacheInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.okhttp.OfflineCacheInterceptor.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANG_HEADER = "X-Offline-Lang";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TITLE_HEADER = "X-Offline-Title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAVE_HEADER = "X-Offline-Save";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAVE_HEADER_SAVE = "save";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OFFLINE_PATH = "offline_files";
    
    public OfflineCacheInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private final okhttp3.Response getCacheWritingResponse(okhttp3.Request request, okhttp3.Response response, java.lang.String lang, java.lang.String title) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean shouldSave(@org.jetbrains.annotations.NotNull()
    okhttp3.Request request) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor$CacheWritingSource;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "cacheSink", "Lokio/BufferedSink;", "obj", "Lorg/wikipedia/offline/db/OfflineObject;", "title", "", "(Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor;Lokio/BufferedSource;Lokio/BufferedSink;Lorg/wikipedia/offline/db/OfflineObject;Ljava/lang/String;)V", "cacheRequestClosed", "", "failed", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "app_alphaDebug"})
    final class CacheWritingSource implements okio.Source {
        private final okio.BufferedSource source = null;
        private final okio.BufferedSink cacheSink = null;
        private final org.wikipedia.offline.db.OfflineObject obj = null;
        private final java.lang.String title = null;
        private boolean cacheRequestClosed = false;
        private boolean failed = false;
        
        public CacheWritingSource(@org.jetbrains.annotations.NotNull()
        okio.BufferedSource source, @org.jetbrains.annotations.NotNull()
        okio.BufferedSink cacheSink, @org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObject obj, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @java.lang.Override()
        public long read(@org.jetbrains.annotations.NotNull()
        okio.Buffer sink, long byteCount) throws java.io.IOException {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okio.Timeout timeout() {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @java.lang.Override()
        public void close() throws java.io.IOException {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0002\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor$CacheWritingResponseBody;", "Lokhttp3/ResponseBody;", "source", "Lokio/Source;", "contentType", "", "contentLength", "", "(Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor;Lokio/Source;Ljava/lang/String;J)V", "Lokhttp3/MediaType;", "Lokio/BufferedSource;", "app_alphaDebug"})
    final class CacheWritingResponseBody extends okhttp3.ResponseBody {
        private final okio.Source source = null;
        private final java.lang.String contentType = null;
        private final long contentLength = 0L;
        
        public CacheWritingResponseBody(@org.jetbrains.annotations.NotNull()
        okio.Source source, @org.jetbrains.annotations.Nullable()
        java.lang.String contentType, long contentLength) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public okhttp3.MediaType contentType() {
            return null;
        }
        
        @java.lang.Override()
        public long contentLength() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okio.BufferedSource source() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor$CachedResponseBody;", "Lokhttp3/ResponseBody;", "file", "Ljava/io/File;", "contentType", "", "(Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor;Ljava/io/File;Ljava/lang/String;)V", "contentLength", "", "Lokhttp3/MediaType;", "source", "Lokio/BufferedSource;", "app_alphaDebug"})
    final class CachedResponseBody extends okhttp3.ResponseBody {
        private final java.io.File file = null;
        private final java.lang.String contentType = null;
        
        public CachedResponseBody(@org.jetbrains.annotations.NotNull()
        java.io.File file, @org.jetbrains.annotations.Nullable()
        java.lang.String contentType) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public okhttp3.MediaType contentType() {
            return null;
        }
        
        @java.lang.Override()
        public long contentLength() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okio.BufferedSource source() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/OfflineCacheInterceptor$Companion;", "", "()V", "LANG_HEADER", "", "OFFLINE_PATH", "SAVE_HEADER", "SAVE_HEADER_SAVE", "TITLE_HEADER", "getObjectFileName", "url", "lang", "mimeType", "shouldSave", "", "request", "Lokhttp3/Request;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final boolean shouldSave(@org.jetbrains.annotations.NotNull()
        okhttp3.Request request) {
            return false;
        }
        
        private final java.lang.String getObjectFileName(java.lang.String url, java.lang.String lang, java.lang.String mimeType) {
            return null;
        }
    }
}
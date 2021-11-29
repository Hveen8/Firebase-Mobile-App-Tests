package org.wikipedia.dataclient.okhttp;

import java.lang.System;

/**
 * This is a subclass of InputStream that implements the available() method reliably enough
 * to satisfy WebResourceResponses or other consumers like BufferedInputStream that depend
 * on available() to return a meaningful value.
 *
 * The problem is that the InputStream provided by OkHttp's body().byteStream() returns zero
 * when calling available() prior to making any read() calls, which means that it will break
 * any consumers that wrap a BufferedInputStream onto this stream, or any other wrapper that
 * relies on a consistent implementation of available().
 *
 * This is initialized with the original InputStream plus its total size, which must be known
 * at the time of instantiation.  You may then call the read() and skip() methods in the usual
 * way, and then be able to call available() and get the number of bytes left to read.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/dataclient/okhttp/AvailableInputStream;", "Ljava/io/InputStream;", "stream", "available", "", "(Ljava/io/InputStream;J)V", "", "decreaseAvailable", "", "n", "read", "b", "", "off", "len", "skip", "app_alphaDebug"})
public final class AvailableInputStream extends java.io.InputStream {
    private final java.io.InputStream stream = null;
    private long available;
    
    public AvailableInputStream(@org.jetbrains.annotations.NotNull()
    java.io.InputStream stream, long available) {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public int read() throws java.io.IOException {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public int read(@org.jetbrains.annotations.NotNull()
    byte[] b) throws java.io.IOException {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public int read(@org.jetbrains.annotations.NotNull()
    byte[] b, int off, int len) throws java.io.IOException {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public long skip(long n) throws java.io.IOException {
        return 0L;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public int available() throws java.io.IOException {
        return 0;
    }
    
    private final void decreaseAvailable(long n) {
    }
}
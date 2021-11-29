package org.wikipedia.util.log;

import java.lang.System;

/**
 * Logging utility like [Log] but with implied tags.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/util/log/L;", "", "()V", "LEVEL_D", "Lorg/wikipedia/util/log/L$LogLevel;", "LEVEL_E", "LEVEL_I", "LEVEL_V", "LEVEL_W", "d", "", "msg", "", "t", "", "e", "i", "logRemoteError", "logRemoteErrorIfProd", "v", "w", "LogLevel", "app_alphaDebug"})
public final class L {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.log.L INSTANCE = null;
    private static final org.wikipedia.util.log.L.LogLevel LEVEL_V = null;
    private static final org.wikipedia.util.log.L.LogLevel LEVEL_D = null;
    private static final org.wikipedia.util.log.L.LogLevel LEVEL_I = null;
    private static final org.wikipedia.util.log.L.LogLevel LEVEL_W = null;
    private static final org.wikipedia.util.log.L.LogLevel LEVEL_E = null;
    
    private L() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void v(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void w(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void v(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void d(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    public final void i(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void w(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void e(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void w(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void logRemoteErrorIfProd(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void logRemoteError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ&\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/util/log/L$LogLevel;", "", "()V", "log", "", "msg", "", "t", "", "logLevel", "tag", "stackTraceElementToMessagePrefix", "element", "Ljava/lang/StackTraceElement;", "Companion", "app_alphaDebug"})
    static abstract class LogLevel {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.util.log.L.LogLevel.Companion Companion = null;
        private static final int STACK_INDEX = 4;
        
        public LogLevel() {
            super();
        }
        
        public abstract void logLevel(@org.jetbrains.annotations.Nullable()
        java.lang.String tag, @org.jetbrains.annotations.Nullable()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable t);
        
        public final void log(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable t) {
        }
        
        private final java.lang.String stackTraceElementToMessagePrefix(java.lang.StackTraceElement element) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/util/log/L$LogLevel$Companion;", "", "()V", "STACK_INDEX", "", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}
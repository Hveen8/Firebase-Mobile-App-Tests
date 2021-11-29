package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002J(\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\nH\u0007J\u001c\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0002\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/util/ThrowableUtil;", "", "()V", "getAppError", "Lorg/wikipedia/util/ThrowableUtil$AppError;", "context", "Landroid/content/Context;", "e", "", "getBlockMessageHtml", "", "blockInfo", "Lorg/wikipedia/dataclient/mwapi/MwServiceError$BlockInfo;", "getInnermostThrowable", "is404", "", "caught", "isEmptyException", "isNetworkError", "isOffline", "isTimeout", "parseBlockedDate", "dateStr", "parseBlockedError", "template", "info", "reason", "userName", "throwableContainsException", "exClass", "Ljava/lang/Class;", "AppError", "EmptyException", "app_alphaDebug"})
public final class ThrowableUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.ThrowableUtil INSTANCE = null;
    
    private ThrowableUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Throwable getInnermostThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        return null;
    }
    
    private final boolean throwableContainsException(java.lang.Throwable e, java.lang.Class<?> exClass) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.util.ThrowableUtil.AppError getAppError(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isOffline(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isTimeout(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean is404(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable caught) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isEmptyException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable caught) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getBlockMessageHtml(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo blockInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String parseBlockedError(@org.jetbrains.annotations.NotNull()
    java.lang.String template, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwServiceError.BlockInfo info, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
        return null;
    }
    
    private final java.lang.String parseBlockedDate(java.lang.String dateStr) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/util/ThrowableUtil$EmptyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_alphaDebug"})
    public static final class EmptyException extends java.lang.Exception {
        
        public EmptyException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/util/ThrowableUtil$AppError;", "", "error", "", "detail", "(Ljava/lang/String;Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "getError", "app_alphaDebug"})
    public static final class AppError {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String detail = null;
        
        public AppError(@org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.Nullable()
        java.lang.String detail) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDetail() {
            return null;
        }
    }
}
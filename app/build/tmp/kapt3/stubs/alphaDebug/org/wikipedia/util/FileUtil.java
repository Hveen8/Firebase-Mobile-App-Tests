package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0007J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/util/FileUtil;", "", "()V", "JPEG_QUALITY", "", "compressBmpToJpg", "Ljava/io/ByteArrayOutputStream;", "bitmap", "Landroid/graphics/Bitmap;", "deleteRecursively", "", "f", "Ljava/io/File;", "isAudio", "", "mimeType", "", "isImage", "isVideo", "readFile", "inputStream", "Ljava/io/InputStream;", "sanitizeFileName", "fileName", "writeToFile", "bytes", "destinationFile", "app_alphaDebug"})
public final class FileUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.FileUtil INSTANCE = null;
    private static final int JPEG_QUALITY = 85;
    
    private FileUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.io.File writeToFile(@org.jetbrains.annotations.NotNull()
    java.io.ByteArrayOutputStream bytes, @org.jetbrains.annotations.NotNull()
    java.io.File destinationFile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.io.ByteArrayOutputStream compressBmpToJpg(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String readFile(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void deleteRecursively(@org.jetbrains.annotations.NotNull()
    java.io.File f) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String sanitizeFileName(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isAudio(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isImage(@org.jetbrains.annotations.NotNull()
    java.lang.String mimeType) {
        return false;
    }
}
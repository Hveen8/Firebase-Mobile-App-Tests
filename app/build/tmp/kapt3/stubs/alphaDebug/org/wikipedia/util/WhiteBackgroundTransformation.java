package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0014J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/util/WhiteBackgroundTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "()V", "applyMatrixWithBackground", "", "inBitmap", "Landroid/graphics/Bitmap;", "targetBitmap", "matrix", "Landroid/graphics/Matrix;", "equals", "", "other", "", "hashCode", "", "transform", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "outHeight", "updateDiskCacheKey", "messageDigest", "Ljava/security/MessageDigest;", "Companion", "app_alphaDebug"})
public final class WhiteBackgroundTransformation extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.WhiteBackgroundTransformation.Companion Companion = null;
    private static final java.lang.String ID = "org.wikipedia.util.WhiteBackgroundTransformation";
    private static final int PAINT_FLAGS = 6;
    private static final byte[] ID_BYTES = null;
    private static final android.graphics.Paint DEFAULT_PAINT = null;
    private static final android.graphics.Paint PAINT_WHITE = null;
    private static final android.graphics.Paint PAINT_DARK_OVERLAY = null;
    
    public WhiteBackgroundTransformation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap toTransform, int outWidth, int outHeight) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public void updateDiskCacheKey(@org.jetbrains.annotations.NotNull()
    java.security.MessageDigest messageDigest) {
    }
    
    public final void applyMatrixWithBackground(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap inBitmap, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap targetBitmap, @org.jetbrains.annotations.NotNull()
    android.graphics.Matrix matrix) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/util/WhiteBackgroundTransformation$Companion;", "", "()V", "DEFAULT_PAINT", "Landroid/graphics/Paint;", "ID", "", "ID_BYTES", "", "PAINT_DARK_OVERLAY", "PAINT_FLAGS", "", "PAINT_WHITE", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
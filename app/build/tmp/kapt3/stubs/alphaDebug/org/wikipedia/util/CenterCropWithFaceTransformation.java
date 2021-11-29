package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002J(\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/util/CenterCropWithFaceTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "()V", "idBytes", "", "detectFace", "Landroid/graphics/PointF;", "testBitmap", "Landroid/graphics/Bitmap;", "equals", "", "other", "", "getNonNullConfig", "Landroid/graphics/Bitmap$Config;", "bitmap", "hashCode", "", "isBitmapEligibleForImageProcessing", "new565ScaledBitmap", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "src", "transform", "inBitmap", "width", "height", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "Companion", "app_alphaDebug"})
public final class CenterCropWithFaceTransformation extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private final byte[] idBytes = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.CenterCropWithFaceTransformation.Companion Companion = null;
    private static final java.lang.String ID = "org.wikipedia.views.CenterCropWithFace";
    private static final int BITMAP_COPY_WIDTH = 200;
    
    public CenterCropWithFaceTransformation() {
        super();
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap inBitmap, int width, int height) {
        return null;
    }
    
    private final android.graphics.Bitmap.Config getNonNullConfig(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final android.graphics.PointF detectFace(android.graphics.Bitmap testBitmap) {
        return null;
    }
    
    private final android.graphics.Bitmap new565ScaledBitmap(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, android.graphics.Bitmap src) {
        return null;
    }
    
    private final boolean isBitmapEligibleForImageProcessing(android.graphics.Bitmap bitmap) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/util/CenterCropWithFaceTransformation$Companion;", "", "()V", "BITMAP_COPY_WIDTH", "", "ID", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
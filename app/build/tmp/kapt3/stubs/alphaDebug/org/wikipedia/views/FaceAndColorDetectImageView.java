package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J2\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/views/FaceAndColorDetectImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "loadImage", "", "uri", "Landroid/net/Uri;", "roundedCorners", "", "cropped", "listener", "Lorg/wikipedia/views/FaceAndColorDetectImageView$OnImageLoadListener;", "id", "", "shouldDetectFace", "Companion", "OnImageLoadListener", "app_alphaDebug"})
public final class FaceAndColorDetectImageView extends androidx.appcompat.widget.AppCompatImageView {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.FaceAndColorDetectImageView.Companion Companion = null;
    private static final org.wikipedia.util.CenterCropWithFaceTransformation FACE_DETECT_TRANSFORM = null;
    private static final com.bumptech.glide.load.MultiTransformation<android.graphics.Bitmap> FACE_DETECT_TRANSFORM_AND_ROUNDED_CORNERS = null;
    private static final com.bumptech.glide.load.MultiTransformation<android.graphics.Bitmap> CENTER_CROP_WHITE_BACKGROUND = null;
    
    public FaceAndColorDetectImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final boolean shouldDetectFace(android.net.Uri uri) {
        return false;
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void loadImage(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void loadImage(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, boolean roundedCorners) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void loadImage(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, boolean roundedCorners, boolean cropped) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void loadImage(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, boolean roundedCorners, boolean cropped, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.FaceAndColorDetectImageView.OnImageLoadListener listener) {
    }
    
    public final void loadImage(@androidx.annotation.DrawableRes()
    int id) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/views/FaceAndColorDetectImageView$OnImageLoadListener;", "", "onImageFailed", "", "onImageLoaded", "palette", "Landroidx/palette/graphics/Palette;", "bmpWidth", "", "bmpHeight", "app_alphaDebug"})
    public static abstract interface OnImageLoadListener {
        
        public abstract void onImageLoaded(@org.jetbrains.annotations.NotNull()
        androidx.palette.graphics.Palette palette, int bmpWidth, int bmpHeight);
        
        public abstract void onImageFailed();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/views/FaceAndColorDetectImageView$Companion;", "", "()V", "CENTER_CROP_WHITE_BACKGROUND", "Lcom/bumptech/glide/load/MultiTransformation;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "FACE_DETECT_TRANSFORM", "Lorg/wikipedia/util/CenterCropWithFaceTransformation;", "FACE_DETECT_TRANSFORM_AND_ROUNDED_CORNERS", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
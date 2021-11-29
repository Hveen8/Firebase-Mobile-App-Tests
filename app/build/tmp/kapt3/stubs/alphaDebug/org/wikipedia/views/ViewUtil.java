package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0007J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJL\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\'\u001a\u00020%2\u0012\b\u0002\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010)H\u0007J\u001a\u0010*\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0007J\"\u0010*\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020%H\u0007J\u0018\u0010+\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-H\u0007R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006."}, d2 = {"Lorg/wikipedia/views/ViewUtil;", "", "()V", "CENTER_CROP_LARGE_ROUNDED_CORNERS", "Lcom/bumptech/glide/load/MultiTransformation;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "getCENTER_CROP_LARGE_ROUNDED_CORNERS", "()Lcom/bumptech/glide/load/MultiTransformation;", "CENTER_CROP_ROUNDED_CORNERS", "ROUNDED_CORNERS", "Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;", "getROUNDED_CORNERS", "()Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;", "adjustImagePlaceholderHeight", "", "containerWidth", "", "thumbWidth", "thumbHeight", "formatLangButton", "", "langButton", "Landroid/widget/TextView;", "langCode", "", "langButtonTextSizeSmaller", "langButtonTextSizeLarger", "getPlaceholderDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "loadImage", "view", "Landroid/widget/ImageView;", "url", "roundedCorners", "", "largeRoundedSize", "force", "listener", "Lcom/bumptech/glide/request/RequestListener;", "loadImageWithRoundedCorners", "setCloseButtonInActionMode", "actionMode", "Landroid/view/ActionMode;", "app_alphaDebug"})
public final class ViewUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.ViewUtil INSTANCE = null;
    private static final com.bumptech.glide.load.MultiTransformation<android.graphics.Bitmap> CENTER_CROP_ROUNDED_CORNERS = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.bumptech.glide.load.resource.bitmap.RoundedCorners ROUNDED_CORNERS = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.bumptech.glide.load.MultiTransformation<android.graphics.Bitmap> CENTER_CROP_LARGE_ROUNDED_CORNERS = null;
    
    private ViewUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.load.resource.bitmap.RoundedCorners getROUNDED_CORNERS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.load.MultiTransformation<android.graphics.Bitmap> getCENTER_CROP_LARGE_ROUNDED_CORNERS() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void loadImageWithRoundedCorners(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void loadImageWithRoundedCorners(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean largeRoundedSize) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean roundedCorners) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean roundedCorners, boolean largeRoundedSize) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean roundedCorners, boolean largeRoundedSize, boolean force) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, boolean roundedCorners, boolean largeRoundedSize, boolean force, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getPlaceholderDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setCloseButtonInActionMode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void formatLangButton(@org.jetbrains.annotations.NotNull()
    android.widget.TextView langButton, @org.jetbrains.annotations.NotNull()
    java.lang.String langCode, int langButtonTextSizeSmaller, int langButtonTextSizeLarger) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int adjustImagePlaceholderHeight(float containerWidth, float thumbWidth, float thumbHeight) {
        return 0;
    }
}
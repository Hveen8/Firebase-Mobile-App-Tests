package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\bH\u0007J\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\bH\u0007J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/util/ResourceUtil;", "", "()V", "bitmapFromVectorDrawable", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "id", "", "tintColor", "(Landroid/content/Context;ILjava/lang/Integer;)Landroid/graphics/Bitmap;", "darkenColor", "color", "getThemedAttribute", "Landroid/util/TypedValue;", "getThemedAttributeId", "getThemedColor", "lightenColor", "setMenuItemTint", "", "item", "Landroid/view/MenuItem;", "colorAttr", "uri", "Landroid/net/Uri;", "app_alphaDebug"})
public final class ResourceUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.ResourceUtil INSTANCE = null;
    
    private ResourceUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.graphics.Bitmap bitmapFromVectorDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.DrawableRes()
    int id, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorRes()
    java.lang.Integer tintColor) {
        return null;
    }
    
    private final android.util.TypedValue getThemedAttribute(android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        return null;
    }
    
    @androidx.annotation.AnyRes()
    @kotlin.jvm.JvmStatic()
    public static final int getThemedAttributeId(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        return 0;
    }
    
    @androidx.annotation.ColorInt()
    @kotlin.jvm.JvmStatic()
    public static final int getThemedColor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {android.content.res.Resources.NotFoundException.class})
    public final android.net.Uri uri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AnyRes()
    int id) throws android.content.res.Resources.NotFoundException {
        return null;
    }
    
    public final void setMenuItemTint(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem item, @androidx.annotation.AttrRes()
    int colorAttr) {
    }
    
    @androidx.annotation.ColorInt()
    public final int lightenColor(@androidx.annotation.ColorInt()
    int color) {
        return 0;
    }
    
    @androidx.annotation.ColorInt()
    public final int darkenColor(@androidx.annotation.ColorInt()
    int color) {
        return 0;
    }
}
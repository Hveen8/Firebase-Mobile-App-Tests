package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/util/GradientUtil;", "", "()V", "GRADIENT_NUM_STOPS", "", "GRADIENT_POWER", "getPowerGradient", "Landroid/graphics/drawable/Drawable;", "baseColor", "gravity", "getPowerGradientInt", "setPowerGradient", "", "drawable", "Landroid/graphics/drawable/PaintDrawable;", "app_alphaDebug"})
public final class GradientUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.GradientUtil INSTANCE = null;
    private static final int GRADIENT_NUM_STOPS = 8;
    private static final int GRADIENT_POWER = 3;
    
    private GradientUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.graphics.drawable.Drawable getPowerGradient(@androidx.annotation.ColorRes()
    int baseColor, int gravity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getPowerGradientInt(@androidx.annotation.ColorInt()
    int baseColor, int gravity) {
        return null;
    }
    
    /**
     * Create a power gradient by using a compound gradient composed of a series of linear
     * gradients with intermediate color values.
     * adapted from: https://github.com/romannurik/muzei/blob/master/main/src/main/java/com/google/android/apps/muzei/util/ScrimUtil.java
     * @param baseColor The color from which the gradient starts (the ending color is transparent).
     * @param gravity Where the gradient should start from. Note: when making horizontal gradients,
     * remember to use START/END, instead of LEFT/RIGHT.
     */
    private final void setPowerGradient(android.graphics.drawable.PaintDrawable drawable, @androidx.annotation.ColorInt()
    int baseColor, int gravity) {
    }
}
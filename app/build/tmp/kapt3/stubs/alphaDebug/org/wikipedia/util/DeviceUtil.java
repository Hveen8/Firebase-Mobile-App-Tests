package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u001f\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0019\"\u00020\u0016\u00a2\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u000e2\b\b\u0001\u0010\u001e\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J \u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u000e8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/util/DeviceUtil;", "", "()V", "isAccessibilityEnabled", "", "()Z", "isNavigationBarShowing", "isOnWiFi", "pendingIntentFlags", "", "getPendingIntentFlags", "()I", "insetsControllerCompat", "Landroidx/core/view/WindowInsetsControllerCompat;", "Landroid/view/Window;", "getInsetsControllerCompat", "(Landroid/view/Window;)Landroidx/core/view/WindowInsetsControllerCompat;", "hideSoftKeyboard", "", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "setContextClickAsLongClick", "views", "", "([Landroid/view/View;)V", "setLightSystemUiVisibility", "setNavigationBarColor", "window", "color", "showSoftKeyboard", "updateStatusBarTheme", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "reset", "app_alphaDebug"})
public final class DeviceUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.DeviceUtil INSTANCE = null;
    
    private DeviceUtil() {
        super();
    }
    
    private final androidx.core.view.WindowInsetsControllerCompat getInsetsControllerCompat(android.view.Window $this$insetsControllerCompat) {
        return null;
    }
    
    public final void showSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void setLightSystemUiVisibility(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void setNavigationBarColor(@org.jetbrains.annotations.NotNull()
    android.view.Window window, @androidx.annotation.ColorInt()
    int color) {
    }
    
    public final void updateStatusBarTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar toolbar, boolean reset) {
    }
    
    public final void setContextClickAsLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    public final boolean isOnWiFi() {
        return false;
    }
    
    public final boolean isNavigationBarShowing() {
        return false;
    }
    
    public final boolean isAccessibilityEnabled() {
        return false;
    }
    
    public final int getPendingIntentFlags() {
        return 0;
    }
}
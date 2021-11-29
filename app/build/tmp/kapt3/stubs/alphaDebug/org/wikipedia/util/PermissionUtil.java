package org.wikipedia.util;

import java.lang.System;

/**
 * Common methods for dealing with runtime permissions.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/util/PermissionUtil;", "", "()V", "hasWriteExternalStoragePermission", "", "context", "Landroid/content/Context;", "isPermitted", "grantResults", "", "requestWriteStorageRuntimePermissions", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "requestCode", "", "fragment", "Landroidx/fragment/app/Fragment;", "shouldShowWritePermissionRationale", "app_alphaDebug"})
public final class PermissionUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.PermissionUtil INSTANCE = null;
    
    private PermissionUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isPermitted(@org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
    
    public final boolean shouldShowWritePermissionRationale(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean hasWriteExternalStoragePermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void requestWriteStorageRuntimePermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int requestCode) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void requestWriteStorageRuntimePermissions(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity, int requestCode) {
    }
}
package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\nR\u001a\u0010\u000b\u001a\u00020\t8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\u00020\t8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000f\u001a\u00020\t8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u000f\u0010\nR\u001a\u0010\u0011\u001a\u00020\t8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0011\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/util/ReleaseUtil;", "", "()V", "RELEASE_ALPHA", "", "RELEASE_BETA", "RELEASE_DEV", "RELEASE_PROD", "isAlphaRelease", "", "()Z", "isDevRelease", "isDevRelease$annotations", "isPreBetaRelease", "isPreBetaRelease$annotations", "isPreProdRelease", "isPreProdRelease$annotations", "isProdRelease", "isProdRelease$annotations", "calculateReleaseType", "getChannel", "", "ctx", "Landroid/content/Context;", "getChannelFromManifest", "app_alphaDebug"})
public final class ReleaseUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.ReleaseUtil INSTANCE = null;
    private static final int RELEASE_PROD = 0;
    private static final int RELEASE_BETA = 1;
    private static final int RELEASE_ALPHA = 2;
    private static final int RELEASE_DEV = 3;
    
    private ReleaseUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void isProdRelease$annotations() {
    }
    
    public static final boolean isProdRelease() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void isPreProdRelease$annotations() {
    }
    
    public static final boolean isPreProdRelease() {
        return false;
    }
    
    public final boolean isAlphaRelease() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void isPreBetaRelease$annotations() {
    }
    
    public static final boolean isPreBetaRelease() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void isDevRelease$annotations() {
    }
    
    public static final boolean isDevRelease() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getChannel(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    private final int calculateReleaseType() {
        return 0;
    }
    
    private final java.lang.String getChannelFromManifest(android.content.Context ctx) {
        return null;
    }
}
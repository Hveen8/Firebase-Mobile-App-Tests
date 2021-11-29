package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/util/GeoUtil;", "", "()V", "geoIPCountry", "", "getGeoIPCountry$annotations", "getGeoIPCountry", "()Ljava/lang/String;", "sendGeoIntent", "", "activity", "Landroid/app/Activity;", "location", "Landroid/location/Location;", "placeName", "app_alphaDebug"})
public final class GeoUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.GeoUtil INSTANCE = null;
    
    private GeoUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void sendGeoIntent(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.location.Location location, @org.jetbrains.annotations.Nullable()
    java.lang.String placeName) {
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getGeoIPCountry$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getGeoIPCountry() {
        return null;
    }
}
package org.wikipedia.views;

import java.lang.System;

/**
 * Based on:
 * https://github.com/okaybroda/ImageZoom/blob/master/library/src/main/java/com/viven/imagezoom/ImageZoomHelper.java
 */
@kotlin.Suppress(names = {"SameParameterValue", "unused"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000e\u0018\u0000 @2\u00020\u0001:\u0002@AB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019J\b\u0010\"\u001a\u00020 H\u0002J\u001a\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0002J(\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0002J\u000e\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020%J\u000e\u0010.\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019J\b\u0010/\u001a\u00020 H\u0002J\u001a\u00100\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u00101\u001a\u00020\fH\u0002JP\u00102\u001a\u00020 2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u0002042\u0006\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020\u0013H\u0002J\u0018\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u0002042\u0006\u0010?\u001a\u000204H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lorg/wikipedia/views/ImageZoomHelper;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "darkView", "Landroid/view/View;", "decorView", "Landroid/view/ViewGroup;", "isAnimatingDismiss", "", "originalDistance", "", "originalXY", "", "parentOfZoomableView", "pivotX", "", "pivotY", "twoPointCenter", "viewIndex", "zoomListeners", "", "Lorg/wikipedia/views/ImageZoomHelper$OnZoomListener;", "zoomableView", "zoomableViewFrameLP", "Landroid/widget/FrameLayout$LayoutParams;", "zoomableViewLP", "Landroid/view/ViewGroup$LayoutParams;", "addOnZoomListener", "", "onZoomListener", "dismissDialogAndViews", "findZoomableView", "event", "Landroid/view/MotionEvent;", "view", "getDistance", "x1", "x2", "y1", "y2", "onDispatchTouchEvent", "ev", "removeOnZoomListener", "resetOriginalViewAfterZoom", "sendZoomEventToListeners", "zoom", "updateZoomableView", "animatedFraction", "", "scaleYStart", "scaleXStart", "leftMarginStart", "topMarginStart", "scaleXEnd", "scaleYEnd", "leftMarginEnd", "topMarginEnd", "updateZoomableViewMargins", "left", "top", "Companion", "OnZoomListener", "app_alphaDebug"})
public final class ImageZoomHelper {
    private int[] twoPointCenter;
    private int[] originalXY;
    private android.view.ViewGroup parentOfZoomableView;
    private android.view.ViewGroup.LayoutParams zoomableViewLP;
    private android.view.View zoomableView;
    private android.widget.FrameLayout.LayoutParams zoomableViewFrameLP;
    private android.view.View darkView;
    private android.view.ViewGroup decorView;
    private int viewIndex = 0;
    private double originalDistance = 0.0;
    private int pivotX = 0;
    private int pivotY = 0;
    private boolean isAnimatingDismiss = false;
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference = null;
    private final java.util.List<org.wikipedia.views.ImageZoomHelper.OnZoomListener> zoomListeners = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.ImageZoomHelper.Companion Companion = null;
    private static final int FLAG_ZOOMABLE = 1;
    private static final int FLAG_UNZOOMABLE = 2;
    private static boolean isZooming = false;
    
    public ImageZoomHelper(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    public final boolean onDispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    private final void updateZoomableView(float animatedFraction, float scaleYStart, float scaleXStart, int leftMarginStart, int topMarginStart, float scaleXEnd, float scaleYEnd, int leftMarginEnd, int topMarginEnd) {
    }
    
    private final void updateZoomableViewMargins(float left, float top) {
    }
    
    /**
     * Dismiss dialog and set views to null for garbage collection
     */
    private final void dismissDialogAndViews() {
    }
    
    public final void addOnZoomListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ImageZoomHelper.OnZoomListener onZoomListener) {
    }
    
    public final void removeOnZoomListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ImageZoomHelper.OnZoomListener onZoomListener) {
    }
    
    private final void sendZoomEventToListeners(android.view.View zoomableView, boolean zoom) {
    }
    
    private final void resetOriginalViewAfterZoom() {
    }
    
    /**
     * Get distance between two points
     *
     * @param x1 distance x from
     * @param x2 distance x end
     * @param y1 distance y from
     * @param y2 distance y end
     * @return distance
     */
    private final double getDistance(double x1, double x2, double y1, double y2) {
        return 0.0;
    }
    
    /**
     * Finds the view that has the R.id.zoomable tag and also contains the x and y coordinations
     * of two pointers
     *
     * @param event MotionEvent that contains two pointers
     * @param view  View to find in
     * @return zoomable View
     */
    private final android.view.View findZoomableView(android.view.MotionEvent event, android.view.View view) {
        return null;
    }
    
    public static final boolean isZooming() {
        return false;
    }
    
    private static final void setZooming(boolean p0) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setViewZoomable(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/ImageZoomHelper$OnZoomListener;", "", "onImageZoomEnded", "", "view", "Landroid/view/View;", "onImageZoomStarted", "app_alphaDebug"})
    public static abstract interface OnZoomListener {
        
        public abstract void onImageZoomStarted(@org.jetbrains.annotations.Nullable()
        android.view.View view);
        
        public abstract void onImageZoomEnded(@org.jetbrains.annotations.Nullable()
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R,\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0006@BX\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/views/ImageZoomHelper$Companion;", "", "()V", "FLAG_UNZOOMABLE", "", "FLAG_ZOOMABLE", "<set-?>", "", "isZooming", "isZooming$annotations", "()Z", "setZooming", "(Z)V", "clearViewZoomable", "", "view", "Landroid/view/View;", "dispatchCancelEvent", "getIntTag", "setViewZoomable", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isZooming() {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void isZooming$annotations() {
        }
        
        private final void setZooming(boolean p0) {
        }
        
        private final int getIntTag(android.view.View view) {
            return 0;
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setViewZoomable(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void clearViewZoomable(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final void dispatchCancelEvent(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
}
package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 62\u00020\u0001:\u000256BE\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\tH\u0016J\b\u0010$\u001a\u00020\tH\u0016J@\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\tH\u0016J \u0010/\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"H\u0016J\u001a\u00102\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u0005H\u0016J\u0018\u00103\u001a\u00020&2\u0006\u0010)\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0005H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lorg/wikipedia/views/SwipeableItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "context", "Landroid/content/Context;", "swipeColor", "", "swipeIcon", "swipeIconTint", "swipeIconAndTextFromTag", "", "refreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "(Landroid/content/Context;IILjava/lang/Integer;ZLandroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "itemBackgroundPaint", "Landroid/graphics/Paint;", "getRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "swipeBackgroundPaint", "swipeIconBitmap", "Landroid/graphics/Bitmap;", "swipeIconPaint", "getSwipeIconTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "swipeableEnabled", "getSwipeableEnabled", "()Z", "setSwipeableEnabled", "(Z)V", "valueTextPaint", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "holder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "isItemViewSwipeEnabled", "isLongPressDragEnabled", "onChildDraw", "", "canvas", "Landroid/graphics/Canvas;", "viewHolder", "dx", "", "dy", "actionState", "isCurrentlyActive", "onMove", "source", "target", "onSelectedChanged", "onSwiped", "i", "Callback", "Companion", "app_alphaDebug"})
public final class SwipeableItemTouchHelperCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer swipeIconTint = null;
    private final boolean swipeIconAndTextFromTag = false;
    @org.jetbrains.annotations.Nullable()
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout refreshLayout = null;
    private android.graphics.Bitmap swipeIconBitmap;
    private final android.graphics.Paint swipeBackgroundPaint = null;
    private final android.graphics.Paint swipeIconPaint = null;
    private final android.graphics.Paint itemBackgroundPaint = null;
    private final android.graphics.Paint valueTextPaint = null;
    private boolean swipeableEnabled = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.SwipeableItemTouchHelperCallback.Companion Companion = null;
    private static final float SWIPE_ICON_PADDING_DP = 16.0F;
    private static final float SWIPE_TEXT_PADDING_DP = 2.0F;
    private static final float SWIPE_ICON_POSITION_SCALE = 1.4F;
    private static final float SWIPE_TEXT_POSITION_SCALE = 2.0F;
    
    @kotlin.jvm.JvmOverloads()
    public SwipeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public SwipeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorRes()
    int swipeColor) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public SwipeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorRes()
    int swipeColor, @androidx.annotation.DrawableRes()
    int swipeIcon) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public SwipeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorRes()
    int swipeColor, @androidx.annotation.DrawableRes()
    int swipeIcon, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorRes()
    java.lang.Integer swipeIconTint) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public SwipeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorRes()
    int swipeColor, @androidx.annotation.DrawableRes()
    int swipeIcon, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorRes()
    java.lang.Integer swipeIconTint, boolean swipeIconAndTextFromTag) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public SwipeableItemTouchHelperCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.ColorRes()
    int swipeColor, @androidx.annotation.DrawableRes()
    int swipeIcon, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.ColorRes()
    java.lang.Integer swipeIconTint, boolean swipeIconAndTextFromTag, @org.jetbrains.annotations.Nullable()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout refreshLayout) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSwipeIconTint() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout getRefreshLayout() {
        return null;
    }
    
    public final boolean getSwipeableEnabled() {
        return false;
    }
    
    public final void setSwipeableEnabled(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean isLongPressDragEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isItemViewSwipeEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder source, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
    }
    
    @java.lang.Override()
    public void onSelectedChanged(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int actionState) {
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dx, float dy, int actionState, boolean isCurrentlyActive) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "", "onSwipe", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSwipe();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Companion;", "", "()V", "SWIPE_ICON_PADDING_DP", "", "SWIPE_ICON_POSITION_SCALE", "SWIPE_TEXT_PADDING_DP", "SWIPE_TEXT_POSITION_SCALE", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
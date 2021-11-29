package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eH\u0002J(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/views/DrawableItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "id", "", "drawStart", "", "drawEnd", "skipSearchBar", "(Landroid/content/Context;IZZZ)V", "drawable", "Landroid/graphics/drawable/Drawable;", "bounds", "Landroid/graphics/Rect;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "child", "Landroid/view/View;", "top", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getItemOffsets", "outRect", "view", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "app_alphaDebug"})
public final class DrawableItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private final boolean drawStart = false;
    private final boolean drawEnd = false;
    private final boolean skipSearchBar = false;
    private final android.graphics.drawable.Drawable drawable = null;
    
    @kotlin.jvm.JvmOverloads()
    public DrawableItemDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DrawableItemDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id, boolean drawStart) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DrawableItemDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id, boolean drawStart, boolean drawEnd) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DrawableItemDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.AttrRes()
    int id, boolean drawStart, boolean drawEnd, boolean skipSearchBar) {
        super();
    }
    
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override()
    public void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final android.graphics.Rect bounds(androidx.recyclerview.widget.RecyclerView parent, android.view.View child, boolean top) {
        return null;
    }
    
    private final void draw(android.graphics.Canvas canvas, android.graphics.Rect bounds) {
    }
}
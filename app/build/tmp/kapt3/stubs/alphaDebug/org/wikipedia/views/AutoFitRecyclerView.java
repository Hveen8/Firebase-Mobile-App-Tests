package org.wikipedia.views;

import java.lang.System;

/**
 * [RecyclerView] that invokes a callback when the number of columns should be updated.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000 $2\u00020\u0001:\u0003#$%B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J0\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/views/AutoFitRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callback", "Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "getCallback", "()Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "setCallback", "(Lorg/wikipedia/views/AutoFitRecyclerView$Callback;)V", "columns", "getColumns", "()I", "setColumns", "(I)V", "minColumnWidth", "calculateColumns", "columnWidth", "availableWidth", "onLayout", "", "changed", "", "l", "t", "r", "b", "onMeasure", "widthSpec", "heightSpec", "Callback", "Companion", "DefaultCallback", "app_alphaDebug"})
public class AutoFitRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    private int minColumnWidth = 0;
    @androidx.annotation.IntRange(from = 1L)
    private int columns = 1;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.views.AutoFitRecyclerView.Callback callback;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.AutoFitRecyclerView.Companion Companion = null;
    private static final int MIN_COLUMNS = 1;
    
    public AutoFitRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final int getColumns() {
        return 0;
    }
    
    public final void setColumns(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.views.AutoFitRecyclerView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.AutoFitRecyclerView.Callback p0) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthSpec, int heightSpec) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
    
    private final int calculateColumns(int columnWidth, int availableWidth) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "", "onColumns", "", "columns", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onColumns(int columns);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/AutoFitRecyclerView$DefaultCallback;", "Lorg/wikipedia/views/AutoFitRecyclerView$Callback;", "()V", "onColumns", "", "columns", "", "app_alphaDebug"})
    static final class DefaultCallback implements org.wikipedia.views.AutoFitRecyclerView.Callback {
        
        public DefaultCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onColumns(int columns) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/views/AutoFitRecyclerView$Companion;", "", "()V", "MIN_COLUMNS", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
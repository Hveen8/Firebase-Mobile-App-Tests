package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/page/ViewHideHandler;", "Lorg/wikipedia/views/ObservableWebView$OnScrollChangeListener;", "Lorg/wikipedia/views/ObservableWebView$OnUpOrCancelMotionEventListener;", "Lorg/wikipedia/views/ObservableWebView$OnDownMotionEventListener;", "Lorg/wikipedia/views/ObservableWebView$OnClickListener;", "hideableView", "Landroid/view/View;", "anchoredView", "gravity", "", "(Landroid/view/View;Landroid/view/View;I)V", "webView", "Lorg/wikipedia/views/ObservableWebView;", "ensureDisplayed", "", "ensureHidden", "onClick", "", "x", "", "y", "onDownMotionEvent", "onScrollChanged", "oldScrollY", "scrollY", "isHumanScroll", "onUpOrCancelMotionEvent", "setScrollView", "app_alphaDebug"})
public final class ViewHideHandler implements org.wikipedia.views.ObservableWebView.OnScrollChangeListener, org.wikipedia.views.ObservableWebView.OnUpOrCancelMotionEventListener, org.wikipedia.views.ObservableWebView.OnDownMotionEventListener, org.wikipedia.views.ObservableWebView.OnClickListener {
    private final android.view.View hideableView = null;
    private final android.view.View anchoredView = null;
    private final int gravity = 0;
    private org.wikipedia.views.ObservableWebView webView;
    
    public ViewHideHandler(@org.jetbrains.annotations.NotNull()
    android.view.View hideableView, @org.jetbrains.annotations.Nullable()
    android.view.View anchoredView, int gravity) {
        super();
    }
    
    public final void setScrollView(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.ObservableWebView webView) {
    }
    
    @java.lang.Override()
    public void onScrollChanged(int oldScrollY, int scrollY, boolean isHumanScroll) {
    }
    
    @java.lang.Override()
    public void onUpOrCancelMotionEvent() {
    }
    
    @java.lang.Override()
    public void onDownMotionEvent() {
    }
    
    @java.lang.Override()
    public boolean onClick(float x, float y) {
        return false;
    }
    
    public final void ensureDisplayed() {
    }
    
    private final void ensureHidden() {
    }
}
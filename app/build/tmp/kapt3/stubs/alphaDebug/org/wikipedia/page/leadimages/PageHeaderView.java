package org.wikipedia.page.leadimages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ0\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0014J \u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001dH\u0016J\u0010\u0010&\u001a\u00020\u00172\b\u0010\'\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010(\u001a\u00020\u0017J\u0012\u0010)\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\nH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/page/leadimages/PageHeaderView;", "Lorg/wikipedia/views/LinearLayoutOverWebView;", "Lorg/wikipedia/views/ObservableWebView$OnScrollChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lorg/wikipedia/databinding/ViewPageHeaderBinding;", "callback", "Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;", "getCallback", "()Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;", "setCallback", "(Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;)V", "getImageView", "Lorg/wikipedia/views/FaceAndColorDetectImageView;", "hide", "", "loadImage", "url", "", "onLayout", "changed", "", "left", "top", "right", "bottom", "onScrollChanged", "oldScrollY", "scrollY", "isHumanScroll", "setUpCallToAction", "callToActionText", "show", "updateScroll", "Callback", "app_alphaDebug"})
public final class PageHeaderView extends org.wikipedia.views.LinearLayoutOverWebView implements org.wikipedia.views.ObservableWebView.OnScrollChangeListener {
    private final org.wikipedia.databinding.ViewPageHeaderBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.leadimages.PageHeaderView.Callback callback;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.leadimages.PageHeaderView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.leadimages.PageHeaderView.Callback p0) {
    }
    
    public PageHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PageHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PageHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override()
    public void onScrollChanged(int oldScrollY, int scrollY, boolean isHumanScroll) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    private final void updateScroll(int scrollY) {
    }
    
    public final void hide() {
    }
    
    public final void show() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.views.FaceAndColorDetectImageView getImageView() {
        return null;
    }
    
    public final void setUpCallToAction(@org.jetbrains.annotations.Nullable()
    java.lang.String callToActionText) {
    }
    
    public final void loadImage(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/leadimages/PageHeaderView$Callback;", "", "onCallToActionClicked", "", "onImageClicked", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onImageClicked();
        
        public abstract void onCallToActionClicked();
    }
}
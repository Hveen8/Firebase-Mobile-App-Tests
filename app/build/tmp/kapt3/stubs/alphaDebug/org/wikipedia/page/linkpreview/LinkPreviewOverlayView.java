package org.wikipedia.page.linkpreview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lorg/wikipedia/databinding/ViewLinkPreviewOverlayBinding;", "callback", "Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "getCallback", "()Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "setCallback", "(Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;)V", "setPrimaryButtonText", "", "text", "", "setSecondaryButtonText", "showSecondaryButton", "show", "", "showTertiaryButton", "Callback", "app_alphaDebug"})
public final class LinkPreviewOverlayView extends android.widget.FrameLayout {
    private final org.wikipedia.databinding.ViewLinkPreviewOverlayBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback callback;
    
    public LinkPreviewOverlayView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public LinkPreviewOverlayView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public LinkPreviewOverlayView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.linkpreview.LinkPreviewOverlayView.Callback p0) {
    }
    
    public final void setPrimaryButtonText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void showSecondaryButton(boolean show) {
    }
    
    public final void setSecondaryButtonText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void showTertiaryButton(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/linkpreview/LinkPreviewOverlayView$Callback;", "", "onPrimaryClick", "", "onSecondaryClick", "onTertiaryClick", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onPrimaryClick();
        
        public abstract void onSecondaryClick();
        
        public abstract void onTertiaryClick();
    }
}
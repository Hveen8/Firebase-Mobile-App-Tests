package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010\'\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\tJ\u000e\u0010+\u001a\u00020(2\u0006\u0010*\u001a\u00020\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u0011\u0010!\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001a\u00a8\u0006-"}, d2 = {"Lorg/wikipedia/views/WikiErrorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backClickListener", "Landroid/view/View$OnClickListener;", "getBackClickListener", "()Landroid/view/View$OnClickListener;", "setBackClickListener", "(Landroid/view/View$OnClickListener;)V", "binding", "Lorg/wikipedia/databinding/ViewWikiErrorBinding;", "getBinding", "()Lorg/wikipedia/databinding/ViewWikiErrorBinding;", "setBinding", "(Lorg/wikipedia/databinding/ViewWikiErrorBinding;)V", "contentTopOffset", "Landroid/widget/Space;", "getContentTopOffset", "()Landroid/widget/Space;", "nextClickListener", "getNextClickListener", "setNextClickListener", "retryClickListener", "getRetryClickListener", "setRetryClickListener", "tabLayoutOffset", "getTabLayoutOffset", "getErrorType", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "caught", "", "setError", "", "setErrorTextColor", "color", "setIconColorFilter", "ErrorType", "app_alphaDebug"})
public final class WikiErrorView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.databinding.ViewWikiErrorBinding binding;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener retryClickListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener backClickListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener nextClickListener;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ViewWikiErrorBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    org.wikipedia.databinding.ViewWikiErrorBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getRetryClickListener() {
        return null;
    }
    
    public final void setRetryClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getBackClickListener() {
        return null;
    }
    
    public final void setBackClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getNextClickListener() {
        return null;
    }
    
    public final void setNextClickListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Space getContentTopOffset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Space getTabLayoutOffset() {
        return null;
    }
    
    public WikiErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public WikiErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public WikiErrorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
    }
    
    public final void setIconColorFilter(int color) {
    }
    
    public final void setErrorTextColor(int color) {
    }
    
    private final org.wikipedia.views.WikiErrorView.ErrorType getErrorType(java.lang.Throwable caught) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType;", "", "icon", "", "text", "buttonText", "footerText", "(Ljava/lang/String;IIIII)V", "getButtonText", "()I", "getFooterText", "hasFooterText", "", "getHasFooterText", "()Z", "getIcon", "getText", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "PAGE_MISSING", "TIMEOUT", "OFFLINE", "EMPTY", "GENERIC", "app_alphaDebug"})
    public static enum ErrorType {
        /*public static final*/ PAGE_MISSING /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$PAGE_MISSING;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app_alphaDebug"}) PAGE_MISSING(0, 0, 0, 0){
    
    PAGE_MISSING() {
        super(0, 0, 0, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ TIMEOUT /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$TIMEOUT;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app_alphaDebug"}) TIMEOUT(0, 0, 0, 0){
    
    TIMEOUT() {
        super(0, 0, 0, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ OFFLINE /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$OFFLINE;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app_alphaDebug"}) OFFLINE(0, 0, 0, 0){
    
    OFFLINE() {
        super(0, 0, 0, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ EMPTY /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$EMPTY;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app_alphaDebug"}) EMPTY(0, 0, 0, 0){
    
    EMPTY() {
        super(0, 0, 0, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */,
        /*public static final*/ GENERIC /* = new @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiErrorView$ErrorType$GENERIC;", "Lorg/wikipedia/views/WikiErrorView$ErrorType;", "buttonClickListener", "Landroid/view/View$OnClickListener;", "errorView", "Lorg/wikipedia/views/WikiErrorView;", "app_alphaDebug"}) GENERIC(0, 0, 0, 0){
    
    GENERIC() {
        super(0, 0, 0, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.WikiErrorView errorView) {
        return null;
    }
} */;
        private final int icon = 0;
        private final int text = 0;
        private final int buttonText = 0;
        private final int footerText = 0;
        
        ErrorType(@androidx.annotation.DrawableRes()
        int icon, @androidx.annotation.StringRes()
        int text, @androidx.annotation.StringRes()
        int buttonText, @androidx.annotation.StringRes()
        int footerText) {
        }
        
        public final int getIcon() {
            return 0;
        }
        
        public final int getText() {
            return 0;
        }
        
        public final int getButtonText() {
            return 0;
        }
        
        public final int getFooterText() {
            return 0;
        }
        
        public final boolean getHasFooterText() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public abstract android.view.View.OnClickListener buttonClickListener(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.WikiErrorView errorView);
    }
}
package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000fJ \u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010 \u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/views/MessageCardView;", "Lorg/wikipedia/views/WikiCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewMessageCardBinding;", "getBinding", "()Lorg/wikipedia/databinding/ViewMessageCardBinding;", "setDefaultState", "", "setDisabled", "message", "", "setIPBlocked", "setImageResource", "imageResource", "", "visible", "", "setMessageText", "text", "setMessageTitle", "title", "setNegativeButton", "stringRes", "listener", "Landroid/view/View$OnClickListener;", "applyListenerToContainer", "setPaused", "setPositiveButton", "setRequiredLogin", "fragment", "Landroidx/fragment/app/Fragment;", "app_alphaDebug"})
public final class MessageCardView extends org.wikipedia.views.WikiCardView {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.databinding.ViewMessageCardBinding binding = null;
    
    public MessageCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ViewMessageCardBinding getBinding() {
        return null;
    }
    
    public final void setMessageTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setMessageText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void setImageResource(@androidx.annotation.DrawableRes()
    int imageResource, boolean visible) {
    }
    
    public final void setPositiveButton(@androidx.annotation.StringRes()
    int stringRes, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener, boolean applyListenerToContainer) {
    }
    
    public final void setNegativeButton(@androidx.annotation.StringRes()
    int stringRes, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener, boolean applyListenerToContainer) {
    }
    
    public final void setPaused(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setDisabled(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setIPBlocked(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void setRequiredLogin(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    private final void setDefaultState() {
    }
}
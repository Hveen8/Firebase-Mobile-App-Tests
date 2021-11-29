package org.wikipedia.feed.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/feed/view/CardFooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewCardFooterBinding;", "callback", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "getCallback", "()Lorg/wikipedia/feed/view/CardFooterView$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/CardFooterView$Callback;)V", "setFooterActionText", "", "actionText", "", "langCode", "Callback", "app_alphaDebug"})
public final class CardFooterView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final org.wikipedia.databinding.ViewCardFooterBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.CardFooterView.Callback callback;
    
    public CardFooterView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.view.CardFooterView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.CardFooterView.Callback p0) {
    }
    
    public final void setFooterActionText(@org.jetbrains.annotations.NotNull()
    java.lang.String actionText, @org.jetbrains.annotations.Nullable()
    java.lang.String langCode) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/feed/view/CardFooterView$Callback;", "", "onFooterClicked", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onFooterClicked();
    }
}
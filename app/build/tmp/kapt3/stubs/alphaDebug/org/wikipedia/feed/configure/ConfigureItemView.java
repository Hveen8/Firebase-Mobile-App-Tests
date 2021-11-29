package org.wikipedia.feed.configure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapter", "Lorg/wikipedia/feed/configure/LanguageItemAdapter;", "binding", "Lorg/wikipedia/databinding/ItemFeedContentTypeBinding;", "callback", "Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;", "getCallback", "()Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;", "setCallback", "(Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;)V", "contentType", "Lorg/wikipedia/feed/FeedContentType;", "setContents", "", "setDragHandleTouchListener", "listener", "Landroid/view/View$OnTouchListener;", "showLangSelectDialog", "Callback", "app_alphaDebug"})
public final class ConfigureItemView extends android.widget.FrameLayout {
    private final org.wikipedia.databinding.ItemFeedContentTypeBinding binding = null;
    private org.wikipedia.feed.FeedContentType contentType;
    private org.wikipedia.feed.configure.LanguageItemAdapter adapter;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.configure.ConfigureItemView.Callback callback;
    
    public ConfigureItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.feed.configure.ConfigureItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.configure.ConfigureItemView.Callback p0) {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.FeedContentType contentType) {
    }
    
    private final void showLangSelectDialog() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void setDragHandleTouchListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnTouchListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/feed/configure/ConfigureItemView$Callback;", "", "onCheckedChanged", "", "contentType", "Lorg/wikipedia/feed/FeedContentType;", "checked", "", "onLanguagesChanged", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onCheckedChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.FeedContentType contentType, boolean checked);
        
        public abstract void onLanguagesChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.FeedContentType contentType);
    }
}
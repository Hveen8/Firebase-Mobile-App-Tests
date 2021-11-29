package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/views/WikiTextKeyboardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lorg/wikipedia/databinding/ViewWikitextKeyboardBinding;", "callback", "Lorg/wikipedia/views/WikiTextKeyboardView$Callback;", "getCallback", "()Lorg/wikipedia/views/WikiTextKeyboardView$Callback;", "setCallback", "(Lorg/wikipedia/views/WikiTextKeyboardView$Callback;)V", "editText", "Lorg/wikipedia/views/PlainPasteEditText;", "getEditText", "()Lorg/wikipedia/views/PlainPasteEditText;", "setEditText", "(Lorg/wikipedia/views/PlainPasteEditText;)V", "lastIndexOf", "str", "", "subStr", "toggleSyntaxAroundCurrentSelection", "", "ic", "Landroid/view/inputmethod/InputConnection;", "prefix", "suffix", "trimPunctuation", "Callback", "app_alphaDebug"})
public final class WikiTextKeyboardView extends android.widget.FrameLayout {
    private final org.wikipedia.databinding.ViewWikitextKeyboardBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.WikiTextKeyboardView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.PlainPasteEditText editText;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.WikiTextKeyboardView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.WikiTextKeyboardView.Callback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.PlainPasteEditText getEditText() {
        return null;
    }
    
    public final void setEditText(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.PlainPasteEditText p0) {
    }
    
    public WikiTextKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public WikiTextKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public WikiTextKeyboardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    private final void toggleSyntaxAroundCurrentSelection(android.view.inputmethod.InputConnection ic, java.lang.String prefix, java.lang.String suffix) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final int lastIndexOf(java.lang.String str, java.lang.String subStr) {
        return 0;
    }
    
    private final java.lang.String trimPunctuation(java.lang.String str) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/WikiTextKeyboardView$Callback;", "", "onPreviewLink", "", "title", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onPreviewLink(@org.jetbrains.annotations.NotNull()
        java.lang.String title);
    }
}
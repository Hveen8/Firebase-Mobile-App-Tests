package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020 J\u0018\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010&\u001a\u00020\u001dJ\u0006\u0010\'\u001a\u00020\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000fH\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020/H\u0016J\u0006\u00101\u001a\u00020\u001dJ\u0006\u00102\u001a\u00020\u001dR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lorg/wikipedia/views/PlainPasteEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "findInPageCurrentTextPosition", "findInPageTextPositionList", "", "findListener", "Lorg/wikipedia/views/PlainPasteEditText$FindListener;", "getFindListener", "()Lorg/wikipedia/views/PlainPasteEditText$FindListener;", "setFindListener", "(Lorg/wikipedia/views/PlainPasteEditText$FindListener;)V", "inputConnection", "Landroid/view/inputmethod/InputConnection;", "getInputConnection", "()Landroid/view/inputmethod/InputConnection;", "setInputConnection", "(Landroid/view/inputmethod/InputConnection;)V", "syntaxHighlighter", "Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "clearMatches", "", "find", "isNext", "", "findFirstOrLast", "isFirst", "findInEditor", "targetText", "", "findNext", "findPrevious", "onCreateInputConnection", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onFinished", "findingNext", "listener", "onReceiveContent", "Landroidx/core/view/ContentInfoCompat;", "payload", "redo", "undo", "FindListener", "app_alphaDebug"})
public final class PlainPasteEditText extends com.google.android.material.textfield.TextInputEditText {
    private final java.util.List<java.lang.Integer> findInPageTextPositionList = null;
    private int findInPageCurrentTextPosition = 0;
    private org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter;
    @org.jetbrains.annotations.Nullable()
    private android.view.inputmethod.InputConnection inputConnection;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.PlainPasteEditText.FindListener findListener;
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.inputmethod.InputConnection getInputConnection() {
        return null;
    }
    
    public final void setInputConnection(@org.jetbrains.annotations.Nullable()
    android.view.inputmethod.InputConnection p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.PlainPasteEditText.FindListener getFindListener() {
        return null;
    }
    
    public final void setFindListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.PlainPasteEditText.FindListener p0) {
    }
    
    public PlainPasteEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public PlainPasteEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public PlainPasteEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.core.view.ContentInfoCompat onReceiveContent(@org.jetbrains.annotations.NotNull()
    androidx.core.view.ContentInfoCompat payload) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.inputmethod.InputConnection onCreateInputConnection(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.EditorInfo outAttrs) {
        return null;
    }
    
    public final void undo() {
    }
    
    public final void redo() {
    }
    
    public final void findInEditor(@org.jetbrains.annotations.Nullable()
    java.lang.String targetText, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter) {
    }
    
    public final void findNext() {
    }
    
    public final void findPrevious() {
    }
    
    public final void findFirstOrLast(boolean isFirst) {
    }
    
    private final void find(boolean isNext) {
    }
    
    public final void clearMatches(@org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter) {
    }
    
    private final void onFinished(boolean findingNext, org.wikipedia.views.PlainPasteEditText.FindListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/views/PlainPasteEditText$FindListener;", "", "onFinished", "", "activeMatchOrdinal", "", "numberOfMatches", "textPosition", "findingNext", "", "app_alphaDebug"})
    public static abstract interface FindListener {
        
        public abstract void onFinished(int activeMatchOrdinal, int numberOfMatches, int textPosition, boolean findingNext);
    }
}
package org.wikipedia.edit.richtext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003#$%B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u0006\u0010 \u001a\u00020\u001eJ\b\u0010!\u001a\u00020\u001eH\u0002J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "", "context", "Landroid/content/Context;", "textBox", "Landroid/widget/EditText;", "(Landroid/content/Context;Landroid/widget/EditText;)V", "syntaxHighlightListener", "Lorg/wikipedia/edit/richtext/SyntaxHighlighter$OnSyntaxHighlightListener;", "(Landroid/content/Context;Landroid/widget/EditText;Lorg/wikipedia/edit/richtext/SyntaxHighlighter$OnSyntaxHighlightListener;)V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "handler", "Landroid/os/Handler;", "searchText", "", "selectedMatchResultPosition", "", "syntaxHighlightCallback", "Ljava/lang/Runnable;", "getSyntaxHighlightListener", "()Lorg/wikipedia/edit/richtext/SyntaxHighlighter$OnSyntaxHighlightListener;", "setSyntaxHighlightListener", "(Lorg/wikipedia/edit/richtext/SyntaxHighlighter$OnSyntaxHighlightListener;)V", "syntaxRules", "", "Lorg/wikipedia/edit/richtext/SyntaxRule;", "getTextBox", "()Landroid/widget/EditText;", "applyFindTextSyntax", "", "listener", "cleanup", "postHighlightCallback", "setSelectedMatchResultPosition", "OnSyntaxHighlightListener", "SyntaxHighlightSearchMatchesTask", "SyntaxHighlightTask", "app_alphaDebug"})
public final class SyntaxHighlighter {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.EditText textBox = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.edit.richtext.SyntaxHighlighter.OnSyntaxHighlightListener syntaxHighlightListener;
    private final java.util.List<org.wikipedia.edit.richtext.SyntaxRule> syntaxRules = null;
    private java.lang.String searchText;
    private int selectedMatchResultPosition = 0;
    private final android.os.Handler handler = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final java.lang.Runnable syntaxHighlightCallback = null;
    
    public SyntaxHighlighter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.EditText textBox, @org.jetbrains.annotations.Nullable()
    org.wikipedia.edit.richtext.SyntaxHighlighter.OnSyntaxHighlightListener syntaxHighlightListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getTextBox() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.edit.richtext.SyntaxHighlighter.OnSyntaxHighlightListener getSyntaxHighlightListener() {
        return null;
    }
    
    public final void setSyntaxHighlightListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.edit.richtext.SyntaxHighlighter.OnSyntaxHighlightListener p0) {
    }
    
    public SyntaxHighlighter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.EditText textBox) {
        super();
    }
    
    public final void applyFindTextSyntax(@org.jetbrains.annotations.Nullable()
    java.lang.String searchText, @org.jetbrains.annotations.Nullable()
    org.wikipedia.edit.richtext.SyntaxHighlighter.OnSyntaxHighlightListener listener) {
    }
    
    public final void setSelectedMatchResultPosition(int selectedMatchResultPosition) {
    }
    
    private final void postHighlightCallback() {
    }
    
    public final void cleanup() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxHighlighter$OnSyntaxHighlightListener;", "", "findTextMatches", "", "spanExtents", "", "Lorg/wikipedia/edit/richtext/SpanExtents;", "syntaxHighlightResults", "app_alphaDebug"})
    public static abstract interface OnSyntaxHighlightListener {
        
        public abstract void syntaxHighlightResults(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.edit.richtext.SpanExtents> spanExtents);
        
        public abstract void findTextMatches(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends org.wikipedia.edit.richtext.SpanExtents> spanExtents);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxHighlighter$SyntaxHighlightTask;", "Ljava/util/concurrent/Callable;", "", "Lorg/wikipedia/edit/richtext/SpanExtents;", "text", "Landroid/text/Editable;", "(Lorg/wikipedia/edit/richtext/SyntaxHighlighter;Landroid/text/Editable;)V", "cancelled", "", "call", "cancel", "", "app_alphaDebug"})
    final class SyntaxHighlightTask implements java.util.concurrent.Callable<java.util.List<org.wikipedia.edit.richtext.SpanExtents>> {
        private final android.text.Editable text = null;
        private boolean cancelled = false;
        
        public SyntaxHighlightTask(@org.jetbrains.annotations.NotNull()
        android.text.Editable text) {
            super();
        }
        
        public final void cancel() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<org.wikipedia.edit.richtext.SpanExtents> call() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxHighlighter$SyntaxHighlightSearchMatchesTask;", "Ljava/util/concurrent/Callable;", "", "Lorg/wikipedia/edit/richtext/SpanExtents;", "text", "Landroid/text/Editable;", "searchText", "", "selectedMatchResultPosition", "", "(Lorg/wikipedia/edit/richtext/SyntaxHighlighter;Landroid/text/Editable;Ljava/lang/String;I)V", "call", "app_alphaDebug"})
    final class SyntaxHighlightSearchMatchesTask implements java.util.concurrent.Callable<java.util.List<? extends org.wikipedia.edit.richtext.SpanExtents>> {
        private final int selectedMatchResultPosition = 0;
        private final java.lang.String searchText = null;
        private final java.lang.String text = null;
        
        public SyntaxHighlightSearchMatchesTask(@org.jetbrains.annotations.NotNull()
        android.text.Editable text, @org.jetbrains.annotations.Nullable()
        java.lang.String searchText, int selectedMatchResultPosition) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<org.wikipedia.edit.richtext.SpanExtents> call() {
            return null;
        }
    }
}
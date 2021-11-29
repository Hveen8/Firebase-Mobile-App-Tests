package org.wikipedia.views;

import java.lang.System;

/**
 * [SearchView] that exposes contextual action bar callbacks.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/views/CabSearchView;", "Landroidx/appcompat/widget/SearchView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "searchCloseBtn", "Landroid/widget/ImageView;", "searchSrcTextView", "Landroidx/appcompat/widget/SearchView$SearchAutoComplete;", "addFilter", "", "textView", "Landroid/widget/TextView;", "filter", "Landroid/text/InputFilter;", "selectAllQueryTexts", "setCloseButtonVisibility", "searchString", "", "setSearchHintTextColor", "color", "Companion", "PlainTextInputFilter", "app_alphaDebug"})
public final class CabSearchView extends androidx.appcompat.widget.SearchView {
    private final android.widget.ImageView searchCloseBtn = null;
    private final androidx.appcompat.widget.SearchView.SearchAutoComplete searchSrcTextView = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.CabSearchView.Companion Companion = null;
    private static final int SEARCH_TEXT_SIZE = 16;
    
    @kotlin.jvm.JvmOverloads()
    public CabSearchView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CabSearchView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CabSearchView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void addFilter(android.widget.TextView textView, android.text.InputFilter filter) {
    }
    
    public final void selectAllQueryTexts() {
    }
    
    public final void setSearchHintTextColor(int color) {
    }
    
    public final void setCloseButtonVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.String searchString) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/views/CabSearchView$PlainTextInputFilter;", "Landroid/text/InputFilter;", "()V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "app_alphaDebug"})
    static final class PlainTextInputFilter implements android.text.InputFilter {
        
        public PlainTextInputFilter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence filter(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence source, int start, int end, @org.jetbrains.annotations.NotNull()
        android.text.Spanned dest, int dstart, int dend) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/views/CabSearchView$Companion;", "", "()V", "SEARCH_TEXT_SIZE", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
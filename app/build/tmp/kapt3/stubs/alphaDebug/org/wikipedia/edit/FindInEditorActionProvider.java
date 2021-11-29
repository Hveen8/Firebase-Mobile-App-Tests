package org.wikipedia.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u0012\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/edit/FindInEditorActionProvider;", "Lorg/wikipedia/views/FindInPageActionProvider;", "Lorg/wikipedia/views/FindInPageActionProvider$FindInPageListener;", "scrollView", "Landroid/widget/ScrollView;", "textView", "Lorg/wikipedia/views/PlainPasteEditText;", "syntaxHighlighter", "Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "actionMode", "Landroid/view/ActionMode;", "(Landroid/widget/ScrollView;Lorg/wikipedia/views/PlainPasteEditText;Lorg/wikipedia/edit/richtext/SyntaxHighlighter;Landroid/view/ActionMode;)V", "searchQuery", "", "findInPage", "", "text", "onCloseClicked", "onCreateActionView", "Landroid/view/View;", "menuItem", "Landroid/view/MenuItem;", "onFindNextClicked", "onFindNextLongClicked", "onFindPrevClicked", "onFindPrevLongClicked", "onSearchTextChanged", "app_alphaDebug"})
public final class FindInEditorActionProvider extends org.wikipedia.views.FindInPageActionProvider implements org.wikipedia.views.FindInPageActionProvider.FindInPageListener {
    private final android.widget.ScrollView scrollView = null;
    private final org.wikipedia.views.PlainPasteEditText textView = null;
    private final org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter = null;
    private final android.view.ActionMode actionMode = null;
    private java.lang.String searchQuery;
    
    public FindInEditorActionProvider(@org.jetbrains.annotations.NotNull()
    android.widget.ScrollView scrollView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.PlainPasteEditText textView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter, @org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateActionView(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return null;
    }
    
    private final void findInPage(java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onFindNextClicked() {
    }
    
    @java.lang.Override()
    public void onFindNextLongClicked() {
    }
    
    @java.lang.Override()
    public void onFindPrevClicked() {
    }
    
    @java.lang.Override()
    public void onFindPrevLongClicked() {
    }
    
    @java.lang.Override()
    public void onCloseClicked() {
    }
    
    @java.lang.Override()
    public void onSearchTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
}
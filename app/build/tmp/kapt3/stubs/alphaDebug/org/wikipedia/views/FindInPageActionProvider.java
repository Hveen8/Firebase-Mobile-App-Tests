package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u000bH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\u0016\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&J\u0010\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lorg/wikipedia/views/FindInPageActionProvider;", "Landroid/view/ActionProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_binding", "Lorg/wikipedia/databinding/GroupFindInPageBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/GroupFindInPageBinding;", "enableLastOccurrenceSearchFlag", "", "getEnableLastOccurrenceSearchFlag", "()Z", "setEnableLastOccurrenceSearchFlag", "(Z)V", "isFirstOccurrence", "isLastOccurrence", "lastOccurrenceSearchFlag", "listener", "Lorg/wikipedia/views/FindInPageActionProvider$FindInPageListener;", "getListener", "()Lorg/wikipedia/views/FindInPageActionProvider$FindInPageListener;", "setListener", "(Lorg/wikipedia/views/FindInPageActionProvider$FindInPageListener;)V", "searchQueryListener", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "onCreateActionView", "Landroid/view/View;", "overridesItemVisibility", "setButtonClickListeners", "", "setButtonLongClickListeners", "setFindInPageChevronsEnabled", "enabled", "setInputFieldStyle", "setMatchesResults", "activeMatchOrdinal", "", "numberOfMatches", "setSearchViewQuery", "searchQuery", "", "FindInPageListener", "app_alphaDebug"})
public class FindInPageActionProvider extends android.view.ActionProvider {
    private final android.content.Context context = null;
    private org.wikipedia.databinding.GroupFindInPageBinding _binding;
    private boolean lastOccurrenceSearchFlag = false;
    private boolean isFirstOccurrence = false;
    private boolean isLastOccurrence = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.FindInPageActionProvider.FindInPageListener listener;
    private boolean enableLastOccurrenceSearchFlag = false;
    private final androidx.appcompat.widget.SearchView.OnQueryTextListener searchQueryListener = null;
    
    public FindInPageActionProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final org.wikipedia.databinding.GroupFindInPageBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.FindInPageActionProvider.FindInPageListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.FindInPageActionProvider.FindInPageListener p0) {
    }
    
    public final boolean getEnableLastOccurrenceSearchFlag() {
        return false;
    }
    
    public final void setEnableLastOccurrenceSearchFlag(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean overridesItemVisibility() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateActionView() {
        return null;
    }
    
    private final void setInputFieldStyle() {
    }
    
    private final void setButtonClickListeners() {
    }
    
    private final void setButtonLongClickListeners() {
    }
    
    public final void setSearchViewQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void setMatchesResults(int activeMatchOrdinal, int numberOfMatches) {
    }
    
    private final void setFindInPageChevronsEnabled(boolean enabled) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/views/FindInPageActionProvider$FindInPageListener;", "", "onCloseClicked", "", "onFindNextClicked", "onFindNextLongClicked", "onFindPrevClicked", "onFindPrevLongClicked", "onSearchTextChanged", "text", "", "app_alphaDebug"})
    public static abstract interface FindInPageListener {
        
        public abstract void onFindNextClicked();
        
        public abstract void onFindNextLongClicked();
        
        public abstract void onFindPrevClicked();
        
        public abstract void onFindPrevLongClicked();
        
        public abstract void onCloseClicked();
        
        public abstract void onSearchTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.String text);
    }
}
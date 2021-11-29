package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/views/SearchAndFilterActionProvider;", "Landroidx/core/view/ActionProvider;", "context", "Landroid/content/Context;", "searchHintString", "", "callback", "Lorg/wikipedia/views/SearchAndFilterActionProvider$Callback;", "(Landroid/content/Context;Ljava/lang/String;Lorg/wikipedia/views/SearchAndFilterActionProvider$Callback;)V", "binding", "Lorg/wikipedia/databinding/ViewSearchAndFilterBinding;", "onCreateActionView", "Landroid/view/View;", "overridesItemVisibility", "", "updateFilterIconAndText", "", "Callback", "app_alphaDebug"})
public final class SearchAndFilterActionProvider extends androidx.core.view.ActionProvider {
    private final java.lang.String searchHintString = null;
    private final org.wikipedia.views.SearchAndFilterActionProvider.Callback callback = null;
    private final org.wikipedia.databinding.ViewSearchAndFilterBinding binding = null;
    
    public SearchAndFilterActionProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String searchHintString, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.SearchAndFilterActionProvider.Callback callback) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateActionView() {
        return null;
    }
    
    @java.lang.Override()
    public boolean overridesItemVisibility() {
        return false;
    }
    
    public final void updateFilterIconAndText() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/views/SearchAndFilterActionProvider$Callback;", "", "getExcludedFilterCount", "", "onQueryTextChange", "", "s", "", "onQueryTextFocusChange", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onQueryTextChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s);
        
        public abstract void onQueryTextFocusChange();
        
        public abstract int getExcludedFilterCount();
    }
}
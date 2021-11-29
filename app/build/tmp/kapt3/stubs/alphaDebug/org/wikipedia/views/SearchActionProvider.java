package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/views/SearchActionProvider;", "Landroidx/core/view/ActionProvider;", "context", "Landroid/content/Context;", "searchHintString", "", "callback", "Lorg/wikipedia/views/SearchActionProvider$Callback;", "(Landroid/content/Context;Ljava/lang/String;Lorg/wikipedia/views/SearchActionProvider$Callback;)V", "binding", "Lorg/wikipedia/databinding/GroupSearchBinding;", "onCreateActionView", "Landroid/view/View;", "overridesItemVisibility", "", "Callback", "app_alphaDebug"})
public final class SearchActionProvider extends androidx.core.view.ActionProvider {
    private final java.lang.String searchHintString = null;
    private final org.wikipedia.views.SearchActionProvider.Callback callback = null;
    private final org.wikipedia.databinding.GroupSearchBinding binding = null;
    
    public SearchActionProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String searchHintString, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.SearchActionProvider.Callback callback) {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/SearchActionProvider$Callback;", "", "onQueryTextChange", "", "s", "", "onQueryTextFocusChange", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onQueryTextChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s);
        
        public abstract void onQueryTextFocusChange();
    }
}
package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTaskView;", "Lorg/wikipedia/views/WikiCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewSuggestedEditsTaskItemBinding;", "setUpViews", "", "task", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsTaskView$Callback;", "updateTranslateActionUI", "Callback", "app_alphaDebug"})
public final class SuggestedEditsTaskView extends org.wikipedia.views.WikiCardView {
    private final org.wikipedia.databinding.ViewSuggestedEditsTaskItemBinding binding = null;
    
    public SuggestedEditsTaskView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    private final void updateTranslateActionUI() {
    }
    
    public final void setUpViews(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.SuggestedEditsTask task, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.SuggestedEditsTaskView.Callback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTaskView$Callback;", "", "onViewClick", "", "task", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "secondary", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onViewClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsTask task, boolean secondary);
    }
}
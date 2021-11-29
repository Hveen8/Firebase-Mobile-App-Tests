package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/views/ReadingListsOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ViewReadingListsOverflowBinding;", "callback", "Lorg/wikipedia/views/ReadingListsOverflowView$Callback;", "popupWindowHost", "Landroid/widget/PopupWindow;", "dismissPopupWindowHost", "", "show", "anchorView", "Landroid/view/View;", "Callback", "app_alphaDebug"})
public final class ReadingListsOverflowView extends android.widget.FrameLayout {
    private org.wikipedia.databinding.ViewReadingListsOverflowBinding binding;
    private org.wikipedia.views.ReadingListsOverflowView.Callback callback;
    private android.widget.PopupWindow popupWindowHost;
    
    public ReadingListsOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final void dismissPopupWindowHost() {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ReadingListsOverflowView.Callback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/ReadingListsOverflowView$Callback;", "", "createNewListClick", "", "refreshClick", "sortByClick", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void sortByClick();
        
        public abstract void createNewListClick();
        
        public abstract void refreshClick();
    }
}
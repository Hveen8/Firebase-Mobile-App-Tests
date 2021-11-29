package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0003J\b\u0010\u0012\u001a\u00020\u000eH\u0002J8\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/views/PageActionOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ViewPageActionOverflowBinding;", "callback", "Lorg/wikipedia/views/PageActionOverflowView$Callback;", "isWatched", "", "popupWindowHost", "Landroid/widget/PopupWindow;", "dismissPopupWindowHost", "", "getWatchlistIcon", "", "hasWatchlistExpiry", "setButtonsListener", "show", "anchorView", "Landroid/view/View;", "currentTab", "Lorg/wikipedia/page/tabs/Tab;", "isMobileWeb", "Callback", "app_alphaDebug"})
public final class PageActionOverflowView extends android.widget.FrameLayout {
    private org.wikipedia.databinding.ViewPageActionOverflowBinding binding;
    private org.wikipedia.views.PageActionOverflowView.Callback callback;
    private android.widget.PopupWindow popupWindowHost;
    private boolean isWatched = false;
    
    public PageActionOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.PageActionOverflowView.Callback callback, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.tabs.Tab currentTab, boolean isMobileWeb, boolean isWatched, boolean hasWatchlistExpiry) {
    }
    
    @androidx.annotation.DrawableRes()
    private final int getWatchlistIcon(boolean isWatched, boolean hasWatchlistExpiry) {
        return 0;
    }
    
    private final void dismissPopupWindowHost() {
    }
    
    private final void setButtonsListener() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/views/PageActionOverflowView$Callback;", "", "editHistoryClick", "", "feedClick", "forwardClick", "newTabClick", "shareClick", "talkClick", "watchlistClick", "isWatched", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void forwardClick();
        
        public abstract void watchlistClick(boolean isWatched);
        
        public abstract void talkClick();
        
        public abstract void editHistoryClick();
        
        public abstract void shareClick();
        
        public abstract void newTabClick();
        
        public abstract void feedClick();
    }
}
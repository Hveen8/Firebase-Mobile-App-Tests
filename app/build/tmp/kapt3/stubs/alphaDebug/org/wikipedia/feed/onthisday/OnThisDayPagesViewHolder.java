package org.wikipedia.feed.onthisday;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayPagesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "v", "Landroid/view/View;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "(Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/view/View;Lorg/wikipedia/dataclient/WikiSite;)V", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "image", "Lorg/wikipedia/views/FaceAndColorDetectImageView;", "imageContainer", "Landroid/widget/FrameLayout;", "selectedPage", "Lorg/wikipedia/dataclient/page/PageSummary;", "onBaseViewClicked", "", "setFields", "page", "setImage", "url", "", "showOverflowMenu", "", "anchorView", "app_alphaDebug"})
public final class OnThisDayPagesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final android.app.Activity activity = null;
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    private final android.widget.FrameLayout imageContainer = null;
    private final org.wikipedia.views.FaceAndColorDetectImageView image = null;
    private org.wikipedia.dataclient.page.PageSummary selectedPage;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    
    public OnThisDayPagesViewHolder(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        super(null);
    }
    
    public final void setFields(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.page.PageSummary page) {
    }
    
    private final void setImage(java.lang.String url) {
    }
    
    private final void onBaseViewClicked() {
    }
    
    private final boolean showOverflowMenu(android.view.View anchorView) {
        return false;
    }
}
package org.wikipedia.userprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/userprofile/ContributionsHeaderView;", "Landroid/widget/LinearLayout;", "Lorg/wikipedia/suggestededits/SuggestedEditsTypeItemView$Callback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewContributionsHeaderBinding;", "callback", "Lorg/wikipedia/userprofile/ContributionsHeaderView$Callback;", "getCallback", "()Lorg/wikipedia/userprofile/ContributionsHeaderView$Callback;", "setCallback", "(Lorg/wikipedia/userprofile/ContributionsHeaderView$Callback;)V", "filterViews", "", "Lorg/wikipedia/suggestededits/SuggestedEditsTypeItemView;", "[Lorg/wikipedia/suggestededits/SuggestedEditsTypeItemView;", "onTypeItemClick", "", "editType", "", "updateFilterViewUI", "totalContributions", "updateTotalPageViews", "pageViews", "", "Callback", "app_alphaDebug"})
public final class ContributionsHeaderView extends android.widget.LinearLayout implements org.wikipedia.suggestededits.SuggestedEditsTypeItemView.Callback {
    private final org.wikipedia.databinding.ViewContributionsHeaderBinding binding = null;
    private org.wikipedia.suggestededits.SuggestedEditsTypeItemView[] filterViews;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.userprofile.ContributionsHeaderView.Callback callback;
    
    public ContributionsHeaderView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.userprofile.ContributionsHeaderView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.userprofile.ContributionsHeaderView.Callback p0) {
    }
    
    @java.lang.Override()
    public void onTypeItemClick(int editType) {
    }
    
    public final void updateFilterViewUI(int editType, int totalContributions) {
    }
    
    public final void updateTotalPageViews(long pageViews) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/userprofile/ContributionsHeaderView$Callback;", "", "onTypeItemClick", "", "editType", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onTypeItemClick(int editType);
    }
}
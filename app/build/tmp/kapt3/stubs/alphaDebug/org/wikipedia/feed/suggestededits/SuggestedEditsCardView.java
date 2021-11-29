package org.wikipedia.feed.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView;", "Lorg/wikipedia/feed/view/DefaultFeedCardView;", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsFeedClient$Callback;", "Lorg/wikipedia/feed/view/CardFooterView$Callback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ViewSuggestedEditsCardBinding;", "value", "Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/FeedAdapter$Callback;", "setCallback", "(Lorg/wikipedia/feed/view/FeedAdapter$Callback;)V", "card", "getCard", "()Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "setCard", "(Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;)V", "prevImageDownloadSettings", "", "header", "", "onFooterClicked", "setUpPagerWithSECards", "updateCardContent", "updateContents", "Callback", "SECardsPagerAdapter", "app_alphaDebug"})
public final class SuggestedEditsCardView extends org.wikipedia.feed.view.DefaultFeedCardView<org.wikipedia.feed.suggestededits.SuggestedEditsCard> implements org.wikipedia.feed.suggestededits.SuggestedEditsFeedClient.Callback, org.wikipedia.feed.view.CardFooterView.Callback {
    private final org.wikipedia.databinding.ViewSuggestedEditsCardBinding binding = null;
    private boolean prevImageDownloadSettings;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.suggestededits.SuggestedEditsCard card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.FeedAdapter.Callback callback;
    
    public SuggestedEditsCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wikipedia.feed.suggestededits.SuggestedEditsCard getCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.suggestededits.SuggestedEditsCard value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wikipedia.feed.view.FeedAdapter.Callback getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.FeedAdapter.Callback value) {
    }
    
    @java.lang.Override()
    public void updateCardContent(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
    }
    
    @java.lang.Override()
    public void onFooterClicked() {
    }
    
    private final void updateContents(org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
    }
    
    private final void setUpPagerWithSECards(org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
    }
    
    private final void header(org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView$Callback;", "", "onSeCardFooterClicked", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSeCardFooterClicked();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCardView$SECardsPagerAdapter;", "Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "card", "Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "(Landroidx/appcompat/app/AppCompatActivity;Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;)V", "seCardTypeList", "Ljava/util/ArrayList;", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_alphaDebug"})
    public static final class SECardsPagerAdapter extends org.wikipedia.views.PositionAwareFragmentStateAdapter {
        private final org.wikipedia.feed.suggestededits.SuggestedEditsCard card = null;
        private final java.util.ArrayList<org.wikipedia.descriptions.DescriptionEditActivity.Action> seCardTypeList = null;
        
        public SECardsPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.suggestededits.SuggestedEditsCard card) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
}
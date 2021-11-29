package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0013\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001QB\u0005\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\"2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0018H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020-H\u0002J\u001a\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u0018H\u0016J\u0012\u00102\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u000104H\u0016J$\u00105\u001a\u0002042\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020-H\u0016J\u0010\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020\u0014H\u0016J\u0010\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020\"H\u0016J\b\u0010D\u001a\u00020-H\u0016J\b\u0010E\u001a\u00020-H\u0002J\u001a\u0010F\u001a\u00020-2\u0006\u0010G\u001a\u0002042\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010H\u001a\u00020-H\u0002J\b\u0010I\u001a\u00020-H\u0016J\b\u0010J\u001a\u00020\u0018H\u0016J\b\u0010K\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020?H\u0002J\b\u0010N\u001a\u00020-H\u0002J\b\u0010O\u001a\u00020-H\u0002J\b\u0010P\u001a\u00020-H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsFragment;", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/view/View$OnClickListener;", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentSuggestedEditsImageTagsItemBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentSuggestedEditsImageTagsItemBinding;", "funnel", "Lorg/wikipedia/analytics/EditFunnel;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "getInvokeSource", "()Lorg/wikipedia/Constants$InvokeSource;", "setInvokeSource", "(Lorg/wikipedia/Constants$InvokeSource;)V", "lastSearchTerm", "", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "publishSuccess", "", "getPublishSuccess", "()Z", "setPublishSuccess", "(Z)V", "publishing", "getPublishing", "setPublishing", "tagList", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$ImageLabel;", "wasCaptionLongClicked", "addChip", "Lcom/google/android/material/chip/Chip;", "label", "typeface", "Landroid/graphics/Typeface;", "atLeastOneTagChecked", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "getNextItem", "", "onCheckedChanged", "button", "Landroid/widget/CompoundButton;", "isChecked", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "caught", "", "onSearchDismiss", "searchTerm", "onSearchSelect", "item", "onStart", "onSuccess", "onViewCreated", "view", "playSuccessVibration", "publish", "publishEnabled", "publishOutlined", "setErrorState", "t", "updateContents", "updateLicenseTextShown", "updateTagChips", "Companion", "app_alphaDebug"})
public final class SuggestedEditsImageTagsFragment extends org.wikipedia.suggestededits.SuggestedEditsItemFragment implements android.widget.CompoundButton.OnCheckedChangeListener, android.view.View.OnClickListener, org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.Callback {
    private org.wikipedia.databinding.FragmentSuggestedEditsImageTagsItemBinding _binding;
    private boolean publishing = false;
    private boolean publishSuccess = false;
    private org.wikipedia.dataclient.mwapi.MwQueryPage page;
    private final java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel> tagList = null;
    private boolean wasCaptionLongClicked = false;
    private java.lang.String lastSearchTerm = "";
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.Constants.InvokeSource invokeSource = org.wikipedia.Constants.InvokeSource.SUGGESTED_EDITS;
    private org.wikipedia.analytics.EditFunnel funnel;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsImageTagsFragment.Companion Companion = null;
    
    public SuggestedEditsImageTagsFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentSuggestedEditsImageTagsItemBinding getBinding() {
        return null;
    }
    
    public final boolean getPublishing() {
        return false;
    }
    
    public final void setPublishing(boolean p0) {
    }
    
    public final boolean getPublishSuccess() {
        return false;
    }
    
    public final void setPublishSuccess(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.Constants.InvokeSource getInvokeSource() {
        return null;
    }
    
    public final void setInvokeSource(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void getNextItem() {
    }
    
    private final void setErrorState(java.lang.Throwable t) {
    }
    
    private final void updateContents() {
    }
    
    private final void updateTagChips() {
    }
    
    private final com.google.android.material.chip.Chip addChip(org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel label, android.graphics.Typeface typeface) {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton button, boolean isChecked) {
    }
    
    @java.lang.Override()
    public void onSearchSelect(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel item) {
    }
    
    @java.lang.Override()
    public void onSearchDismiss(@org.jetbrains.annotations.NotNull()
    java.lang.String searchTerm) {
    }
    
    @java.lang.Override()
    public void publish() {
    }
    
    private final void onSuccess() {
    }
    
    private final void onError(java.lang.Throwable caught) {
    }
    
    private final void playSuccessVibration() {
    }
    
    private final void updateLicenseTextShown() {
    }
    
    private final boolean atLeastOneTagChecked() {
        return false;
    }
    
    @java.lang.Override()
    public boolean publishEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean publishOutlined() {
        return false;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsItemFragment.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagsFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsItemFragment newInstance() {
            return null;
        }
    }
}
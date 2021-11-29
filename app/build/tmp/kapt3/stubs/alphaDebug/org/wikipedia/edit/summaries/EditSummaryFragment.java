package org.wikipedia.edit.summaries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u0019J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0006\u0010&\u001a\u00020\u0019J\u0006\u0010\'\u001a\u00020\u0019R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006)"}, d2 = {"Lorg/wikipedia/edit/summaries/EditSummaryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentPreviewSummaryBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentPreviewSummaryBinding;", "editSummaryHandler", "Lorg/wikipedia/edit/summaries/EditSummaryHandler;", "isActive", "", "()Z", "summary", "", "getSummary", "()Ljava/lang/String;", "title", "Lorg/wikipedia/page/PageTitle;", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "setTitle", "(Lorg/wikipedia/page/PageTitle;)V", "handleBackPressed", "hide", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSaveInstanceState", "outState", "onStart", "saveSummary", "show", "Companion", "app_alphaDebug"})
public final class EditSummaryFragment extends androidx.fragment.app.Fragment {
    private org.wikipedia.databinding.FragmentPreviewSummaryBinding _binding;
    private org.wikipedia.edit.summaries.EditSummaryHandler editSummaryHandler;
    public org.wikipedia.page.PageTitle title;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.summaries.EditSummaryFragment.Companion Companion = null;
    private static final java.lang.String KEY_SUMMARY_TEXT = "summaryText";
    
    public EditSummaryFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentPreviewSummaryBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public final boolean isActive() {
        return false;
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    /**
     * Shows (fades in) the custom edit summary fragment.
     * When fade-in completes, the keyboard is shown automatically, and the state
     * of the actionbar button(s) is updated.
     */
    public final void show() {
    }
    
    /**
     * Hides (fades out) the custom edit summary fragment.
     * When fade-out completes, the keyboard is hidden, and the state of the actionbar
     * button(s) is updated.
     */
    public final void hide() {
    }
    
    public final boolean handleBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    /**
     * Commits the custom ("other") edit summary that the user may have entered,
     * so that it remains saved in a drop-down list for future use.
     */
    public final void saveSummary() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/edit/summaries/EditSummaryFragment$Companion;", "", "()V", "KEY_SUMMARY_TEXT", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
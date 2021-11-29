package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0004,-./B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0013H\u0016J\u001a\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lorg/wikipedia/databinding/DialogImageTagSelectBinding;", "adapter", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultListAdapter;", "binding", "getBinding", "()Lorg/wikipedia/databinding/DialogImageTagSelectBinding;", "currentSearchTerm", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "searchRunnable", "Ljava/lang/Runnable;", "textWatcher", "Landroid/text/TextWatcher;", "applyResults", "", "results", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$ImageLabel;", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Callback;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "onViewCreated", "view", "requestResults", "searchTerm", "Callback", "Companion", "ResultItemHolder", "ResultListAdapter", "app_alphaDebug"})
public final class SuggestedEditsImageTagDialog extends androidx.fragment.app.DialogFragment {
    private android.text.TextWatcher textWatcher;
    private org.wikipedia.databinding.DialogImageTagSelectBinding _binding;
    private java.lang.String currentSearchTerm = "";
    private final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultListAdapter adapter = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final java.lang.Runnable searchRunnable = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.Companion Companion = null;
    
    public SuggestedEditsImageTagDialog() {
        super();
    }
    
    private final org.wikipedia.databinding.DialogImageTagSelectBinding getBinding() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void requestResults(java.lang.String searchTerm) {
    }
    
    private final void applyResults(java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel> results) {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Callback;", "", "onSearchDismiss", "", "searchTerm", "", "onSearchSelect", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$ImageLabel;", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSearchSelect(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel item);
        
        public abstract void onSearchDismiss(@org.jetbrains.annotations.NotNull()
        java.lang.String searchTerm);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;Landroid/view/View;)V", "bindItem", "", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$ImageLabel;", "onClick", "v", "app_alphaDebug"})
    final class ResultItemHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        
        public ResultItemHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel item) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\tH\u0016J\u0014\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$ResultItemHolder;", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;", "results", "", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$ImageLabel;", "(Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setResults", "app_alphaDebug"})
    final class ResultListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultItemHolder> {
        private java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel> results;
        
        public ResultListAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel> results) {
            super();
        }
        
        public final void setResults(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.dataclient.mwapi.MwQueryPage.ImageLabel> results) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultItemHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int pos) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsImageTagDialog.ResultItemHolder holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsImageTagDialog;", "useClipboardText", "", "lastText", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsImageTagDialog newInstance(boolean useClipboardText, @org.jetbrains.annotations.NotNull()
        java.lang.String lastText) {
            return null;
        }
    }
}
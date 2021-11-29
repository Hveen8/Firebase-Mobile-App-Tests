package org.wikipedia.page.references;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lorg/wikipedia/page/references/ReferenceDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentReferencesPagerBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentReferencesPagerBinding;", "callback", "Lorg/wikipedia/page/references/ReferenceDialog$Callback;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "", "onStart", "processLinkTextWithAlphaReferences", "", "linkText", "Callback", "ReferencesAdapter", "ViewHolder", "app_alphaDebug"})
public final class ReferenceDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    private org.wikipedia.databinding.FragmentReferencesPagerBinding _binding;
    
    public ReferenceDialog() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentReferencesPagerBinding getBinding() {
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final java.lang.String processLinkTextWithAlphaReferences(java.lang.String linkText) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final org.wikipedia.page.references.ReferenceDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/page/references/ReferenceDialog$Callback;", "", "linkHandler", "Lorg/wikipedia/page/LinkHandler;", "getLinkHandler", "()Lorg/wikipedia/page/LinkHandler;", "referencesGroup", "", "Lorg/wikipedia/page/references/PageReferences$Reference;", "getReferencesGroup", "()Ljava/util/List;", "selectedReferenceIndex", "", "getSelectedReferenceIndex", "()I", "app_alphaDebug"})
    public static abstract interface Callback {
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.wikipedia.page.LinkHandler getLinkHandler();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.util.List<org.wikipedia.page.references.PageReferences.Reference> getReferencesGroup();
        
        public abstract int getSelectedReferenceIndex();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/references/ReferenceDialog$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/wikipedia/databinding/ViewReferencePagerItemBinding;", "(Lorg/wikipedia/page/references/ReferenceDialog;Lorg/wikipedia/databinding/ViewReferencePagerItemBinding;)V", "getBinding", "()Lorg/wikipedia/databinding/ViewReferencePagerItemBinding;", "bindItem", "", "idText", "", "contents", "app_alphaDebug"})
    final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.databinding.ViewReferencePagerItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.databinding.ViewReferencePagerItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.databinding.ViewReferencePagerItemBinding getBinding() {
            return null;
        }
        
        public final void bindItem(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence idText, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence contents) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/page/references/ReferenceDialog$ReferencesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/page/references/ReferenceDialog$ViewHolder;", "Lorg/wikipedia/page/references/ReferenceDialog;", "references", "", "Lorg/wikipedia/page/references/PageReferences$Reference;", "(Lorg/wikipedia/page/references/ReferenceDialog;Ljava/util/List;)V", "getReferences", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_alphaDebug"})
    final class ReferencesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.page.references.ReferenceDialog.ViewHolder> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<org.wikipedia.page.references.PageReferences.Reference> references = null;
        
        public ReferencesAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.references.PageReferences.Reference> references) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<org.wikipedia.page.references.PageReferences.Reference> getReferences() {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.page.references.ReferenceDialog.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.references.ReferenceDialog.ViewHolder holder, int position) {
        }
    }
}
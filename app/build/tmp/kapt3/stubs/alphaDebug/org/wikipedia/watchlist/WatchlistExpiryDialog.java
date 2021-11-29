package org.wikipedia.watchlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0003$%&B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J$\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "Lorg/wikipedia/databinding/DialogWatchlistExpiryBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/DialogWatchlistExpiryBinding;", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "expiryList", "", "[Lorg/wikipedia/watchlist/WatchlistExpiry;", "expiryOptions", "Landroid/view/View;", "[Landroid/view/View;", "callback", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onStart", "onViewCreated", "view", "resetAllOptions", "selectOption", "setupListeners", "updateOptionView", "enabled", "", "Callback", "Companion", "ExpiryOptionClickListener", "app_alphaDebug"})
public final class WatchlistExpiryDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    private org.wikipedia.databinding.DialogWatchlistExpiryBinding _binding;
    private org.wikipedia.watchlist.WatchlistExpiry expiry;
    private android.view.View[] expiryOptions;
    private final org.wikipedia.watchlist.WatchlistExpiry[] expiryList = {org.wikipedia.watchlist.WatchlistExpiry.NEVER, org.wikipedia.watchlist.WatchlistExpiry.ONE_WEEK, org.wikipedia.watchlist.WatchlistExpiry.ONE_MONTH, org.wikipedia.watchlist.WatchlistExpiry.THREE_MONTH, org.wikipedia.watchlist.WatchlistExpiry.SIX_MONTH};
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.watchlist.WatchlistExpiryDialog.Companion Companion = null;
    private static final java.lang.String ARG_EXPIRY = "expiry";
    
    public WatchlistExpiryDialog() {
        super();
    }
    
    private final org.wikipedia.databinding.DialogWatchlistExpiryBinding getBinding() {
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
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void setupListeners() {
    }
    
    private final void selectOption(org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    private final void resetAllOptions() {
    }
    
    private final void updateOptionView(android.view.View view, boolean enabled) {
    }
    
    private final org.wikipedia.watchlist.WatchlistExpiryDialog.Callback callback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.watchlist.WatchlistExpiryDialog newInstance(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "", "onExpirySelect", "", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onExpirySelect(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialog$ExpiryOptionClickListener;", "Landroid/view/View$OnClickListener;", "(Lorg/wikipedia/watchlist/WatchlistExpiryDialog;)V", "onClick", "", "view", "Landroid/view/View;", "app_alphaDebug"})
    public final class ExpiryOptionClickListener implements android.view.View.OnClickListener {
        
        public ExpiryOptionClickListener() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Companion;", "", "()V", "ARG_EXPIRY", "", "newInstance", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog;", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.wikipedia.watchlist.WatchlistExpiryDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry) {
            return null;
        }
    }
}
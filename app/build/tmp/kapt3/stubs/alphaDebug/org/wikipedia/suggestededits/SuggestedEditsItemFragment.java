package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "parent", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "publish", "publishEnabled", "", "publishOutlined", "Callback", "app_alphaDebug"})
public abstract class SuggestedEditsItemFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    
    public SuggestedEditsItemFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.suggestededits.SuggestedEditsCardsFragment parent() {
        return null;
    }
    
    public boolean publishEnabled() {
        return false;
    }
    
    public boolean publishOutlined() {
        return false;
    }
    
    public void publish() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "", "getLangCode", "", "getSinglePage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "logSuccess", "", "nextPage", "sourceFragment", "Landroidx/fragment/app/Fragment;", "updateActionButton", "app_alphaDebug"})
    public static abstract interface Callback {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getLangCode();
        
        @org.jetbrains.annotations.Nullable()
        public abstract org.wikipedia.dataclient.mwapi.MwQueryPage getSinglePage();
        
        public abstract void updateActionButton();
        
        public abstract void nextPage(@org.jetbrains.annotations.Nullable()
        androidx.fragment.app.Fragment sourceFragment);
        
        public abstract void logSuccess();
    }
}
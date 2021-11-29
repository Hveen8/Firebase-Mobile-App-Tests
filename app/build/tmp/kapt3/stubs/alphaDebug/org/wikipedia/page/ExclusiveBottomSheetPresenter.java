package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ(\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J8\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "", "()V", "dismiss", "", "manager", "Landroidx/fragment/app/FragmentManager;", "show", "dialog", "Landroidx/fragment/app/DialogFragment;", "showAddToListDialog", "fm", "title", "Lorg/wikipedia/page/PageTitle;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "listener", "Landroid/content/DialogInterface$OnDismissListener;", "showMoveToListDialog", "sourceReadingListId", "", "showDefaultList", "", "Companion", "app_alphaDebug"})
public final class ExclusiveBottomSheetPresenter {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.ExclusiveBottomSheetPresenter.Companion Companion = null;
    private static final java.lang.String BOTTOM_SHEET_FRAGMENT_TAG = "bottom_sheet_fragment";
    
    public ExclusiveBottomSheetPresenter() {
        super();
    }
    
    public final void showAddToListDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
    }
    
    public final void showAddToListDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener listener) {
    }
    
    public final void showMoveToListDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm, long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, boolean showDefaultList, @org.jetbrains.annotations.Nullable()
    android.content.DialogInterface.OnDismissListener listener) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment dialog) {
    }
    
    public final void dismiss(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager manager) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/page/ExclusiveBottomSheetPresenter$Companion;", "", "()V", "BOTTOM_SHEET_FRAGMENT_TAG", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
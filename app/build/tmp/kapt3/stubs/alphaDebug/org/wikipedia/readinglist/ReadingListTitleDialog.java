package org.wikipedia.readinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListTitleDialog;", "", "()V", "readingListTitleDialog", "Lorg/wikipedia/views/TextInputDialog;", "activity", "Landroid/app/Activity;", "title", "", "description", "otherTitles", "", "callback", "Lorg/wikipedia/readinglist/ReadingListTitleDialog$Callback;", "Callback", "app_alphaDebug"})
public final class ReadingListTitleDialog {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListTitleDialog INSTANCE = null;
    
    private ReadingListTitleDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.views.TextInputDialog readingListTitleDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> otherTitles, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.ReadingListTitleDialog.Callback callback) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListTitleDialog$Callback;", "", "onSuccess", "", "text", "", "description", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        java.lang.String description);
    }
}
package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001&B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0002J&\u0010\u0015\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nJA\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0002\u0010\u001eJ+\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/views/LanguageScrollView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewLanguageScrollBinding;", "callback", "Lorg/wikipedia/views/LanguageScrollView$Callback;", "languageCodes", "", "", "selectedPosition", "", "getSelectedPosition", "()I", "createLanguageTab", "Landroid/view/View;", "languageCode", "setUpLanguageScrollTabData", "", "position", "updateTabLanguageCode", "customView", "textColor", "background", "Landroid/graphics/drawable/Drawable;", "backgroundColorTint", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)V", "updateTabLanguageLabel", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Integer;)V", "updateTabView", "selected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "Callback", "app_alphaDebug"})
public final class LanguageScrollView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final org.wikipedia.databinding.ViewLanguageScrollBinding binding = null;
    private org.wikipedia.views.LanguageScrollView.Callback callback;
    private java.util.List<java.lang.String> languageCodes;
    
    public LanguageScrollView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final int getSelectedPosition() {
        return 0;
    }
    
    private final void updateTabView(boolean selected, com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    public final void setUpLanguageScrollTabData(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> languageCodes, int position, @org.jetbrains.annotations.Nullable()
    org.wikipedia.views.LanguageScrollView.Callback callback) {
    }
    
    private final android.view.View createLanguageTab(java.lang.String languageCode) {
        return null;
    }
    
    private final void updateTabLanguageLabel(android.view.View customView, java.lang.String languageCode, @androidx.annotation.ColorInt()
    java.lang.Integer textColor) {
    }
    
    private final void updateTabLanguageCode(android.view.View customView, java.lang.String languageCode, @androidx.annotation.ColorInt()
    java.lang.Integer textColor, android.graphics.drawable.Drawable background, @androidx.annotation.ColorInt()
    java.lang.Integer backgroundColorTint) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/LanguageScrollView$Callback;", "", "onLanguageButtonClicked", "", "onLanguageTabSelected", "selectedLanguageCode", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onLanguageTabSelected(@org.jetbrains.annotations.NotNull()
        java.lang.String selectedLanguageCode);
        
        public abstract void onLanguageButtonClicked();
    }
}
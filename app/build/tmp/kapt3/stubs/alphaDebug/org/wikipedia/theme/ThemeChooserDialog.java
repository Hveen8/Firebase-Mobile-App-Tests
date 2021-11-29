package org.wikipedia.theme;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 52\u00020\u0001:\u0007456789:B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0012H\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0012H\u0002J\b\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u0018H\u0002J\b\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002J\u0018\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0012H\u0002J\b\u00103\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "Lorg/wikipedia/databinding/DialogThemeChooserBinding;", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "binding", "getBinding", "()Lorg/wikipedia/databinding/DialogThemeChooserBinding;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/AppearanceChangeFunnel;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "isMatchingSystemThemeEnabled", "", "()Z", "updatingFont", "callback", "Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "conditionallyDisableThemeButtons", "", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onToggleDimImages", "enabled", "onToggleMatchSystemTheme", "updateComponents", "updateDimImagesSwitch", "updateFontFamily", "updateFontSize", "updateMatchSystemThemeSwitch", "updateThemeButtonStroke", "button", "Lcom/google/android/material/button/MaterialButton;", "selected", "updateThemeButtons", "Callback", "Companion", "EventBusConsumer", "FontFamilyListener", "FontSizeAction", "FontSizeButtonListener", "ThemeButtonListener", "app_alphaDebug"})
public final class ThemeChooserDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    private org.wikipedia.databinding.DialogThemeChooserBinding _binding;
    private org.wikipedia.WikipediaApp app;
    private org.wikipedia.analytics.AppearanceChangeFunnel funnel;
    private org.wikipedia.Constants.InvokeSource invokeSource;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private boolean updatingFont = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.theme.ThemeChooserDialog.Companion Companion = null;
    private static final int BUTTON_STROKE_WIDTH = 0;
    
    public ThemeChooserDialog() {
        super();
    }
    
    private final org.wikipedia.databinding.DialogThemeChooserBinding getBinding() {
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
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCancel(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
    
    private final void onToggleDimImages(boolean enabled) {
    }
    
    private final void onToggleMatchSystemTheme(boolean enabled) {
    }
    
    private final void conditionallyDisableThemeButtons() {
    }
    
    private final boolean isMatchingSystemThemeEnabled() {
        return false;
    }
    
    private final void updateComponents() {
    }
    
    private final void updateMatchSystemThemeSwitch() {
    }
    
    private final void updateFontSize() {
    }
    
    private final void updateFontFamily() {
    }
    
    private final void updateThemeButtons() {
    }
    
    private final void updateThemeButtonStroke(com.google.android.material.button.MaterialButton button, boolean selected) {
    }
    
    private final void updateDimImagesSwitch() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.theme.ThemeChooserDialog.Callback callback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.theme.ThemeChooserDialog newInstance(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "", "onCancelThemeChooser", "", "onToggleDimImages", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onToggleDimImages();
        
        public abstract void onCancelThemeChooser();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeAction;", "", "(Ljava/lang/String;I)V", "INCREASE", "DECREASE", "RESET", "app_alphaDebug"})
    static enum FontSizeAction {
        /*public static final*/ INCREASE /* = new INCREASE() */,
        /*public static final*/ DECREASE /* = new DECREASE() */,
        /*public static final*/ RESET /* = new RESET() */;
        
        FontSizeAction() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$ThemeButtonListener;", "Landroid/view/View$OnClickListener;", "theme", "Lorg/wikipedia/theme/Theme;", "(Lorg/wikipedia/theme/ThemeChooserDialog;Lorg/wikipedia/theme/Theme;)V", "onClick", "", "v", "Landroid/view/View;", "app_alphaDebug"})
    final class ThemeButtonListener implements android.view.View.OnClickListener {
        private final org.wikipedia.theme.Theme theme = null;
        
        public ThemeButtonListener(@org.jetbrains.annotations.NotNull()
        org.wikipedia.theme.Theme theme) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$FontFamilyListener;", "Landroid/view/View$OnClickListener;", "(Lorg/wikipedia/theme/ThemeChooserDialog;)V", "onClick", "", "v", "Landroid/view/View;", "app_alphaDebug"})
    final class FontFamilyListener implements android.view.View.OnClickListener {
        
        public FontFamilyListener() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeButtonListener;", "Landroid/view/View$OnClickListener;", "action", "Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeAction;", "(Lorg/wikipedia/theme/ThemeChooserDialog;Lorg/wikipedia/theme/ThemeChooserDialog$FontSizeAction;)V", "onClick", "", "view", "Landroid/view/View;", "app_alphaDebug"})
    final class FontSizeButtonListener implements android.view.View.OnClickListener {
        private final org.wikipedia.theme.ThemeChooserDialog.FontSizeAction action = null;
        
        public FontSizeButtonListener(@org.jetbrains.annotations.NotNull()
        org.wikipedia.theme.ThemeChooserDialog.FontSizeAction action) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$EventBusConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "(Lorg/wikipedia/theme/ThemeChooserDialog;)V", "accept", "", "event", "app_alphaDebug"})
    final class EventBusConsumer implements io.reactivex.rxjava3.functions.Consumer<java.lang.Object> {
        
        public EventBusConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.Nullable()
        java.lang.Object event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/theme/ThemeChooserDialog$Companion;", "", "()V", "BUTTON_STROKE_WIDTH", "", "newInstance", "Lorg/wikipedia/theme/ThemeChooserDialog;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.wikipedia.theme.ThemeChooserDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source) {
            return null;
        }
    }
}
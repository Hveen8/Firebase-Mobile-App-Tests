package org.wikipedia.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/settings/AboutActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "Lorg/wikipedia/databinding/ActivityAboutBinding;", "makeEverythingClickable", "", "vg", "Landroid/view/ViewGroup;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "AboutLogoClickListener", "app_alphaDebug"})
public final class AboutActivity extends org.wikipedia.activity.BaseActivity {
    private org.wikipedia.databinding.ActivityAboutBinding binding;
    
    public AboutActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void makeEverythingClickable(android.view.ViewGroup vg) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/settings/AboutActivity$AboutLogoClickListener;", "Landroid/view/View$OnClickListener;", "()V", "isSecretClickLimitMet", "", "()Z", "mSecretClickCount", "", "onClick", "", "v", "Landroid/view/View;", "Companion", "app_alphaDebug"})
    static final class AboutLogoClickListener implements android.view.View.OnClickListener {
        private int mSecretClickCount = 0;
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.settings.AboutActivity.AboutLogoClickListener.Companion Companion = null;
        private static final int SECRET_CLICK_LIMIT = 7;
        
        public AboutLogoClickListener() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        private final boolean isSecretClickLimitMet() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/settings/AboutActivity$AboutLogoClickListener$Companion;", "", "()V", "SECRET_CLICK_LIMIT", "", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}
package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u001c\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u001c\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/views/ViewAnimations;", "", "()V", "MEDIUM_ANIMATION_DURATION", "", "SHORT_ANIMATION_DURATION", "crossFade", "", "curView", "Landroid/view/View;", "newView", "runOnComplete", "Ljava/lang/Runnable;", "ensureTranslationY", "view", "translation", "", "fadeIn", "fadeOut", "CancelStateAnimatorListenerAdapter", "app_alphaDebug"})
public final class ViewAnimations {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.ViewAnimations INSTANCE = null;
    private static final long SHORT_ANIMATION_DURATION = 0L;
    private static final long MEDIUM_ANIMATION_DURATION = 0L;
    
    private ViewAnimations() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void crossFade(@org.jetbrains.annotations.NotNull()
    android.view.View curView, @org.jetbrains.annotations.NotNull()
    android.view.View newView) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void crossFade(@org.jetbrains.annotations.NotNull()
    android.view.View curView, @org.jetbrains.annotations.NotNull()
    android.view.View newView, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable runOnComplete) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void fadeIn(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void fadeIn(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable runOnComplete) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void fadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void fadeOut(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.Runnable runOnComplete) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void ensureTranslationY(@org.jetbrains.annotations.NotNull()
    android.view.View view, int translation) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/views/ViewAnimations$CancelStateAnimatorListenerAdapter;", "Landroid/animation/AnimatorListenerAdapter;", "()V", "canceled", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "app_alphaDebug"})
    static class CancelStateAnimatorListenerAdapter extends android.animation.AnimatorListenerAdapter {
        private boolean canceled = false;
        
        public CancelStateAnimatorListenerAdapter() {
            super();
        }
        
        @java.lang.Override()
        public void onAnimationCancel(@org.jetbrains.annotations.NotNull()
        android.animation.Animator animation) {
        }
        
        protected final boolean canceled() {
            return false;
        }
    }
}
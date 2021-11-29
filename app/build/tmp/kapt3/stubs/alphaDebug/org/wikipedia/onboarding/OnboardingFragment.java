package org.wikipedia.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0002)*B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0004J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH$J\b\u0010\u001d\u001a\u00020\u0004H\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J\b\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "enableSkip", "", "(Z)V", "_binding", "Lorg/wikipedia/databinding/FragmentOnboardingPagerBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentOnboardingPagerBinding;", "doneButtonText", "", "getDoneButtonText", "()I", "getEnableSkip", "()Z", "forwardClickListener", "Landroid/view/View$OnClickListener;", "pageChangeCallback", "Lorg/wikipedia/onboarding/OnboardingFragment$PageChangeCallback;", "advancePage", "", "atLastPage", "callback", "Lorg/wikipedia/onboarding/OnboardingFragment$Callback;", "finish", "getAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "updateButtonState", "updatePageIndicatorContentDescription", "Callback", "PageChangeCallback", "app_alphaDebug"})
public abstract class OnboardingFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler {
    private final boolean enableSkip = false;
    private org.wikipedia.databinding.FragmentOnboardingPagerBinding _binding;
    private final org.wikipedia.onboarding.OnboardingFragment.PageChangeCallback pageChangeCallback = null;
    private final android.view.View.OnClickListener forwardClickListener = null;
    
    public OnboardingFragment() {
        super();
    }
    
    public OnboardingFragment(boolean enableSkip) {
        super();
    }
    
    public final boolean getEnableSkip() {
        return false;
    }
    
    private final org.wikipedia.databinding.FragmentOnboardingPagerBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract androidx.viewpager2.adapter.FragmentStateAdapter getAdapter();
    
    @androidx.annotation.StringRes()
    protected abstract int getDoneButtonText();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    public final void advancePage() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final org.wikipedia.onboarding.OnboardingFragment.Callback callback() {
        return null;
    }
    
    private final void finish() {
    }
    
    private final boolean atLastPage() {
        return false;
    }
    
    private final void updatePageIndicatorContentDescription() {
    }
    
    private final void updateButtonState() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingFragment$Callback;", "", "onComplete", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onComplete();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/onboarding/OnboardingFragment$PageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/onboarding/OnboardingFragment;)V", "onPageSelected", "", "position", "", "app_alphaDebug"})
    final class PageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        
        public PageChangeCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
    }
}
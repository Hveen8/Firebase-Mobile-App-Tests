package org.wikipedia.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0004\u001b\u001c\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment;", "Lorg/wikipedia/onboarding/OnboardingFragment;", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "()V", "doneButtonText", "", "getDoneButtonText", "()I", "onboardingPageView", "Lorg/wikipedia/onboarding/OnboardingPageView;", "getAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onLinkClick", "view", "url", "", "onListActionButtonClicked", "onResume", "onSwitchChange", "checked", "", "Companion", "ItemFragment", "OnboardingPage", "OnboardingPagerAdapter", "app_alphaDebug"})
public final class InitialOnboardingFragment extends org.wikipedia.onboarding.OnboardingFragment implements org.wikipedia.onboarding.OnboardingPageView.Callback {
    private org.wikipedia.onboarding.OnboardingPageView onboardingPageView;
    private final int doneButtonText = org.wikipedia.R.string.onboarding_get_started;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.onboarding.InitialOnboardingFragment.Companion Companion = null;
    
    public InitialOnboardingFragment() {
        super(false);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected androidx.viewpager2.adapter.FragmentStateAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected int getDoneButtonText() {
        return 0;
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onSwitchChange(@org.jetbrains.annotations.NotNull()
    org.wikipedia.onboarding.OnboardingPageView view, boolean checked) {
    }
    
    @java.lang.Override()
    public void onLinkClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.onboarding.OnboardingPageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onListActionButtonClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.onboarding.OnboardingPageView view) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "createFragment", "position", "", "getItemCount", "app_alphaDebug"})
    static final class OnboardingPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        public OnboardingPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$ItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callback", "Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "getCallback", "()Lorg/wikipedia/onboarding/OnboardingPageView$Callback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_alphaDebug"})
    public static final class ItemFragment extends androidx.fragment.app.Fragment {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.onboarding.InitialOnboardingFragment.ItemFragment.Companion Companion = null;
        
        public ItemFragment() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
        android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
            return null;
        }
        
        private final org.wikipedia.onboarding.OnboardingPageView.Callback getCallback() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$ItemFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/onboarding/InitialOnboardingFragment$ItemFragment;", "position", "", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.onboarding.InitialOnboardingFragment.ItemFragment newInstance(int position) {
                return null;
            }
        }
    }
    
    @kotlin.Suppress(names = {"unused"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\rB\u0011\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPage;", "", "Lorg/wikipedia/model/EnumCode;", "layout", "", "(Ljava/lang/String;II)V", "getLayout", "()I", "code", "PAGE_WELCOME", "PAGE_EXPLORE", "PAGE_READING_LISTS", "PAGE_USAGE_DATA", "Companion", "app_alphaDebug"})
    public static enum OnboardingPage implements org.wikipedia.model.EnumCode {
        /*public static final*/ PAGE_WELCOME /* = new PAGE_WELCOME(0) */,
        /*public static final*/ PAGE_EXPLORE /* = new PAGE_EXPLORE(0) */,
        /*public static final*/ PAGE_READING_LISTS /* = new PAGE_READING_LISTS(0) */,
        /*public static final*/ PAGE_USAGE_DATA /* = new PAGE_USAGE_DATA(0) */;
        private final int layout = 0;
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.onboarding.InitialOnboardingFragment.OnboardingPage.Companion Companion = null;
        private static final org.wikipedia.model.EnumCodeMap<org.wikipedia.onboarding.InitialOnboardingFragment.OnboardingPage> MAP = null;
        
        OnboardingPage(@androidx.annotation.LayoutRes()
        int layout) {
        }
        
        public final int getLayout() {
            return 0;
        }
        
        @java.lang.Override()
        public int code() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPage$Companion;", "", "()V", "MAP", "Lorg/wikipedia/model/EnumCodeMap;", "Lorg/wikipedia/onboarding/InitialOnboardingFragment$OnboardingPage;", "of", "code", "", "size", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.onboarding.InitialOnboardingFragment.OnboardingPage of(int code) {
                return null;
            }
            
            public final int size() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/onboarding/InitialOnboardingFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/onboarding/InitialOnboardingFragment;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.onboarding.InitialOnboardingFragment newInstance() {
            return null;
        }
    }
}
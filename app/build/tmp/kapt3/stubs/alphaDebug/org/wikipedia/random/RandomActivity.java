package org.wikipedia.random;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/random/RandomActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/random/RandomFragment;", "()V", "createFragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_alphaDebug"})
public final class RandomActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.random.RandomFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.random.RandomActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_WIKISITE = "wikiSite";
    
    public RandomActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.Nullable()
    org.wikipedia.Constants.InvokeSource invokeSource) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.random.RandomFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/random/RandomActivity$Companion;", "", "()V", "INTENT_EXTRA_WIKISITE", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.Nullable()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}
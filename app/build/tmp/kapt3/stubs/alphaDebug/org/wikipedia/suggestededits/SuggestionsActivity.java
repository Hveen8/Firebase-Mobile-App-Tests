package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestionsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "()V", "createFragment", "getActionBarTitle", "", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_alphaDebug"})
public final class SuggestionsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.suggestededits.SuggestedEditsCardsFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestionsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE_ADDED_CONTRIBUTION = "addedContribution";
    
    public SuggestionsActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.wikipedia.suggestededits.SuggestedEditsCardsFragment createFragment() {
        return null;
    }
    
    private final java.lang.String getActionBarTitle(org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestionsActivity$Companion;", "", "()V", "EXTRA_SOURCE_ADDED_CONTRIBUTION", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source) {
            return null;
        }
    }
}
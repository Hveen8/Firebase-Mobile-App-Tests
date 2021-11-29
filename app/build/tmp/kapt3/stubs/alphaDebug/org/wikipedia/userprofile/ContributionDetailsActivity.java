package org.wikipedia.userprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/userprofile/ContributionDetailsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/userprofile/ContributionDetailsFragment;", "()V", "createFragment", "updateStatusBarColor", "", "color", "", "Companion", "app_alphaDebug"})
public final class ContributionDetailsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.userprofile.ContributionDetailsFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.userprofile.ContributionDetailsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE_CONTRIBUTION = "contribution";
    
    public ContributionDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.wikipedia.userprofile.ContributionDetailsFragment createFragment() {
        return null;
    }
    
    public final void updateStatusBarColor(int color) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/userprofile/ContributionDetailsActivity$Companion;", "", "()V", "EXTRA_SOURCE_CONTRIBUTION", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "contribution", "Lorg/wikipedia/userprofile/Contribution;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.userprofile.Contribution contribution) {
            return null;
        }
    }
}
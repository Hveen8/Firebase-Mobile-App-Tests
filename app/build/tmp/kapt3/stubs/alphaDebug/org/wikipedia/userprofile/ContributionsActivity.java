package org.wikipedia.userprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/userprofile/ContributionsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/userprofile/ContributionsFragment;", "()V", "createFragment", "Companion", "app_alphaDebug"})
public final class ContributionsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.userprofile.ContributionsFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.userprofile.ContributionsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE_CONTRIBUTIONS = "contributions";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE_PAGEVIEWS = "pageViews";
    
    public ContributionsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.userprofile.ContributionsFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/userprofile/ContributionsActivity$Companion;", "", "()V", "EXTRA_SOURCE_CONTRIBUTIONS", "", "EXTRA_SOURCE_PAGEVIEWS", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "contributions", "", "pageViews", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int contributions, long pageViews) {
            return null;
        }
    }
}
package org.wikipedia.feed.onthisday;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/feed/onthisday/OnThisDayFragment;", "()V", "createFragment", "Companion", "app_alphaDebug"})
public final class OnThisDayActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.feed.onthisday.OnThisDayFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.onthisday.OnThisDayActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_AGE = "age";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_YEAR = "year";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_WIKISITE = "wikiSite";
    
    public OnThisDayActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.wikipedia.feed.onthisday.OnThisDayFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/feed/onthisday/OnThisDayActivity$Companion;", "", "()V", "EXTRA_AGE", "", "EXTRA_WIKISITE", "EXTRA_YEAR", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "age", "", "year", "wikiSite", "Lorg/wikipedia/dataclient/WikiSite;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int age, int year, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wikiSite, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}
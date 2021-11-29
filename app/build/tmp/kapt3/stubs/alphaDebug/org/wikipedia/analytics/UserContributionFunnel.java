package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/analytics/UserContributionFunnel;", "Lorg/wikipedia/analytics/Funnel;", "()V", "logDisabled", "", "logFilterAll", "logFilterCaptions", "logFilterDescriptions", "logFilterTags", "logIpBlock", "logNavigateCaption", "logNavigateDescription", "logNavigateMisc", "logNavigateTag", "logOpen", "logPaused", "logViewCaption", "logViewDescription", "logViewMisc", "logViewTag", "Companion", "app_alphaDebug"})
public final class UserContributionFunnel extends org.wikipedia.analytics.Funnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.UserContributionFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppUserContribution";
    private static final int REV_ID = 20217330;
    private static org.wikipedia.analytics.UserContributionFunnel INSTANCE;
    
    private UserContributionFunnel() {
        super(null, null, 0, null);
    }
    
    public final void logOpen() {
    }
    
    public final void logFilterDescriptions() {
    }
    
    public final void logFilterCaptions() {
    }
    
    public final void logFilterTags() {
    }
    
    public final void logFilterAll() {
    }
    
    public final void logViewDescription() {
    }
    
    public final void logViewCaption() {
    }
    
    public final void logViewTag() {
    }
    
    public final void logViewMisc() {
    }
    
    public final void logNavigateDescription() {
    }
    
    public final void logNavigateCaption() {
    }
    
    public final void logNavigateTag() {
    }
    
    public final void logNavigateMisc() {
    }
    
    public final void logPaused() {
    }
    
    public final void logDisabled() {
    }
    
    public final void logIpBlock() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/analytics/UserContributionFunnel$Companion;", "", "()V", "INSTANCE", "Lorg/wikipedia/analytics/UserContributionFunnel;", "REV_ID", "", "SCHEMA_NAME", "", "get", "reset", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.UserContributionFunnel get() {
            return null;
        }
        
        public final void reset() {
        }
    }
}
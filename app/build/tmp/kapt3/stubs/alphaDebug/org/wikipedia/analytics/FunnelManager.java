package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/analytics/FunnelManager;", "", "app", "Lorg/wikipedia/WikipediaApp;", "(Lorg/wikipedia/WikipediaApp;)V", "editFunnels", "Ljava/util/Hashtable;", "Lorg/wikipedia/page/PageTitle;", "Lorg/wikipedia/analytics/EditFunnel;", "getEditFunnel", "title", "app_alphaDebug"})
public final class FunnelManager {
    private final org.wikipedia.WikipediaApp app = null;
    private final java.util.Hashtable<org.wikipedia.page.PageTitle, org.wikipedia.analytics.EditFunnel> editFunnels = null;
    
    public FunnelManager(@org.jetbrains.annotations.NotNull()
    org.wikipedia.WikipediaApp app) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.EditFunnel getEditFunnel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        return null;
    }
}
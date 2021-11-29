package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/PageAvailableOfflineHandler;", "", "()V", "check", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "callback", "Lorg/wikipedia/page/PageAvailableOfflineHandler$Callback;", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "Callback", "app_alphaDebug"})
public final class PageAvailableOfflineHandler {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.PageAvailableOfflineHandler INSTANCE = null;
    
    private PageAvailableOfflineHandler() {
        super();
    }
    
    public final void check(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageAvailableOfflineHandler.Callback callback) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void check(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageAvailableOfflineHandler.Callback callback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/PageAvailableOfflineHandler$Callback;", "", "onFinish", "", "available", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onFinish(boolean available);
    }
}
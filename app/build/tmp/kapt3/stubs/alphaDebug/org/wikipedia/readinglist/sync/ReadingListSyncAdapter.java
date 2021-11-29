package org.wikipedia.readinglist.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListSyncAdapter;", "Landroidx/core/app/JobIntentService;", "()V", "createOrUpdatePage", "", "listForPage", "Lorg/wikipedia/readinglist/database/ReadingList;", "remotePage", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "deletePageByTitle", "title", "Lorg/wikipedia/page/PageTitle;", "getCsrfToken", "", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "tokenList", "", "getLastDateFromHeader", "lastSyncTime", "client", "Lorg/wikipedia/readinglist/sync/ReadingListClient;", "onHandleWork", "intent", "Landroid/content/Intent;", "pageTitleFromRemoteEntry", "remoteEntry", "remoteEntryFromLocalPage", "localPage", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "Companion", "app_alphaDebug"})
public final class ReadingListSyncAdapter extends androidx.core.app.JobIntentService {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.sync.ReadingListSyncAdapter.Companion Companion = null;
    private static final int JOB_ID = 1001;
    private static final java.lang.String SYNC_EXTRAS_FORCE_FULL_SYNC = "forceFullSync";
    private static final java.lang.String SYNC_EXTRAS_REFRESHING = "refreshing";
    private static final java.lang.String SYNC_EXTRAS_RETRYING = "retrying";
    private static boolean IN_PROGRESS = false;
    
    public ReadingListSyncAdapter() {
        super();
    }
    
    @java.lang.Override()
    protected void onHandleWork(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Throwable.class})
    private final java.lang.String getCsrfToken(org.wikipedia.dataclient.WikiSite wiki, java.util.List<java.lang.String> tokenList) {
        return null;
    }
    
    private final java.lang.String getLastDateFromHeader(java.lang.String lastSyncTime, org.wikipedia.readinglist.sync.ReadingListClient client) {
        return null;
    }
    
    private final void createOrUpdatePage(org.wikipedia.readinglist.database.ReadingList listForPage, org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry remotePage) {
    }
    
    private final void deletePageByTitle(org.wikipedia.readinglist.database.ReadingList listForPage, org.wikipedia.page.PageTitle title) {
    }
    
    private final org.wikipedia.page.PageTitle pageTitleFromRemoteEntry(org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry remoteEntry) {
        return null;
    }
    
    private final org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry remoteEntryFromLocalPage(org.wikipedia.readinglist.database.ReadingListPage localPage) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void manualSyncWithDeleteList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void manualSyncWithDeletePages(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void manualSyncWithForce() {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void manualSync() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0007J\b\u0010\u0019\u001a\u00020\u000fH\u0007J\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lorg/wikipedia/readinglist/sync/ReadingListSyncAdapter$Companion;", "", "()V", "IN_PROGRESS", "", "JOB_ID", "", "SYNC_EXTRAS_FORCE_FULL_SYNC", "", "SYNC_EXTRAS_REFRESHING", "SYNC_EXTRAS_RETRYING", "isDisabledByRemoteConfig", "()Z", "inProgress", "manualSync", "", "extras", "Landroid/os/Bundle;", "manualSyncWithDeleteList", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "manualSyncWithDeletePages", "pages", "", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "manualSyncWithForce", "manualSyncWithRefresh", "setSyncEnabledWithSetup", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean inProgress() {
            return false;
        }
        
        public final void setSyncEnabledWithSetup() {
        }
        
        public final boolean isDisabledByRemoteConfig() {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        public final void manualSyncWithDeleteList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void manualSyncWithDeletePages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void manualSyncWithForce() {
        }
        
        public final void manualSyncWithRefresh() {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void manualSync() {
        }
        
        private final void manualSync(android.os.Bundle extras) {
        }
    }
}
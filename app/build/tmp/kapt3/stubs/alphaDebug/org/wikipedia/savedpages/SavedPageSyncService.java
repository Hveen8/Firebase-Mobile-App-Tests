package org.wikipedia.savedpages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0 0\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160*H\u0002J \u0010+\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010,\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f00H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lorg/wikipedia/savedpages/SavedPageSyncService;", "Landroidx/core/app/JobIntentService;", "()V", "app", "Lorg/wikipedia/WikipediaApp;", "getApp", "()Lorg/wikipedia/WikipediaApp;", "savedPageSyncNotification", "Lorg/wikipedia/savedpages/SavedPageSyncNotification;", "deletePageContents", "", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "isRetryable", "", "t", "", "makeUrlRequest", "Lokhttp3/Request$Builder;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "url", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "onHandleWork", "intent", "Landroid/content/Intent;", "persistPageThumbnail", "title", "reqMediaList", "Lio/reactivex/rxjava3/core/Observable;", "Lretrofit2/Response;", "Lorg/wikipedia/gallery/MediaList;", "revision", "", "reqMobileHTML", "Lokhttp3/Response;", "reqPageSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "reqSaveFiles", "urls", "", "reqSaveUrl", "savePageFor", "savePages", "", "queue", "", "Companion", "app_alphaDebug"})
public final class SavedPageSyncService extends androidx.core.app.JobIntentService {
    private final org.wikipedia.savedpages.SavedPageSyncNotification savedPageSyncNotification = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.WikipediaApp app = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.savedpages.SavedPageSyncService.Companion Companion = null;
    private static final int JOB_ID = 1000;
    private static final int ENQUEUE_DELAY_MILLIS = 2000;
    public static final int SUMMARY_PROGRESS = 10;
    public static final int MOBILE_HTML_SECTION_PROGRESS = 20;
    public static final int MEDIA_LIST_PROGRESS = 30;
    private static final java.lang.Runnable ENQUEUE_RUNNABLE = null;
    
    public SavedPageSyncService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.WikipediaApp getApp() {
        return null;
    }
    
    @java.lang.Override()
    protected void onHandleWork(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void deletePageContents(org.wikipedia.readinglist.database.ReadingListPage page) {
    }
    
    private final int savePages(java.util.List<org.wikipedia.readinglist.database.ReadingListPage> queue) {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final long savePageFor(org.wikipedia.readinglist.database.ReadingListPage page) throws java.lang.Exception {
        return 0L;
    }
    
    private final io.reactivex.rxjava3.core.Observable<retrofit2.Response<org.wikipedia.dataclient.page.PageSummary>> reqPageSummary(org.wikipedia.page.PageTitle pageTitle) {
        return null;
    }
    
    private final io.reactivex.rxjava3.core.Observable<retrofit2.Response<org.wikipedia.gallery.MediaList>> reqMediaList(org.wikipedia.page.PageTitle pageTitle, long revision) {
        return null;
    }
    
    private final io.reactivex.rxjava3.core.Observable<okhttp3.Response> reqMobileHTML(org.wikipedia.page.PageTitle pageTitle) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, java.lang.InterruptedException.class})
    private final void reqSaveFiles(org.wikipedia.readinglist.database.ReadingListPage page, org.wikipedia.page.PageTitle pageTitle, java.util.Set<java.lang.String> urls) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final void reqSaveUrl(org.wikipedia.page.PageTitle pageTitle, org.wikipedia.dataclient.WikiSite wiki, java.lang.String url) throws java.io.IOException {
    }
    
    private final okhttp3.Request.Builder makeUrlRequest(org.wikipedia.dataclient.WikiSite wiki, java.lang.String url, org.wikipedia.page.PageTitle pageTitle) {
        return null;
    }
    
    private final void persistPageThumbnail(org.wikipedia.page.PageTitle title, java.lang.String url) {
    }
    
    private final boolean isRetryable(java.lang.Throwable t) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void enqueue() {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void sendSyncEvent() {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void sendSyncEvent(boolean showMessage) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/savedpages/SavedPageSyncService$Companion;", "", "()V", "ENQUEUE_DELAY_MILLIS", "", "ENQUEUE_RUNNABLE", "Ljava/lang/Runnable;", "JOB_ID", "MEDIA_LIST_PROGRESS", "MOBILE_HTML_SECTION_PROGRESS", "SUMMARY_PROGRESS", "enqueue", "", "sendSyncEvent", "showMessage", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void enqueue() {
        }
        
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final void sendSyncEvent() {
        }
        
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final void sendSyncEvent(boolean showMessage) {
        }
    }
}
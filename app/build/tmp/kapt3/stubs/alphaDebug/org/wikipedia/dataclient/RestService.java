package org.wikipedia.dataclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 Q2\u00020\u0001:\u0001QJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\'J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\'J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\'J.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u001f\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\'J$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\'J2\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0013H\'J(\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0\u00032\b\b\u0001\u0010)\u001a\u00020\u00132\b\b\u0001\u0010*\u001a\u00020\u0013H\'J\u001e\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0\u00032\b\b\u0001\u0010,\u001a\u00020\u0013H\'J*\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\'0.0\u00032\b\b\u0001\u00100\u001a\u00020\u0013H\'J(\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0\u00032\b\b\u0001\u0010)\u001a\u00020\u00132\b\b\u0001\u0010*\u001a\u00020\u0013H\'J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\'0\u00032\b\b\u0001\u0010,\u001a\u00020\u0013H\'J\"\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u00100\u001a\u00020\u00132\b\b\u0001\u00105\u001a\u00020\u0011H\'JZ\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204070\u00032\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u00105\u001a\u00020\u00112\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0013H\'J\"\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010$\u001a\u00020>2\b\b\u0001\u0010%\u001a\u00020>H\'J&\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u000e2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u0013H\'J$\u0010C\u001a\b\u0012\u0004\u0012\u00020@0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u0013H\'J\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020@0\u000e2\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u0013H\'J2\u0010E\u001a\b\u0012\u0004\u0012\u00020@0\u000e2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u0013H\'J\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00032\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0013H\'J$\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u00100\u001a\u00020\u0013H\'JZ\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b070\u00032\b\b\u0001\u00100\u001a\u00020\u00132\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u00109\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0013H\'J\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0013H\'J\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\'J\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\'J0\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u00a8\u0006R"}, d2 = {"Lorg/wikipedia/dataclient/RestService;", "", "announcements", "Lio/reactivex/rxjava3/core/Observable;", "Lorg/wikipedia/feed/announcement/AnnouncementList;", "getAnnouncements", "()Lio/reactivex/rxjava3/core/Observable;", "feedAvailability", "Lorg/wikipedia/feed/configure/FeedAvailability;", "getFeedAvailability", "randomSummary", "Lorg/wikipedia/dataclient/page/PageSummary;", "getRandomSummary", "addEntriesToReadingList", "Lretrofit2/Call;", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponseBatch;", "listId", "", "token", "", "batch", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntryBatch;", "addEntryToReadingList", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteIdResponse;", "entry", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingListEntry;", "createReadingList", "list", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists$RemoteReadingList;", "deleteEntryFromReadingList", "", "entryId", "deleteReadingList", "getAggregatedFeed", "Lorg/wikipedia/feed/aggregated/AggregatedFeedContent;", "year", "month", "day", "getArticlesWithTranslatableDescriptions", "", "Lorg/wikipedia/suggestededits/provider/SuggestedEditItem;", "fromLang", "toLang", "getArticlesWithoutDescriptions", "lang", "getDefinition", "", "Lorg/wikipedia/dataclient/restbase/RbDefinition$Usage;", "title", "getImagesWithTranslatableCaptions", "getImagesWithoutCaptions", "getMediaList", "Lorg/wikipedia/gallery/MediaList;", "revision", "getMediaListResponse", "Lretrofit2/Response;", "cacheControl", "saveHeader", "langHeader", "titleHeader", "getOnThisDay", "Lorg/wikipedia/feed/onthisday/OnThisDay;", "", "getReadingListChangesSince", "Lorg/wikipedia/readinglist/sync/SyncedReadingLists;", "iso8601Date", "next", "getReadingListEntries", "getReadingLists", "getReadingListsContaining", "project", "getRelatedPages", "Lorg/wikipedia/dataclient/restbase/RbRelatedPages;", "getSummary", "referrerUrl", "getSummaryResponse", "getTalkPage", "Lorg/wikipedia/dataclient/page/TalkPage;", "setupReadingLists", "tearDownReadingLists", "updateReadingList", "Companion", "app_alphaDebug"})
public abstract interface RestService {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.RestService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REST_API_PREFIX = "/api/rest_v1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_PREFIX = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_SUMMARY = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\"";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_DEFINITION = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/definition/0.7.2\"";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACCEPT_HEADER_MOBILE_HTML = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Mobile-HTML/1.2.1\"";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_HTML_ENDPOINT = "page/mobile-html/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAGE_HTML_PREVIEW_ENDPOINT = "transform/wikitext/to/mobile-html/";
    
    /**
     * Gets a page summary for a given title -- for link previews
     *
     * @param title the page title to be used including prefix
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "page/summary/{title}")
    @retrofit2.http.Headers(value = {"x-analytics: preview=1", "Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\""})
    public abstract io.reactivex.rxjava3.core.Observable<retrofit2.Response<org.wikipedia.dataclient.page.PageSummary>> getSummaryResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Referer")
    java.lang.String referrerUrl, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Cache-Control")
    java.lang.String cacheControl, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "X-Offline-Save")
    java.lang.String saveHeader, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "X-Offline-Lang")
    java.lang.String langHeader, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "X-Offline-Title")
    java.lang.String titleHeader);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "page/summary/{title}")
    @retrofit2.http.Headers(value = {"x-analytics: preview=1", "Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\""})
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.page.PageSummary> getSummary(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Referer")
    java.lang.String referrerUrl, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "title")
    java.lang.String title);
    
    /**
     * Gets selected Wiktionary content for a given title derived from user-selected text
     *
     * @param title the Wiktionary page title derived from user-selected Wikipedia article text
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "page/definition/{title}")
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/definition/0.7.2\""})
    public abstract io.reactivex.rxjava3.core.Observable<java.util.Map<java.lang.String, java.util.List<org.wikipedia.dataclient.restbase.RbDefinition.Usage>>> getDefinition(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "title")
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\""})
    @retrofit2.http.GET(value = "page/random/summary")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.page.PageSummary> getRandomSummary();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "page/related/{title}")
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\""})
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.restbase.RbRelatedPages> getRelatedPages(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "title")
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "page/media-list/{title}/{revision}")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.gallery.MediaList> getMediaList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "title")
    java.lang.String title, @retrofit2.http.Path(value = "revision")
    long revision);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "page/media-list/{title}/{revision}")
    public abstract io.reactivex.rxjava3.core.Observable<retrofit2.Response<org.wikipedia.gallery.MediaList>> getMediaListResponse(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "title")
    java.lang.String title, @retrofit2.http.Path(value = "revision")
    long revision, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Cache-Control")
    java.lang.String cacheControl, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "X-Offline-Save")
    java.lang.String saveHeader, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "X-Offline-Lang")
    java.lang.String langHeader, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "X-Offline-Title")
    java.lang.String titleHeader);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "feed/onthisday/events/{mm}/{dd}")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.feed.onthisday.OnThisDay> getOnThisDay(@retrofit2.http.Path(value = "mm")
    int month, @retrofit2.http.Path(value = "dd")
    int day);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/announcements/0.1.0\""})
    @retrofit2.http.GET(value = "feed/announcements")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.feed.announcement.AnnouncementList> getAnnouncements();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "feed/featured/{year}/{month}/{day}")
    @retrofit2.http.Headers(value = {"Accept: application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/aggregated-feed/0.5.0\""})
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.feed.aggregated.AggregatedFeedContent> getAggregatedFeed(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "year")
    java.lang.String year, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "month")
    java.lang.String month, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "day")
    java.lang.String day);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "feed/availability")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.feed.configure.FeedAvailability> getFeedAvailability();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "data/lists/setup")
    public abstract retrofit2.Call<kotlin.Unit> setupReadingLists(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "data/lists/teardown")
    public abstract retrofit2.Call<kotlin.Unit> tearDownReadingLists(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/lists/")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingLists(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "next")
    java.lang.String next);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "data/lists/")
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponse> createReadingList(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList list);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "data/lists/{id}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract retrofit2.Call<kotlin.Unit> updateReadingList(@retrofit2.http.Path(value = "id")
    long listId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingList list);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "data/lists/{id}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract retrofit2.Call<kotlin.Unit> deleteReadingList(@retrofit2.http.Path(value = "id")
    long listId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/lists/changes/since/{date}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingListChangesSince(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "date")
    java.lang.String iso8601Date, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "next")
    java.lang.String next);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/lists/pages/{project}/{title}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingListsContaining(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "project")
    java.lang.String project, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "next")
    java.lang.String next);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/lists/{id}/entries/")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists> getReadingListEntries(@retrofit2.http.Path(value = "id")
    long listId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "next")
    java.lang.String next);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "data/lists/{id}/entries/")
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponse> addEntryToReadingList(@retrofit2.http.Path(value = "id")
    long listId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntry entry);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "data/lists/{id}/entries/batch")
    public abstract retrofit2.Call<org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteIdResponseBatch> addEntriesToReadingList(@retrofit2.http.Path(value = "id")
    long listId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    org.wikipedia.readinglist.sync.SyncedReadingLists.RemoteReadingListEntryBatch batch);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "data/lists/{id}/entries/{entry_id}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract retrofit2.Call<kotlin.Unit> deleteEntryFromReadingList(@retrofit2.http.Path(value = "id")
    long listId, @retrofit2.http.Path(value = "entry_id")
    long entryId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "csrf_token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/recommendation/caption/addition/{lang}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<org.wikipedia.suggestededits.provider.SuggestedEditItem>> getImagesWithoutCaptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lang")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/recommendation/caption/translation/from/{fromLang}/to/{toLang}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<org.wikipedia.suggestededits.provider.SuggestedEditItem>> getImagesWithTranslatableCaptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "fromLang")
    java.lang.String fromLang, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "toLang")
    java.lang.String toLang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/recommendation/description/addition/{lang}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<org.wikipedia.suggestededits.provider.SuggestedEditItem>> getArticlesWithoutDescriptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lang")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "data/recommendation/description/translation/from/{fromLang}/to/{toLang}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract io.reactivex.rxjava3.core.Observable<java.util.List<org.wikipedia.suggestededits.provider.SuggestedEditItem>> getArticlesWithTranslatableDescriptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "fromLang")
    java.lang.String fromLang, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "toLang")
    java.lang.String toLang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "page/talk/{title}")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.page.TalkPage> getTalkPage(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "title")
    java.lang.String title);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/dataclient/RestService$Companion;", "", "()V", "ACCEPT_HEADER_DEFINITION", "", "ACCEPT_HEADER_MOBILE_HTML", "ACCEPT_HEADER_PREFIX", "ACCEPT_HEADER_SUMMARY", "PAGE_HTML_ENDPOINT", "PAGE_HTML_PREVIEW_ENDPOINT", "REST_API_PREFIX", "app_alphaDebug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REST_API_PREFIX = "/api/rest_v1";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_PREFIX = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_SUMMARY = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Summary/1.2.0\"";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_DEFINITION = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/definition/0.7.2\"";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPT_HEADER_MOBILE_HTML = "application/json; charset=utf-8; profile=\"https://www.mediawiki.org/wiki/Specs/Mobile-HTML/1.2.1\"";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGE_HTML_ENDPOINT = "page/mobile-html/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PAGE_HTML_PREVIEW_ENDPOINT = "transform/wikitext/to/mobile-html/";
        
        private Companion() {
            super();
        }
    }
}
package org.wikipedia.readinglist.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\bg\u0018\u00002\u00020\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J&\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u001e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003J&\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0017J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\'J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u001bH\'J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u001fH\'J:\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001fH\'JB\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001fH\'J\u001a\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u00104\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001fH\'J>\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001fH\'J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\'J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u0014H\'J\n\u0010:\u001a\u0004\u0018\u00010\u0004H\'J\u0018\u0010;\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010<\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0004H\'J\b\u0010=\u001a\u00020\u000eH\'J \u0010>\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0016J(\u0010@\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0017J&\u0010A\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u00109\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0014H\u0017J \u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J,\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0017J\u0018\u0010F\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010G\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010H\u001a\u00020\u000eH\u0016J\b\u0010I\u001a\u00020\u000eH\u0016J$\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u00042\b\u0010L\u001a\u0004\u0018\u00010\u001b2\b\u0010M\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010N\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017J\u0010\u0010O\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004H\'J \u0010P\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u0014H\'J4\u0010S\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\b\u0010M\u001a\u0004\u0018\u00010\u001b2\b\u0010L\u001a\u0004\u0018\u00010\u001bH\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u00a8\u0006T"}, d2 = {"Lorg/wikipedia/readinglist/db/ReadingListPageDao;", "", "allPagesToBeDeleted", "", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "getAllPagesToBeDeleted", "()Ljava/util/List;", "allPagesToBeForcedSave", "getAllPagesToBeForcedSave", "allPagesToBeSaved", "getAllPagesToBeSaved", "allPagesToBeUnsaved", "getAllPagesToBeUnsaved", "addPageToList", "", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "title", "Lorg/wikipedia/page/PageTitle;", "queueForSync", "", "addPageToLists", "lists", "page", "addPagesToList", "pages", "addPagesToListIfNotExist", "", "titles", "deletePagesByStatus", "status", "", "findPageBySearchTerm", "term", "findPageForSearchQueryInAnyList", "Lorg/wikipedia/search/SearchResults;", "searchQuery", "findPageInAnyList", "getAllPageOccurrences", "getAllPages", "getAllPagesToBeSynced", "getPageById", "id", "getPageByParams", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "lang", "ns", "Lorg/wikipedia/page/Namespace;", "displayTitle", "apiTitle", "excludedStatus", "listId", "getPageByTitle", "getPagesByListId", "getPagesByParams", "getPagesByStatus", "offline", "getRandomPage", "insertPageIntoDb", "insertReadingListPage", "markAllPagesUnsynced", "markPageForOffline", "forcedSave", "markPagesForDeletion", "markPagesForOffline", "movePageToList", "sourceList", "destList", "movePagesToListAndDeleteSourcePages", "pageExistsInList", "populateListPages", "purgeDeletedPages", "resetUnsavedPageStatus", "updateMetadataByTitle", "pageProto", "description", "thumbUrl", "updatePages", "updateReadingListPage", "updateStatus", "oldStatus", "newStatus", "updateThumbAndDescriptionByName", "app_alphaDebug"})
public abstract interface ReadingListPageDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void updateReadingListPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPages();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE id = :id")
    public abstract org.wikipedia.readinglist.database.ReadingListPage getPageById(long id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE status = :status AND offline = :offline")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByStatus(long status, boolean offline);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE status = :status")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByStatus(long status);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE wiki = :wiki AND lang = :lang AND namespace = :ns AND displayTitle = :displayTitle AND apiTitle = :apiTitle AND listId = :listId AND status != :excludedStatus")
    public abstract org.wikipedia.readinglist.database.ReadingListPage getPageByParams(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace ns, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, long listId, long excludedStatus);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE wiki = :wiki AND lang = :lang AND namespace = :ns AND displayTitle = :displayTitle AND apiTitle = :apiTitle AND status != :excludedStatus")
    public abstract org.wikipedia.readinglist.database.ReadingListPage getPageByParams(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace ns, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, long excludedStatus);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE wiki = :wiki AND lang = :lang AND namespace = :ns AND displayTitle = :displayTitle AND apiTitle = :apiTitle AND status != :excludedStatus")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByParams(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Namespace ns, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, long excludedStatus);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE listId = :listId AND status != :excludedStatus")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getPagesByListId(long listId, long excludedStatus);
    
    @androidx.room.Query(value = "UPDATE ReadingListPage SET thumbUrl = :thumbUrl, description = :description WHERE lang = :lang AND displayTitle = :displayTitle AND apiTitle = :apiTitle")
    public abstract void updateThumbAndDescriptionByName(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String displayTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description);
    
    @androidx.room.Query(value = "UPDATE ReadingListPage SET status = :newStatus WHERE status = :oldStatus AND offline = :offline")
    public abstract void updateStatus(long oldStatus, long newStatus, boolean offline);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage ORDER BY RANDOM() LIMIT 1")
    public abstract org.wikipedia.readinglist.database.ReadingListPage getRandomPage();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE UPPER(displayTitle) LIKE UPPER(:term) ESCAPE \'\\\'")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> findPageBySearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term);
    
    @androidx.room.Query(value = "DELETE FROM ReadingListPage WHERE status = :status")
    public abstract void deletePagesByStatus(long status);
    
    @androidx.room.Query(value = "UPDATE ReadingListPage SET remoteId = -1")
    public abstract void markAllPagesUnsynced();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingListPage WHERE remoteId < 1")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeSynced();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeSaved();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeForcedSave();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeUnsaved();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeDeleted();
    
    public abstract void populateListPages(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    public abstract void addPagesToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Transaction()
    public abstract java.util.List<java.lang.String> addPagesToListIfNotExist(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> titles);
    
    @androidx.room.Transaction()
    public abstract void updatePages(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages);
    
    public abstract void updateMetadataByTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage pageProto, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbUrl);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.ReadingListPage findPageInAnyList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.search.SearchResults findPageForSearchQueryInAnyList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    public abstract boolean pageExistsInList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title);
    
    public abstract void resetUnsavedPageStatus();
    
    @androidx.room.Transaction()
    public abstract void markPagesForDeletion(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync);
    
    public abstract void markPageForOffline(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page, boolean offline, boolean forcedSave);
    
    @androidx.room.Transaction()
    public abstract void markPagesForOffline(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean offline, boolean forcedSave);
    
    public abstract void purgeDeletedPages();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Transaction()
    public abstract java.util.List<java.lang.String> movePagesToListAndDeleteSourcePages(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList sourceList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList destList, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> titles);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.ReadingListPage getPageByTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title);
    
    public abstract void addPageToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean queueForSync);
    
    @androidx.room.Transaction()
    public abstract void addPageToLists(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingListPage page, boolean queueForSync);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPageOccurrences(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeSaved(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeForcedSave(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeUnsaved(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPagesToBeDeleted(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
            return null;
        }
        
        public static void populateListPages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list) {
        }
        
        public static void addPagesToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync) {
        }
        
        @androidx.room.Transaction()
        private static void addPagesToList(org.wikipedia.readinglist.db.ReadingListPageDao $this, org.wikipedia.readinglist.database.ReadingList list, java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.Transaction()
        public static java.util.List<java.lang.String> addPagesToListIfNotExist(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> titles) {
            return null;
        }
        
        @androidx.room.Transaction()
        public static void updatePages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
        }
        
        public static void updateMetadataByTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage pageProto, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String thumbUrl) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public static org.wikipedia.readinglist.database.ReadingListPage findPageInAnyList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.wikipedia.search.SearchResults findPageForSearchQueryInAnyList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery) {
            return null;
        }
        
        public static boolean pageExistsInList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return false;
        }
        
        public static void resetUnsavedPageStatus(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
        }
        
        @androidx.room.Transaction()
        public static void markPagesForDeletion(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean queueForSync) {
        }
        
        public static void markPageForOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page, boolean offline, boolean forcedSave) {
        }
        
        @androidx.room.Transaction()
        public static void markPagesForOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages, boolean offline, boolean forcedSave) {
        }
        
        public static void purgeDeletedPages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.room.Transaction()
        public static java.util.List<java.lang.String> movePagesToListAndDeleteSourcePages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList sourceList, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList destList, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> titles) {
            return null;
        }
        
        private static void movePageToList(org.wikipedia.readinglist.db.ReadingListPageDao $this, org.wikipedia.readinglist.database.ReadingList sourceList, org.wikipedia.readinglist.database.ReadingList destList, org.wikipedia.page.PageTitle title) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public static org.wikipedia.readinglist.database.ReadingListPage getPageByTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        public static void addPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, boolean queueForSync) {
        }
        
        @androidx.room.Transaction()
        public static void addPageToLists(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page, boolean queueForSync) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getAllPageOccurrences(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListPageDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        private static void addPageToList(org.wikipedia.readinglist.db.ReadingListPageDao $this, org.wikipedia.readinglist.database.ReadingList list, org.wikipedia.page.PageTitle title) {
        }
        
        private static void insertPageIntoDb(org.wikipedia.readinglist.db.ReadingListPageDao $this, org.wikipedia.readinglist.database.ReadingList list, org.wikipedia.readinglist.database.ReadingListPage page) {
        }
    }
}
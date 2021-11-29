package org.wikipedia.suggestededits.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\'B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0004J:\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\n0\u00182\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u001c\u001a\u00020\u0004J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0004J2\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n0\u00182\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u0004J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u0004J.\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\n0\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/wikipedia/suggestededits/provider/EditingSuggestionsProvider;", "", "()V", "MAX_RETRY_LIMIT", "", "articlesWithMissingDescriptionCache", "Ljava/util/Stack;", "", "articlesWithMissingDescriptionCacheLang", "articlesWithTranslatableDescriptionCache", "Lkotlin/Pair;", "Lorg/wikipedia/page/PageTitle;", "articlesWithTranslatableDescriptionCacheFromLang", "articlesWithTranslatableDescriptionCacheToLang", "imagesWithMissingCaptionsCache", "imagesWithMissingCaptionsCacheLang", "imagesWithMissingTagsCache", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "imagesWithTranslatableCaptionCache", "imagesWithTranslatableCaptionCacheFromLang", "imagesWithTranslatableCaptionCacheToLang", "mutex", "Ljava/util/concurrent/Semaphore;", "getNextArticleWithMissingDescription", "Lio/reactivex/rxjava3/core/Observable;", "Lorg/wikipedia/dataclient/page/PageSummary;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "retryLimit", "sourceWiki", "targetLang", "sourceLangMustExist", "", "getNextImageWithMissingCaption", "lang", "sourceLang", "getNextImageWithMissingTags", "getSummary", "targetAndSourcePageTitles", "ListEmptyException", "app_alphaDebug"})
public final class EditingSuggestionsProvider {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.provider.EditingSuggestionsProvider INSTANCE = null;
    private static final java.util.concurrent.Semaphore mutex = null;
    private static final java.util.Stack<java.lang.String> articlesWithMissingDescriptionCache = null;
    private static java.lang.String articlesWithMissingDescriptionCacheLang = "";
    private static final java.util.Stack<kotlin.Pair<org.wikipedia.page.PageTitle, org.wikipedia.page.PageTitle>> articlesWithTranslatableDescriptionCache = null;
    private static java.lang.String articlesWithTranslatableDescriptionCacheFromLang = "";
    private static java.lang.String articlesWithTranslatableDescriptionCacheToLang = "";
    private static final java.util.Stack<java.lang.String> imagesWithMissingCaptionsCache = null;
    private static java.lang.String imagesWithMissingCaptionsCacheLang = "";
    private static final java.util.Stack<kotlin.Pair<java.lang.String, java.lang.String>> imagesWithTranslatableCaptionCache = null;
    private static java.lang.String imagesWithTranslatableCaptionCacheFromLang = "";
    private static java.lang.String imagesWithTranslatableCaptionCacheToLang = "";
    private static final java.util.Stack<org.wikipedia.dataclient.mwapi.MwQueryPage> imagesWithMissingTagsCache = null;
    private static final long MAX_RETRY_LIMIT = 50L;
    
    private EditingSuggestionsProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.page.PageSummary> getNextArticleWithMissingDescription(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, long retryLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<kotlin.Pair<org.wikipedia.dataclient.page.PageSummary, org.wikipedia.dataclient.page.PageSummary>> getNextArticleWithMissingDescription(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite sourceWiki, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLang, boolean sourceLangMustExist, long retryLimit) {
        return null;
    }
    
    private final io.reactivex.rxjava3.core.Observable<kotlin.Pair<org.wikipedia.dataclient.page.PageSummary, org.wikipedia.dataclient.page.PageSummary>> getSummary(kotlin.Pair<org.wikipedia.page.PageTitle, org.wikipedia.page.PageTitle> targetAndSourcePageTitles) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<java.lang.String> getNextImageWithMissingCaption(@org.jetbrains.annotations.NotNull()
    java.lang.String lang, long retryLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<kotlin.Pair<java.lang.String, java.lang.String>> getNextImageWithMissingCaption(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceLang, @org.jetbrains.annotations.NotNull()
    java.lang.String targetLang, long retryLimit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryPage> getNextImageWithMissingTags(long retryLimit) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/suggestededits/provider/EditingSuggestionsProvider$ListEmptyException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "app_alphaDebug"})
    public static final class ListEmptyException extends java.lang.RuntimeException {
        
        public ListEmptyException() {
            super();
        }
    }
}
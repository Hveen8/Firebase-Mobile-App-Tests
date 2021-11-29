package org.wikipedia.language;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u0007J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR0\u0010\u0010\u001a$\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/language/LanguagesListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "nonSuggestedLanguageCodes", "", "", "kotlin.jvm.PlatformType", "siteListData", "Landroidx/lifecycle/MutableLiveData;", "Lorg/wikipedia/util/Resource;", "", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix$SiteInfo;", "getSiteListData", "()Landroidx/lifecycle/MutableLiveData;", "suggestedLanguageCodes", "addFilteredLanguageListItems", "", "filter", "codes", "headerText", "results", "Lorg/wikipedia/language/LanguagesListViewModel$LanguageListItem;", "fetchData", "getCanonicalName", "code", "getListBySearchTerm", "context", "Landroid/content/Context;", "searchTerm", "LanguageListItem", "app_alphaDebug"})
public final class LanguagesListViewModel extends androidx.lifecycle.ViewModel {
    private final java.util.List<java.lang.String> suggestedLanguageCodes = null;
    private final java.util.List<java.lang.String> nonSuggestedLanguageCodes = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<org.wikipedia.dataclient.mwapi.SiteMatrix.SiteInfo>>> siteListData = null;
    
    public LanguagesListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<org.wikipedia.util.Resource<java.util.List<org.wikipedia.dataclient.mwapi.SiteMatrix.SiteInfo>>> getSiteListData() {
        return null;
    }
    
    private final void fetchData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.language.LanguagesListViewModel.LanguageListItem> getListBySearchTerm(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String searchTerm) {
        return null;
    }
    
    private final void addFilteredLanguageListItems(java.lang.String filter, java.util.List<java.lang.String> codes, java.lang.String headerText, java.util.List<org.wikipedia.language.LanguagesListViewModel.LanguageListItem> results) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCanonicalName(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/language/LanguagesListViewModel$LanguageListItem;", "", "code", "", "isHeader", "", "(Ljava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "()Z", "app_alphaDebug"})
    public static final class LanguageListItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        private final boolean isHeader = false;
        
        public LanguageListItem(@org.jetbrains.annotations.NotNull()
        java.lang.String code, boolean isHeader) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        public final boolean isHeader() {
            return false;
        }
    }
}
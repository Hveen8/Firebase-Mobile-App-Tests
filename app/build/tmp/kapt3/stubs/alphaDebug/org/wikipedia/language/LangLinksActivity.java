package org.wikipedia.language;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u0005-./01B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0019H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0002J\u0016\u0010+\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0002J\b\u0010,\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lorg/wikipedia/language/LangLinksActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "actionMode", "Landroidx/appcompat/view/ActionMode;", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "binding", "Lorg/wikipedia/databinding/ActivityLanglinksBinding;", "currentSearchQuery", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "entriesByAppLanguages", "", "Lorg/wikipedia/page/PageTitle;", "getEntriesByAppLanguages", "()Ljava/util/List;", "languageEntries", "", "siteInfoList", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix$SiteInfo;", "title", "displayLangLinks", "", "fetchLangLinks", "getCanonicalName", "code", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "sortLanguageEntriesByMru", "entries", "updateLanguageEntriesSupported", "updateVariantDisplayTitleIfNeeded", "Companion", "DefaultViewHolder", "LangLinksAdapter", "LangLinksItemViewHolder", "LanguageSearchCallback", "app_alphaDebug"})
public final class LangLinksActivity extends org.wikipedia.activity.BaseActivity {
    private org.wikipedia.databinding.ActivityLanglinksBinding binding;
    private org.wikipedia.page.PageTitle title;
    private java.util.List<org.wikipedia.page.PageTitle> languageEntries;
    private org.wikipedia.WikipediaApp app;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private java.lang.String currentSearchQuery;
    private androidx.appcompat.view.ActionMode actionMode;
    private java.util.List<org.wikipedia.dataclient.mwapi.SiteMatrix.SiteInfo> siteInfoList;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.language.LangLinksActivity.Companion Companion = null;
    public static final int ACTIVITY_RESULT_LANGLINK_SELECT = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LANGLINKS_FOR_TITLE = "org.wikipedia.langlinks_for_title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PAGETITLE = "org.wikipedia.pagetitle";
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    
    public LangLinksActivity() {
        super();
    }
    
    private final java.util.List<org.wikipedia.page.PageTitle> getEntriesByAppLanguages() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void displayLangLinks() {
    }
    
    private final void fetchLangLinks() {
    }
    
    private final void updateLanguageEntriesSupported(java.util.List<org.wikipedia.page.PageTitle> languageEntries) {
    }
    
    private final void updateVariantDisplayTitleIfNeeded() {
    }
    
    private final void sortLanguageEntriesByMru(java.util.List<org.wikipedia.page.PageTitle> entries) {
    }
    
    private final java.lang.String getCanonicalName(java.lang.String code) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void addVariantEntriesIfNeeded(@org.jetbrains.annotations.NotNull()
    org.wikipedia.language.AppLanguageState language, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.PageTitle> languageEntries) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0014R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/language/LangLinksActivity$LanguageSearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/language/LangLinksActivity;)V", "langLinksAdapter", "Lorg/wikipedia/language/LangLinksActivity$LangLinksAdapter;", "Lorg/wikipedia/language/LangLinksActivity;", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app_alphaDebug"})
    final class LanguageSearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        private final org.wikipedia.language.LangLinksActivity.LangLinksAdapter langLinksAdapter = null;
        
        public LanguageSearchCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        protected void onQueryChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String getSearchHintString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.content.Context getParentContext() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/language/LangLinksActivity$LangLinksAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/language/LangLinksActivity$DefaultViewHolder;", "Lorg/wikipedia/language/LangLinksActivity;", "languageEntries", "", "Lorg/wikipedia/page/PageTitle;", "appLanguageEntries", "(Lorg/wikipedia/language/LangLinksActivity;Ljava/util/List;Ljava/util/List;)V", "isSearching", "", "", "nonDuplicateEntries", "getNonDuplicateEntries", "()Ljava/util/List;", "originalLanguageEntries", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "reset", "setFilterText", "filterText", "", "shouldShowSectionHeader", "app_alphaDebug"})
    final class LangLinksAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.language.LangLinksActivity.DefaultViewHolder> {
        private final java.util.List<org.wikipedia.page.PageTitle> appLanguageEntries = null;
        private final java.util.List<org.wikipedia.page.PageTitle> originalLanguageEntries = null;
        private final java.util.List<org.wikipedia.page.PageTitle> languageEntries = null;
        private boolean isSearching = false;
        
        public LangLinksAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> languageEntries, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> appLanguageEntries) {
            super();
        }
        
        private final java.util.List<org.wikipedia.page.PageTitle> getNonDuplicateEntries() {
            return null;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.language.LangLinksActivity.DefaultViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.language.LangLinksActivity.DefaultViewHolder holder, int pos) {
        }
        
        public final boolean shouldShowSectionHeader(int position) {
            return false;
        }
        
        public final void setFilterText(@org.jetbrains.annotations.NotNull()
        java.lang.String filterText) {
        }
        
        public final void reset() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0092\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/language/LangLinksActivity$DefaultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "languageEntries", "", "Lorg/wikipedia/page/PageTitle;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/language/LangLinksActivity;Ljava/util/List;Landroid/view/View;)V", "bindItem", "", "position", "", "app_alphaDebug"})
    class DefaultViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final java.util.List<org.wikipedia.page.PageTitle> languageEntries = null;
        
        public DefaultViewHolder(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> languageEntries, @org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public void bindItem(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/language/LangLinksActivity$LangLinksItemViewHolder;", "Lorg/wikipedia/language/LangLinksActivity$DefaultViewHolder;", "Lorg/wikipedia/language/LangLinksActivity;", "Landroid/view/View$OnClickListener;", "languageEntries", "", "Lorg/wikipedia/page/PageTitle;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/language/LangLinksActivity;Ljava/util/List;Landroid/view/View;)V", "articleTitleTextView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "localizedLanguageNameTextView", "nonLocalizedLanguageNameTextView", "pos", "", "bindItem", "", "position", "onClick", "v", "app_alphaDebug"})
    final class LangLinksItemViewHolder extends org.wikipedia.language.LangLinksActivity.DefaultViewHolder implements android.view.View.OnClickListener {
        private final java.util.List<org.wikipedia.page.PageTitle> languageEntries = null;
        private final android.widget.TextView localizedLanguageNameTextView = null;
        private final android.widget.TextView nonLocalizedLanguageNameTextView = null;
        private final android.widget.TextView articleTitleTextView = null;
        private int pos = 0;
        
        public LangLinksItemViewHolder(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> languageEntries, @org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null, null);
        }
        
        @java.lang.Override()
        public void bindItem(int position) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/language/LangLinksActivity$Companion;", "", "()V", "ACTION_LANGLINKS_FOR_TITLE", "", "ACTIVITY_RESULT_LANGLINK_SELECT", "", "EXTRA_PAGETITLE", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "addVariantEntriesIfNeeded", "", "language", "Lorg/wikipedia/language/AppLanguageState;", "title", "Lorg/wikipedia/page/PageTitle;", "languageEntries", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void addVariantEntriesIfNeeded(@org.jetbrains.annotations.NotNull()
        org.wikipedia.language.AppLanguageState language, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.page.PageTitle> languageEntries) {
        }
    }
}
package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00012B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J&\u0010\u001c\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017H\u0002J\u0006\u0010\"\u001a\u00020\u0017J\u0006\u0010#\u001a\u00020\u0017J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0017J\u0010\u0010&\u001a\u00020\u00192\b\b\u0002\u0010\'\u001a\u00020\u0017J\u0006\u0010(\u001a\u00020\u0019J\b\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0015H\u0002J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\rJ\u0012\u0010.\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0006\u00101\u001a\u00020\u0019R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lorg/wikipedia/page/PageFragmentLoadState;", "", "model", "Lorg/wikipedia/page/PageViewModel;", "fragment", "Lorg/wikipedia/page/PageFragment;", "webView", "Lorg/wikipedia/views/ObservableWebView;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "leadImagesHandler", "Lorg/wikipedia/page/leadimages/LeadImagesHandler;", "currentTab", "Lorg/wikipedia/page/tabs/Tab;", "(Lorg/wikipedia/page/PageViewModel;Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/views/ObservableWebView;Lorg/wikipedia/bridge/CommunicationBridge;Lorg/wikipedia/page/leadimages/LeadImagesHandler;Lorg/wikipedia/page/tabs/Tab;)V", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "networkErrorCallback", "Lorg/wikipedia/page/PageFragmentLoadState$ErrorCallback;", "backStackEmpty", "", "commonSectionFetchOnCatch", "", "caught", "", "createPageModel", "response", "Lretrofit2/Response;", "Lorg/wikipedia/dataclient/page/PageSummary;", "isWatched", "hasWatchlistExpiry", "goBack", "goForward", "load", "pushBackStack", "loadFromBackStack", "isRefresh", "onConfigurationChanged", "pageLoadCheckReadingLists", "pageLoadFromNetwork", "errorCallback", "setTab", "tab", "showPageOfflineMessage", "dateHeader", "", "updateCurrentBackStackItem", "ErrorCallback", "app_alphaDebug"})
public final class PageFragmentLoadState {
    private org.wikipedia.page.PageViewModel model;
    private org.wikipedia.page.PageFragment fragment;
    private org.wikipedia.views.ObservableWebView webView;
    private org.wikipedia.bridge.CommunicationBridge bridge;
    private org.wikipedia.page.leadimages.LeadImagesHandler leadImagesHandler;
    private org.wikipedia.page.tabs.Tab currentTab;
    private org.wikipedia.page.PageFragmentLoadState.ErrorCallback networkErrorCallback;
    private final org.wikipedia.WikipediaApp app = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    
    public PageFragmentLoadState(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageViewModel model, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView webView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge bridge, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.leadimages.LeadImagesHandler leadImagesHandler, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.tabs.Tab currentTab) {
        super();
    }
    
    public final void load(boolean pushBackStack) {
    }
    
    public final void loadFromBackStack(boolean isRefresh) {
    }
    
    public final void updateCurrentBackStackItem() {
    }
    
    public final void setTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.tabs.Tab tab) {
    }
    
    public final boolean goBack() {
        return false;
    }
    
    public final boolean goForward() {
        return false;
    }
    
    public final boolean backStackEmpty() {
        return false;
    }
    
    public final void onConfigurationChanged() {
    }
    
    private final void commonSectionFetchOnCatch(java.lang.Throwable caught) {
    }
    
    private final void pageLoadCheckReadingLists() {
    }
    
    private final void pageLoadFromNetwork(org.wikipedia.page.PageFragmentLoadState.ErrorCallback errorCallback) {
    }
    
    private final void showPageOfflineMessage(java.lang.String dateHeader) {
    }
    
    private final void createPageModel(retrofit2.Response<org.wikipedia.dataclient.page.PageSummary> response, boolean isWatched, boolean hasWatchlistExpiry) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u00e2\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/PageFragmentLoadState$ErrorCallback;", "", "call", "", "error", "", "app_alphaDebug"})
    static abstract interface ErrorCallback {
        
        public abstract void call(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error);
    }
}
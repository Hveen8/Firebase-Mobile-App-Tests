package org.wikipedia.wiktionary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u000267B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0017H\u0002J\u0012\u0010&\u001a\u00020\u00172\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J$\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010.\u001a\u00020\u0017H\u0016J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\u0012\u00103\u001a\u00020\u00132\b\u00104\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u00105\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lorg/wikipedia/wiktionary/WiktionaryDialog;", "Lorg/wikipedia/page/ExtendedBottomSheetDialogFragment;", "()V", "_binding", "Lorg/wikipedia/databinding/DialogWiktionaryBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/DialogWiktionaryBinding;", "currentDefinition", "Lorg/wikipedia/dataclient/restbase/RbDefinition;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/WiktionaryDialogFunnel;", "linkMovementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "selectedText", "", "callback", "Lorg/wikipedia/wiktionary/WiktionaryDialog$Callback;", "displayNoDefinitionsFound", "", "getTermFromWikiLink", "url", "layOutDefinitionWithExamples", "Landroid/view/View;", "Lorg/wikipedia/dataclient/restbase/RbDefinition$Definition;", "count", "", "layOutDefinitionsByUsage", "layOutUsage", "currentUsage", "Lorg/wikipedia/dataclient/restbase/RbDefinition$Usage;", "layoutExamples", "example", "loadDefinitions", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDismiss", "dialogInterface", "Landroid/content/DialogInterface;", "removeLinkFragment", "sanitizeForDialogTitle", "text", "showNewDialogForLink", "Callback", "Companion", "app_alphaDebug"})
public final class WiktionaryDialog extends org.wikipedia.page.ExtendedBottomSheetDialogFragment {
    private org.wikipedia.databinding.DialogWiktionaryBinding _binding;
    private org.wikipedia.page.PageTitle pageTitle;
    private java.lang.String selectedText;
    private org.wikipedia.dataclient.restbase.RbDefinition currentDefinition;
    private org.wikipedia.analytics.WiktionaryDialogFunnel funnel;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final org.wikipedia.page.LinkMovementMethodExt linkMovementMethod = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.wiktionary.WiktionaryDialog.Companion Companion = null;
    private static final java.lang.String WIKTIONARY_DOMAIN = ".wiktionary.org";
    private static final java.lang.String TITLE = "title";
    private static final java.lang.String SELECTED_TEXT = "selected_text";
    private static final java.lang.String PATH_WIKI = "/wiki/";
    private static final java.lang.String PATH_CURRENT = "./";
    private static final java.lang.String GLOSSARY_OF_TERMS = ":Glossary";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> enabledLanguages = null;
    
    public WiktionaryDialog() {
        super();
    }
    
    private final org.wikipedia.databinding.DialogWiktionaryBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialogInterface) {
    }
    
    private final void loadDefinitions() {
    }
    
    private final void displayNoDefinitionsFound() {
    }
    
    private final void layOutDefinitionsByUsage() {
    }
    
    private final android.view.View layOutUsage(org.wikipedia.dataclient.restbase.RbDefinition.Usage currentUsage) {
        return null;
    }
    
    private final android.view.View layOutDefinitionWithExamples(org.wikipedia.dataclient.restbase.RbDefinition.Definition currentDefinition, int count) {
        return null;
    }
    
    private final android.view.View layoutExamples(java.lang.String example) {
        return null;
    }
    
    private final java.lang.String getTermFromWikiLink(java.lang.String url) {
        return null;
    }
    
    private final java.lang.String removeLinkFragment(java.lang.String url) {
        return null;
    }
    
    private final void showNewDialogForLink(java.lang.String url) {
    }
    
    private final java.lang.String sanitizeForDialogTitle(java.lang.String text) {
        return null;
    }
    
    private final org.wikipedia.wiktionary.WiktionaryDialog.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/wiktionary/WiktionaryDialog$Callback;", "", "wiktionaryShowDialogForTerm", "", "term", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void wiktionaryShowDialogForTerm(@org.jetbrains.annotations.NotNull()
        java.lang.String term);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/wiktionary/WiktionaryDialog$Companion;", "", "()V", "GLOSSARY_OF_TERMS", "", "PATH_CURRENT", "PATH_WIKI", "SELECTED_TEXT", "TITLE", "WIKTIONARY_DOMAIN", "enabledLanguages", "", "getEnabledLanguages", "()Ljava/util/List;", "newInstance", "Lorg/wikipedia/wiktionary/WiktionaryDialog;", "title", "Lorg/wikipedia/page/PageTitle;", "selectedText", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getEnabledLanguages() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.wiktionary.WiktionaryDialog newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        java.lang.String selectedText) {
            return null;
        }
    }
}
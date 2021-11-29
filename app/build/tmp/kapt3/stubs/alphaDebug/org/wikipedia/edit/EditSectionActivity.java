package org.wikipedia.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 d2\u00020\u0001:\u0001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00100\u001a\u00020\u0017H\u0002J\u0006\u00101\u001a\u00020\u0017J\b\u00102\u001a\u00020\u0017H\u0002J\u0010\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0011H\u0002J\b\u00105\u001a\u00020\u0017H\u0002J\b\u00106\u001a\u00020\u0017H\u0002J\u0010\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u00020\u0017H\u0002J\u0010\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0004H\u0016J\"\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\'2\u0006\u0010?\u001a\u00020\'2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\b\u0010B\u001a\u00020\u0017H\u0016J\u0012\u0010C\u001a\u00020\u00172\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020\u0017H\u0016J\u0010\u0010J\u001a\u00020\u00172\u0006\u00108\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u00020\u00172\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020\u00172\u0006\u0010S\u001a\u00020EH\u0014J\b\u0010T\u001a\u00020\u0017H\u0016J\b\u0010U\u001a\u00020\u0017H\u0002J\u0012\u0010V\u001a\u00020\u00172\b\u0010W\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010X\u001a\u00020\u0017J\b\u0010Y\u001a\u00020\u0017H\u0002J\u0010\u0010Z\u001a\u00020\u00172\b\u00108\u001a\u0004\u0018\u00010KJ\b\u0010[\u001a\u00020\u0017H\u0002J\u000e\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\u001bJ\u0010\u0010^\u001a\u00020\u00172\u0006\u0010_\u001a\u00020KH\u0002J\b\u0010`\u001a\u00020\u0017H\u0002J\b\u0010a\u001a\u00020\u0017H\u0002J\u0010\u0010b\u001a\u00020\u00172\u0006\u0010c\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006e"}, d2 = {"Lorg/wikipedia/edit/EditSectionActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "actionMode", "Landroid/view/ActionMode;", "binding", "Lorg/wikipedia/databinding/ActivityEditSectionBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "captchaHandler", "Lorg/wikipedia/captcha/CaptchaHandler;", "currentRevision", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "editNotices", "", "", "editPreviewFragment", "Lorg/wikipedia/edit/preview/EditPreviewFragment;", "editSummaryFragment", "Lorg/wikipedia/edit/summaries/EditSummaryFragment;", "editTokenThenSave", "", "getEditTokenThenSave", "()Lkotlin/Unit;", "editingAllowed", "", "funnel", "Lorg/wikipedia/analytics/EditFunnel;", "pageProps", "Lorg/wikipedia/page/PageProperties;", "<set-?>", "Lorg/wikipedia/page/PageTitle;", "pageTitle", "getPageTitle", "()Lorg/wikipedia/page/PageTitle;", "sectionAnchor", "sectionID", "", "sectionTextFirstLoad", "sectionTextModified", "sectionWikitext", "syntaxHighlighter", "Lorg/wikipedia/edit/richtext/SyntaxHighlighter;", "textToHighlight", "textWatcher", "Landroid/text/TextWatcher;", "cancelCalls", "clickNextButton", "displaySectionText", "doSave", "token", "fetchSectionText", "finishActionMode", "handleEditingException", "caught", "Lorg/wikipedia/dataclient/mwapi/MwException;", "maybeShowEditNoticesTooltip", "onActionModeStarted", "mode", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onEditFailure", "", "onEditSuccess", "result", "Lorg/wikipedia/edit/EditResult;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onStart", "resetToStart", "scrollToHighlight", "highlightText", "showCustomSummary", "showEditNotices", "showError", "showFindInEditor", "showProgressBar", "enable", "showRetryDialog", "t", "updateEditLicenseText", "updateTextSize", "waitForUpdatedRevision", "newRevision", "Companion", "app_alphaDebug"})
public final class EditSectionActivity extends org.wikipedia.activity.BaseActivity {
    private org.wikipedia.databinding.ActivityEditSectionBinding binding;
    private org.wikipedia.analytics.EditFunnel funnel;
    private android.text.TextWatcher textWatcher;
    private org.wikipedia.captcha.CaptchaHandler captchaHandler;
    private org.wikipedia.edit.preview.EditPreviewFragment editPreviewFragment;
    private org.wikipedia.edit.summaries.EditSummaryFragment editSummaryFragment;
    private org.wikipedia.edit.richtext.SyntaxHighlighter syntaxHighlighter;
    private org.wikipedia.page.PageTitle pageTitle;
    private int sectionID = 0;
    private java.lang.String sectionAnchor;
    private org.wikipedia.page.PageProperties pageProps;
    private java.lang.String textToHighlight;
    private java.lang.String sectionWikitext;
    private final java.util.List<java.lang.String> editNotices = null;
    private boolean sectionTextModified = false;
    private boolean sectionTextFirstLoad = true;
    private boolean editingAllowed = false;
    private long currentRevision = 0L;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private android.view.ActionMode actionMode;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.EditSectionActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_KEY_SECTION_TEXT_MODIFIED = "sectionTextModified";
    private static final java.lang.String EXTRA_KEY_TEMPORARY_WIKITEXT_STORED = "hasTemporaryWikitextStored";
    private static final java.lang.String EXTRA_KEY_EDITING_ALLOWED = "editingAllowed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TITLE = "org.wikipedia.edit_section.title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SECTION_ID = "org.wikipedia.edit_section.sectionid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SECTION_ANCHOR = "org.wikipedia.edit_section.anchor";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PAGE_PROPS = "org.wikipedia.edit_section.pageprops";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HIGHLIGHT_TEXT = "org.wikipedia.edit_section.highlight";
    
    public EditSectionActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getPageTitle() {
        return null;
    }
    
    private final kotlin.Unit getEditTokenThenSave() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void updateEditLicenseText() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void cancelCalls() {
    }
    
    private final void doSave(java.lang.String token) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final void waitForUpdatedRevision(long newRevision) {
    }
    
    private final void onEditSuccess(org.wikipedia.edit.EditResult result) {
    }
    
    private final void onEditFailure(java.lang.Throwable caught) {
    }
    
    private final void showRetryDialog(java.lang.Throwable t) {
    }
    
    /**
     * Processes API error codes encountered during editing, and handles them as appropriate.
     * @param caught The MwException to handle.
     */
    private final void handleEditingException(org.wikipedia.dataclient.mwapi.MwException caught) {
    }
    
    /**
     * Executes a click of the actionbar button, and performs the appropriate action
     * based on the current state of the button.
     */
    public final void clickNextButton() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onActionModeStarted(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    public final void showError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
    }
    
    private final void showFindInEditor() {
    }
    
    private final void finishActionMode() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void updateTextSize() {
    }
    
    private final void resetToStart() {
    }
    
    private final void fetchSectionText() {
    }
    
    private final void maybeShowEditNoticesTooltip() {
    }
    
    private final void showEditNotices() {
    }
    
    private final void displaySectionText() {
    }
    
    private final void scrollToHighlight(java.lang.String highlightText) {
    }
    
    public final void showProgressBar(boolean enable) {
    }
    
    /**
     * Shows the custom edit summary input fragment, where the user may enter a summary
     * that's different from the standard summary tags.
     */
    public final void showCustomSummary() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/edit/EditSectionActivity$Companion;", "", "()V", "EXTRA_HIGHLIGHT_TEXT", "", "EXTRA_KEY_EDITING_ALLOWED", "EXTRA_KEY_SECTION_TEXT_MODIFIED", "EXTRA_KEY_TEMPORARY_WIKITEXT_STORED", "EXTRA_PAGE_PROPS", "EXTRA_SECTION_ANCHOR", "EXTRA_SECTION_ID", "EXTRA_TITLE", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
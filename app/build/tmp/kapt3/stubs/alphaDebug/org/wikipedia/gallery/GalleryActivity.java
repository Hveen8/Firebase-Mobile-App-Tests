package org.wikipedia.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u000f\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004z{|}B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\u0018\u00104\u001a\u0002002\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020#H\u0002J\u0010\u00107\u001a\u0002002\u0006\u00105\u001a\u00020\u000fH\u0002J\b\u00108\u001a\u000200H\u0002J\b\u00109\u001a\u000200H\u0002J\u001a\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020)2\b\b\u0002\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020\rH\u0002J\u0010\u0010@\u001a\u0002002\b\u0010A\u001a\u0004\u0018\u00010\u000fJ\b\u0010B\u001a\u000200H\u0002J\"\u0010C\u001a\u0002002\u0006\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u00020#2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u000200H\u0016J\u0012\u0010I\u001a\u0002002\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0010\u0010L\u001a\u00020\r2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u000200H\u0016J\u0010\u0010P\u001a\u0002002\u0006\u00105\u001a\u00020\u000fH\u0016J\u0010\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u000200H\u0002J\b\u0010U\u001a\u00020\rH\u0002J\u0010\u0010V\u001a\u0002002\u0006\u0010W\u001a\u00020)H\u0016J\u0010\u0010X\u001a\u0002002\u0006\u0010W\u001a\u00020)H\u0016J \u0010Y\u001a\u0002002\u0006\u0010W\u001a\u00020)2\u0006\u0010Z\u001a\u00020=2\u0006\u0010[\u001a\u00020\rH\u0016J\u0010\u0010\\\u001a\u0002002\u0006\u0010W\u001a\u00020)H\u0016J\u0006\u0010]\u001a\u000200J\b\u0010^\u001a\u000200H\u0016J\b\u0010_\u001a\u000200H\u0016J\u0010\u0010`\u001a\u0002002\u0006\u0010a\u001a\u00020KH\u0014J*\u0010b\u001a\u0002002\u0006\u00105\u001a\u00020\u000f2\b\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010e\u001a\u00020!2\u0006\u0010W\u001a\u00020)H\u0016J\b\u0010f\u001a\u000200H\u0002J\u0010\u0010g\u001a\u0002002\u0006\u0010h\u001a\u00020\rH\u0002J\u0010\u0010i\u001a\u0002002\u0006\u00105\u001a\u00020\u000fH\u0002J\b\u0010j\u001a\u000200H\u0014J\u000e\u0010k\u001a\u0002002\u0006\u0010l\u001a\u00020\rJ\u0010\u0010m\u001a\u0002002\b\u0010n\u001a\u0004\u0018\u00010oJ\u0010\u0010p\u001a\u0002002\u0006\u0010W\u001a\u00020)H\u0002J\b\u0010q\u001a\u000200H\u0002J\u0010\u0010r\u001a\u0002002\u0006\u00105\u001a\u00020\u000fH\u0002J\u0010\u0010s\u001a\u0002002\u0006\u00105\u001a\u00020\u000fH\u0002J\u0010\u0010t\u001a\u0002002\u0006\u00105\u001a\u00020\u000fH\u0002J\u0006\u0010u\u001a\u000200J\u0016\u0010v\u001a\u0002002\u0006\u0010w\u001a\u00020\r2\u0006\u00106\u001a\u00020#J\u0010\u0010x\u001a\u0002002\u0006\u0010y\u001a\u00020\rH\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00060\'R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006~"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$Callback;", "Lorg/wikipedia/gallery/GalleryItemFragment$Callback;", "()V", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "binding", "Lorg/wikipedia/databinding/ActivityGalleryBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "controlsShowing", "", "currentItem", "Lorg/wikipedia/gallery/GalleryItemFragment;", "getCurrentItem", "()Lorg/wikipedia/gallery/GalleryItemFragment;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "downloadReceiver", "Lorg/wikipedia/gallery/MediaDownloadReceiver;", "downloadReceiverCallback", "Lorg/wikipedia/gallery/GalleryActivity$MediaDownloadReceiverCallback;", "funnel", "Lorg/wikipedia/analytics/GalleryFunnel;", "galleryAdapter", "Lorg/wikipedia/gallery/GalleryActivity$GalleryItemAdapter;", "imageCaptionDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "imageEditType", "Lorg/wikipedia/Constants$ImageEditType;", "initialFilename", "", "initialImageIndex", "", "linkMovementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "pageChangeListener", "Lorg/wikipedia/gallery/GalleryActivity$GalleryPageChangeListener;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "revision", "", "sourceWiki", "Lorg/wikipedia/dataclient/WikiSite;", "targetLanguageCode", "applyGalleryList", "", "mediaListItems", "", "Lorg/wikipedia/gallery/MediaListItem;", "decideImageEditType", "item", "tagsCount", "displayApplicableDescription", "disposeImageCaptionDisposable", "fetchGalleryItems", "finishWithPageResult", "resultTitle", "historyEntry", "Lorg/wikipedia/history/HistoryEntry;", "hideTransitionReceiver", "delay", "layOutGalleryDescription", "callingFragment", "loadGalleryContent", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onDownload", "onEditClick", "v", "Landroid/view/View;", "onLicenseClick", "onLicenseLongClick", "onLinkPreviewAddToList", "title", "onLinkPreviewCopyLink", "onLinkPreviewLoadPage", "entry", "inNewTab", "onLinkPreviewShareLink", "onMediaLoaded", "onPause", "onResume", "onSaveInstanceState", "outState", "onShare", "bitmap", "Landroid/graphics/Bitmap;", "subject", "onTranslateClick", "setControlsShowing", "showing", "setLicenseInfo", "setTheme", "setViewPagerEnabled", "enabled", "showError", "caught", "", "showLinkPreview", "showTransitionReceiver", "startCaptionEdit", "startCaptionTranslation", "startTagsEdit", "toggleControls", "updateGalleryDescription", "isProtected", "updateProgressBar", "visible", "Companion", "GalleryItemAdapter", "GalleryPageChangeListener", "MediaDownloadReceiverCallback", "app_alphaDebug"})
public final class GalleryActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.page.linkpreview.LinkPreviewDialog.Callback, org.wikipedia.gallery.GalleryItemFragment.Callback {
    private org.wikipedia.databinding.ActivityGalleryBinding binding;
    private org.wikipedia.dataclient.WikiSite sourceWiki;
    private org.wikipedia.analytics.GalleryFunnel funnel;
    private org.wikipedia.gallery.GalleryActivity.GalleryItemAdapter galleryAdapter;
    private org.wikipedia.gallery.GalleryActivity.GalleryPageChangeListener pageChangeListener;
    private org.wikipedia.page.PageTitle pageTitle;
    private org.wikipedia.Constants.ImageEditType imageEditType;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private io.reactivex.rxjava3.disposables.Disposable imageCaptionDisposable;
    private long revision = 0L;
    private boolean controlsShowing = true;
    
    /**
     * If we have an intent that tells us a specific image to jump to within the gallery,
     * then this will be non-null.
     */
    private java.lang.String initialFilename;
    
    /**
     * If we come back from savedInstanceState, then this will be the previous pager position.
     */
    private int initialImageIndex = -1;
    private java.lang.String targetLanguageCode;
    private final org.wikipedia.WikipediaApp app = null;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private final org.wikipedia.gallery.MediaDownloadReceiver downloadReceiver = null;
    private final org.wikipedia.gallery.GalleryActivity.MediaDownloadReceiverCallback downloadReceiverCallback = null;
    private final org.wikipedia.page.LinkMovementMethodExt linkMovementMethod = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.gallery.GalleryActivity.Companion Companion = null;
    private static final java.lang.String KEY_CONTROLS_SHOWING = "controlsShowing";
    private static final java.lang.String KEY_PAGER_INDEX = "pagerIndex";
    public static final int ACTIVITY_RESULT_PAGE_SELECTED = 1;
    public static final int ACTIVITY_REQUEST_DESCRIPTION_EDIT = 2;
    public static final int ACTIVITY_RESULT_IMAGE_CAPTION_ADDED = 3;
    public static final int ACTIVITY_REQUEST_ADD_IMAGE_TAGS = 4;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PAGETITLE = "pageTitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FILENAME = "filename";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_WIKI = "wiki";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_REVISION = "revision";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SOURCE = "source";
    private static org.wikipedia.bridge.JavaScriptActionHandler.ImageHitInfo TRANSITION_INFO;
    
    public GalleryActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onDownload(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    @java.lang.Override()
    public void onShare(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.GalleryItemFragment item, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    protected void setTheme() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void onEditClick(android.view.View v) {
    }
    
    private final void startCaptionEdit(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void onTranslateClick() {
    }
    
    private final void startTagsEdit(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void startCaptionTranslation(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void onLicenseClick() {
    }
    
    private final boolean onLicenseLongClick() {
        return false;
    }
    
    private final void disposeImageCaptionDisposable() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void updateProgressBar(boolean visible) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void onMediaLoaded() {
    }
    
    private final void showTransitionReceiver() {
    }
    
    private final void hideTransitionReceiver(boolean delay) {
    }
    
    private final void setControlsShowing(boolean showing) {
    }
    
    public final void toggleControls() {
    }
    
    private final void showLinkPreview(org.wikipedia.page.PageTitle title) {
    }
    
    public final void setViewPagerEnabled(boolean enabled) {
    }
    
    private final void finishWithPageResult(org.wikipedia.page.PageTitle resultTitle, org.wikipedia.history.HistoryEntry historyEntry) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean inNewTab) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewCopyLink(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewAddToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewShareLink(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final void showError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable caught) {
    }
    
    private final void fetchGalleryItems() {
    }
    
    private final void loadGalleryContent() {
    }
    
    private final void applyGalleryList(java.util.List<org.wikipedia.gallery.MediaListItem> mediaListItems) {
    }
    
    private final org.wikipedia.gallery.GalleryItemFragment getCurrentItem() {
        return null;
    }
    
    public final void layOutGalleryDescription(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.GalleryItemFragment callingFragment) {
    }
    
    public final void updateGalleryDescription(boolean isProtected, int tagsCount) {
    }
    
    private final void decideImageEditType(org.wikipedia.gallery.GalleryItemFragment item, int tagsCount) {
    }
    
    private final void displayApplicableDescription(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    private final void setLicenseInfo(org.wikipedia.gallery.GalleryItemFragment item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, long revision, int source) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setTransitionInfo(@org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.JavaScriptActionHandler.ImageHitInfo hitInfo) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$GalleryPageChangeListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/gallery/GalleryActivity;)V", "currentPosition", "", "onPageScrollStateChanged", "", "state", "onPageSelected", "position", "app_alphaDebug"})
    final class GalleryPageChangeListener extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        private int currentPosition = -1;
        
        public GalleryPageChangeListener() {
            super();
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
        
        @java.lang.Override()
        public void onPageScrollStateChanged(int state) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$GalleryItemAdapter;", "Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "(Lorg/wikipedia/gallery/GalleryActivity;Landroidx/appcompat/app/AppCompatActivity;)V", "list", "", "Lorg/wikipedia/gallery/MediaListItem;", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "setList", "", "", "app_alphaDebug"})
    final class GalleryItemAdapter extends org.wikipedia.views.PositionAwareFragmentStateAdapter {
        private final java.util.List<org.wikipedia.gallery.MediaListItem> list = null;
        
        public GalleryItemAdapter(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.app.AppCompatActivity activity) {
            super(null);
        }
        
        public final void setList(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.gallery.MediaListItem> list) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$MediaDownloadReceiverCallback;", "Lorg/wikipedia/gallery/MediaDownloadReceiver$Callback;", "(Lorg/wikipedia/gallery/GalleryActivity;)V", "onSuccess", "", "app_alphaDebug"})
    final class MediaDownloadReceiverCallback implements org.wikipedia.gallery.MediaDownloadReceiver.Callback {
        
        public MediaDownloadReceiverCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/wikipedia/gallery/GalleryActivity$Companion;", "", "()V", "ACTIVITY_REQUEST_ADD_IMAGE_TAGS", "", "ACTIVITY_REQUEST_DESCRIPTION_EDIT", "ACTIVITY_RESULT_IMAGE_CAPTION_ADDED", "ACTIVITY_RESULT_PAGE_SELECTED", "EXTRA_FILENAME", "", "EXTRA_PAGETITLE", "EXTRA_REVISION", "EXTRA_SOURCE", "EXTRA_WIKI", "KEY_CONTROLS_SHOWING", "KEY_PAGER_INDEX", "TRANSITION_INFO", "Lorg/wikipedia/bridge/JavaScriptActionHandler$ImageHitInfo;", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "filename", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "revision", "", "source", "setTransitionInfo", "", "hitInfo", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.String filename, @org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite wiki, long revision, int source) {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setTransitionInfo(@org.jetbrains.annotations.NotNull()
        org.wikipedia.bridge.JavaScriptActionHandler.ImageHitInfo hitInfo) {
        }
    }
}
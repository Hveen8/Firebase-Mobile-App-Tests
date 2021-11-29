package org.wikipedia;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00029:B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u001eX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lorg/wikipedia/Constants;", "", "()V", "ACTIVITY_REQUEST_ADD_A_LANGUAGE", "", "ACTIVITY_REQUEST_ADD_A_LANGUAGE_FROM_SEARCH", "ACTIVITY_REQUEST_BROWSE_TABS", "ACTIVITY_REQUEST_CREATE_ACCOUNT", "ACTIVITY_REQUEST_DESCRIPTION_EDIT", "ACTIVITY_REQUEST_DESCRIPTION_EDIT_SUCCESS", "ACTIVITY_REQUEST_DESCRIPTION_EDIT_TUTORIAL", "ACTIVITY_REQUEST_EDIT_SECTION", "ACTIVITY_REQUEST_FEED_CONFIGURE", "ACTIVITY_REQUEST_GALLERY", "ACTIVITY_REQUEST_GO_TO_TOPIC_ACTIVITY", "ACTIVITY_REQUEST_IMAGE_CAPTION_EDIT", "ACTIVITY_REQUEST_IMAGE_TAGS_EDIT", "ACTIVITY_REQUEST_IMAGE_TAGS_ONBOARDING", "ACTIVITY_REQUEST_INITIAL_ONBOARDING", "ACTIVITY_REQUEST_LANGLINKS", "ACTIVITY_REQUEST_LOGIN", "ACTIVITY_REQUEST_NEW_TOPIC_ACTIVITY", "ACTIVITY_REQUEST_OPEN_SEARCH_ACTIVITY", "ACTIVITY_REQUEST_RESET_PASSWORD", "ACTIVITY_REQUEST_SETTINGS", "ACTIVITY_REQUEST_SUGGESTED_EDITS_ONBOARDING", "ACTIVITY_REQUEST_VOICE_SEARCH", "ACTIVITY_REQUEST_WRITE_EXTERNAL_STORAGE_PERMISSION", "API_QUERY_MAX_TITLES", "INTENT_APP_SHORTCUT_CONTINUE_READING", "", "INTENT_APP_SHORTCUT_RANDOMIZER", "INTENT_APP_SHORTCUT_SEARCH", "INTENT_EXTRA_ACTION", "INTENT_EXTRA_DELETE_READING_LIST", "INTENT_EXTRA_GO_TO_MAIN_TAB", "INTENT_EXTRA_GO_TO_SE_TAB", "INTENT_EXTRA_HAS_TRANSITION_ANIM", "INTENT_EXTRA_INVOKE_SOURCE", "INTENT_EXTRA_NOTIFICATION_ID", "INTENT_EXTRA_NOTIFICATION_SYNC_CANCEL", "INTENT_EXTRA_NOTIFICATION_SYNC_PAUSE_RESUME", "INTENT_EXTRA_NOTIFICATION_TYPE", "INTENT_EXTRA_REVERT_QNUMBER", "INTENT_FEATURED_ARTICLE_FROM_WIDGET", "INTENT_RETURN_TO_MAIN", "MAX_READING_LISTS_LIMIT", "MAX_READING_LIST_ARTICLE_LIMIT", "MAX_TABS", "MIN_LANGUAGES_TO_UNLOCK_TRANSLATION", "PLAIN_TEXT_MIME_TYPE", "PREFERRED_CARD_THUMBNAIL_SIZE", "PREFERRED_GALLERY_IMAGE_SIZE", "RECENT_SEARCHES_FRAGMENT_LOADER_ID", "SUGGESTION_REQUEST_ITEMS", "WIKI_CODE_COMMONS", "WIKI_CODE_WIKIDATA", "ImageEditType", "InvokeSource", "app_alphaDebug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.Constants INSTANCE = null;
    public static final int ACTIVITY_REQUEST_ADD_A_LANGUAGE = 59;
    public static final int ACTIVITY_REQUEST_ADD_A_LANGUAGE_FROM_SEARCH = 60;
    public static final int ACTIVITY_REQUEST_BROWSE_TABS = 61;
    public static final int ACTIVITY_REQUEST_CREATE_ACCOUNT = 42;
    public static final int ACTIVITY_REQUEST_DESCRIPTION_EDIT = 55;
    public static final int ACTIVITY_REQUEST_DESCRIPTION_EDIT_SUCCESS = 54;
    public static final int ACTIVITY_REQUEST_DESCRIPTION_EDIT_TUTORIAL = 56;
    public static final int ACTIVITY_REQUEST_EDIT_SECTION = 51;
    public static final int ACTIVITY_REQUEST_FEED_CONFIGURE = 58;
    public static final int ACTIVITY_REQUEST_GALLERY = 52;
    public static final int ACTIVITY_REQUEST_IMAGE_CAPTION_EDIT = 64;
    public static final int ACTIVITY_REQUEST_IMAGE_TAGS_EDIT = 66;
    public static final int ACTIVITY_REQUEST_IMAGE_TAGS_ONBOARDING = 65;
    public static final int ACTIVITY_REQUEST_INITIAL_ONBOARDING = 57;
    public static final int ACTIVITY_REQUEST_LANGLINKS = 50;
    public static final int ACTIVITY_REQUEST_LOGIN = 53;
    public static final int ACTIVITY_REQUEST_NEW_TOPIC_ACTIVITY = 67;
    public static final int ACTIVITY_REQUEST_OPEN_SEARCH_ACTIVITY = 62;
    public static final int ACTIVITY_REQUEST_RESET_PASSWORD = 43;
    public static final int ACTIVITY_REQUEST_SETTINGS = 41;
    public static final int ACTIVITY_REQUEST_SUGGESTED_EDITS_ONBOARDING = 63;
    public static final int ACTIVITY_REQUEST_VOICE_SEARCH = 45;
    public static final int ACTIVITY_REQUEST_WRITE_EXTERNAL_STORAGE_PERMISSION = 44;
    public static final int ACTIVITY_REQUEST_GO_TO_TOPIC_ACTIVITY = 68;
    public static final int API_QUERY_MAX_TITLES = 50;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_APP_SHORTCUT_CONTINUE_READING = "appShortcutContinueReading";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_APP_SHORTCUT_RANDOMIZER = "appShortcutRandomizer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_APP_SHORTCUT_SEARCH = "appShortcutSearch";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_ACTION = "intentAction";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_DELETE_READING_LIST = "deleteReadingList";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_GO_TO_MAIN_TAB = "goToMainTab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_GO_TO_SE_TAB = "goToSETab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_HAS_TRANSITION_ANIM = "hasTransitionAnim";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_INVOKE_SOURCE = "invokeSource";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_NOTIFICATION_ID = "notificationId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_NOTIFICATION_SYNC_CANCEL = "syncCancel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_NOTIFICATION_SYNC_PAUSE_RESUME = "syncPauseResume";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_NOTIFICATION_TYPE = "notificationType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_EXTRA_REVERT_QNUMBER = "revertQNumber";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_FEATURED_ARTICLE_FROM_WIDGET = "featuredArticleFromWidget";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTENT_RETURN_TO_MAIN = "returnToMain";
    public static final int MAX_READING_LIST_ARTICLE_LIMIT = 5000;
    public static final int MAX_READING_LISTS_LIMIT = 100;
    public static final int MAX_TABS = 100;
    public static final int MIN_LANGUAGES_TO_UNLOCK_TRANSLATION = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLAIN_TEXT_MIME_TYPE = "text/plain";
    public static final int PREFERRED_CARD_THUMBNAIL_SIZE = 800;
    public static final int PREFERRED_GALLERY_IMAGE_SIZE = 1280;
    public static final int RECENT_SEARCHES_FRAGMENT_LOADER_ID = 101;
    public static final int SUGGESTION_REQUEST_ITEMS = 5;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKI_CODE_COMMONS = "commons";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKI_CODE_WIKIDATA = "wikidata";
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/\u00a8\u00060"}, d2 = {"Lorg/wikipedia/Constants$InvokeSource;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANNOUNCEMENT", "APP_SHORTCUTS", "BOOKMARK_BUTTON", "CONTEXT_MENU", "DIFF_ACTIVITY", "FEED", "FEED_BAR", "FILE_PAGE_ACTIVITY", "GALLERY_ACTIVITY", "INTENT_PROCESS_TEXT", "INTENT_SHARE", "INTENT_UNKNOWN", "LANG_VARIANT_DIALOG", "LEAD_IMAGE", "LINK_PREVIEW_MENU", "MAIN_ACTIVITY", "MOST_READ_ACTIVITY", "NAV_MENU", "NEWS_ACTIVITY", "NOTIFICATION", "ON_THIS_DAY_ACTIVITY", "ON_THIS_DAY_CARD_BODY", "ON_THIS_DAY_CARD_FOOTER", "ON_THIS_DAY_CARD_YEAR", "ONBOARDING_DIALOG", "PAGE_ACTION_TAB", "PAGE_ACTIVITY", "PAGE_OVERFLOW_MENU", "RANDOM_ACTIVITY", "READ_MORE_BOOKMARK_BUTTON", "READING_LIST_ACTIVITY", "SEARCH", "SETTINGS", "SNACKBAR_ACTION", "SUGGESTED_EDITS", "TABS_ACTIVITY", "TALK_ACTIVITY", "TOOLBAR", "VOICE", "WATCHLIST_ACTIVITY", "WIDGET", "app_alphaDebug"})
    public static enum InvokeSource {
        /*public static final*/ ANNOUNCEMENT /* = new ANNOUNCEMENT(null) */,
        /*public static final*/ APP_SHORTCUTS /* = new APP_SHORTCUTS(null) */,
        /*public static final*/ BOOKMARK_BUTTON /* = new BOOKMARK_BUTTON(null) */,
        /*public static final*/ CONTEXT_MENU /* = new CONTEXT_MENU(null) */,
        /*public static final*/ DIFF_ACTIVITY /* = new DIFF_ACTIVITY(null) */,
        /*public static final*/ FEED /* = new FEED(null) */,
        /*public static final*/ FEED_BAR /* = new FEED_BAR(null) */,
        /*public static final*/ FILE_PAGE_ACTIVITY /* = new FILE_PAGE_ACTIVITY(null) */,
        /*public static final*/ GALLERY_ACTIVITY /* = new GALLERY_ACTIVITY(null) */,
        /*public static final*/ INTENT_PROCESS_TEXT /* = new INTENT_PROCESS_TEXT(null) */,
        /*public static final*/ INTENT_SHARE /* = new INTENT_SHARE(null) */,
        /*public static final*/ INTENT_UNKNOWN /* = new INTENT_UNKNOWN(null) */,
        /*public static final*/ LANG_VARIANT_DIALOG /* = new LANG_VARIANT_DIALOG(null) */,
        /*public static final*/ LEAD_IMAGE /* = new LEAD_IMAGE(null) */,
        /*public static final*/ LINK_PREVIEW_MENU /* = new LINK_PREVIEW_MENU(null) */,
        /*public static final*/ MAIN_ACTIVITY /* = new MAIN_ACTIVITY(null) */,
        /*public static final*/ MOST_READ_ACTIVITY /* = new MOST_READ_ACTIVITY(null) */,
        /*public static final*/ NAV_MENU /* = new NAV_MENU(null) */,
        /*public static final*/ NEWS_ACTIVITY /* = new NEWS_ACTIVITY(null) */,
        /*public static final*/ NOTIFICATION /* = new NOTIFICATION(null) */,
        /*public static final*/ ON_THIS_DAY_ACTIVITY /* = new ON_THIS_DAY_ACTIVITY(null) */,
        /*public static final*/ ON_THIS_DAY_CARD_BODY /* = new ON_THIS_DAY_CARD_BODY(null) */,
        /*public static final*/ ON_THIS_DAY_CARD_FOOTER /* = new ON_THIS_DAY_CARD_FOOTER(null) */,
        /*public static final*/ ON_THIS_DAY_CARD_YEAR /* = new ON_THIS_DAY_CARD_YEAR(null) */,
        /*public static final*/ ONBOARDING_DIALOG /* = new ONBOARDING_DIALOG(null) */,
        /*public static final*/ PAGE_ACTION_TAB /* = new PAGE_ACTION_TAB(null) */,
        /*public static final*/ PAGE_ACTIVITY /* = new PAGE_ACTIVITY(null) */,
        /*public static final*/ PAGE_OVERFLOW_MENU /* = new PAGE_OVERFLOW_MENU(null) */,
        /*public static final*/ RANDOM_ACTIVITY /* = new RANDOM_ACTIVITY(null) */,
        /*public static final*/ READ_MORE_BOOKMARK_BUTTON /* = new READ_MORE_BOOKMARK_BUTTON(null) */,
        /*public static final*/ READING_LIST_ACTIVITY /* = new READING_LIST_ACTIVITY(null) */,
        /*public static final*/ SEARCH /* = new SEARCH(null) */,
        /*public static final*/ SETTINGS /* = new SETTINGS(null) */,
        /*public static final*/ SNACKBAR_ACTION /* = new SNACKBAR_ACTION(null) */,
        /*public static final*/ SUGGESTED_EDITS /* = new SUGGESTED_EDITS(null) */,
        /*public static final*/ TABS_ACTIVITY /* = new TABS_ACTIVITY(null) */,
        /*public static final*/ TALK_ACTIVITY /* = new TALK_ACTIVITY(null) */,
        /*public static final*/ TOOLBAR /* = new TOOLBAR(null) */,
        /*public static final*/ VOICE /* = new VOICE(null) */,
        /*public static final*/ WATCHLIST_ACTIVITY /* = new WATCHLIST_ACTIVITY(null) */,
        /*public static final*/ WIDGET /* = new WIDGET(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        InvokeSource(java.lang.String value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/Constants$ImageEditType;", "", "name", "", "(Ljava/lang/String;ILjava/lang/String;)V", "ADD_CAPTION", "ADD_CAPTION_TRANSLATION", "ADD_TAGS", "app_alphaDebug"})
    public static enum ImageEditType {
        /*public static final*/ ADD_CAPTION /* = new ADD_CAPTION(null) */,
        /*public static final*/ ADD_CAPTION_TRANSLATION /* = new ADD_CAPTION_TRANSLATION(null) */,
        /*public static final*/ ADD_TAGS /* = new ADD_TAGS(null) */;
        
        ImageEditType(java.lang.String name) {
        }
    }
}
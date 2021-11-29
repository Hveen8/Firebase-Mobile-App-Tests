package org.wikipedia.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/settings/DeveloperSettingsPreferenceLoader;", "Lorg/wikipedia/settings/BasePreferenceLoader;", "fragment", "Landroidx/preference/PreferenceFragmentCompat;", "(Landroidx/preference/PreferenceFragmentCompat;)V", "setMediaWikiBaseUriChangeListener", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "setMediaWikiMultiLangSupportChangeListener", "createTestReadingList", "", "listName", "", "numOfLists", "", "numOfArticles", "deleteTestReadingList", "isEmptyOrZero", "", "newValue", "", "loadPreferences", "resetMediaWikiSettings", "setUpMediaWikiSettings", "Companion", "TestException", "app_alphaDebug"})
public final class DeveloperSettingsPreferenceLoader extends org.wikipedia.settings.BasePreferenceLoader {
    private final androidx.preference.Preference.OnPreferenceChangeListener setMediaWikiBaseUriChangeListener = null;
    private final androidx.preference.Preference.OnPreferenceChangeListener setMediaWikiMultiLangSupportChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.DeveloperSettingsPreferenceLoader.Companion Companion = null;
    private static final java.lang.String TEXT_OF_TEST_READING_LIST = "Test reading list";
    private static final java.lang.String TEXT_OF_READING_LIST = "Reading list";
    
    public DeveloperSettingsPreferenceLoader(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat fragment) {
        super(null);
    }
    
    @java.lang.Override()
    public void loadPreferences() {
    }
    
    private final void setUpMediaWikiSettings() {
    }
    
    private final void resetMediaWikiSettings() {
    }
    
    private final void createTestReadingList(java.lang.String listName, int numOfLists, int numOfArticles) {
    }
    
    private final void deleteTestReadingList(java.lang.String listName, int numOfLists) {
    }
    
    private final boolean isEmptyOrZero(java.lang.Object newValue) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/settings/DeveloperSettingsPreferenceLoader$TestException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "app_alphaDebug"})
    static final class TestException extends java.lang.RuntimeException {
        
        public TestException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/settings/DeveloperSettingsPreferenceLoader$Companion;", "", "()V", "TEXT_OF_READING_LIST", "", "TEXT_OF_TEST_READING_LIST", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
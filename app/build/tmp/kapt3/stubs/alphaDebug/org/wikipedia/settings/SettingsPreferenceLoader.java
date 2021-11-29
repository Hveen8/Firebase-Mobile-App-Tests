package org.wikipedia.settings;

import java.lang.System;

/**
 * UI code for app settings used by PreferenceFragment.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/settings/SettingsPreferenceLoader;", "Lorg/wikipedia/settings/BasePreferenceLoader;", "fragment", "Landroidx/preference/PreferenceFragmentCompat;", "(Landroidx/preference/PreferenceFragmentCompat;)V", "loadPreferences", "", "updateLanguagePrefSummary", "updateSyncReadingListsPrefSummary", "DeleteRemoteListsYesListener", "SyncReadingListsListener", "app_alphaDebug"})
public final class SettingsPreferenceLoader extends org.wikipedia.settings.BasePreferenceLoader {
    
    public SettingsPreferenceLoader(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat fragment) {
        super(null);
    }
    
    @java.lang.Override()
    public void loadPreferences() {
    }
    
    public final void updateLanguagePrefSummary() {
    }
    
    public final void updateSyncReadingListsPrefSummary() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/settings/SettingsPreferenceLoader$SyncReadingListsListener;", "Landroidx/preference/Preference$OnPreferenceChangeListener;", "(Lorg/wikipedia/settings/SettingsPreferenceLoader;)V", "onPreferenceChange", "", "preference", "Landroidx/preference/Preference;", "newValue", "", "app_alphaDebug"})
    final class SyncReadingListsListener implements androidx.preference.Preference.OnPreferenceChangeListener {
        
        public SyncReadingListsListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onPreferenceChange(@org.jetbrains.annotations.NotNull()
        androidx.preference.Preference preference, @org.jetbrains.annotations.NotNull()
        java.lang.Object newValue) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/settings/SettingsPreferenceLoader$DeleteRemoteListsYesListener;", "Landroid/content/DialogInterface$OnClickListener;", "preference", "Landroidx/preference/Preference;", "(Lorg/wikipedia/settings/SettingsPreferenceLoader;Landroidx/preference/Preference;)V", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "app_alphaDebug"})
    final class DeleteRemoteListsYesListener implements android.content.DialogInterface.OnClickListener {
        private final androidx.preference.Preference preference = null;
        
        public DeleteRemoteListsYesListener(@org.jetbrains.annotations.NotNull()
        androidx.preference.Preference preference) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.content.DialogInterface dialog, int which) {
        }
    }
}
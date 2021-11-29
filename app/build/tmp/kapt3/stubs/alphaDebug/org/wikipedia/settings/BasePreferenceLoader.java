package org.wikipedia.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\fH\u0004R\u0014\u0010\u0005\u001a\u00020\u00068DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/settings/BasePreferenceLoader;", "Lorg/wikipedia/settings/PreferenceLoader;", "preferenceHost", "Landroidx/preference/PreferenceFragmentCompat;", "(Landroidx/preference/PreferenceFragmentCompat;)V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "findPreference", "Landroidx/preference/Preference;", "key", "", "loadPreferences", "", "id", "app_alphaDebug"})
public abstract class BasePreferenceLoader implements org.wikipedia.settings.PreferenceLoader {
    private final androidx.preference.PreferenceFragmentCompat preferenceHost = null;
    
    public BasePreferenceLoader(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat preferenceHost) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.preference.Preference findPreference(@androidx.annotation.StringRes()
    int key) {
        return null;
    }
    
    protected final void loadPreferences(@androidx.annotation.XmlRes()
    int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.app.Activity getActivity() {
        return null;
    }
}
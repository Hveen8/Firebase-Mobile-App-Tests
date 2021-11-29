package org.wikipedia.analytics;

import java.lang.System;

/**
 * To test the Google Play Install Referrer functionality:
 *
 * - Make sure the app is uninstalled.
 * - Launch the Play Store via the usual specially crafted campaign link, such as:
 * https://play.google.com/store/apps/details?id=org.wikipedia&referrer=utm_source%3Dtest_source%26utm_medium%3Dtest_medium%26utm_term%3Dtest-term%26utm_content%3Dtest_content%26utm_campaign%3Dtest_name
 *
 * - ...But do NOT click the "install" button in the Play Store to install the app.
 * - Launch or debug the app in the usual way.
 * - The Install Referrer service should work, and will pass through the correct referrer.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/analytics/InstallReferrerListener;", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "()V", "referrerClient", "Lcom/android/installreferrer/api/InstallReferrerClient;", "onInstallReferrerServiceDisconnected", "", "onInstallReferrerSetupFinished", "responseCode", "", "openPageFromUrl", "context", "Landroid/content/Context;", "url", "", "processInstallReferrer", "queryReferrer", "Companion", "app_alphaDebug"})
public final class InstallReferrerListener implements com.android.installreferrer.api.InstallReferrerStateListener {
    private com.android.installreferrer.api.InstallReferrerClient referrerClient;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.InstallReferrerListener.Companion Companion = null;
    private static org.wikipedia.analytics.InstallReferrerListener INSTANCE;
    
    public InstallReferrerListener() {
        super();
    }
    
    private final void queryReferrer(android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onInstallReferrerSetupFinished(int responseCode) {
    }
    
    @java.lang.Override()
    public void onInstallReferrerServiceDisconnected() {
    }
    
    /**
     * Receives a referrer string from the Play Store app upon first launch after the app has been
     * installed. If the original link that led the user to the Play Store for installing
     * the app contained a "referrer" query parameter, then the contents of this parameter
     * will be passed to this receiver.
     *
     * The structure for the "referrer" parameter shall be as follows:
     *
     * referrer_url=foo&utm_medium=bar&utm_campaign=baz&utm_source=baz
     *
     * referrer_url: the original url from which the link was clicked.
     * utm_medium: the "medium" from which this install came, e.g. "sitenotice"
     * utm_campaign: name of the campaign from which this install came, e.g. "fundraising2017"
     * utm_source: name of the specific source in the campaign from which this install came, e.g. "popup1"
     *
     * The string containing all of the above parameters is then Urlencoded and passed as the
     * "referrer" parameter in the real URL that leads to the Play Store, which then gets passed
     * down to the app when it's installed.
     */
    private final void processInstallReferrer() {
    }
    
    private final void openPageFromUrl(android.content.Context context, java.lang.String url) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void newInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/analytics/InstallReferrerListener$Companion;", "", "()V", "INSTANCE", "Lorg/wikipedia/analytics/InstallReferrerListener;", "newInstance", "", "context", "Landroid/content/Context;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}
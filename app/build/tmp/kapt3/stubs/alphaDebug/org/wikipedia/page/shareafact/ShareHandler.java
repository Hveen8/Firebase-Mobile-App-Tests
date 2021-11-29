package org.wikipedia.page.shareafact;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0002J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/page/shareafact/ShareHandler;", "", "fragment", "Lorg/wikipedia/page/PageFragment;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "(Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/bridge/CommunicationBridge;)V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/ShareAFactFunnel;", "webViewActionMode", "Landroid/view/ActionMode;", "createFunnel", "", "dispose", "finishActionMode", "onEditHerePayload", "sectionID", "", "text", "", "isEditingDescription", "", "onTextSelected", "mode", "shouldEnableWiktionaryDialog", "showWiktionaryDefinition", "Companion", "RequestTextSelectOnMenuItemClickListener", "app_alphaDebug"})
public final class ShareHandler {
    private final org.wikipedia.page.PageFragment fragment = null;
    private final org.wikipedia.bridge.CommunicationBridge bridge = null;
    private android.view.ActionMode webViewActionMode;
    private org.wikipedia.analytics.ShareAFactFunnel funnel;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.shareafact.ShareHandler.Companion Companion = null;
    private static final java.lang.String PAYLOAD_PURPOSE_DEFINE = "define";
    private static final java.lang.String PAYLOAD_PURPOSE_EDIT_HERE = "edit_here";
    private static final java.lang.String PAYLOAD_TEXT_KEY = "text";
    
    public ShareHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge bridge) {
        super();
    }
    
    private final void createFunnel() {
    }
    
    private final void onEditHerePayload(int sectionID, java.lang.String text, boolean isEditingDescription) {
    }
    
    private final void finishActionMode() {
    }
    
    public final void dispose() {
    }
    
    public final void showWiktionaryDefinition(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void onTextSelected(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    public final boolean shouldEnableWiktionaryDialog() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/page/shareafact/ShareHandler$RequestTextSelectOnMenuItemClickListener;", "Landroid/view/MenuItem$OnMenuItemClickListener;", "purpose", "", "(Lorg/wikipedia/page/shareafact/ShareHandler;Ljava/lang/String;)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_alphaDebug"})
    final class RequestTextSelectOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        private final java.lang.String purpose = null;
        
        public RequestTextSelectOnMenuItemClickListener(@org.jetbrains.annotations.NotNull()
        java.lang.String purpose) {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/shareafact/ShareHandler$Companion;", "", "()V", "PAYLOAD_PURPOSE_DEFINE", "", "PAYLOAD_PURPOSE_EDIT_HERE", "PAYLOAD_TEXT_KEY", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
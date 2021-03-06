package org.wikipedia.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/edit/EditHandler;", "Lorg/wikipedia/bridge/CommunicationBridge$JSEventListener;", "fragment", "Lorg/wikipedia/page/PageFragment;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "(Lorg/wikipedia/page/PageFragment;Lorg/wikipedia/bridge/CommunicationBridge;)V", "currentPage", "Lorg/wikipedia/page/Page;", "onMessage", "", "messageType", "", "messagePayload", "Lkotlinx/serialization/json/JsonObject;", "setPage", "page", "startEditingSection", "sectionID", "", "highlightText", "Companion", "EditMenuClickListener", "app_alphaDebug"})
public final class EditHandler implements org.wikipedia.bridge.CommunicationBridge.JSEventListener {
    private final org.wikipedia.page.PageFragment fragment = null;
    private org.wikipedia.page.Page currentPage;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.edit.EditHandler.Companion Companion = null;
    private static final java.lang.String TYPE_EDIT_SECTION = "edit_section";
    private static final java.lang.String TYPE_ADD_TITLE_DESCRIPTION = "add_title_description";
    private static final java.lang.String PAYLOAD_SECTION_ID = "sectionId";
    public static final int RESULT_REFRESH_PAGE = 1;
    
    public EditHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageFragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.bridge.CommunicationBridge bridge) {
        super();
    }
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String messageType, @org.jetbrains.annotations.Nullable()
    kotlinx.serialization.json.JsonObject messagePayload) {
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable()
    org.wikipedia.page.Page page) {
    }
    
    public final void startEditingSection(int sectionID, @org.jetbrains.annotations.Nullable()
    java.lang.String highlightText) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/edit/EditHandler$EditMenuClickListener;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "(Lorg/wikipedia/edit/EditHandler;)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_alphaDebug"})
    final class EditMenuClickListener implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
        
        public EditMenuClickListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/edit/EditHandler$Companion;", "", "()V", "PAYLOAD_SECTION_ID", "", "RESULT_REFRESH_PAGE", "", "TYPE_ADD_TITLE_DESCRIPTION", "TYPE_EDIT_SECTION", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
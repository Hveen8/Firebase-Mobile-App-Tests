package org.wikipedia.appshortcuts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/appshortcuts/AppShortcuts;", "", "()V", "Companion", "app_alphaDebug"})
public final class AppShortcuts {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.appshortcuts.AppShortcuts.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_APP_SHORTCUT = "ACTION_APP_SHORTCUT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APP_SHORTCUT_ID = "APP_SHORTCUT_ID";
    private static final java.lang.String APP_SHORTCUT_ID_CONTINUE_READING = "shortcutContinueReading";
    private static final java.lang.String APP_SHORTCUT_ID_RANDOM = "shortcutRandom";
    private static final java.lang.String APP_SHORTCUT_ID_SEARCH = "shortcutSearch";
    
    public AppShortcuts() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setShortcuts(@org.jetbrains.annotations.NotNull()
    android.content.Context app) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/appshortcuts/AppShortcuts$Companion;", "", "()V", "ACTION_APP_SHORTCUT", "", "APP_SHORTCUT_ID", "APP_SHORTCUT_ID_CONTINUE_READING", "APP_SHORTCUT_ID_RANDOM", "APP_SHORTCUT_ID_SEARCH", "continueReadingShortcut", "Landroidx/core/content/pm/ShortcutInfoCompat;", "app", "Landroid/content/Context;", "randomShortcut", "searchShortcut", "setShortcuts", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void setShortcuts(@org.jetbrains.annotations.NotNull()
        android.content.Context app) {
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat searchShortcut(android.content.Context app) {
            return null;
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat randomShortcut(android.content.Context app) {
            return null;
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat continueReadingShortcut(android.content.Context app) {
            return null;
        }
    }
}
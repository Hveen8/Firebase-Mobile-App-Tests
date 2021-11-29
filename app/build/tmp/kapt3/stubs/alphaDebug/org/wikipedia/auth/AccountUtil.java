package org.wikipedia.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0005H\u0007J\u0018\u0010&\u001a\u00020\f2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007J\u0018\u0010\'\u001a\u00020(2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0015H\u0007J\b\u0010*\u001a\u00020(H\u0007J\u0010\u0010+\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010,\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u001a\u0010-\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0007R6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\f8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000b\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R<\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00148B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0012\u00a8\u00062"}, d2 = {"Lorg/wikipedia/auth/AccountUtil;", "", "()V", "groups", "", "", "getGroups$annotations", "getGroups", "()Ljava/util/Set;", "setGroups", "(Ljava/util/Set;)V", "isLoggedIn", "", "isLoggedIn$annotations", "()Z", "password", "getPassword$annotations", "getPassword", "()Ljava/lang/String;", "ids", "", "", "userIds", "getUserIds", "()Ljava/util/Map;", "setUserIds", "(Ljava/util/Map;)V", "userName", "getUserName$annotations", "getUserName", "account", "Landroid/accounts/Account;", "accountManager", "Landroid/accounts/AccountManager;", "accountType", "createAccount", "getUserIdForLanguage", "code", "isMemberOf", "putUserIdForLanguage", "", "id", "removeAccount", "setPassword", "supported", "updateAccount", "response", "Landroid/accounts/AccountAuthenticatorResponse;", "result", "Lorg/wikipedia/login/LoginResult;", "app_alphaDebug"})
public final class AccountUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.auth.AccountUtil INSTANCE = null;
    
    private AccountUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void updateAccount(@org.jetbrains.annotations.Nullable()
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.NotNull()
    org.wikipedia.login.LoginResult result) {
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void isLoggedIn$annotations() {
    }
    
    public static final boolean isLoggedIn() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getUserName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getUserName() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getPassword$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getPassword() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int getUserIdForLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void putUserIdForLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String code, int id) {
    }
    
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static void getGroups$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<java.lang.String> getGroups() {
        return null;
    }
    
    public static final void setGroups(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isMemberOf(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> groups) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void removeAccount() {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean supported(@org.jetbrains.annotations.NotNull()
    android.accounts.Account account) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final android.accounts.Account account() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String accountType() {
        return null;
    }
    
    private final boolean createAccount(java.lang.String userName, java.lang.String password) {
        return false;
    }
    
    private final void setPassword(java.lang.String password) {
    }
    
    private final java.util.Map<java.lang.String, java.lang.Integer> getUserIds() {
        return null;
    }
    
    private final void setUserIds(java.util.Map<java.lang.String, java.lang.Integer> ids) {
    }
    
    private final android.accounts.AccountManager accountManager() {
        return null;
    }
}
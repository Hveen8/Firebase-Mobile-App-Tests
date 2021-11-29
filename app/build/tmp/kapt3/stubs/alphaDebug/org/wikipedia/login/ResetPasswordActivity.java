package org.wikipedia.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\rH\u0014J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/login/ResetPasswordActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "Lorg/wikipedia/databinding/ActivityResetPasswordBinding;", "firstStepToken", "", "loginCallback", "Lorg/wikipedia/login/ResetPasswordActivity$LoginCallback;", "loginClient", "Lorg/wikipedia/login/LoginClient;", "userName", "clearErrors", "", "doLogin", "getText", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStop", "showError", "caught", "", "showProgressBar", "enable", "", "validateThenLogin", "Companion", "LoginCallback", "app_alphaDebug"})
public final class ResetPasswordActivity extends org.wikipedia.activity.BaseActivity {
    private org.wikipedia.databinding.ActivityResetPasswordBinding binding;
    private java.lang.String firstStepToken;
    private java.lang.String userName;
    private org.wikipedia.login.LoginClient loginClient;
    private final org.wikipedia.login.ResetPasswordActivity.LoginCallback loginCallback = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.login.ResetPasswordActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_USER_NAME = "userName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_TOKEN = "token";
    
    public ResetPasswordActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void clearErrors() {
    }
    
    private final void validateThenLogin() {
    }
    
    private final java.lang.String getText(com.google.android.material.textfield.TextInputLayout input) {
        return null;
    }
    
    private final void doLogin() {
    }
    
    private final void showProgressBar(boolean enable) {
    }
    
    private final void showError(java.lang.Throwable caught) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/login/ResetPasswordActivity$LoginCallback;", "Lorg/wikipedia/login/LoginClient$LoginCallback;", "(Lorg/wikipedia/login/ResetPasswordActivity;)V", "error", "", "caught", "", "passwordResetPrompt", "token", "", "success", "result", "Lorg/wikipedia/login/LoginResult;", "twoFactorPrompt", "app_alphaDebug"})
    final class LoginCallback implements org.wikipedia.login.LoginClient.LoginCallback {
        
        public LoginCallback() {
            super();
        }
        
        @java.lang.Override()
        public void success(@org.jetbrains.annotations.NotNull()
        org.wikipedia.login.LoginResult result) {
        }
        
        @java.lang.Override()
        public void twoFactorPrompt(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught, @org.jetbrains.annotations.Nullable()
        java.lang.String token) {
        }
        
        @java.lang.Override()
        public void passwordResetPrompt(@org.jetbrains.annotations.Nullable()
        java.lang.String token) {
        }
        
        @java.lang.Override()
        public void error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/login/ResetPasswordActivity$Companion;", "", "()V", "LOGIN_TOKEN", "", "LOGIN_USER_NAME", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "userName", "token", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String userName, @org.jetbrains.annotations.Nullable()
        java.lang.String token) {
            return null;
        }
    }
}
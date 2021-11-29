package org.wikipedia.createaccount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0003/01B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0019J\b\u0010!\u001a\u00020\bH\u0016J\u0012\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010\'\u001a\u00020\bH\u0002J\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "binding", "Lorg/wikipedia/databinding/ActivityCreateAccountBinding;", "captchaHandler", "Lorg/wikipedia/captcha/CaptchaHandler;", "createAccountInfo", "", "getCreateAccountInfo", "()Lkotlin/Unit;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/CreateAccountFunnel;", "userNameTextWatcher", "Landroid/text/TextWatcher;", "userNameVerifyRunnable", "Lorg/wikipedia/createaccount/CreateAccountActivity$UserNameVerifyRunnable;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "clearErrors", "createAccount", "doCreateAccount", "token", "", "finishWithUserResult", "userName", "getText", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "handleAccountCreationError", "message", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStop", "setClickListeners", "showError", "caught", "", "showProgressBar", "enable", "", "validateThenCreateAccount", "Companion", "UserNameVerifyRunnable", "ValidateResult", "app_alphaDebug"})
public final class CreateAccountActivity extends org.wikipedia.activity.BaseActivity {
    private org.wikipedia.databinding.ActivityCreateAccountBinding binding;
    private org.wikipedia.captcha.CaptchaHandler captchaHandler;
    private org.wikipedia.analytics.CreateAccountFunnel funnel;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private org.wikipedia.dataclient.WikiSite wiki;
    private android.text.TextWatcher userNameTextWatcher;
    private final org.wikipedia.createaccount.CreateAccountActivity.UserNameVerifyRunnable userNameVerifyRunnable = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.createaccount.CreateAccountActivity.Companion Companion = null;
    private static final int PASSWORD_MIN_LENGTH = 8;
    public static final int RESULT_ACCOUNT_CREATED = 1;
    public static final int RESULT_ACCOUNT_NOT_CREATED = 2;
    public static final int RESULT_ACCOUNT_LOGIN = 3;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_REQUEST_SOURCE = "login_request_source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_SESSION_TOKEN = "login_session_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_ACCOUNT_RESULT_USERNAME = "username";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CREATE_ACCOUNT_RESULT_PASSWORD = "password";
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final java.util.regex.Pattern USERNAME_PATTERN = null;
    
    public CreateAccountActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setClickListeners() {
    }
    
    public final void handleAccountCreationError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final kotlin.Unit getCreateAccountInfo() {
        return null;
    }
    
    private final void doCreateAccount(java.lang.String token) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void clearErrors() {
    }
    
    private final void validateThenCreateAccount() {
    }
    
    private final void createAccount() {
    }
    
    private final java.lang.String getText(com.google.android.material.textfield.TextInputLayout input) {
        return null;
    }
    
    private final void finishWithUserResult(java.lang.String userName) {
    }
    
    private final void showProgressBar(boolean enable) {
    }
    
    private final void showError(java.lang.Throwable caught) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.createaccount.CreateAccountActivity.ValidateResult validateInput(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence username, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence password, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence passwordRepeat, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence email) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivity$ValidateResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "INVALID_USERNAME", "PASSWORD_TOO_SHORT", "PASSWORD_MISMATCH", "NO_EMAIL", "INVALID_EMAIL", "app_alphaDebug"})
    public static enum ValidateResult {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ INVALID_USERNAME /* = new INVALID_USERNAME() */,
        /*public static final*/ PASSWORD_TOO_SHORT /* = new PASSWORD_TOO_SHORT() */,
        /*public static final*/ PASSWORD_MISMATCH /* = new PASSWORD_MISMATCH() */,
        /*public static final*/ NO_EMAIL /* = new NO_EMAIL() */,
        /*public static final*/ INVALID_EMAIL /* = new INVALID_EMAIL() */;
        
        ValidateResult() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivity$UserNameVerifyRunnable;", "Ljava/lang/Runnable;", "(Lorg/wikipedia/createaccount/CreateAccountActivity;)V", "userName", "", "run", "", "setUserName", "app_alphaDebug"})
    final class UserNameVerifyRunnable implements java.lang.Runnable {
        private java.lang.String userName;
        
        public UserNameVerifyRunnable() {
            super();
        }
        
        public final void setUserName(@org.jetbrains.annotations.NotNull()
        java.lang.String userName) {
        }
        
        @java.lang.Override()
        public void run() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/createaccount/CreateAccountActivity$Companion;", "", "()V", "CREATE_ACCOUNT_RESULT_PASSWORD", "", "CREATE_ACCOUNT_RESULT_USERNAME", "LOGIN_REQUEST_SOURCE", "LOGIN_SESSION_TOKEN", "PASSWORD_MIN_LENGTH", "", "RESULT_ACCOUNT_CREATED", "RESULT_ACCOUNT_LOGIN", "RESULT_ACCOUNT_NOT_CREATED", "USERNAME_PATTERN", "Ljava/util/regex/Pattern;", "validateInput", "Lorg/wikipedia/createaccount/CreateAccountActivity$ValidateResult;", "username", "", "password", "passwordRepeat", "email", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.wikipedia.createaccount.CreateAccountActivity.ValidateResult validateInput(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence username, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence password, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence passwordRepeat, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence email) {
            return null;
        }
    }
}
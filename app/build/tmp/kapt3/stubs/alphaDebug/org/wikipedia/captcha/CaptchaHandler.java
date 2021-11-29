package org.wikipedia.captcha;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0014H\u0002J\u0018\u0010 \u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/captcha/CaptchaHandler;", "", "activity", "Landroid/app/Activity;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "captchaView", "Landroid/view/View;", "primaryView", "prevTitle", "", "submitButtonText", "(Landroid/app/Activity;Lorg/wikipedia/dataclient/WikiSite;Landroid/view/View;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "binding", "Lorg/wikipedia/databinding/GroupCaptchaBinding;", "captchaResult", "Lorg/wikipedia/captcha/CaptchaResult;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isActive", "", "()Z", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "cancelCaptcha", "", "captchaId", "captchaWord", "dispose", "handleCaptcha", "isReload", "hideCaptcha", "requestNewCaptcha", "app_alphaDebug"})
public final class CaptchaHandler {
    private final android.app.Activity activity = null;
    private final org.wikipedia.dataclient.WikiSite wiki = null;
    private final android.view.View primaryView = null;
    private final java.lang.String prevTitle = null;
    private final org.wikipedia.databinding.GroupCaptchaBinding binding = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private org.wikipedia.captcha.CaptchaResult captchaResult;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String token;
    
    public CaptchaHandler(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    android.view.View captchaView, @org.jetbrains.annotations.NotNull()
    android.view.View primaryView, @org.jetbrains.annotations.NotNull()
    java.lang.String prevTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String submitButtonText) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String captchaId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String captchaWord() {
        return null;
    }
    
    public final void dispose() {
    }
    
    public final void handleCaptcha(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    org.wikipedia.captcha.CaptchaResult captchaResult) {
    }
    
    public final void requestNewCaptcha() {
    }
    
    private final void handleCaptcha(boolean isReload) {
    }
    
    public final void hideCaptcha() {
    }
    
    public final void cancelCaptcha() {
    }
}
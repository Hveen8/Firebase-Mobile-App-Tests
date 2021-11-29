package org.wikipedia.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/push/WikipediaFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "Companion", "app_alphaDebug"})
public final class WikipediaFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.push.WikipediaFirebaseMessagingService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_TYPE_CHECK_ECHO = "checkEchoV1";
    private static final int SUBSCRIBE_RETRY_COUNT = 5;
    private static final int UNSUBSCRIBE_RETRY_COUNT = 3;
    private static io.reactivex.rxjava3.disposables.CompositeDisposable csrfDisposables;
    
    public WikipediaFirebaseMessagingService() {
        super();
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/push/WikipediaFirebaseMessagingService$Companion;", "", "()V", "MESSAGE_TYPE_CHECK_ECHO", "", "SUBSCRIBE_RETRY_COUNT", "", "UNSUBSCRIBE_RETRY_COUNT", "csrfDisposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isUsingPush", "", "setNotificationOptions", "", "lang", "csrfToken", "subscribeWithCsrf", "unsubscribePushToken", "Lio/reactivex/rxjava3/core/Observable;", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse;", "pushToken", "updateSubscription", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isUsingPush() {
            return false;
        }
        
        public final void updateSubscription() {
        }
        
        private final void subscribeWithCsrf(java.lang.String csrfToken) {
        }
        
        private final void setNotificationOptions(java.lang.String lang, java.lang.String csrfToken) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> unsubscribePushToken(@org.jetbrains.annotations.NotNull()
        java.lang.String csrfToken, @org.jetbrains.annotations.NotNull()
        java.lang.String pushToken) {
            return null;
        }
    }
}
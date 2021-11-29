package org.wikipedia.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002JD\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002JD\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010J&\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/login/LoginClient;", "", "()V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "cancel", "", "getExtendedInfo", "Lio/reactivex/rxjava3/core/Observable;", "Lorg/wikipedia/login/LoginResult;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "loginResult", "getLoginResponse", "Lorg/wikipedia/login/LoginClient$LoginResponse;", "userName", "", "password", "retypedPassword", "twoFactorCode", "loginToken", "getLoginToken", "login", "cb", "Lorg/wikipedia/login/LoginClient$LoginCallback;", "loginBlocking", "request", "LoginCallback", "LoginFailedException", "LoginResponse", "app_alphaDebug"})
public final class LoginClient {
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    
    public LoginClient() {
        super();
    }
    
    public final void request(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    org.wikipedia.login.LoginClient.LoginCallback cb) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String retypedPassword, @org.jetbrains.annotations.Nullable()
    java.lang.String twoFactorCode, @org.jetbrains.annotations.Nullable()
    java.lang.String loginToken, @org.jetbrains.annotations.NotNull()
    org.wikipedia.login.LoginClient.LoginCallback cb) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<org.wikipedia.login.LoginClient.LoginResponse> loginBlocking(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String twoFactorCode) {
        return null;
    }
    
    private final io.reactivex.rxjava3.core.Observable<java.lang.String> getLoginToken(org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
    
    private final io.reactivex.rxjava3.core.Observable<org.wikipedia.login.LoginClient.LoginResponse> getLoginResponse(org.wikipedia.dataclient.WikiSite wiki, java.lang.String userName, java.lang.String password, java.lang.String retypedPassword, java.lang.String twoFactorCode, java.lang.String loginToken) {
        return null;
    }
    
    private final io.reactivex.rxjava3.core.Observable<org.wikipedia.login.LoginResult> getExtendedInfo(org.wikipedia.dataclient.WikiSite wiki, org.wikipedia.login.LoginResult loginResult) {
        return null;
    }
    
    public final void cancel() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginCallback;", "", "error", "", "caught", "", "passwordResetPrompt", "token", "", "success", "result", "Lorg/wikipedia/login/LoginResult;", "twoFactorPrompt", "app_alphaDebug"})
    public static abstract interface LoginCallback {
        
        public abstract void success(@org.jetbrains.annotations.NotNull()
        org.wikipedia.login.LoginResult result);
        
        public abstract void twoFactorPrompt(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught, @org.jetbrains.annotations.Nullable()
        java.lang.String token);
        
        public abstract void passwordResetPrompt(@org.jetbrains.annotations.Nullable()
        java.lang.String token);
        
        public abstract void error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable caught);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fBA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rB\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u00c7\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u000e\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginResponse;", "Lorg/wikipedia/dataclient/mwapi/MwResponse;", "seen1", "", "errors", "", "Lorg/wikipedia/dataclient/mwapi/MwServiceError;", "servedBy", "", "clientLogin", "Lorg/wikipedia/login/LoginClient$LoginResponse$ClientLogin;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lorg/wikipedia/login/LoginClient$LoginResponse$ClientLogin;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getClientLogin$annotations", "toLoginResult", "Lorg/wikipedia/login/LoginResult;", "site", "Lorg/wikipedia/dataclient/WikiSite;", "password", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "ClientLogin", "Companion", "Request", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    public static final class LoginResponse extends org.wikipedia.dataclient.mwapi.MwResponse {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.login.LoginClient.LoginResponse.Companion Companion = null;
        private final org.wikipedia.login.LoginClient.LoginResponse.ClientLogin clientLogin = null;
        
        public LoginResponse() {
            super(0, null, null, null);
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.login.LoginClient.LoginResponse self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        @kotlinx.serialization.SerialName(value = "clientlogin")
        @java.lang.Deprecated()
        private static void getClientLogin$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final org.wikipedia.login.LoginResult toLoginResult(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.WikiSite site, @org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dBI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rB\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u00c7\u0001R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginResponse$ClientLogin;", "", "seen1", "", "status", "", "requests", "", "Lorg/wikipedia/login/LoginClient$LoginResponse$Request;", "message", "userName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getUserName$annotations", "toLoginResult", "Lorg/wikipedia/login/LoginResult;", "site", "Lorg/wikipedia/dataclient/WikiSite;", "password", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_alphaDebug"})
        @kotlinx.serialization.Serializable()
        static final class ClientLogin {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.login.LoginClient.LoginResponse.ClientLogin.Companion Companion = null;
            private final java.lang.String status = null;
            private final java.util.List<org.wikipedia.login.LoginClient.LoginResponse.Request> requests = null;
            private final java.lang.String message = null;
            private final java.lang.String userName = null;
            
            public ClientLogin() {
                super();
            }
            
            @kotlin.jvm.JvmStatic()
            public static final void write$Self(@org.jetbrains.annotations.NotNull()
            org.wikipedia.login.LoginClient.LoginResponse.ClientLogin self, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            }
            
            @kotlinx.serialization.SerialName(value = "username")
            @java.lang.Deprecated()
            private static void getUserName$annotations() {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.login.LoginResult toLoginResult(@org.jetbrains.annotations.NotNull()
            org.wikipedia.dataclient.WikiSite site, @org.jetbrains.annotations.NotNull()
            java.lang.String password) {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginResponse$ClientLogin$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/login/LoginClient$LoginResponse$ClientLogin;", "app_alphaDebug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final kotlinx.serialization.KSerializer<org.wikipedia.login.LoginClient.LoginResponse.ClientLogin> serializer() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/login/LoginClient.LoginResponse.ClientLogin.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/login/LoginClient$LoginResponse$ClientLogin;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
            @java.lang.Deprecated()
            public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.login.LoginClient.LoginResponse.ClientLogin> {
                @org.jetbrains.annotations.NotNull()
                public static final org.wikipedia.login.LoginClient.LoginResponse.ClientLogin.$serializer INSTANCE = null;
                
                private $serializer() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public org.wikipedia.login.LoginClient.LoginResponse.ClientLogin deserialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Decoder decoder) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                    return null;
                }
                
                @java.lang.Override()
                public void serialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
                org.wikipedia.login.LoginClient.LoginResponse.ClientLogin value) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\u0005\u00a2\u0006\u0002\u0010\tJ!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u00c7\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginResponse$Request;", "", "seen1", "", "id", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getId", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_alphaDebug"})
        @kotlinx.serialization.Serializable()
        static final class Request {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.login.LoginClient.LoginResponse.Request.Companion Companion = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String id = null;
            
            public Request() {
                super();
            }
            
            @kotlin.jvm.JvmStatic()
            public static final void write$Self(@org.jetbrains.annotations.NotNull()
            org.wikipedia.login.LoginClient.LoginResponse.Request self, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
            kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getId() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginResponse$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/login/LoginClient$LoginResponse$Request;", "app_alphaDebug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final kotlinx.serialization.KSerializer<org.wikipedia.login.LoginClient.LoginResponse.Request> serializer() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/login/LoginClient.LoginResponse.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/login/LoginClient$LoginResponse$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
            @java.lang.Deprecated()
            public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.login.LoginClient.LoginResponse.Request> {
                @org.jetbrains.annotations.NotNull()
                public static final org.wikipedia.login.LoginClient.LoginResponse.Request.$serializer INSTANCE = null;
                
                private $serializer() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public org.wikipedia.login.LoginClient.LoginResponse.Request deserialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Decoder decoder) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                    return null;
                }
                
                @java.lang.Override()
                public void serialize(@org.jetbrains.annotations.NotNull()
                kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
                org.wikipedia.login.LoginClient.LoginResponse.Request value) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/login/LoginClient$LoginResponse;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.login.LoginClient.LoginResponse> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/login/LoginClient.LoginResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/login/LoginClient$LoginResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.login.LoginClient.LoginResponse> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.login.LoginClient.LoginResponse.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public org.wikipedia.login.LoginClient.LoginResponse deserialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override()
            public void serialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
            org.wikipedia.login.LoginClient.LoginResponse value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/login/LoginClient$LoginFailedException;", "", "message", "", "(Ljava/lang/String;)V", "app_alphaDebug"})
    public static final class LoginFailedException extends java.lang.Throwable {
        
        public LoginFailedException(@org.jetbrains.annotations.Nullable()
        java.lang.String message) {
            super(null);
        }
    }
}
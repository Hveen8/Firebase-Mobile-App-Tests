package org.wikipedia.mlkit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/mlkit/MlKitLanguageDetector;", "", "()V", "callback", "Lorg/wikipedia/mlkit/MlKitLanguageDetector$Callback;", "getCallback", "()Lorg/wikipedia/mlkit/MlKitLanguageDetector$Callback;", "setCallback", "(Lorg/wikipedia/mlkit/MlKitLanguageDetector$Callback;)V", "languageIdentifier", "Lcom/google/mlkit/nl/languageid/LanguageIdentifier;", "detectLanguageFromText", "", "text", "", "Callback", "app_alphaDebug"})
public final class MlKitLanguageDetector {
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.mlkit.MlKitLanguageDetector.Callback callback;
    private final com.google.mlkit.nl.languageid.LanguageIdentifier languageIdentifier = null;
    
    public MlKitLanguageDetector() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.mlkit.MlKitLanguageDetector.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.mlkit.MlKitLanguageDetector.Callback p0) {
    }
    
    public final void detectLanguageFromText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/mlkit/MlKitLanguageDetector$Callback;", "", "onLanguageDetectionSuccess", "", "languageCode", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onLanguageDetectionSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String languageCode);
    }
}
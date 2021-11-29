package org.wikipedia.gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/gallery/ImagePipelineBitmapGetter;", "", "imageUrl", "", "(Ljava/lang/String;)V", "get", "", "context", "Landroid/content/Context;", "onSuccess", "bitmap", "Landroid/graphics/Bitmap;", "app_alphaDebug"})
public abstract class ImagePipelineBitmapGetter {
    private final java.lang.String imageUrl = null;
    
    public ImagePipelineBitmapGetter(@org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
        super();
    }
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap);
    
    public final void get(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}
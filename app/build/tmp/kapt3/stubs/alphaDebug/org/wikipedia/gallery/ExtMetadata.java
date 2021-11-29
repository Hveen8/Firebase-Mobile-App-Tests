package org.wikipedia.gallery;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003+,-B\u0085\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010Bq\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0006\u0010\b\u001a\u00020\u001cJ\u0006\u0010\t\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u0006\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010\r\u001a\u00020\u001cJ\u0006\u0010\n\u001a\u00020\u001cJ\u0006\u0010\f\u001a\u00020\u001cJ\u0006\u0010\u0004\u001a\u00020\u001cJ\u0006\u0010\u000b\u001a\u00020\u001cJ!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u00c7\u0001J\u0019\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u00a8\u0006."}, d2 = {"Lorg/wikipedia/gallery/ExtMetadata;", "Landroid/os/Parcelable;", "seen1", "", "objectName", "Lorg/wikipedia/gallery/ExtMetadata$Values;", "imageDescription", "dateTimeOriginal", "artist", "credit", "licenseShortName", "usageTerms", "licenseUrl", "license", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;Lorg/wikipedia/gallery/ExtMetadata$Values;)V", "getArtist$annotations", "()V", "getCredit$annotations", "getDateTimeOriginal$annotations", "getImageDescription$annotations", "getLicense$annotations", "getLicenseShortName$annotations", "getLicenseUrl$annotations", "getObjectName$annotations", "getUsageTerms$annotations", "", "dateTime", "describeContents", "imageDescriptionSource", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "Values", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class ExtMetadata implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.gallery.ExtMetadata.Companion Companion = null;
    private final org.wikipedia.gallery.ExtMetadata.Values objectName = null;
    private final org.wikipedia.gallery.ExtMetadata.Values imageDescription = null;
    private final org.wikipedia.gallery.ExtMetadata.Values dateTimeOriginal = null;
    private final org.wikipedia.gallery.ExtMetadata.Values artist = null;
    private final org.wikipedia.gallery.ExtMetadata.Values credit = null;
    private final org.wikipedia.gallery.ExtMetadata.Values licenseShortName = null;
    private final org.wikipedia.gallery.ExtMetadata.Values usageTerms = null;
    private final org.wikipedia.gallery.ExtMetadata.Values licenseUrl = null;
    private final org.wikipedia.gallery.ExtMetadata.Values license = null;
    public static final android.os.Parcelable.Creator<org.wikipedia.gallery.ExtMetadata> CREATOR = null;
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.gallery.ExtMetadata self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public ExtMetadata() {
        super();
    }
    
    public ExtMetadata(@org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values objectName, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values imageDescription, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values dateTimeOriginal, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values artist, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values credit, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values licenseShortName, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values usageTerms, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values licenseUrl, @org.jetbrains.annotations.Nullable()
    org.wikipedia.gallery.ExtMetadata.Values license) {
        super();
    }
    
    @kotlinx.serialization.SerialName(value = "ObjectName")
    @java.lang.Deprecated()
    private static void getObjectName$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "ImageDescription")
    @java.lang.Deprecated()
    private static void getImageDescription$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "DateTimeOriginal")
    @java.lang.Deprecated()
    private static void getDateTimeOriginal$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "Artist")
    @java.lang.Deprecated()
    private static void getArtist$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "Credit")
    @java.lang.Deprecated()
    private static void getCredit$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "LicenseShortName")
    @java.lang.Deprecated()
    private static void getLicenseShortName$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "UsageTerms")
    @java.lang.Deprecated()
    private static void getUsageTerms$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "LicenseUrl")
    @java.lang.Deprecated()
    private static void getLicenseUrl$annotations() {
    }
    
    @kotlinx.serialization.SerialName(value = "License")
    @java.lang.Deprecated()
    private static void getLicense$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String licenseShortName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String licenseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String license() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String imageDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String imageDescriptionSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String objectName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String usageTerms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String artist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String credit() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.gallery.ExtMetadata> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.gallery.ExtMetadata createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final org.wikipedia.gallery.ExtMetadata[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u00c7\u0001J\u0019\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lorg/wikipedia/gallery/ExtMetadata$Values;", "Landroid/os/Parcelable;", "seen1", "", "value", "", "source", "hidden", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHidden", "()Ljava/lang/String;", "getSource", "getValue", "describeContents", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    public static final class Values implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.gallery.ExtMetadata.Values.Companion Companion = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String source = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String hidden = null;
        public static final android.os.Parcelable.Creator<org.wikipedia.gallery.ExtMetadata.Values> CREATOR = null;
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.gallery.ExtMetadata.Values self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public Values() {
            super();
        }
        
        public Values(@org.jetbrains.annotations.Nullable()
        java.lang.String value, @org.jetbrains.annotations.Nullable()
        java.lang.String source, @org.jetbrains.annotations.Nullable()
        java.lang.String hidden) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSource() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHidden() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<org.wikipedia.gallery.ExtMetadata.Values> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.gallery.ExtMetadata.Values createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final org.wikipedia.gallery.ExtMetadata.Values[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/gallery/ExtMetadata$Values$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/gallery/ExtMetadata$Values;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.gallery.ExtMetadata.Values> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/gallery/ExtMetadata.Values.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/gallery/ExtMetadata$Values;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.gallery.ExtMetadata.Values> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.gallery.ExtMetadata.Values.$serializer INSTANCE = null;
            
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
            public org.wikipedia.gallery.ExtMetadata.Values deserialize(@org.jetbrains.annotations.NotNull()
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
            org.wikipedia.gallery.ExtMetadata.Values value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/gallery/ExtMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/gallery/ExtMetadata;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.gallery.ExtMetadata> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/gallery/ExtMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/gallery/ExtMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.gallery.ExtMetadata> {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.gallery.ExtMetadata.$serializer INSTANCE = null;
        
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
        public org.wikipedia.gallery.ExtMetadata deserialize(@org.jetbrains.annotations.NotNull()
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
        org.wikipedia.gallery.ExtMetadata value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}
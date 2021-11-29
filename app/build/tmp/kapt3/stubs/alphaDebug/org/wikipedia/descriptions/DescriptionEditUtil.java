package org.wikipedia.descriptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditUtil;", "", "()V", "DESCRIPTION_SOURCE_LOCAL", "", "DESCRIPTION_SOURCE_WIKIDATA", "isEditAllowed", "", "page", "Lorg/wikipedia/page/Page;", "app_alphaDebug"})
public final class DescriptionEditUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditUtil INSTANCE = null;
    private static final java.lang.String DESCRIPTION_SOURCE_LOCAL = "local";
    private static final java.lang.String DESCRIPTION_SOURCE_WIKIDATA = "central";
    
    private DescriptionEditUtil() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isEditAllowed(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.Page page) {
        return false;
    }
}
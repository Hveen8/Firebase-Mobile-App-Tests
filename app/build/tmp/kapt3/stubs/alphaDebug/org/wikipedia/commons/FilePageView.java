package org.wikipedia.commons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J,\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002J6\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002J$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J,\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0002J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\u0006\u0010\'\u001a\u00020(H\u0002J(\u0010)\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020 2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002J\u0080\u0001\u0010.\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001c0\u001b2\u0006\u0010\'\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u00152\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00102\u001a\u0004\u0018\u000103R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lorg/wikipedia/commons/FilePageView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewFilePageBinding;", "getBinding", "()Lorg/wikipedia/databinding/ViewFilePageBinding;", "movementMethod", "Lorg/wikipedia/page/LinkMovementMethodExt;", "addActionButton", "", "buttonText", "", "listener", "Landroid/view/View$OnClickListener;", "addDetail", "showDivider", "", "titleString", "detail", "externalLink", "getImageTags", "imageTags", "", "", "languageCode", "getProperLanguageCode", "summary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "imageFromCommons", "imageCaptionOnClickListener", "fragment", "Landroidx/fragment/app/Fragment;", "summaryForEdit", "imageTagsOnClickListener", "page", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "loadImage", "containerWidth", "", "thumbWidth", "thumbHeight", "setup", "showFilename", "showEditButton", "suggestionReason", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "app_alphaDebug"})
public final class FilePageView extends android.widget.LinearLayout {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.databinding.ViewFilePageBinding binding = null;
    private final org.wikipedia.page.LinkMovementMethodExt movementMethod = null;
    
    public FilePageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ViewFilePageBinding getBinding() {
        return null;
    }
    
    public final void setup(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> imageTags, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryPage page, int containerWidth, int thumbWidth, int thumbHeight, boolean imageFromCommons, boolean showFilename, boolean showEditButton, @org.jetbrains.annotations.Nullable()
    java.lang.String suggestionReason, @org.jetbrains.annotations.Nullable()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    private final java.lang.String getImageTags(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> imageTags, java.lang.String languageCode) {
        return null;
    }
    
    private final java.lang.String getProperLanguageCode(org.wikipedia.suggestededits.PageSummaryForEdit summary, boolean imageFromCommons) {
        return null;
    }
    
    private final void loadImage(org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, int containerWidth, int thumbWidth, int thumbHeight) {
    }
    
    private final android.view.View.OnClickListener imageCaptionOnClickListener(androidx.fragment.app.Fragment fragment, org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit) {
        return null;
    }
    
    private final android.view.View.OnClickListener imageTagsOnClickListener(androidx.fragment.app.Fragment fragment, org.wikipedia.dataclient.mwapi.MwQueryPage page) {
        return null;
    }
    
    private final void addDetail(java.lang.String titleString, java.lang.String detail) {
    }
    
    private final void addDetail(java.lang.String titleString, java.lang.String detail, android.view.View.OnClickListener listener) {
    }
    
    private final void addDetail(boolean showDivider, java.lang.String titleString, java.lang.String detail, java.lang.String externalLink) {
    }
    
    private final void addDetail(boolean showDivider, java.lang.String titleString, java.lang.String detail, java.lang.String externalLink, android.view.View.OnClickListener listener) {
    }
    
    private final void addActionButton(java.lang.String buttonText, android.view.View.OnClickListener listener) {
    }
}
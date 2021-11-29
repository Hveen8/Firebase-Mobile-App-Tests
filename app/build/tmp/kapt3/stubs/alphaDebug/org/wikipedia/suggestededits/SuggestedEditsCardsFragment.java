package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0005abcdeB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010,\u001a\u00020\u0017H\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0017H\u0002J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0016J\b\u00104\u001a\u000202H\u0002J\u0012\u00105\u001a\u0002022\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u00107\u001a\u0002022\b\u00108\u001a\u0004\u0018\u000109H\u0016J\"\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0012\u0010@\u001a\u0002022\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0018\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0016J$\u0010F\u001a\u00020G2\u0006\u0010D\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010K\u001a\u000202H\u0016J\u0010\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u000202H\u0016J\b\u0010P\u001a\u000202H\u0016J\u0006\u0010Q\u001a\u000202J\u001a\u0010R\u001a\u0002022\u0006\u0010S\u001a\u00020G2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010T\u001a\u000202H\u0002J\b\u0010U\u001a\u000202H\u0002J\b\u0010V\u001a\u000202H\u0002J\b\u0010W\u001a\u000202H\u0002J\u0010\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\"H\u0002J\n\u0010Z\u001a\u0004\u0018\u00010[H\u0002J\n\u0010\\\u001a\u0004\u0018\u00010]H\u0002J\b\u0010^\u001a\u000202H\u0016J\u0010\u0010_\u001a\u0002022\u0006\u0010`\u001a\u00020<H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u0004\u0018\u00010\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00060+R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006f"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentSuggestedEditsCardsBinding;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "getAction", "()Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "setAction", "(Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;)V", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentSuggestedEditsCardsBinding;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/SuggestedEditsFeedFunnel;", "langFromCode", "", "getLangFromCode", "()Ljava/lang/String;", "setLangFromCode", "(Ljava/lang/String;)V", "langToCode", "getLangToCode", "setLangToCode", "languageList", "", "resettingViewPager", "", "siteMatrix", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix;", "swappingLanguageSpinners", "topTitle", "Lorg/wikipedia/page/PageTitle;", "getTopTitle", "()Lorg/wikipedia/page/PageTitle;", "viewPagerListener", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$ViewPagerListener;", "getLangCode", "getLanguageLocalName", "code", "getSinglePage", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage;", "initLanguageSpinners", "", "logSuccess", "maybeShowOnboarding", "nextPage", "sourceFragment", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onSelectPage", "onViewCreated", "view", "previousPage", "requestLanguagesAndBuildSpinner", "resetViewPagerItemAdapter", "setInitialUiState", "swapLanguageSpinnerSelection", "isFromLang", "topBaseChild", "Lorg/wikipedia/suggestededits/SuggestedEditsItemFragment;", "topChild", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsItemFragment;", "updateActionButton", "updateBackButton", "pagerPosition", "Companion", "OnFromSpinnerItemSelectedListener", "OnToSpinnerItemSelectedListener", "ViewPagerAdapter", "ViewPagerListener", "app_alphaDebug"})
public final class SuggestedEditsCardsFragment extends androidx.fragment.app.Fragment implements org.wikipedia.suggestededits.SuggestedEditsItemFragment.Callback {
    private org.wikipedia.databinding.FragmentSuggestedEditsCardsBinding _binding;
    private final org.wikipedia.suggestededits.SuggestedEditsCardsFragment.ViewPagerListener viewPagerListener = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final org.wikipedia.WikipediaApp app = null;
    private org.wikipedia.dataclient.mwapi.SiteMatrix siteMatrix;
    private java.util.List<java.lang.String> languageList;
    private boolean swappingLanguageSpinners = false;
    private boolean resettingViewPager = false;
    private org.wikipedia.analytics.SuggestedEditsFeedFunnel funnel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String langFromCode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String langToCode;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.descriptions.DescriptionEditActivity.Action action = org.wikipedia.descriptions.DescriptionEditActivity.Action.ADD_DESCRIPTION;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsCardsFragment.Companion Companion = null;
    
    public SuggestedEditsCardsFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentSuggestedEditsCardsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLangFromCode() {
        return null;
    }
    
    public final void setLangFromCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLangToCode() {
        return null;
    }
    
    public final void setLangToCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.descriptions.DescriptionEditActivity.Action getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action p0) {
    }
    
    private final org.wikipedia.page.PageTitle getTopTitle() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsItemFragment topBaseChild() {
        return null;
    }
    
    private final org.wikipedia.suggestededits.SuggestedEditsCardsItemFragment topChild() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void maybeShowOnboarding() {
    }
    
    private final void updateBackButton(int pagerPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLangCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wikipedia.dataclient.mwapi.MwQueryPage getSinglePage() {
        return null;
    }
    
    @java.lang.Override()
    public void updateActionButton() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void previousPage() {
    }
    
    @java.lang.Override()
    public void nextPage(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment sourceFragment) {
    }
    
    @java.lang.Override()
    public void logSuccess() {
    }
    
    public final void onSelectPage() {
    }
    
    private final void requestLanguagesAndBuildSpinner() {
    }
    
    private final java.lang.String getLanguageLocalName(java.lang.String code) {
        return null;
    }
    
    private final void resetViewPagerItemAdapter() {
    }
    
    private final void setInitialUiState() {
    }
    
    private final void swapLanguageSpinnerSelection(boolean isFromLang) {
    }
    
    private final void initLanguageSpinners() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$OnFromSpinnerItemSelectedListener;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;)V", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app_alphaDebug"})
    final class OnFromSpinnerItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
        
        public OnFromSpinnerItemSelectedListener() {
            super();
        }
        
        @java.lang.Override()
        public void onItemSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
        android.view.View view, int position, long id) {
        }
        
        @java.lang.Override()
        public void onNothingSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$OnToSpinnerItemSelectedListener;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;)V", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "app_alphaDebug"})
    final class OnToSpinnerItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
        
        public OnToSpinnerItemSelectedListener() {
            super();
        }
        
        @java.lang.Override()
        public void onItemSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
        android.view.View view, int position, long id) {
        }
        
        @java.lang.Override()
        public void onNothingSelected(@org.jetbrains.annotations.NotNull()
        android.widget.AdapterView<?> parent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$ViewPagerAdapter;", "Lorg/wikipedia/views/PositionAwareFragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;Landroidx/fragment/app/Fragment;)V", "createFragment", "position", "", "getItemCount", "app_alphaDebug"})
    final class ViewPagerAdapter extends org.wikipedia.views.PositionAwareFragmentStateAdapter {
        
        public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super(null);
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$ViewPagerListener;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;)V", "nextPageSelectedAutomatic", "", "prevPosition", "", "onPageSelected", "", "position", "setNextPageSelectedAutomatic", "app_alphaDebug"})
    final class ViewPagerListener extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        private int prevPosition = 0;
        private boolean nextPageSelectedAutomatic = false;
        
        public ViewPagerListener() {
            super();
        }
        
        public final void setNextPageSelectedAutomatic() {
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsCardsFragment;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsCardsFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}
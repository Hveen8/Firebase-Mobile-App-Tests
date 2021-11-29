package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ \u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0015H\u0007J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0005H\u0007J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0007J\u000e\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010*\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010,\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u0017H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lorg/wikipedia/util/DateUtil;", "", "()V", "DATE_FORMATS", "Ljava/util/HashMap;", "", "Ljava/text/SimpleDateFormat;", "dbDateFormat", "date", "Ljava/util/Date;", "dbDateParse", "get24HrFormatTimeOnlyString", "getCachedDateFormat", "pattern", "locale", "Ljava/util/Locale;", "utc", "", "getDateAndTimeWithPipe", "getDateStringWithSkeletonPattern", "getDefaultDateFor", "Ljava/util/Calendar;", "age", "", "getExtraShortDateString", "getFeedCardDateString", "getFeedCardDayHeaderDate", "getFeedCardShortDateString", "getHttpLastModifiedDate", "dateStr", "getLastSyncDateString", "getMDYDateString", "getMonthOnlyDateString", "getMonthOnlyWithoutDayDateString", "getShortDateString", "getTimeString", "getUtcRequestDateFor", "Lorg/wikipedia/feed/model/UtcDate;", "getYearDifferenceString", "year", "languageCode", "iso8601DateFormat", "iso8601DateParse", "iso8601LocalDateFormat", "iso8601ShortDateParse", "yearToStringWithEra", "app_alphaDebug"})
public final class DateUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.DateUtil INSTANCE = null;
    private static final java.util.HashMap<java.lang.String, java.text.SimpleDateFormat> DATE_FORMATS = null;
    
    private DateUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized java.lang.String iso8601DateFormat(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized java.util.Date iso8601DateParse(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    public final synchronized java.util.Date iso8601ShortDateParse(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized java.lang.String iso8601LocalDateFormat(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized java.lang.String dbDateFormat(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized java.util.Date dbDateParse(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getFeedCardDayHeaderDate(int age) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getFeedCardDateString(int age) {
        return null;
    }
    
    private final java.lang.String getFeedCardDateString(java.util.Calendar date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getFeedCardDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getFeedCardShortDateString(@org.jetbrains.annotations.NotNull()
    java.util.Calendar date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMDYDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getMonthOnlyDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getMonthOnlyWithoutDayDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    private final java.lang.String getExtraShortDateString(java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateAndTimeWithPipe(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    private final synchronized java.lang.String getDateStringWithSkeletonPattern(java.util.Date date, java.lang.String pattern) {
        return null;
    }
    
    private final java.text.SimpleDateFormat getCachedDateFormat(java.lang.String pattern, java.util.Locale locale, boolean utc) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getShortDateString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.feed.model.UtcDate getUtcRequestDateFor(int age) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.Calendar getDefaultDateFor(int age) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.text.ParseException.class})
    @kotlin.jvm.Synchronized()
    @kotlin.jvm.JvmStatic()
    public static final synchronized java.util.Date getHttpLastModifiedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dateStr) throws java.text.ParseException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.text.ParseException.class})
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getLastSyncDateString(@org.jetbrains.annotations.NotNull()
    java.lang.String dateStr) throws java.text.ParseException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get24HrFormatTimeOnlyString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String yearToStringWithEra(int year) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getYearDifferenceString(int year, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
        return null;
    }
}
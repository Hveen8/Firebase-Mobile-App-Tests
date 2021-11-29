package org.wikipedia.pageimages.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/pageimages/db/PageImageDao;", "", "getAllPageImages", "", "Lorg/wikipedia/pageimages/db/PageImage;", "insertPageImage", "", "pageImage", "app_alphaDebug"})
public abstract interface PageImageDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertPageImage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.pageimages.db.PageImage pageImage);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM PageImage")
    public abstract java.util.List<org.wikipedia.pageimages.db.PageImage> getAllPageImages();
}
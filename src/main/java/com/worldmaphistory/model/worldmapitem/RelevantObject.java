package com.worldmaphistory.model.worldmapitem;

import com.worldmaphistory.model.changemap.date.IntegerDateChangeMap;

public abstract class RelevantObject {

    private final IntegerDateChangeMap importanceMap = new IntegerDateChangeMap(0);

    public Integer getImportanceInDate(Date date) {
        return (Integer) importanceMap.getCurrent(date);
    }

    public void setImportanceInDate(Date date, Integer importance) {
        if (importance > 10) {
            importance = 10;
        }
        if (importance < 0) {
            importance = 0;
        }
        importanceMap.put(date, importance);
    }

}

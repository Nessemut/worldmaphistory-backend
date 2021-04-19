package io.worldmaphistory.model;

import io.worldmaphistory.datechangemaps.IntegerDateChangeMap;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;


public abstract class RelevantObject {

    private IntegerDateChangeMap importanceMap = new IntegerDateChangeMap();

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

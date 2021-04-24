package com.worldmaphistory.model;

import com.worldmaphistory.datechangemaps.StringDateChangeMap;

public class Location extends RelevantObject {

    private final StringDateChangeMap nameMap = new StringDateChangeMap();

    public String getNameInDate(Date date) {
        return (String) nameMap.getCurrent(date);
    }

    public void setNameInDate(Date date, String name) {
        nameMap.put(date, name);
    }

}

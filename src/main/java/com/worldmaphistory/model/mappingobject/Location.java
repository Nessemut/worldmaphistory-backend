package com.worldmaphistory.model.mappingobject;

import com.worldmaphistory.model.changemap.date.StringDateChangeMap;

public class Location extends RelevantObject {

    private final StringDateChangeMap nameMap = new StringDateChangeMap();

    public String getNameInDate(Date date) {
        return (String) nameMap.getCurrent(date);
    }

    public void setNameInDate(Date date, String name) {
        nameMap.put(date, name);
    }

}

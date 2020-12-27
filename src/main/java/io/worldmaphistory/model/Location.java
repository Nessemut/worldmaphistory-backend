package io.worldmaphistory.model;

import io.worldmaphistory.model.changemaps.StringDateChangeMap;
import lombok.Data;

@Data
public class Location {

    private StringDateChangeMap nameMap = new StringDateChangeMap();

    public String getNameInDate(Date date) {
        return (String) nameMap.getCurrent(date);
    }

    public void setNameInDate(Date date, String name) {
        nameMap.put(date, name);
    }

}

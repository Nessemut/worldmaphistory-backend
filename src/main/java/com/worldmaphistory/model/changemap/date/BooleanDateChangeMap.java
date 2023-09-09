package com.worldmaphistory.model.changemap.date;

import com.worldmaphistory.model.worldmapitem.Date;

public class BooleanDateChangeMap extends DateChangeMap<Date, Boolean> {

    public BooleanDateChangeMap() {
        super(Boolean.FALSE);
    }

    public BooleanDateChangeMap(Boolean defaultValue) {
        super(defaultValue);
    }

}

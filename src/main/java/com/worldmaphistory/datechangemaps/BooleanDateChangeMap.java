package com.worldmaphistory.datechangemaps;

public class BooleanDateChangeMap extends DateChangeMap {

    public BooleanDateChangeMap(Boolean defaultValue) {
        super(Boolean.class, defaultValue);
    }

    public BooleanDateChangeMap() {
        this(false);
    }

}

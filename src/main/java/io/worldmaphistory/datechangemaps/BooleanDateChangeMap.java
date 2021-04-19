package io.worldmaphistory.datechangemaps;

import io.worldmaphistory.model.Date;

public class BooleanDateChangeMap extends DateChangeMap {

    private final boolean defaultValue;

    public BooleanDateChangeMap(boolean defaultValue) {
        super(boolean.class);
        this.defaultValue = defaultValue;
    }

    @Override
    public Object getCurrent(Date date) {
        if (this.isEmpty()) {
            return this.defaultValue;
        }
        return super.getCurrent(date);
    }
}

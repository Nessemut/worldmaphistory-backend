package com.worldmaphistory.model.changemap;

import java.util.HashMap;

public abstract class ChangeMap<K, V> extends HashMap<K, V> {

    protected final V defaultValue;

    public ChangeMap() {
        super();
        defaultValue = null;
    }

    public ChangeMap(V defaultValue) {
        super();
        this.defaultValue = defaultValue;
    }

}

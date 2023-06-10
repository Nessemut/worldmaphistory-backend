package com.worldmaphistory.model.changemap;

import java.util.HashMap;

public abstract class ChangeMap<K, V> extends HashMap<K, V> {

    protected final transient V defaultValue;

    protected ChangeMap() {
        super();
        defaultValue = null;
    }

    protected ChangeMap(V defaultValue) {
        super();
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}

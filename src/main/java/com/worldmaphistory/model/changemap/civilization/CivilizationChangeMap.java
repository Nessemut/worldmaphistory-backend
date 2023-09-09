package com.worldmaphistory.model.changemap.civilization;

import com.worldmaphistory.model.worldmapitem.Civilization;
import com.worldmaphistory.model.changemap.ChangeMap;

public abstract class CivilizationChangeMap<K, V> extends ChangeMap<Civilization, V> {

    protected CivilizationChangeMap() {
        super();
    }

    protected CivilizationChangeMap(V defaultValue) {
        super(defaultValue);
    }

}

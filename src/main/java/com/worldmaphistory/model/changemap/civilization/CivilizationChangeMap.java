package com.worldmaphistory.model.changemap.civilization;

import com.worldmaphistory.model.Civilization;
import com.worldmaphistory.model.changemap.ChangeMap;

public abstract class CivilizationChangeMap<K, V> extends ChangeMap<Civilization, V> {

    public CivilizationChangeMap() {
        super();
    }

    public CivilizationChangeMap(V defaultValue) {
        super(defaultValue);
    }

}

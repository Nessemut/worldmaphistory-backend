package com.worldmaphistory.datechangemaps;

import com.worldmaphistory.model.enums.TerritoryType;

public class TerritoryTypeDateChangeMap extends DateChangeMap {

    public TerritoryTypeDateChangeMap() {
        super(TerritoryType.class, TerritoryType.PRIMARY);
    }

}

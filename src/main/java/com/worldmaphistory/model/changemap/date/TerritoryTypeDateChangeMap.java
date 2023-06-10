package com.worldmaphistory.model.changemap.date;

import com.worldmaphistory.model.mappingobject.Date;
import com.worldmaphistory.model.mappingobject.enums.TerritoryType;

public class TerritoryTypeDateChangeMap extends DateChangeMap<Date, TerritoryType> {

    public TerritoryTypeDateChangeMap() {
        super(TerritoryType.PRIMARY);
    }

    public TerritoryTypeDateChangeMap(TerritoryType territoryType) {
        super(territoryType);
    }

}

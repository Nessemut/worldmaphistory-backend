package com.worldmaphistory.model;

import com.worldmaphistory.datechangemaps.BooleanDateChangeMap;
import com.worldmaphistory.datechangemaps.TerritoryTypeDateChangeMap;
import com.worldmaphistory.model.enums.TerritoryType;
import lombok.*;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
public class Territory extends Location {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private final BooleanDateChangeMap independentRenderingMap = new BooleanDateChangeMap();
    private final TerritoryTypeDateChangeMap territoryTypeMap = new TerritoryTypeDateChangeMap();
    private final ArrayList<Border> borders = new ArrayList<>();

    public void setRendersIndependentlyInDate(Date date, Boolean rendersIndependently) {
        independentRenderingMap.put(date, rendersIndependently);
    }

    public Boolean isRenderedIndependentlyInDate(Date date) {
        return (Boolean) independentRenderingMap.getCurrent(date);
    }

    public void setTerritoryTypeInDate(Date date, TerritoryType type) {
        territoryTypeMap.put(date, type);
    }

    public TerritoryType getTerritoryTypeInDate(Date date) {
        return (TerritoryType) territoryTypeMap.getCurrent(date);
    }

}

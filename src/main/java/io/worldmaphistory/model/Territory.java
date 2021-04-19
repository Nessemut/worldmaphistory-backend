package io.worldmaphistory.model;

import io.worldmaphistory.datechangemaps.ArrayListDateChangeMap;
import io.worldmaphistory.datechangemaps.BooleanDateChangeMap;
import lombok.*;

import java.util.ArrayList;


public class Territory extends Location {

    private final ArrayListDateChangeMap bordersMap = new ArrayListDateChangeMap();
    private final BooleanDateChangeMap independentRenderingMap = new BooleanDateChangeMap(false);


    public void setBordersInDate(Date date, ArrayList<Border> borders) {
        bordersMap.put(date, borders);
    }

    public ArrayList<Border> getBordersInDate(Date date) {
        return (ArrayList<Border>) bordersMap.getCurrent(date);
    }

    public void setRendersIndependentlyInDate(Date date, Boolean rendersIndependently) {
        independentRenderingMap.put(date, rendersIndependently);
    }

    public Boolean isRenderedIndependentlyInDate(Date date) {
        return (Boolean) independentRenderingMap.getCurrent(date);
    }

}

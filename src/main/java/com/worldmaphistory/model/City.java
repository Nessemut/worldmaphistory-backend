package com.worldmaphistory.model;

import com.worldmaphistory.datechangemaps.BooleanDateChangeMap;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
public class City extends Point implements Eventable {

    @Setter(AccessLevel.NONE)
    private BooleanDateChangeMap isPopulatedOnDateMap = new BooleanDateChangeMap(true);

    public Date getFoundationDate() {
        return isPopulatedOnDateMap.getEarliestChangeDate();
    }

    public boolean isPopulatedOnDate(Date date){
        return (boolean) isPopulatedOnDateMap.get(date);
    }

    public void setPopulatedOnDate(Date date, Boolean isPopulated){
        isPopulatedOnDateMap.put(date, isPopulated);
    }

    @Override
    public ArrayList<Event> getEvents(Date date) {
        return null;
    }
}

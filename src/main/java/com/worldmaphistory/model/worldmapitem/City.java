package com.worldmaphistory.model.worldmapitem;

import com.worldmaphistory.model.changemap.date.BooleanDateChangeMap;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class City extends Point implements Eventable {

    @Setter(AccessLevel.NONE)
    private BooleanDateChangeMap isPopulatedOnDateMap = new BooleanDateChangeMap(Boolean.TRUE);

    public Date getFoundationDate() {
        return isPopulatedOnDateMap.getEarliestChangeDate();
    }

    public Boolean isPopulatedOnDate(Date date){
        return isPopulatedOnDateMap.get(date);
    }

    public void setPopulatedOnDate(Date date, Boolean isPopulated){
        isPopulatedOnDateMap.put(date, isPopulated);
    }

    @Override
    public List<Event> getEvents(Date date) {
        return null;
    }
}

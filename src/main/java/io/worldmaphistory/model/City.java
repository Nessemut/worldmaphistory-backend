package io.worldmaphistory.model;

import io.worldmaphistory.model.changemaps.BooleanDateChangeMap;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class City extends Point {

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

}

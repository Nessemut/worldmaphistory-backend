package io.worldmaphistory.model;

import io.worldmaphistory.model.enums.PeriodType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
public class Period extends RelevantObject implements Eventable {

    private Date startDate;
    private Date endDate;
    private String name;
    private PeriodType type;


    public Period(PeriodType type) {
        this.type = type;
    }

    public Period() {
        this.type = PeriodType.MISC;
    }

    @Override
    public ArrayList<Event> getEvents(Date date) {
        return null;
    }
}

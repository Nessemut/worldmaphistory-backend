package com.worldmaphistory.model.mappingobject;

import com.worldmaphistory.model.mappingobject.enums.PeriodType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

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
        this(PeriodType.MISC);
    }

    @Override
    public List<Event> getEvents(Date date) {
        return null;
    }

    @Override
    public void setImportanceInDate(Date date, Integer importance) {
        //TODO: date should not be earlier than startDate nor later than endDate
        super.setImportanceInDate(date, importance);
    }
}

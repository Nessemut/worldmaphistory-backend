package com.worldmaphistory.model;

import com.worldmaphistory.model.enums.EventType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Event extends RelevantObject {

    private Date date;
    private String name;
    private Location location;
    private EventType type;

    public Event(EventType type) {
        this.type = type;
    }

    public Event() {
        this.type = EventType.MISC;
    }

}
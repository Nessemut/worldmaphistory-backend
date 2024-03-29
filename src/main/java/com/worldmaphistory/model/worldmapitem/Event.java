package com.worldmaphistory.model.worldmapitem;

import com.worldmaphistory.model.worldmapitem.enums.EventType;
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
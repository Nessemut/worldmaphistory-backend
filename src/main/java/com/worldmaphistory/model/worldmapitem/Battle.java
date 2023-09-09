package com.worldmaphistory.model.worldmapitem;

import com.worldmaphistory.model.worldmapitem.enums.EventType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Battle extends Event {

    private War war;

    public Battle() {
        super(EventType.BATTLE);
    }

}

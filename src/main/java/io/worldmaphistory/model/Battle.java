package io.worldmaphistory.model;

import io.worldmaphistory.model.enums.EventType;
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

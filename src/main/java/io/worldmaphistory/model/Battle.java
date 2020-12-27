package io.worldmaphistory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Battle extends Event {

    private War war;

}

package io.worldmaphistory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Point extends Location {

    private Coordinates coordinates;

}

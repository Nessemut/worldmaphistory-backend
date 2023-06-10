package com.worldmaphistory.model.mappingobject;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Point extends Location {

    private Coordinates coordinates;

}

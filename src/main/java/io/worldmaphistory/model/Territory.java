package io.worldmaphistory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
public class Territory extends Location {

    private ArrayList<Border> borders;

}

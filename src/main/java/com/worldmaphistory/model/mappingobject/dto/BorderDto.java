package com.worldmaphistory.model.mappingobject.dto;

import com.worldmaphistory.model.mappingobject.Coordinates;
import lombok.Data;

import java.util.List;

@Data
public class BorderDto {

    private String name;
    private List<Coordinates> coordinates;

}

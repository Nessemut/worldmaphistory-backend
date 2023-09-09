package com.worldmaphistory.model.worldmapitem.dto;

import com.worldmaphistory.model.worldmapitem.Coordinates;
import lombok.Data;

import java.util.List;

@Data
public class BorderDto {

    private String name;
    private List<Coordinates> coordinates;

}

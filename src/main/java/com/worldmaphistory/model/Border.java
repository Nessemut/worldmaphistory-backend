package com.worldmaphistory.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Border {

    private ArrayList<Coordinates> coordinates;

    private String name;

}

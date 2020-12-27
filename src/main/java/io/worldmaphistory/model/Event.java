package io.worldmaphistory.model;

import lombok.Data;

@Data
public class Event {

    private Date date;
    private String name;
    private Location location;

}
package io.worldmaphistory.model;

import lombok.Data;

@Data
public class Person {

    private String name;
    private Date birthDate;
    private Integer deathDate;

}

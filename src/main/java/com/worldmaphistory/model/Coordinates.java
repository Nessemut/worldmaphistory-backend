package com.worldmaphistory.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "coordinates")
public class Coordinates {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Coordinates() {
    }

    @Getter
    @Setter
    @Column(name="lat")
    private double lat;

    @Getter
    @Setter
    @Column(name="lon")
    private double lon;

}

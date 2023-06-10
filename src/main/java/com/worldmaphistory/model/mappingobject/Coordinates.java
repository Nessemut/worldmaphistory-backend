package com.worldmaphistory.model.mappingobject;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name= "coordinates")
public class Coordinates {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name="lat")
    private double lat;

    @Getter
    @Setter
    @Column(name="lon")
    private double lon;

}

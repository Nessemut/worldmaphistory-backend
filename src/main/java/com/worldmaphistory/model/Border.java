package com.worldmaphistory.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "border")
public class Border {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Border() {
    }

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name = "border_coordinates",
            joinColumns = { @JoinColumn(name = "border_id") },
            inverseJoinColumns = { @JoinColumn(name = "coordinate_id") }
    )
    @OrderBy("id")
    private List<Coordinates> coordinates;

    @Column
    private String name;

}

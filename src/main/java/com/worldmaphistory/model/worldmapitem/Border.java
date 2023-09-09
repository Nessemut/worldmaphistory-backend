package com.worldmaphistory.model.worldmapitem;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Border {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

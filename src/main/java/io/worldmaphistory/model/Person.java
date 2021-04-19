package io.worldmaphistory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends RelevantObject implements Eventable {

    private String name;
    private Date birthDate;
    private Date deathDate;

    @Override
    public ArrayList<Event> getEvents(Date date) {
        return null;
    }
}
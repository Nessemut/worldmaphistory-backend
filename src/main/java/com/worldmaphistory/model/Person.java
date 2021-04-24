package com.worldmaphistory.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends RelevantObject implements Eventable {

    private String name;
    private String aka;
    private String title;
    private Date birthDate;
    private Date deathDate;

    @Override
    public ArrayList<Event> getEvents(Date date) {
        return null;
    }

    public Boolean isAlive(Date date) {
        return this.birthDate.before(date) && this.deathDate.after(date);
    }
}
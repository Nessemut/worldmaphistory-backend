package com.worldmaphistory.model;

import java.util.ArrayList;
import java.util.List;

public class Realm extends ArrayList<Territory> implements Eventable {

    @Override
    public List<Event> getEvents(Date date) {
        return null;
    }

}

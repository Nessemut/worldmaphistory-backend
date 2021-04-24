package com.worldmaphistory.model;

import java.util.ArrayList;

public class Realm extends ArrayList<Territory> implements Eventable {
    
    @Override
    public ArrayList<Event> getEvents(Date date) {
        return null;
    }

}

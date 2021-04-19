package io.worldmaphistory.model;

import java.util.ArrayList;

public interface Eventable {

    // TODO: manage automatic event creation for all classes implementing this interface
    ArrayList<Event> getEvents(Date date);

}

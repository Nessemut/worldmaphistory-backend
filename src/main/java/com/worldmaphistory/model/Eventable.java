package com.worldmaphistory.model;

import java.util.List;

public interface Eventable {

    // TODO: manage automatic event creation for all classes implementing this interface
    List<Event> getEvents(Date date);

}

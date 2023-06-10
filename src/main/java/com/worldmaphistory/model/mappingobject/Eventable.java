package com.worldmaphistory.model.mappingobject;

import java.util.List;

public interface Eventable {

    // TODO: manage automatic event creation for all classes implementing this interface
    List<Event> getEvents(Date date);

}

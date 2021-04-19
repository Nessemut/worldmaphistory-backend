package io.worldmaphistory.model;

import io.worldmaphistory.datechangemaps.ArrayListDateChangeMap;
import io.worldmaphistory.datechangemaps.PersonDateChangeMap;
import io.worldmaphistory.datechangemaps.PointDateChangeMap;
import io.worldmaphistory.datechangemaps.StringDateChangeMap;

import java.util.ArrayList;


public class Civilization extends RelevantObject implements Eventable {

    private final PersonDateChangeMap rulerMap = new PersonDateChangeMap();
    private final StringDateChangeMap nameMap = new StringDateChangeMap();
    private final PointDateChangeMap capitalMap = new PointDateChangeMap();
    private final ArrayListDateChangeMap territoriesMap = new ArrayListDateChangeMap();


    public City getCapitalInDate(Date date) {
        return (City) capitalMap.getCurrent(date);
    }

    public void setCapitalInDate(Date date, City currentCapital) {
        capitalMap.put(date, currentCapital);
    }

    public String getNameInDate(Date date) {
        return (String) nameMap.getCurrent(date);
    }

    public void setNameInDate(Date date, String currentName) {
        nameMap.put(date, currentName);
    }

    public Person getRulerInDate(Date date) {
        return (Person) rulerMap.getCurrent(date);
    }

    public void setRulerInDate(Date date, Person currentRuler) {
        rulerMap.put(date, currentRuler);
    }

    public ArrayList<Territory> getTerritoriesInDate(Date date) {
        return (ArrayList<Territory>) territoriesMap.getCurrent(date);
    }

    public void setTerritoriesInDate(Date date, ArrayList<Territory> territories) {
        territoriesMap.put(date, territories);
    }

    @Override
    public ArrayList<Event> getEvents(Date date) {
        return null;
    }
}

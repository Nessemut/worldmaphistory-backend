package com.worldmaphistory.model.mappingobject;

import com.worldmaphistory.model.changemap.date.*;
import java.util.Collections;

import java.util.List;

public class Civilization extends RelevantObject implements Eventable {

    private final PeopleDateChangeMap rulersMap = new PeopleDateChangeMap();

    private final StringDateChangeMap nameMap = new StringDateChangeMap();

    private final PointDateChangeMap capitalMap = new PointDateChangeMap();

    private final RealmDateChangeMap realmMap = new RealmDateChangeMap();

    private final IntegerDateChangeMap populationMap = new IntegerDateChangeMap();


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

    public People getRulersInDate(Date date) {
        return (People) rulersMap.getCurrent(date);
    }

    public void setRulersInDate(Date date, People currentRuler) {
        rulersMap.put(date, currentRuler);
    }

    public Realm getRealmInDate(Date date) {
        return (Realm) realmMap.getCurrent(date);
    }

    public void setRealmInDate(Date date, Realm realm) {
        realmMap.put(date, realm);
    }

    public Integer getPopulationInDate(Date date) {
        return (Integer) populationMap.getCurrent(date);
    }

    public void setPopulationInDate(Date date, Integer population) {
        populationMap.put(date, population);
    }

    @Override
    public List<Event> getEvents(Date date) {
        //TODO: implement event generation
        return Collections.emptyList();
    }
}

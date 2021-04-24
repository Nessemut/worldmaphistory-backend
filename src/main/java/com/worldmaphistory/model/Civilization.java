package com.worldmaphistory.model;

import com.worldmaphistory.datechangemaps.*;

import java.util.ArrayList;

public class Civilization extends RelevantObject implements Eventable {

    private final PersonDateChangeMap rulerMap = new PersonDateChangeMap();
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

    public Person getRulerInDate(Date date) {
        return (Person) rulerMap.getCurrent(date);
    }

    public void setRulerInDate(Date date, Person currentRuler) {
        rulerMap.put(date, currentRuler);
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
    public ArrayList<Event> getEvents(Date date) {
        return null;
    }
}

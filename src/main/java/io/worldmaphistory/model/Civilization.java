package io.worldmaphistory.model;

import io.worldmaphistory.model.changemaps.DomainsDateChangeMap;
import io.worldmaphistory.model.changemaps.PersonDateChangeMap;
import io.worldmaphistory.model.changemaps.PointDateChangeMap;
import io.worldmaphistory.model.changemaps.StringDateChangeMap;
import lombok.Data;

@Data
public class Civilization {

    private PersonDateChangeMap rulerMap = new PersonDateChangeMap();
    private StringDateChangeMap nameMap = new StringDateChangeMap();
    private PointDateChangeMap capitalMap = new PointDateChangeMap();
    private DomainsDateChangeMap domainsMap = new DomainsDateChangeMap();


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

    public Domains getDomainsInDate(Date date) {
        return (Domains) domainsMap.getCurrent(date);
    }

    public void setDomainsInDate(Date date, Domains domains) {
        domainsMap.put(date, domains);
    }

}

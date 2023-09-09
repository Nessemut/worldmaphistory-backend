package com.worldmaphistory.model.worldmapitem;

import com.worldmaphistory.model.changemap.civilization.StringCivilizationChangeMap;
import java.util.Collections;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Person extends RelevantObject implements Eventable {

    private StringCivilizationChangeMap nameMap = new StringCivilizationChangeMap();
    private StringCivilizationChangeMap akaMap = new StringCivilizationChangeMap();
    private StringCivilizationChangeMap titleMap = new StringCivilizationChangeMap();

    private Date birthDate;
    private Date deathDate;

    public void setNameInCivilization(Civilization civilization, String name) {
        nameMap.put(civilization, name);
    }

    public String getNameInCivilization(Civilization civilization) {
        return nameMap.get(civilization);
    }

    public void setAkaInCivilization(Civilization civilization, String aka) {
        akaMap.put(civilization, aka);
    }

    public String getAkaInCivilization(Civilization civilization) {
        return akaMap.get(civilization);
    }

    public void setTitleInCivilization(Civilization civilization, String title) {
        titleMap.put(civilization, title);
    }

    public String getTitleInCivilization(Civilization civilization) {
        return titleMap.get(civilization);
    }

    public Boolean isAlive(Date date) {
        return this.birthDate.before(date) && this.deathDate.after(date);
    }

    @Override
    public List<Event> getEvents(Date date) {
        return Collections.emptyList();
    }
}

package com.worldmaphistory.changemap.civilization;

import com.worldmaphistory.model.mappingobject.Civilization;
import com.worldmaphistory.model.mappingobject.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CivilizationChangeMapTest {

    @Test
    public void testCivilizationChangeMaps() {
        Person charles = new Person();
        Civilization spain = new Civilization();
        Civilization hre = new Civilization();
        charles.setNameInCivilization(spain, "Carlos I");
        charles.setNameInCivilization(hre, "Karl V");
        charles.setAkaInCivilization(spain, "el César");
        charles.setTitleInCivilization(spain, "Rey de España");
        charles.setTitleInCivilization(hre, "Kaiser");
        assertEquals("Carlos I", charles.getNameInCivilization(spain));
        assertEquals("Karl V", charles.getNameInCivilization(hre));
        assertNull(charles.getAkaInCivilization(hre));
        assertEquals("Rey de España", charles.getTitleInCivilization(spain));
        assertEquals("Kaiser", charles.getTitleInCivilization(hre));
    }

}

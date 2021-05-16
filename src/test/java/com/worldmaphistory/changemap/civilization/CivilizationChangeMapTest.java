package com.worldmaphistory.changemap.civilization;

import com.worldmaphistory.model.Civilization;
import com.worldmaphistory.model.Person;
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
        assertEquals(charles.getNameInCivilization(spain), "Carlos I");
        assertEquals(charles.getNameInCivilization(hre), "Karl V");
        assertNull(charles.getAkaInCivilization(hre));
        assertEquals(charles.getTitleInCivilization(spain), "Rey de España");
        assertEquals(charles.getTitleInCivilization(hre), "Kaiser");
    }

}

package io.worldmaphistory;

import io.worldmaphistory.model.City;
import io.worldmaphistory.model.Civilization;
import io.worldmaphistory.model.Date;
import io.worldmaphistory.model.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateChangeMapTest {

    @Test
    public void testStringMap() {

        Civilization spain = new Civilization();

        spain.setNameInDate(new Date(-1900), "Hispania");
        spain.setNameInDate(new Date(711), "Cordoba");
        spain.setNameInDate(new Date(1516), "Spain");

        assertEquals("Hispania", spain.getNameInDate(new Date(-100)));
        assertEquals("Cordoba", spain.getNameInDate(new Date(1050)));
        assertEquals("Spain", spain.getNameInDate(new Date(2020)));

        City constantinople = new City();

        constantinople.setNameInDate(new Date(-500), "Bizantium");
        constantinople.setNameInDate(new Date(200), "Constantinople");
        constantinople.setNameInDate(new Date(1453), "Istanbul");

        assertEquals("Bizantium", constantinople.getNameInDate(new Date(-100)));
        assertEquals("Constantinople", constantinople.getNameInDate(new Date(1050)));
        assertEquals("Istanbul", constantinople.getNameInDate(new Date(2020)));

    }

}

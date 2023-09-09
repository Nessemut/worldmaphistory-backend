package com.worldmaphistory.changemap.date;

import com.worldmaphistory.model.worldmapitem.City;
import com.worldmaphistory.model.worldmapitem.Civilization;
import com.worldmaphistory.model.worldmapitem.Date;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateChangeMapTest {

    // TODO: properly test default values setting and retrieval

    @Test
    public void testDateChangeMaps() {
        Civilization ottomanEmpire = new Civilization();
        ottomanEmpire.setNameInDate(new Date(600), "Turks");
        ottomanEmpire.setNameInDate(new Date(1299), "Ottoman Empire");
        ottomanEmpire.setNameInDate(new Date(1923), "Turkey");

        City constantinople = new City();
        constantinople.setNameInDate(new Date(-1500), "Byzantium");
        constantinople.setNameInDate(new Date(330), "Constantinople");
        constantinople.setNameInDate(new Date(1453), "Istanbul");

        City ankara = new City();
        ankara.setNameInDate(new Date(-1200), "Ankuwash");
        ankara.setNameInDate(new Date(-323), "Ancyra");
        ankara.setNameInDate(new Date(1356), "Ankara");

        ottomanEmpire.setCapitalInDate(new Date(1453), constantinople);
        ottomanEmpire.setCapitalInDate(new Date(1923), ankara);

        assertEquals("Byzantium", constantinople.getNameInDate(new Date(-100)));
        assertEquals("Constantinople", constantinople.getNameInDate(new Date(1050)));
        assertEquals("Istanbul", constantinople.getNameInDate(new Date(2020)));
        assertEquals("Ankara",
                ottomanEmpire.getCapitalInDate(new Date(1950)).getNameInDate(new Date(1950))
        );
        assertEquals("Istanbul",
                ottomanEmpire.getCapitalInDate(new Date(1914)).getNameInDate(new Date(1914))
        );
        assertEquals("Ottoman Empire", ottomanEmpire.getNameInDate(new Date(1914)));
    }

}

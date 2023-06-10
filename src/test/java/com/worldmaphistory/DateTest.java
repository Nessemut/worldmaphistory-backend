package com.worldmaphistory;

import com.worldmaphistory.model.mappingobject.Date;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DateTest {

    @Test
    public void testDateComparators() {
        Date lowestDatePossible = new Date(-3800, 1, 1);
        Date dateAbovePlusOneDay = new Date(-3800, 2);
        assertTrue(lowestDatePossible.before(dateAbovePlusOneDay));
    }

    @Test
    public void testFormat() {
        assertEquals("-3800", new Date(-3800, null, null).toString());
        assertEquals("0/1", new Date(0, 1, null).toString());
        assertEquals("-2000/1/29", new Date(-2000, 1, 29).toString());
    }

}

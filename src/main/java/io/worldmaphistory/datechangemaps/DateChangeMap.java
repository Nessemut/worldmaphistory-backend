package io.worldmaphistory.datechangemaps;

import io.worldmaphistory.model.Date;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class DateChangeMap extends HashMap<Date, Object> {

    private final Class T;

    public DateChangeMap(Class T) {
        super();
        this.T = T;
    }

    public Object getCurrent(Date date) {
        if (this.containsKey(date)) {
            return this.get(date);
        }
        Iterator it = this.entrySet().iterator();
        Date closest = null;
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            Date key = (Date) pair.getKey();
            if ((closest == null && key.before(date)) || (key.before(date) && key.after(closest))) {
                closest = key;
            }
        }
        return this.T.cast(this.get(closest));
    }

    public Date getEarliestChangeDate() {
        //TODO: implement get earliest change date
        return null;
    }

    public Date getLatestChangeDate() {
        //TODO: implement get latest change date
        return null;
    }
}

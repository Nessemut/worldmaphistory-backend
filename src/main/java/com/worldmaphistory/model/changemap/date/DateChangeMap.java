package com.worldmaphistory.model.changemap.date;

import com.worldmaphistory.model.worldmapitem.Date;
import com.worldmaphistory.model.changemap.ChangeMap;

import java.util.Iterator;

abstract class DateChangeMap<K, V> extends ChangeMap<Date, V> {

    protected DateChangeMap() {
        super(null);
    }

    protected DateChangeMap(V defaultValue) {
        super(defaultValue);
    }

    public Object getCurrent(Date date) {
        //TODO: after implementing getEarliestChangeDate(), return default value if this date is earlier than that
        if (this.isEmpty()) {
            return this.defaultValue;
        }
        if (this.containsKey(date)) {
            return this.get(date);
        }
        Iterator<Entry<Date, V>> it = this.entrySet().iterator();
        Date closest = null;
        while (it.hasNext()) {
            Entry<Date, V> pair = it.next();
            Date key = pair.getKey();
            if ((closest == null && key.before(date)) || (key.before(date) && key.after(closest))) {
                closest = key;
            }
        }
        return this.get(closest);
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

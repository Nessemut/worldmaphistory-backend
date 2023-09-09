package com.worldmaphistory.model;

import com.worldmaphistory.model.worldmapitem.Date;
import lombok.Data;

@Data
public class RepresentationRequest {

    private Date date;
    private Integer zoom;

}

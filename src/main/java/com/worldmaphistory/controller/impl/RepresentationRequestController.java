package com.worldmaphistory.controller.impl;

import com.worldmaphistory.controller.IRepresentationRequestController;
import com.worldmaphistory.model.RepresentationRequest;
import com.worldmaphistory.model.worldmapitem.Date;
import com.worldmaphistory.model.worldmapitem.dto.DateDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepresentationRequestController extends BaseController implements IRepresentationRequestController {

    @Override
    public void processRequest(DateDto date, @RequestBody Integer zoom) {
        RepresentationRequest rr = new RepresentationRequest();
        rr.setDate(modelMapper.map(date, Date.class));
        rr.setZoom(zoom);
    }

}

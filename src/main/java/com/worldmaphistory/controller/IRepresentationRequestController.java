package com.worldmaphistory.controller;

import com.worldmaphistory.model.worldmapitem.dto.DateDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/mapping")
public interface IRepresentationRequestController {

    @GetMapping
    void processRequest(DateDto date, @RequestParam Integer zoom);

}

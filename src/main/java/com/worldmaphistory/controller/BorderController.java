package com.worldmaphistory.controller;

import com.worldmaphistory.model.Border;
import com.worldmaphistory.service.BorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/border")
public class BorderController {

    @Autowired
    BorderService borderService;

    @GetMapping("/all")
    public List<Border> getAll() {
        return borderService.findAll();
    }

    @RequestMapping(method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Border postBorder(@RequestBody Border border) {
        return borderService.save(border);
    }

}

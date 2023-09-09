package com.worldmaphistory.controller;

import com.worldmaphistory.model.worldmapitem.dto.BorderDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/border")
public interface IBorderController {

    @GetMapping
    List<BorderDto> getAll();

    //TODO: manage CORS filter only when running locally
    @PostMapping
    @CrossOrigin(origins = "http://127.0.0.1:3000")
    HttpStatus postBorder(@RequestBody BorderDto border);

}

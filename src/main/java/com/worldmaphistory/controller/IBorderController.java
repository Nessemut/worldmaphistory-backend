package com.worldmaphistory.controller;

import com.worldmaphistory.model.mappingobject.dto.BorderDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/border")
public interface IBorderController {

    @GetMapping
    List<BorderDto> getAll();

    @PostMapping
    HttpStatus postBorder(@RequestBody BorderDto border);

}

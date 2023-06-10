package com.worldmaphistory.controller.impl;

import com.worldmaphistory.controller.IBorderController;
import com.worldmaphistory.model.mappingobject.Border;
import com.worldmaphistory.model.mappingobject.dto.BorderDto;
import com.worldmaphistory.service.BorderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BorderController extends BaseController implements IBorderController {

    BorderService borderService;

    public BorderController(BorderService borderService) {
        super();
        this.borderService = borderService;
    }

    @Override
    public List<BorderDto> getAll() {
        return borderService.findAll().stream().map(border -> modelMapper.map(border, BorderDto.class)).toList();
    }

    @Override
    public HttpStatus postBorder(@RequestBody BorderDto border) {
        borderService.save(modelMapper.map(border, Border.class));
        return HttpStatus.CREATED;
    }

}

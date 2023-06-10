package com.worldmaphistory.controller.impl;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

abstract class BaseController {

    @Autowired
    protected ModelMapper modelMapper;

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

}

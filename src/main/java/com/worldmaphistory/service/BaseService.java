package com.worldmaphistory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;

abstract class BaseService<T> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected CrudRepository<T, Long> repository;

    protected BaseService(CrudRepository<T, Long> repository) {
        this.repository = repository;
    }

}

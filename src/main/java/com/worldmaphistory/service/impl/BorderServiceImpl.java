package com.worldmaphistory.service.impl;

import com.worldmaphistory.model.Border;
import com.worldmaphistory.repository.BorderRepository;
import com.worldmaphistory.service.BorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorderServiceImpl implements BorderService {

    @Autowired
    private final BorderRepository borderRepository;

    public BorderServiceImpl(BorderRepository borderRepository) {
        this.borderRepository = borderRepository;
    }

    public List<Border> findAll() {
        return (List<Border>) borderRepository.findAll();
    }

    public Border save(Border border) {
        return borderRepository.save(border);
    }

}

package com.worldmaphistory.service;

import com.worldmaphistory.model.mappingobject.Border;
import com.worldmaphistory.repository.IBorderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorderService extends BaseService<Border> {

    public BorderService(IBorderRepository borderRepository) {
        super(borderRepository);
    }

    public List<Border> findAll() {
        return (List<Border>) repository.findAll();
    }

    public void save(Border border) {
        repository.save(border);
    }

}

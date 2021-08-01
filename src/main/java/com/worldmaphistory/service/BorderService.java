package com.worldmaphistory.service;

import com.worldmaphistory.model.Border;

import java.util.List;

public interface BorderService {

    List<Border> findAll();

    Border save(Border border);

}

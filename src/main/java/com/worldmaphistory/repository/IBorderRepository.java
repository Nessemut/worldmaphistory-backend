package com.worldmaphistory.repository;

import com.worldmaphistory.model.mappingobject.Border;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorderRepository extends CrudRepository<Border, Long> {
}

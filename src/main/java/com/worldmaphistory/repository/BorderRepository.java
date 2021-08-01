package com.worldmaphistory.repository;

import com.worldmaphistory.model.Border;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BorderRepository extends CrudRepository<Border, Long> {

}

package com.aficionado.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementsRepository extends CrudRepository <Measurements, Long> {
   
}

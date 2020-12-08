package com.aficionado.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMeasurementsRepository extends CrudRepository <UserMeasurements, Long> {
   
}

package com.aficionado.repository;

import com.aficionado.models.UserMeasurements;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMeasurementsRepository extends CrudRepository<UserMeasurements, Long> {
   
}

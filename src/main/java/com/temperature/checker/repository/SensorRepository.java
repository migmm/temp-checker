package com.temperature.checker.repository;

import com.temperature.checker.model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends MongoRepository <Sensor, String> {

}

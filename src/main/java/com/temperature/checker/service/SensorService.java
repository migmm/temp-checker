package com.temperature.checker.service;

import com.temperature.checker.model.Sensor;
import com.temperature.checker.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorRepository sensorRepository;

    public void save (Sensor sensor) {
        sensorRepository.save(sensor);
    }

    public List<Sensor> findAll() {
        return sensorRepository.findAll();
    }

    public Optional<Sensor> findById(String id) {
        return sensorRepository.findById(id);
    }

    public void deleteById(String id) {
        sensorRepository.deleteById(id);
    }
}

package com.temperature.checker.controller;

import com.temperature.checker.model.Sensor;
import com.temperature.checker.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SensorController {

    private final SensorService sensorService;

    @PostMapping("/sensor")
    public void save(@RequestBody Sensor sensor) {
        sensorService.save(sensor);
    }

    @GetMapping("/sensor")
    public List<Sensor> findAll() {
        return sensorService.findAll();
    }

    @GetMapping("/sensor/{id}")
    public Sensor findById(@PathVariable String id) {
        return sensorService.findById(id).get();
    }

    @DeleteMapping("/sensor/{id}")
    public void deleteById(@PathVariable String id) {
        sensorService.deleteById(id);
    }

    @PutMapping("/sensor")
    public void update(@RequestBody Sensor sensor) {
        sensorService.save(sensor);
    }
}

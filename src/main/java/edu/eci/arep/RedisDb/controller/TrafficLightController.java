package edu.eci.arep.RedisDb.controller;

import edu.eci.arep.RedisDb.entity.TrafficLight;
import edu.eci.arep.RedisDb.service.RedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/trafficLight")
public class TrafficLightController {

    private RedisRepository trafficLightRepository;

    @Autowired
    public TrafficLightController(RedisRepository trafficLightRepository) {
        this.trafficLightRepository = trafficLightRepository;
    }

    @GetMapping("/{id}")
    public TrafficLight findById(@PathVariable String id){
        return trafficLightRepository.findById(id);
    }

    @GetMapping
    public Iterable<TrafficLight> findAll(){

        return trafficLightRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody TrafficLight trafficLight){
        trafficLightRepository.save(trafficLight);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        trafficLightRepository.delete(id);
    }
}

package edu.eci.arep.RedisDb.controller;

import edu.eci.arep.RedisDb.entity.TrafficLight;
import edu.eci.arep.RedisDb.repository.TrafficLightRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/trafficLight")
public class TrafficLightController {


    private TrafficLightRepository trafficLightRepository;

    public TrafficLightController(TrafficLightRepository trafficLightRepository) {
        this.trafficLightRepository = trafficLightRepository;
    }

    @GetMapping("/{id}")
    public TrafficLight findById(@PathVariable String id){
        return trafficLightRepository.findById(id);
    }

    @GetMapping
    public Map<String, TrafficLight> findAll(){
        return trafficLightRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody TrafficLight trafficLight){
    	System.out.println(trafficLight.getSpeed());
        //trafficLightRepository.save(trafficLight);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        trafficLightRepository.delete(id);
    }
}

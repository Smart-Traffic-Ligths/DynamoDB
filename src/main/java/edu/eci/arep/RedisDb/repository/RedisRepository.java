package edu.eci.arep.RedisDb.repository;

import edu.eci.arep.RedisDb.entity.TrafficLight;

import java.util.List;
import java.util.Map;

public interface RedisRepository {
    Map<String, TrafficLight> findAll();
    TrafficLight findById(String id);
    void save(TrafficLight trafficLight);
    void delete(String id);
}

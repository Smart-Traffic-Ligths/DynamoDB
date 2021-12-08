package edu.eci.arep.RedisDb.repository;

import edu.eci.arep.RedisDb.entity.TrafficLight;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.UUID;

@Repository
public class TrafficLightRepository implements RedisRepository{
    private static final String KEY = "TrafficLight";

    private RedisTemplate<String, TrafficLight> redisTemplate;
    private HashOperations hashOperations;

    public TrafficLightRepository(RedisTemplate<String, TrafficLight> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public Map<String, TrafficLight> findAll() {
        return hashOperations.entries(KEY);
    }

    @Override
    public TrafficLight findById(String id) {
        return (TrafficLight) hashOperations.get(KEY, id);
    }

    @Override
    public void save(TrafficLight trafficLight) {
        hashOperations.put(KEY, UUID.randomUUID().toString(), trafficLight);
    }

    @Override
    public void delete(String id) {
        hashOperations.delete(KEY, id);
    }
}

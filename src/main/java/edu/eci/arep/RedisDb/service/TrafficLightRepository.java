package edu.eci.arep.RedisDb.service;


import edu.eci.arep.RedisDb.data.DataRepository;
import edu.eci.arep.RedisDb.entity.TrafficLight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class TrafficLightRepository implements RedisRepository{
    private static final String KEY = "TrafficLight2";

    private RedisTemplate<String, String> redisTemplate;
    private HashOperations hashOperations;
    private DataRepository dataRepository;

    @Autowired
    public TrafficLightRepository(RedisTemplate<String, String> redisTemplate, DataRepository dataRepository) {
        this.redisTemplate = redisTemplate;
        this.dataRepository = dataRepository;
    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(TrafficLight trafficLight) {
        dataRepository.save(trafficLight);
    }

    @Override
    public Iterable<TrafficLight> findAll() {
        return dataRepository.findAll();
        //return null;
    }

    @Override
    public TrafficLight findById(String id) {
        return dataRepository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        hashOperations.delete(KEY, id);
    }
}

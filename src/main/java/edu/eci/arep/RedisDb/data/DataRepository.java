package edu.eci.arep.RedisDb.data;

import edu.eci.arep.RedisDb.entity.TrafficLight;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DataRepository extends CrudRepository<TrafficLight,String> {

}

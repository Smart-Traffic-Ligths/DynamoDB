package edu.eci.arep.RedisDb.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class TrafficLight implements Serializable {
	
	private String traffic_light;
	private String lights_status;
	private long duration_lights;
	private long traffic_volume;
	private int lane_occupancy;
	private long speed;
	private String date_day;
	private String time_day;

	public TrafficLight(String traffic_light, String lights_status, long duration_ligths, long traffic_volume,
		int lane_occupancy, long speed, String date_day, String time_day) {
		super();
		this.traffic_light = traffic_light;
		this.lights_status = lights_status;
		this.duration_lights = duration_ligths;
		this.traffic_volume = traffic_volume;
		this.lane_occupancy = lane_occupancy;
		this.speed = speed;
		this.date_day = date_day;
		this.time_day = time_day;
	}

	public String getTraffic_light() {
		return traffic_light;
	}
	
	
	public void setTraffic_light(String traffic_light) {
		this.traffic_light = traffic_light;
	}
	
	public String getLights_status() {
		return lights_status;
	}

	public void setLights_status(String lights_status) {
		this.lights_status = lights_status;
	}

	public long getDuration_ligths() {
		return duration_lights;
	}

	public void setDuration_ligths(long duration_ligths) {
		this.duration_lights = duration_ligths;
	}

	public long getTraffic_volume() {
		return traffic_volume;
	}

	public void setTraffic_volume(long traffic_volume) {
		this.traffic_volume = traffic_volume;
	}

	public int getLane_occupancy() {
		return lane_occupancy;
	}

	public void setLane_occupancy(int lane_occupancy) {
		this.lane_occupancy = lane_occupancy;
	}

	public long getSpeed() {
		return speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}

	public String getDate_day() {
		return date_day;
	}

	public void setDate_day(String date_day) {
		this.date_day = date_day;
	}

	public String getTime_day() {
		return time_day;
	}

	public void setTime_day(String time_day) {
		this.time_day = time_day;
	}   
}


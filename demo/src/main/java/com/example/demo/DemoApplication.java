package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
	
	public void deserialise() {
		RestTemplate restTemplate = new RestTemplate();
		String url="https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22";
		restTemplate.getForObject(url, dto.class);
		
	}
	
	public LocalDate findDay(dto dto) {
		ArrayList<Double> list = new ArrayList<Double>();
		
		list.add(dto.getTemp_max());
		Double temp_max = Collections.max(list);
		LocalDate day = null;
		while(dto.getTemp_max()==temp_max) {
			day = dto.getDt_txtDate();
		}
		return day;
		
	}
	public void getDetails(dto dto,LocalDate date) {
		if (dto.getDt_txtDate().equals(date)) {
			System.out.println(dto.getTemp_min());
			System.out.println(dto.getTemp_max());
			System.out.println(dto.getHumidity());
			System.out.println(dto.getMain());
		}
		
	}
	public List<LocalDate> name(dto dto) {
		ArrayList<LocalDate> list = new ArrayList<LocalDate>();
		while(dto.getMain().equalsIgnoreCase("rain")) {
			list.add(dto.getDt_txtDate());
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		DemoApplication ref = new DemoApplication();
		
	}
}

package com.example.demo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class dto {

	private LocalDate dt_txtDate;
	private double temp_min;
	private double temp_max;
	private int humidity;
	private String main;
	public LocalDate getDt_txtDate() {
		return dt_txtDate;
	}
	public void setDt_txtDate(LocalDate dt_txtDate) {
		this.dt_txtDate = dt_txtDate;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	@Override
	public String toString() {
		return "dto [dt_txtDate=" + dt_txtDate + ", temp_min=" + temp_min + ", temp_max=" + temp_max + ", humidity="
				+ humidity + ", main=" + main + "]";
	}
	
	
	
}

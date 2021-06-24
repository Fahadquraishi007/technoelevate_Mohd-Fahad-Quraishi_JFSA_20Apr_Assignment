package com.te.springcoreannotations.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Car;
import com.te.springcoreannotations.beans.Engine;
import com.te.springcoreannotations.beans.Wheels;

@Configuration
public class WheelsConfig {

	@Bean(name = "mrf")
	public Wheels getWheels() {
		return new Wheels("MRF", 17);
	}
	
	@Bean(name = "ceat")
	public Wheels getWheel() {
		return new Wheels("CEAT", 18);
	}
	
	@Bean
	public Car getCar() {
		return new Car(new Engine(), new Wheels());
	}
}
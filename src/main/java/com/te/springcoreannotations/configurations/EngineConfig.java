package com.te.springcoreannotations.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Engine;

@Configuration
public class EngineConfig {

	@Bean
	public Engine getEngine() {
		return new Engine(8000, "V8");
	}
}
package com.te.springcoreannotations.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Department;
import com.te.springcoreannotations.beans.Library;
@Configuration
public class LibraryConfig {


	@Bean(name = "dev")
	public Library getLib() {
		return new Library(10,"DEV"); 
	}
	
	@Bean(name = "sales")
	public Library getLibSales() {
		return new Library(20,"Sales"); 
	}
	
	@Bean(name = "hr")
//	@Primary
	public Library getLibHR() {
		return new Library(30,"HR"); 
	}
}


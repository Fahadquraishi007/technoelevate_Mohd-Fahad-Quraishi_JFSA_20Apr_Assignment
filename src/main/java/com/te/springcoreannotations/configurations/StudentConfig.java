package com.te.springcoreannotations.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.beans.Department;
import com.te.springcoreannotations.beans.EmployeeBean;
import com.te.springcoreannotations.beans.Library;
import com.te.springcoreannotations.beans.Students;
@Configuration
public class StudentConfig {
	@Bean(name = "one")
	public Students getStudent() {
		return new Students();
	}
	@Bean(name = "two")
	public Students getstdObject() {
		return new Students(10,"Lohith" ,new Library());
	}
	@Bean(name = "three")
	public Students getstdPropertyData() {
		Students std = new Students();
		std.setId(20);
		std.setName("Mohit");
		return std;
	}

}

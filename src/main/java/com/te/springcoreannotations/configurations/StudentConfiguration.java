package com.te.springcoreannotations.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcoreannotations.beans.Students;

@Configuration
@Import({LibraryConfig.class})
public class StudentConfiguration {
	
	@Bean
	public Students	 getEmployee() {
		Students std = new Students();
		std.setId(100);
		std.setName("Yash");
//		bean.setDepartment(new Department());
		return std;
	}
}
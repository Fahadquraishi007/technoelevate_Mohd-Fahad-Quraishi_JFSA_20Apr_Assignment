package com.te.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.beans.Students;
import com.te.springcoreannotations.configurations.StudentConfiguration;

public class StdTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

		Students student = context.getBean(Students.class);

		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getLibrary().getLid());
		System.out.println(student.getLibrary().getLname());
}
}

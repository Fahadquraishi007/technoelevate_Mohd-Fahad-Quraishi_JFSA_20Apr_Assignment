package com.te.springcoreannotations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.te.springcoreannotations.beans.Students;

import com.te.springcoreannotations.configurations.StudentConfig;

public class StudentTestClass {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		

		Students stdOne = context.getBean(Students.class);
		
		System.out.println(" Enter the ID of First Student");
		stdOne.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println(" Enter the Name of First Student");
		stdOne.setName(scanner.nextLine());
		
		System.out.println("Student Object One - "+ stdOne);
		
		Students stdTwo = context.getBean(Students.class);
		
		System.out.println(" Enter the ID of Second Student");
		stdTwo.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println(" Enter the Name of Second Student");
		stdTwo.setName(scanner.nextLine());
		
		System.out.println("Student Object Two - "+ stdTwo);
		
		System.out.println("-----------------------------");
		
		System.out.println("Student Object One - "+ stdOne);
		
		System.out.println(stdOne);

	}

}

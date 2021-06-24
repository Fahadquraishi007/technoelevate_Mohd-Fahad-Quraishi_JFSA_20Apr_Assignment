package com.te.springcoreannotations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.beans.EmployeeBean;
import com.te.springcoreannotations.configurations.EmployeeConfig;

public class EmployeeTestClass {

static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		

		EmployeeBean empOne = context.getBean(EmployeeBean.class);
		
		
		System.out.println(" Enter the ID of First Employee");
		empOne.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println(" Enter the Name of First Employee");
		empOne.setName(scanner.nextLine());
		
		System.out.println("Employee Object One - "+ empOne);
		
		EmployeeBean empTwo = context.getBean(EmployeeBean.class);
		
		System.out.println(" Enter the ID of Second Employee");
		empTwo.setId(Integer.parseInt(scanner.nextLine()));
		
		System.out.println(" Enter the Name of Second Employee");
		empTwo.setName(scanner.nextLine());
		
		System.out.println("Employee Object Two - "+ empTwo);
		
		System.out.println("-----------------------------");
		
		System.out.println("Employee Object One - "+ empOne);
		
		System.out.println(empOne);
		
	}
}

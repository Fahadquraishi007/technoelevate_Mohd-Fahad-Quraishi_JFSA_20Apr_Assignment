package com.te.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.beans.EmployeeBean;
import com.te.springcoreannotations.configurations.EmployeeConfiguration;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		
		System.out.println(employeeBean.getId());
		System.out.println(employeeBean.getName());
		System.out.println(employeeBean.getDepartment().getDid());
		System.out.println(employeeBean.getDepartment().getDname());
	}
}

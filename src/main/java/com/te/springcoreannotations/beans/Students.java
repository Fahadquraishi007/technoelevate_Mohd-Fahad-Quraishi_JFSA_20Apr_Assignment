package com.te.springcoreannotations.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Students implements Serializable {
	
	private int id;
	
	private String name;
	
	private Library library;
	
	public Students() {
		
	}

}

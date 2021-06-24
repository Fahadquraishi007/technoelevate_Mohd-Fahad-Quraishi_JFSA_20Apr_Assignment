package com.te.springcoreannotations.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Library implements Serializable {

	private int lid;
	
	private String lname;
	
	public Library() {
		
	}
}

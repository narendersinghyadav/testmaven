package com.testmaven.service;

/**
 * Teacher operation class implements salary interface which have
 * method calculate salary which must be defined here
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public class TeacherOperation implements SalaryInterface{

	/** 
	 * calculate teacher salary which is 5 times the number of hours worked 
	 * @param hours number of hours teacher worked
	 */
	public int calculateSalary(int hours) {
		
		//return 5 times hour
		return hours*5;
	}
}

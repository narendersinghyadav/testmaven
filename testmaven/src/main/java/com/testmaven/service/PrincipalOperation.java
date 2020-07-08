package com.testmaven.service;

/**
 * Principal operation inherit salary interface and implements calculate salary
 * method declared in salary interface
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public class PrincipalOperation implements SalaryInterface{

	/** 
	 * calculate salary method which takes hours and input and return salary
	 * @param hours number of hours principal worked
	 */
	public int calculateSalary(int hours) {
		
		//return 10 times the number of hours
		return hours*10;
	}
}

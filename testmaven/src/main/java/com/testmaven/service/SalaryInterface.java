package com.testmaven.service;

/**
 * Salary Interface have functionality of calculate salary 
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public interface SalaryInterface {

	/** 
	 * Calculate salary method take input number of hours and return salary
	 * @param hours number of hours worked
	 */
	public int calculateSalary(int hours);
}

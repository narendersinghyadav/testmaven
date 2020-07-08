package com.testmaven.service;

/**
 * Teacher operation class implements salary interface which have
 * method calculate salary which must be defined here
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public class TeacherOperation implements SalaryInterface{

	public int calculateSalary(int hours) {
		return hours*5;
	}
}

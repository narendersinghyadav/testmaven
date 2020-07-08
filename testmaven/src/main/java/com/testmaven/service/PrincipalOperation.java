package com.testmaven.service;

/**
 * Principal operation inherit salary interface and implements calculate salary
 * method declared in salary interface
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public class PrincipalOperation implements SalaryInterface{

	public int calculateSalary(int hours) {
		return hours*10;
	}
}

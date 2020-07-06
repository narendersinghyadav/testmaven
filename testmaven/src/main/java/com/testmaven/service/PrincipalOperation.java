package com.testmaven.service;

public class PrincipalOperation implements SalaryInterface{

	public int calculateSalary(int hours) {
		return hours*10;
	}

}

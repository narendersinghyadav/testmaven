package com.testmaven.service;

public class TeacherOperation implements SalaryInterface{

	public int calculateSalary(int hours) {
		return hours*5;
	}

}

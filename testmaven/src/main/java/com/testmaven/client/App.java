package com.testmaven.client;

import com.testmaven.service.PrincipalOperation;
import com.testmaven.service.SalaryInterface;
import com.testmaven.service.TeacherOperation;

import testmaven1.testmaven1.Sum;

/**
 * Client method here all service methods are called
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public class App {
	
	/** Main method */
	public static void main( String[] args ) {
		System.out.println( "Hello World!" );

		/** Sum class object and functionality*/
		Sum s=new Sum();
		System.out.println(s.calculateSum(100, 20));

		/** Salary of principal and teacher */
		SalaryInterface principalsalary=new PrincipalOperation();
		SalaryInterface teachersalary=new TeacherOperation();
		System.out.println(teachersalary.calculateSalary(10) );
		System.out.println(principalsalary.calculateSalary(10));
	}
}

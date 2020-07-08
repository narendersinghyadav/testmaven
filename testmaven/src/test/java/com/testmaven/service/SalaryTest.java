package com.testmaven.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Junit4 test salary class for both principal and teacher
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public class SalaryTest {

	/** class instance reference of principal salary */
	private static SalaryInterface principalsalary;

	/** class instance reference of teacher salary */
	private static SalaryInterface teachersalary;

	/** Before class -static method to create objects */
	@BeforeClass
	public static void initSalary() {
		principalsalary=new PrincipalOperation();
		teachersalary=new TeacherOperation();
	}

	/** before each  test method executed */
	@Before
	public void beforeExecution() {
		System.out.println("before execution");
	}

	/** After each test method is executed */
	@After
	public void afterExecution() {
		System.out.println("after execution of testcsases");
	}

	/** Test principal salary calculation */
	@Test
	public void testPrincipal() {
		int result=principalsalary.calculateSalary(20);
		assertEquals(200,result);
	}

	/** Test teacher salary calculation */
	@Test
	public void testTeacher() {
		int result=teachersalary.calculateSalary(20);
		assertEquals(100,result);
	}
}

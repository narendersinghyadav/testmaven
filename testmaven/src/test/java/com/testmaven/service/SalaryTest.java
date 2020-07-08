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

	private static SalaryInterface principalsalary;

	private static SalaryInterface teachersalary;

	@BeforeClass
	public static void initSalary() {
		principalsalary=new PrincipalOperation();
		teachersalary=new TeacherOperation();
	}

	@Before
	public void beforeExecution() {
		System.out.println("before execution");
	}

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

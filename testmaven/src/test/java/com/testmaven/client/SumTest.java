package com.testmaven.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import testmaven1.testmaven1.Sum;

/**
 * Test sum calculation
 * 
 * @version 1.0 08 July 2020
 * @author narender yadav
 */
public class SumTest {

	private static Sum s;
	
	@BeforeClass
	public static  void initSum() {
		s=new Sum();
	}
	
	@Before
	public void beforeSum() {
		System.out.println("before test execution");
	}
	
	@After
	public void afterTest() {
		System.out.println("after test execution");
	}
	
	/** Test calculateSum method*/
	@Test
	public void test() {
		
		//Calculate sum of two numbers
		int result=s.calculateSum(10, 20);
		assertEquals(30,result);
		
	}

}

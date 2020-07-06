package com.testmaven.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import testmaven1.testmaven1.Sum;

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
	@Test
	public void test() {
		int result=s.calculateSum(10, 20);
		assertEquals(30,result);
		
	}

}

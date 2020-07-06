package com.testmaven.client;

import com.testmaven.service.PrincipalOperation;
import com.testmaven.service.SalaryInterface;
import com.testmaven.service.TeacherOperation;

import testmaven1.testmaven1.Sum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Sum s=new Sum();
        System.out.println(s.calculateSum(100, 20));
        
        SalaryInterface principalsalary=new PrincipalOperation();
        SalaryInterface teachersalary=new TeacherOperation();
        
        System.out.println(teachersalary.calculateSalary(10) );
        System.out.println(principalsalary.calculateSalary(10));
    }
}

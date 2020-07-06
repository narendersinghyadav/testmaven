package testmaven.testmaven;

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
    }
}

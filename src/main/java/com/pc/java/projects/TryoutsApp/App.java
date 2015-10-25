package com.pc.java.projects.TryoutsApp;


/**
 * Hello world!
 *
 */
public class App 
{
	
	public double add (double value1, double value2)
	{
		return value1+value2;
	}
	
	public double divide (double dividend, double divisor) throws IllegalArgumentException
	{
		//return (divisor == 0) ? 0 : dividend / divisor;
		if(divisor == 0) throw new IllegalArgumentException("Divisor cannot be zero");
		return dividend / divisor;
	}
	
    public static void main( String[] args )
    {
        App test = new App();
        System.out.println(test.add(-20,10));
        System.out.println("Another output");
    }
}

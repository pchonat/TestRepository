package com.pc.java.projects.TryoutsApp;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.*;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

@RunWith(Parameterized.class)

public class AppTest {
	
	@Parameter
	public double param1;
	
	@Parameter (value=1)
	public double param2;
	
	private App test;
	
	
	/*public AppTest(double value1,double value2)
	{
		param1=value1;
		param2=value2;
	}*/

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass invocation");
	}

	@Before
	public void setUpq() throws Exception {
		System.out.println("Within Setup");
		test = new App();
	}
	

	@After
	public void tearDown() throws Exception {
	}
	
	@Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 , 2 }, { 5, 3 }, { 121, 4 } };
        return Arrays.asList(data);
    }

	@Test
	public void additionShouldreturnValue() {
		
		assertEquals("Value should be 15",15,test.add(10, 5),0);
	}
	
	@Test
	public void parameterizedAdditionShouldreturnValue() {
		
		assertEquals("Value should be as expected"+param1+param2,param1+param2,test.add(param1,param2),0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void divisionShouldThrowException() {
		test.divide(10,0);
	}

}

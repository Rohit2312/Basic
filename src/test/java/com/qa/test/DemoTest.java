package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	
	@Test
	
	public void sum()
	{
		System.out.println("Sum");
		int a=10;
		int b=20;
		
		Assert.assertEquals(30,a+b);
	}
	
@Test
	public void sub()
	{
		System.out.println("Sub");
		int a=20;
		int b=10;
		
		Assert.assertEquals(10,a-b);
	}

	
	
	
	
}

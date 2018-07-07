package com.epam.mentoring.calculator.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestDiv extends BaseTest {
	private double a;
	private double b;
	private double c;
	
	public TestDiv(double a,double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Test()
	public void testDiv()
	{
		double result = calc.div(a,b);
		Assert.assertEquals(result, c, 0.0001);
	}

	
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         {0, 0, 0 },
	         {15.5,2.5,6.2},
	         {8.0001,9.555 ,0.8372},
	      });
	   }
}

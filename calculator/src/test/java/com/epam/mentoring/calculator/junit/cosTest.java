package com.epam.mentoring.calculator.junit;
import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.epam.mentoring.calculator.junit.BaseTest;

@RunWith(Parameterized.class)
public class cosTest extends BaseTest {
	private double a;
	private double b;
	
	public cosTest(double a,double b) {
		this.a=a;
		this.b=b;
	}
	@Test()
	public void cosTest()
	{
		double result = calc.cos(a);
		Assert.assertEquals(result, b, 0.0001);
	}

	
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         {0, 0 },
	         {30,0.15425144988},
	         {90, -0.44807361612 },
	      });
	   }
}

package com.epam.mentoring.calculator.junit;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ctgTest extends BaseTest {
	private double a;
	private double b;
	
	public ctgTest(double a,double b) {
		this.a=a;
		this.b=b;
	}
	@Test()
	public void cosTest()
	{
		double result = calc.ctg(a);
		Assert.assertEquals(result, b, 0.0001);
	}

	
	@Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         {0, 0 },
	         {30,1.7321},
	         {90, 0 },
	      });
	   }
}

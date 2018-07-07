package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSqrt extends BaseTest{

	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{0,0},
		{9, 3},
		{10000, 100},
		{-8,0},
		};
	}
		
	@Test(dataProvider="values",groups = "demogroup")
	public void sqrtTest(double a, double b)
	{
		double result = calc.sqrt(a);
		Assert.assertEquals(result, b, 0.001);
		
		
	}

}

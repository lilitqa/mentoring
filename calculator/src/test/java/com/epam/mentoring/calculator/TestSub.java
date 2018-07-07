package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSub extends BaseTest{

	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{0,0,0},
		{9, 3,6},
		{10000, 100,9900},
		{-8, 2.4,-10.4},
		{-8, -8,0},
		{ 1, 9000,-8999},
		{ 2.70005, 1.3,1.40005},
		};
	}
		
	@Test(dataProvider="values",groups = "demogroup")
	public void subTest(double a, double b,double c)
	{
		double result = calc.sub(a, b);
		Assert.assertEquals(result, c, 0.001);
		
		
	}

}

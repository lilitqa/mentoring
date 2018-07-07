package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.ReadExcel;

public class MultDouble extends BaseTest {

	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{0,0,0},
		{5.5, 2, 11},
		{-2, 4, -8},
		{0.1, 0.001, 0.0001},
		};
	}
		
	@Test(dataProvider="values",groups = "demogroup")
	public void multDouble(double a, double b,double c)
	{
		
		double result = calc.mult(a,b);
		Assert.assertEquals(result, c, 0.001);
	}

}

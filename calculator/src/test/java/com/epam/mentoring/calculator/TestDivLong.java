package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDivLong extends BaseTest {

	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{0,0,0},
		{1,1,1},
		{5, 3, 1},
		{100,2,50},
		{-20,8,-2}
		};
	}
	
	
	@Test(dataProvider="values",groups = "demogroup")
	public void divLongTest(long a, long b, long c)
	{
		long result = calc.div(a, b);
		Assert.assertEquals(result,c);
	}

}

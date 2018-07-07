package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {
	
	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{1.0,57.2900},
		{45.0,1.0},
		};
	}
		
	@Test(dataProvider="values",groups = "demogroup")
	public void tgTest(double a, double b)
	{
		double result = calc.tg(a);
		Assert.assertEquals(result,b, 0.0001);
	}

}
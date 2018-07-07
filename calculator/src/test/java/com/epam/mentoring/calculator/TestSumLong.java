package com.epam.mentoring.calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSumLong extends BaseTest{

	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{0,0,0},
		{9, 3,12},
		{10000, 100,10100},
		{-8, -8,-16},
		{ 1, 9000,9001},
		};
	}
		
	@Test(dataProvider="values",groups = "demogroup")
	public void sumLongTest(long a, long b,long c)
	{
		long result = calc.sum(a, b);
		Assert.assertEquals(result, c, 0.001);	
	}

}
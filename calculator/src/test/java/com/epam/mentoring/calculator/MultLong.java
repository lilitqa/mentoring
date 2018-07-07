package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLong extends BaseTest
{
	
@DataProvider(name="values")
public Object[][] value() {
return new Object[][] {
	{0,0,0},
	{5, 5, 25},
	{-2, 4, -8},
	{10, 1000, 10000},
	};
}
	
@Test(dataProvider="values",groups = "demogroup")
public void multLong(long a, long b,long c)
{
	long result = calc.mult(a,b);
	Assert.assertEquals(result, c);
}

}

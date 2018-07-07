package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {
		
		@DataProvider(name="values")
		public Object[][] value() {
		return new Object[][] {
			{0.0,0.0},
			{1.0,0.01745240643},
			{45.0,0.70710678118},
			{90.0,1.0},	
			};
		}
		
			
		@Test(dataProvider="values", groups = "demogroup")
		public void sinTest(double a, double b)
		{
			double result = calc.sin(a);
			Assert.assertEquals(b, result, 0.0001);
		}

	}



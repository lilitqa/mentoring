package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {
	
	 @Parameters({"positiveLong"})
	 @Test(groups = "demogroup")
	 public void isPositive(@Optional(value="50") long positiveLong)
	 {
		boolean result= calc.isPositive(positiveLong);
		Assert.assertTrue(result);
	 }
}

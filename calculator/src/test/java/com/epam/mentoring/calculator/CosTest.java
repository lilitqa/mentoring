package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.ReadExcel;

public class CosTest extends BaseTest {
	
	@DataProvider(name="values")
	public Object[][] values() throws Exception{
		 
        Object[][] testObjArray = ReadExcel.getTableArray("C:\\Users\\Lilit_Vardanyan\\Desktop\\TestData.xlsx","Sheet1");
        return (testObjArray);

		}
	
		
	@Test(dataProvider="values", groups = "skip")
	public void cosTest(double a, double b)
	{
		double result = calc.cos(a);
		Assert.assertEquals(result,b, 0.0001);
	}

}

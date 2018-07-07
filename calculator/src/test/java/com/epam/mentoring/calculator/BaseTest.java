package com.epam.mentoring.calculator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;

public class BaseTest {
	
protected Calculator calc;
	
	@BeforeClass (alwaysRun = true)
	public  void Setup()
	{
		calc = new Calculator();	
	}
	
	@AfterClass (alwaysRun = true)
	public  void TearDown()
	{
		calc = null;	
	}
}

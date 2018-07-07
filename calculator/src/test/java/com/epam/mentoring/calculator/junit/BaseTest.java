package com.epam.mentoring.calculator.junit;

import org.junit.*;

import com.epam.tat.module4.Calculator;

public class BaseTest {
	
protected Calculator calc;
	
	@Before
	public  void Setup()
	{
		calc = new Calculator();	
	}
	
	@After
	public  void TearDown()
	{
		calc = null;	
	}
}


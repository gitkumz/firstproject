package org.login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckingTestngflw {
	
	@BeforeSuite
	
	private void launch() {
		System.out.println("first 1st launch the browser");

	}
	
	@BeforeTest
	
	private void launchpart2() {
		System.out.println("second 2n launch the broser");
	}
	
	@BeforeMethod
	
	private void launchpart3() {
		System.out.println("Before Method Before MethodBefore MethodBefore MethodBefore Method");
	
	}
	
	@Test
	
	private void testmethod() {
		
		System.out.println("Test---1111111111111111111");
		
	}
	
	@Test
	
	private void testmethod2() {
		System.out.println("test=222222222222222222");
		
	}
	
	@AfterMethod
	
	private void samplemethod() {
		System.out.println("After After After After After After After After ");
		
	}
}

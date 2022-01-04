package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class ScreeshotExampleshere {
	WebDriver driver;
	
	@BeforeSuite
	
	private void launchurl() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
	}
	@BeforeMethod
	
	private void clickc() {
		
		driver.navigate().refresh();
		
	}
	
	@AfterMethod
	
	private void naviagteem() {
		driver.navigate().back();

	}

	

	
	
	@Test
	
	private void driverlaunch() {
		WebElement ClickAlert = driver.findElement(By.name("username"));
		ClickAlert.sendKeys("vijaykumar220997");

WebElement ClickAlerts = driver.findElement(By.name("password"));
	ClickAlerts.sendKeys("Vijay@123");		
	
					WebElement clickloginbtn = driver.findElement(By.name("login"));
					clickloginbtn.click();		
	}	
	
	@Test(invocationCount = 2)
	
	private void failmethodshow() {
		WebElement ClickAlert = driver.findElement(By.name("username"));
		ClickAlert.sendKeys("kumar.k");

WebElement ClickAlerts = driver.findElement(By.name("password"));
	ClickAlerts.sendKeys("Sathiyavani@1");		
	
					WebElement clickloginbtn = driver.findElement(By.name("login"));
					clickloginbtn.click();		


	}
	
	@Test
	private void driverlaunchpart2() {
		WebElement ClickAlert = driver.findElement(By.name("username"));
		ClickAlert.sendKeys("Bakthavachalam");

WebElement ClickAlerts = driver.findElement(By.name("password"));
	ClickAlerts.sendKeys("Sathiyavani@1");		
	
					WebElement clickloginbtn = driver.findElement(By.name("login"));
					clickloginbtn.click();		
	}
}
package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learn {
	
	public static WebDriver driver;
	public static Actions acc;		
	public static Select s;	
		public void launchbrowser() {
			
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	acc= new Actions(driver);
		}
		public void openurl(String url) {
			driver.get(url);
		}
		private WebElement elementLocatorBYId(String id) {
			WebElement finElement = driver.findElement(By.id(id));
			return finElement;	
		}
		private void elementLocatorByXpath(String xpath) {
			driver.findElement(By.xpath(xpath));
		}
		private void click(WebElement element) {
			element.click();
		}
		private void maxi() {
			driver.manage().window().maximize();
		}
		private void iwait(int time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		private void movecusor(WebElement element) {
			acc.moveToElement(element).perform();
		}
		private void dragandrop(WebElement drag, WebElement drop) {
			acc.dragAndDrop(drag, drop).perform();
		}
		
		private void selectByIndex(WebElement element, int index) {
			s = new Select(element);
			s.selectByIndex(index);
		}
		
		private void selectByValue(String value, WebElement element) {
			s = new Select(element);
			s.selectByValue(value);		
		}
		
		}
package com.TestNg.org.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Parallel_Test {

	@Test
	private void Amazon() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
		
	}
	
	
	@Test(invocationCount = 5)
	private void Flipcart() {
		System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");

	}
	
	@Test(priority = 1)
	private void instagram() {
    System.setProperty("webdriver.opera.driver",System.getProperty("user.dir")+"\\Driver\\operadriver.exe" );
    WebDriver driver= new OperaDriver();	
	driver.get("https://www.instagram.com/");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

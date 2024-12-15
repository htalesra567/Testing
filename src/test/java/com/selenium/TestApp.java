package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestApp {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void testApp() {
		
		driver.findElement(By.id("male")).click();
    	driver.findElement(By.id("female")).click();
    	
    	
	}

	@BeforeMethod
	public void testAnnotation()
	{
		
    	
       driver.get("https://artoftesting.com/samplesiteforselenium");
    	
    	driver.findElement(By.id("fname")).sendKeys("cdac in mumbai");
	}

}

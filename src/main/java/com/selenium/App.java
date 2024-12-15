package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://artoftesting.com/samplesiteforselenium");
    	
    	driver.findElement(By.id("fname")).sendKeys("cdac in mumbai");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("idOfButton")).click();
    	
    	
    	
    	
    	
//    	Actions act = new Actions(driver);
//    	WebElement ele = driver.findElement(By.id("dblClkBtn"));
//    	act.doubleClick(ele).perform();
//    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("male")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("female")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.className("Automation")).click();
    	
    	driver.findElement(By.className("Performance")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.id("performance")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("automation")).click();
    	
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//*[@id=\"AlertBox\"]/button")).click();
    	
    	//driver.findElement(By.xpath("//button[@style='background: rgb(40, 118, 153); --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor: #205e7a;']")).click();
    	//driver.findElement(By.xpath("//button[contains(@style, 'background: rgb(40, 118, 153);')]")).click();

    			
    			
    }
}

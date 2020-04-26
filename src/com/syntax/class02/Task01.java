package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
	
//	TC 2: Mercury Tours Registration: 
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info
//	Click Submit
//	User successfully registered
//	(Create 2 scripts using different locators)

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.partialLinkText("Register")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Smith");
		driver.findElement(By.name("phone")).sendKeys("345-456-0806");
		driver.findElement(By.id("userName")).sendKeys("johnSmith@yahoo.com");
		
		Thread.sleep(2000);
		driver.findElement(By.name("register")).click();
		
	}

}

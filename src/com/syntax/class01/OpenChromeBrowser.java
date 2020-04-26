package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();// go ahead and open chrome browser
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}

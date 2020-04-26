package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) {

		//1. set a system property
		System.setProperty("webdriver.chrome.driver", "/Users/andrii/eclipse-workspace/Selenium/drivers/chromedriver");
		
		//2. create an object of webdriver type
		WebDriver driver = new ChromeDriver();
		
		//3. navigate to Syntax application
		driver.get("https://syntaxtechs.com");
		
		
	}

}

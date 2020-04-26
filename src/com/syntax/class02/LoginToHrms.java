package com.syntax.class02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginToHrms {

		public static void main(String[] args) throws IOException, InterruptedException{
			System.out.println(System.getProperty("user.dir"));
			String filePath = System.getProperty("user.dir")+"/config/configurations.properties";
			
			FileInputStream fis = new FileInputStream(filePath);
			
			Properties prop = new Properties();
			
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			
			WebDriver driver = null;
			switch(browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				driver=new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
				driver=new SafariDriver();
				break;
			
			}
			
			driver.get(prop.getProperty("url"));
			Thread.sleep(3000);
			driver.close();
	}

}

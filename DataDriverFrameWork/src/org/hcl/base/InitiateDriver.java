package org.hcl.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitiateDriver {

	public ChromeDriver driver;
	
	@BeforeMethod
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	public void closeBowser()
	{
		driver.close();
	}
	
	
}

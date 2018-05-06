package org.hcl.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	ChromeDriver driver;
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElementById("email").sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElementById("pass").sendKeys(password);
	}
	
	public void clickSignin()
	{
		driver.findElementByXPath("//input[@type='submit']").click();
	}
	
}

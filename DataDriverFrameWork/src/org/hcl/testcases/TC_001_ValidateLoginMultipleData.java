package org.hcl.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hcl.base.InitiateDriver;
import org.hcl.pages.LoginPage;
import org.hcl.testData.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001_ValidateLoginMultipleData extends InitiateDriver{

	@Test
	public void tc_001() throws InterruptedException
	{
		
		LoginPage login = new LoginPage(driver);
	
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sadsadAS")));
	
		FluentWait wait1 = new FluentWait(driver);
		wait1.pollingEvery(2, TimeUnit.SECONDS);
		wait.ignoring(NoSuchFieldError.class);
		
		login.enterUsername("hello");
		login.enterPassword("test");
		
		login.clickSignin();
	}	
	
	
	
	
	
	
	
	
}

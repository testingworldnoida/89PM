package org.hcl.testcases;

import org.hcl.base.InitiateDriver;
import org.hcl.pages.LoginPage;
import org.hcl.testData.TestData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_002_login_validation extends InitiateDriver {
	@Test(dataProviderClass=TestData.class,dataProvider="dp1")
	public void tc_001(String a, String b)
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(a);
		login.enterPassword(b);
		login.clickSignin();
	}	
	
	@DataProvider(name="dp1")
	public Object[][] testData()
	{
		Object arr[][] = {
				           {"username","pass"},
				           {"username2","pass2"},
				           {"username3","pass2"}
				           
		};
	return arr;
	}

}

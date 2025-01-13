package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class Login extends BaseClass {
	
	
	
	@Test(groups= {"Regression","Master"}) //if we have onle one group {} not rquired 
	void loginApp() {
		
		try {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(p.getProperty("username"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLoginButton();
		//Assert.assertEquals(lp.getDashboardMessage(), "MANAGER'S DASHBOARD");
		boolean targetPage = lp.isDashboarPageExist();
		//Assert.assertEquals(targetPage, true, "Login Failed"); //on failing this message will displayed 
		Assert.assertTrue(targetPage);
		}
		catch(Exception e) {
			Assert.fail();
		}
	}
	
	
	

}

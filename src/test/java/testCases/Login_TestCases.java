package testCases;

import org.testng.annotations.Test;

import base.Base_Test;

public class Login_TestCases extends Base_Test {
	
	
	@Test
	public void loginTest001() throws InterruptedException {
		

		
		loginobj.setUserName("test_6");
		loginobj.setPassword("test_6");
		loginobj.getLoginButton().click();
		Thread.sleep(3000);
		loginobj.getLoginPopup().click();
//		loginobj.getLogOut().click();
		
		
		
		
//		String afterLogin = loginobj.getAfterLoginValidation().getText();
//		String actualLogin = "FTest Oasissys";
//		Assert.assertEquals(afterLogin, actualLogin);
	}

}


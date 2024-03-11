package testCases;

import org.testng.annotations.Test;

import base.Base_Test;

public class Login_TestCases extends Base_Test {
	
	@Test
	public void loginTest001() {
		
		
		loginobj.setUserName("test_6");
		loginobj.setPassword("test_6");
		loginobj.getLoginButton().click();
	}

}

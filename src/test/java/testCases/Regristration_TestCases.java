package testCases;

import org.testng.annotations.Test;

import base.Base_Test;

public class Regristration_TestCases extends Base_Test {

	@Test
	public void registerPatient() throws InterruptedException {

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		loginobj.setUserName("test_6");
		loginobj.setPassword("test_6");
		loginobj.getLoginButton().click();
		Thread.sleep(5000);
		loginobj.getLoginPopup().click();
		
		
		Thread.sleep(5000);
		registrationobj.getMenu().click();
		Thread.sleep(5000);
		registrationobj.getPatiendMasterIndex().click();
		registrationobj.getPmiProcessing().click();
		registrationobj.getPatientSearch().click();
		registrationobj.getRegisterNewPatient().click();

//		String navigateRegisterPage = registrationobj.getValidateRegisterPage().getText();
//		String validateRegisterPage = "Demographics";
//
//		Assert.assertEquals(navigateRegisterPage, validateRegisterPage);

		registrationobj.getTitleDropdown().click();
		registrationobj.getMissSelect().click();

		registrationobj.setFirstName("Shiny");
		registrationobj.setFamilyName("David");

		registrationobj.getSelectGender().click();
		registrationobj.setAge("01-01-1990");

		registrationobj.getMaritalStatusDropdown().click();
		registrationobj.getMaritalStatusMarried().click();

		registrationobj.setNationality("India");
		registrationobj.setJob("SQA");

		registrationobj.setMobileNumber("0512345678");
		registrationobj.getSaveChanges().click();

	}

}

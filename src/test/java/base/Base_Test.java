package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import pages.Login_Page;
import pages.Registration_Page;

public class Base_Test {

	public WebDriver driver;

	public Login_Page loginobj;
//	public Home_Page homeobj;
	public Registration_Page registrationobj;

	@BeforeTest
	public void openBrowser() {
		

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		loginobj = new Login_Page(driver);
//		homeobj = new Home_Page(driver);
		registrationobj = new Registration_Page(driver);
	}

	@BeforeClass
	public void navigateOasis() {

		driver.get("https://testplus.oasisapp.services/dhbhp/faces/Login.jsf");
	}

//	@AfterClass
//	public void closeBrowser() {
//		driver.close();
//	}

}

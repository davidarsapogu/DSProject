package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import pages.Login_Page;

public class Base_Test {

	WebDriver driver;

	public Login_Page loginobj;

	@BeforeTest
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		loginobj = new Login_Page(driver);
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

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	

	WebDriver driver;

	public Login_Page(WebDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "it1::content")
	private WebElement userName;

	@FindBy(id = "it2::content")
	private WebElement password;

	@FindBy(id = "login::text")
	private WebElement loginButton;
	
	@FindBy(id = "j_id8_yes")
	private WebElement loginPopup;
	
	
	@FindBy(xpath = "//span[@id='pt1:OasisHedarToolBar:logoutLink::text']")
	private WebElement logOut;
	
	

	
//	@FindBy(xpath = "//span[contains(text(),'FTest Oasissys')]")
//	private WebElement afterLoginValidation;
	
		
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String val) {
		this.userName.sendKeys(val);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String val) {
		this.password.sendKeys(val);
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
		
	public WebElement getLoginPopup() {
		return loginPopup;
	}

	public WebElement getLogOut() {
		return logOut;
	}

//	public WebElement getAfterLoginValidation() {
//	return afterLoginValidation;
//}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		
		this.driver= driver;		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//body[1]/form[1]/span[1]/span[3]/span[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")
	private WebElement menu;	
	
	@FindBy(xpath = "//span[contains(text(),'Patient Master Index')]")
	private WebElement patiendMasterIndex;
	
	@FindBy(xpath = "//span[contains(text(),'PMI Processing')]")
	private WebElement pmiProcessing;
	
	@FindBy(xpath = "//span[contains(text(),'Patient Search')]")
	private WebElement patientSearch;
	
	@FindBy(xpath = "//span[contains(text(),'Register a New Patient Info')]")
	private WebElement registerNewPatient;
	
	

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getPatiendMasterIndex() {
		return patiendMasterIndex;
	}

	public WebElement getPmiProcessing() {
		return pmiProcessing;
	}

	public WebElement getPatientSearch() {
		return patientSearch;
	}

	public WebElement getRegisterNewPatient() {
		return registerNewPatient;
	}

	
	


}

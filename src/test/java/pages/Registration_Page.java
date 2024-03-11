package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base_Test;

public class Registration_Page extends Base_Test {

	WebDriver driver;

	public Registration_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@class='hamburger-menu-btn xgn p_AFTextOnly']")
	private WebElement menu;	
	//elements for menu 
	//a[@class='hamburger-menu-btn xgn p_AFTextOnly']      
	
	
	@FindBy(xpath = "//span[contains(text(),'Patient Master Index')]")
	private WebElement patiendMasterIndex;
	
	@FindBy(xpath = "//span[contains(text(),'PMI Processing')]")
	private WebElement pmiProcessing;
	
	@FindBy(xpath = "//span[contains(text(),'Patient Search')]")
	private WebElement patientSearch;
	
	@FindBy(xpath = "//span[contains(text(),'Register a New Patient Info')]")
	private WebElement registerNewPatient;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:1:oc19:ff5:fi31:soc12::content")
	private WebElement titleDropdown;

	@FindBy(id = "id='f1']/span[@id='pt1:pt_pgl3']/div[@id='pt1:pt_pgl1']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/div[2]/span[1]/span[3]/span[1]/span[2]/span[2]/span[1]/select[1]/option[7]")
	private WebElement missSelect;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:1:oc19:ff5:fi32:ptnm1ar::content")
	private WebElement firstName;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:langs_or:langs_iter:1:oc19:ff5:fi35:nmfmar::content")
	private WebElement familyName;

	@FindBy(xpath = "//label[contains(text(),'Female')]")
	private WebElement selectGender;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:bscOc:ff1:greg_fi:greg_dob::content")
	private WebElement age;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:fi2122:soc11:codesSelect::content")
	private WebElement maritalStatusDropdown;

	@FindBy(xpath = "//option[contains(text(),'Married')]")
	private WebElement maritalStatusMarried;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:nat_it_fi:nat_it::content")
	private WebElement nationality;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc1:de_reg:0:demo_pg:or7:oc1:demo2_ff:job_it_fi:pat_job_it::content")
	private WebElement job;

	@FindBy(id = "pt1:contrRg:0:CntRgn:2:pt1regi:osc1:or1:oc2:or2:oc4:r2:0:addresspt1:of1:fg1:fi10:mobileIt::content")
	private WebElement mobileNumber;

	@FindBy(id = "//span[contains(text(),'Save Changes')]")
	private WebElement saveChanges;
	
//	@FindBy(id = "//h2[contains(text(),'Demographics')]")
//	private WebElement validateRegisterPage;
	
	
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
	

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String val) {
		this.firstName.sendKeys(val);
	}

	public WebElement getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String val) {
		this.familyName.sendKeys(val);
	}

	public WebElement getAge() {
		return age;
	}

	public void setAge(String val) {
		this.age.sendKeys(val);
	}

	public WebElement getNationality() {
		return nationality;
	}

	public void setNationality(String val) {
		this.nationality.sendKeys(val);;
	}

	public WebElement getJob() {
		return job;
	}

	public void setJob(String val) {
		this.job.sendKeys(val);
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String val) {
		this.mobileNumber.sendKeys(val);
	}

	public WebElement getTitleDropdown() {
		return titleDropdown;
	}

	public WebElement getMissSelect() {
		return missSelect;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public WebElement getMaritalStatusDropdown() {
		return maritalStatusDropdown;
	}

	public WebElement getMaritalStatusMarried() {
		return maritalStatusMarried;
	}

	public WebElement getSaveChanges() {
		return saveChanges;
	}
	
//	public WebElement getValidateRegisterPage() {
//		return validateRegisterPage;
//	}

}

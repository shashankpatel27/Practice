package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelInsurance {

	private WebDriver driver;
	private WebDriverWait wait; 
	private Actions act;
	
	@FindBy (xpath ="//input[@id='country']") 
	private WebElement enterDestination;
	
	@FindBy (xpath ="//li[@class='search-item']") 
	private WebElement selectEnteredCountry;
	
	@FindBy (xpath ="//button[@class='travel_main_cta']") 
	private WebElement nextbtn;
	
	@FindBy (xpath ="(//input[@aria-invalid='false'])[1]") 
	private WebElement selectStartDate;
	
	@FindBy (xpath ="(//input[@aria-invalid='false'])[2]") 
	private WebElement selectEndDate;
	
	@FindBy (xpath ="//div[@id='0']") 
	private WebElement selectAge;
	
	@FindBy (xpath ="//label[text()='25 years']") 
	private WebElement select25yr;
	
	@FindBy (xpath ="//input[@id='ped_no']") 
	private WebElement selectNo;
	
	@FindBy (xpath ="//input[@id='mobileNumber']") 
	private WebElement enterMobileNum;
	
	//////////////////////////////////////////////////
	
	@FindBy (xpath ="//span[text()='Close']") 
	private WebElement closePopUp;
	
	@FindBy (xpath ="//button[@id='49543']") 
	private WebElement buyBajajAllianz;
	
	@FindBy (xpath ="(//input[@inputmode='text'])[1]") 
	private WebElement enterFullName;
	
	@FindBy (xpath ="//label[@class='male ']") 
	private WebElement selectGender;
	
	@FindBy (xpath ="(//input[@inputmode='text'])[2]") 
	private WebElement enterDOB;

	@FindBy (xpath ="//input[@inputmode='passport']") 
	private WebElement enterPassportNum;
	
	@FindBy (xpath ="(//input[@inputmode='text'])[3]") 
	private WebElement enterPanNum;
	
	@FindBy (xpath ="(//input[@inputmode='text'])[4]") 
	private WebElement nomineeName;
	
	@FindBy (xpath ="(//div[@class='customDropdown '])[2]") 
	private WebElement nomineeRelation;
	
	@FindBy (xpath ="//label[text()='Father']") 
	private WebElement nomineeFather;
	
	@FindBy (xpath ="//button[text()='Continue']") 
	private WebElement continueBtn;
	
	public TravelInsurance(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait= new WebDriverWait(driver,10);
	}
	
	public void enterCountryName() {
		enterDestination.sendKeys("Philippines");
		selectEnteredCountry.click();
		
	}
	
	public void clickNextBtn() {
		nextbtn.click();	
	}
	
	public void selectStartEndDate() {
		wait.until(ExpectedConditions.visibilityOf(selectStartDate));
		selectStartDate.sendKeys("09 September, 2023");	
		selectEndDate.sendKeys("28 September, 2023");
		
	}
	
	
	public void selectAges() {
		wait.until(ExpectedConditions.visibilityOf(selectAge));
		selectAge.click();
		select25yr.click();
		nextbtn.click();
	}
	
	public void selectMedicalHistory() {
		wait.until(ExpectedConditions.visibilityOf(selectNo));
		selectNo.click();
	}
	
	public void enterMobileNum() {
		enterMobileNum.sendKeys("9648521478");
		nextbtn.click();
	}
	
	public void selectPolicy() {
		wait.until(ExpectedConditions.visibilityOf(buyBajajAllianz));
		buyBajajAllianz.click();
	}
	
	public void enterTravellerDetails() {
		wait.until(ExpectedConditions.visibilityOf(enterFullName));
		enterFullName.sendKeys("Shashank PAtel");
		
		selectGender.click();
		
		enterDOB.sendKeys("27-03-1998");
		
		enterPassportNum.sendKeys("364598215648");
		
		enterPanNum.sendKeys("DRKPP1483A");
		
		nomineeName.sendKeys("Babubhai Patel");
		
		nomineeRelation.click();
		
		nomineeFather.click();
	}
	
	public boolean continueBtnDisplay() {
		boolean btn = continueBtn.isDisplayed();
		return btn;
	}
}

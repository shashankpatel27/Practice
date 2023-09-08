package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class HealthInsurance {
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	private Actions act;
	private Select select;
	
	@FindBy (xpath ="(//i[@class='checkbox'])[1]") 
	private WebElement checkboxSelf;
	
	@FindBy (xpath ="(//i[@class='checkbox'])[2]") 
	private WebElement checkboxSpouse;
	
	@FindBy (xpath ="(//i[@class='checkbox'])[3]") 
	private WebElement checkboxSon;
	
	@FindBy (xpath ="(//i[@class='checkbox'])[4]") 
	private WebElement checkboxDaughter;
	
	@FindBy (xpath ="(//i[@class='checkbox'])[5]") 
	private WebElement checkboxFather;
	
	@FindBy (xpath ="(//i[@class='checkbox'])[6]") 
	private WebElement checkboxMother;
	
	@FindBy (xpath ="(//p[text()='Grand Father '])") 
	private WebElement checkboxGrandfather;
	
	@FindBy (xpath ="//div[@class='toll-link']") 
	private WebElement callUs;
	
	@FindBy (xpath ="//button[@class='primaryButton']") 
	private WebElement continueButton;
	
	@FindBy (xpath ="//select[@id='Self']") 
	private WebElement yourAgedropDown;
	
	
	
	@FindBy (xpath ="//input[@id='city']") 
	private WebElement enterCityName;
	
	@FindBy (xpath ="//li[@class='active']") 
	private WebElement selectCityName;
	
	@FindBy (xpath ="//i[@class='gender male']") 
	private WebElement selectGenderMale;
	
	@FindBy (xpath ="//input[@id='fullName']") 
	private WebElement enterFullName;
	
	@FindBy (xpath ="//input[@id='mobile']") 
	private WebElement enterMobileNum;
	
	@FindBy (xpath ="//input[@inputmode='email']") 
	private WebElement enterEmailAd;
	
	@FindBy (xpath ="//button[@type='submit']") 
	private WebElement btnSubmit;
	
	@FindBy (xpath ="//input[@name='noneOfThese']") 
	private WebElement selectNoneOfThese;
	
	@FindBy (xpath ="//div[@class='pb_exitIntent__box__close']") 
	private WebElement PopupClose;
	
	
	public HealthInsurance(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		js = (JavascriptExecutor)driver;
		act = new Actions(driver);
	}
	
	public void clickContinueButton() {
		wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(continueButton));
		continueButton.click();
		
	}
	
	public void selectAge() {
		wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(yourAgedropDown));
	    select = new Select(yourAgedropDown);
	    select.selectByValue("25");
		
	}
	
	public void enterCityOrPincode() {
		wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(enterCityName));
	    enterCityName.sendKeys("Surat");
	    selectCityName.click();
		
	}
	
	public void selectGender() {
		wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(selectGenderMale));
	    selectGenderMale.click();	
	}
	
	public void enterName() {
		
	    enterFullName.click();
	    enterFullName.sendKeys("Shashank Patel");	
	}
	
	public void enterMobileNumber() {
		
	    enterMobileNum.sendKeys("9698742535");	
	}
	
	public void enterEmailID() {
		
	    enterEmailAd.sendKeys("hjkl@gmail.com");	
	}
	
	public void clickSubmitBtn() {
		
		btnSubmit.click();
		
	}
	
    public void noneOfTheseCheckbox() {
    	wait = new WebDriverWait(driver, 50);
	    wait.until(ExpectedConditions.visibilityOf(selectNoneOfThese));
    	selectNoneOfThese.click();	
	}
    
    public void closePopUp() {
    	wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(PopupClose));
    	PopupClose.click();	
	}
    
}

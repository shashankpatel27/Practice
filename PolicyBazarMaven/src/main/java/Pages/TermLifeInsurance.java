package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TermLifeInsurance {

	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;
	private Actions act;
	private Select select;
	
	@FindBy (xpath ="//input[@id='nameAdd']") 
	private WebElement enterFullName;
	
	@FindBy (xpath ="//input[@id='dob']") 
	private WebElement enterDateOfBirth;
	
	@FindBy (xpath ="//input[@id='mobileNo']") 
	private WebElement enterMobileNum;
	
	@FindBy (xpath ="//button[@id='submitButton']") 
	private WebElement continueButton;
	
	
	
	
	
}

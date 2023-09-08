package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyHomePage {
	private WebDriver driver;
	private Actions act;
	
	@FindBy (xpath ="(//div[@class='shadowHandlerBox'])[1]") 
	private WebElement termilifensurance;
	
	@FindBy (xpath ="(//div[@class='shadowHandlerBox'])[2]") 
	private WebElement healthinsurance;
	
	@FindBy (xpath ="(//div[@class='shadowHandlerBox'])[7]") 
	private WebElement tarvelInsurance;
	
	public PolicyHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public void clickHealthInsurance() {
		healthinsurance.click();
		
	}
	
	public void clickTarvelInsurance() {
		tarvelInsurance.click();
		
	}
}

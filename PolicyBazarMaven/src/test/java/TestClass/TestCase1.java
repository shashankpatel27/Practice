package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.HealthInsurance;
import Pages.PolicyHomePage;
import Pages.TravelInsurance;
import base.Browsers;


public class TestCase1 extends Browsers{

	private WebDriver driver;
	private Alert alt;
    private PolicyHomePage homePage;
    private HealthInsurance healthInsurance;
    private TravelInsurance travelInsurance;
    
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) 
	{
		
		if(browserName.equals("Chrome")) 
		{
			
			driver=openChromeBrowser();
			
		}
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void createPOMObject() throws InterruptedException 
	{
		homePage = new PolicyHomePage(driver); 
		healthInsurance = new HealthInsurance(driver);
		travelInsurance = new TravelInsurance(driver);
	}
	
	@Test
	public void verifyNavigateToPolicyList() {
		homePage.clickTarvelInsurance();
		
		travelInsurance.enterCountryName();
		travelInsurance.clickNextBtn();
		travelInsurance.selectStartEndDate();
		
		travelInsurance.clickNextBtn();
		travelInsurance.selectAges();
		
		travelInsurance.selectMedicalHistory();
		travelInsurance.enterMobileNum();
		
		travelInsurance.selectPolicy();
		travelInsurance.enterTravellerDetails();
		
		boolean result = travelInsurance.continueBtnDisplay();
		
		Assert.assertEquals(result, "true");
	}
	
	

	 
}

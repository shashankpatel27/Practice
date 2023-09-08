package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;


public class Browsers {
	
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\27sas\\Downloads\\Testing class\\chromedriver-win64\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
	
	
}

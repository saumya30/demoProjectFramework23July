package factory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataProvider.ConfigDataProvider;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername) throws IOException{
		
		if(browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromepath());
			driver = new ChromeDriver();
		}
		
		
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		return driver;
	}	
	
	public static void closeBrowser(WebDriver ldriver){
		ldriver.quit();
	}

}

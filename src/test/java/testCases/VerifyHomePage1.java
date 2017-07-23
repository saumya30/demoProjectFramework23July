package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import applicationPages.HomePage1;
import factory.BrowserFactory;
import factory.DataProviderFactory;



public class VerifyHomePage1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException{
		driver=BrowserFactory.getBrowser("firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationURL());

}
	@Test
	public void testHomePage(){
	HomePage1 home=PageFactory.initElements(driver,HomePage1.class);
		
		String title=home.getApplicationTitle();
		Assert.assertTrue(title.contains("Avactis Demo Store"));
	}
	@AfterMethod
	public void CloseSetUp(){
		
		BrowserFactory.closeBrowser(driver);
	}

}


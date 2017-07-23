package applicationPages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	
	
	public class HomePage1 {

		WebDriver driver;

		public HomePage1(WebDriver ldriver)
		{
			this.driver=ldriver;
		}
		
		@FindBy(xpath="//span[text()='Home']")
		WebElement home;
		
		@FindBy(xpath="//span[text()='My Account']")
		WebElement myAccount;

		@FindBy(xpath="//span[text()='My Cart']")
		WebElement myCart;

		@FindBy(xpath="//span[text()='Wishlist']")
		WebElement wishlist;
		
		@FindBy(xpath="//span[text()=' Log In']")
		WebElement logIn;
		
		public void clickOnHomePageLink()
		{
			home.click();
		}

		public void clickOnMyAccountLink()
		{
			myAccount.click();
		}
		
		public void clickOnMyCartLink()
		{
			myCart.click();
		}
		
		public void clickOnWishlistLink()
		{
			wishlist.click();
		}
		public void LogInLink()
		{
			logIn.click();
		}

	public String getApplicationTitle()
	{
		return(driver.getTitle());
	}


	}




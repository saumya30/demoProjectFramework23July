package applicationPages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class LoginPage {

		WebDriver driver;

		public LoginPage(WebDriver ldriver)
		{
			this.driver=ldriver;
		}
		
		@FindBy(id="account_sign_in_form_email_id")
		WebElement email;
		
		@FindBy(id="account_sign_in_form_passwd_id")
		WebElement password;
		
		@FindBy(xpath="//input[@value='Log In']")
		WebElement LogIn;
		
		public void login_info(String email_id,String pwd)
		{
		email.sendKeys(email_id);
		password.sendKeys(pwd);
		LogIn.click();
		}
		
		public void close_it()
		{
			
		}

	}



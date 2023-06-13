package ZigWheelsSignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInClick {
	public SignInClick(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="forum_login_title_lg")
	WebElement login;
	public void clickSignIn() {
		login.click();
		
	}
}

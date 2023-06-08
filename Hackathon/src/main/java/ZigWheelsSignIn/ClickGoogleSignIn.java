package ZigWheelsSignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickGoogleSignIn {
	
	public ClickGoogleSignIn(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div[17]/div/div/div/div[1]/div/div[2]/div[4]/div[2]")
	WebElement googlesignin;
	public void clickGoogleSignIn() {
		googlesignin.click();
	}
}

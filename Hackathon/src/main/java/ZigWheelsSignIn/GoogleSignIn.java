package ZigWheelsSignIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSignIn {

	public GoogleSignIn(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='identifierId']")
	WebElement sendemail;
	public void SndEmail() {
		sendemail.sendKeys("abc@gmail.c");
	}
	
	@FindBy(xpath="//*[contains(text(),'Next')]")
	WebElement next;
	public void clkNext() {
		next.click();
	}
	
	@FindBy(xpath="//*[@class='o6cuMc Jj6Lae']")
	WebElement message;
	public String getMessage() {
		return message.getText();
	}
}

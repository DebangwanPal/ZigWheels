package ZigWheelsUsedCars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCars {
	public UsedCars(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@data-track-label='used-cars']")
	WebElement usedcars;
	public void usedCardrop(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(usedcars).perform();
	}
	
	@FindBy(xpath="//*[@data-track-label='used-cars-chennai']")
	WebElement loc;
	public void location() {
		loc.click();
	}
}

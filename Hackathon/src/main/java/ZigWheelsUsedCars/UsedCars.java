package ZigWheelsUsedCars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class UsedCars extends TestBase {
	public UsedCars(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@data-track-label='used-cars']")
	WebElement usedcars;
	public void usedCardrop(WebDriver driver) {
		try {
			Actions a=new Actions(driver);
			a.moveToElement(usedcars).perform();
			reportPass("drop down selected correctly");
		}catch(Exception e) {
			reportFail(e.getMessage());
		}
		
	}
	
	@FindBy(xpath="//*[@data-track-label='used-cars-chennai']")
	WebElement loc;
	public void location() {
		try {
			loc.click();
			reportPass("location selected");
		}catch(Exception e) {
			reportFail(e.getMessage());
		}
		
	}
}

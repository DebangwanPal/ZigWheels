package ZigWheelsUpcomingBikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpcomingBikes {
	public UpcomingBikes(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@data-track-label='bikes']")
	WebElement bikes;
	public void newBikes(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(bikes).perform();
	}
	
	@FindBy(xpath="//span[@data-track-label='bikes-upcoming']")
	WebElement upcomingbikes;
	public void clickUpcomingBikes(WebDriver driver) {
		upcomingbikes.click();
	}
}

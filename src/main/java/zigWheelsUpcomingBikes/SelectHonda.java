package zigWheelsUpcomingBikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectHonda {
	public SelectHonda(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@id='makeId']")
	WebElement drop;
	public void clickOnHonda(WebDriver driver)
	{
		Select s=new Select(drop);
		s.selectByIndex(3);
	}
}

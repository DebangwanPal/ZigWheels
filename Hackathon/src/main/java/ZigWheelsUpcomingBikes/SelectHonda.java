package ZigWheelsUpcomingBikes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectHonda {
	public SelectHonda(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnHonda(WebDriver driver)
	{
		WebElement drop=driver.findElement(By.xpath("//select[@id='makeId']"));
		Select s=new Select(drop);
		s.selectByIndex(3);
	}
}

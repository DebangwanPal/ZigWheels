package zigWheelsUpcomingBikes;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayHondaBikes {
	public DisplayHondaBikes(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	  
	@FindBy(xpath="//span[@class='zw-cmn-loadMore']")
	WebElement ele;
	
	@FindBy(xpath="//ul[@id='modelList']")
	List<WebElement> l;
	public void display(WebDriver driver) throws InterruptedException 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(5000);
		
		int size=l.size();
		String ms="";		
		System.out.println("********************Upcoming Bikes******************");
		
		for(int i=0;i<size;i++)
		{
			ms=l.get(i).getText();
			ms=ms.replace("Alert Me When Launched", "");
			//ms=ms.replace("View More Bikes", "");
			System.out.println(ms);
		}	
	}
}
package ZigWheelsUsedCars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;


public class FindNames extends TestBase{
	
	public FindNames(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void printNames(WebDriver driver) {
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='gsc_thin_scroll']"));

		int size=l.size();
		System.out.println("****************Used Cars in Chennai***************");
		for(int i=0;i<size;i++)
		{
			String ms=l.get(i).getText();
			System.out.println(ms);
		}
	}
}

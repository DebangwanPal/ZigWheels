package zigWheelsUsedCars;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class FindNames extends TestBase{
	
	public FindNames(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='gsc_thin_scroll']")
	List<WebElement> list;
	public void printNames(WebDriver driver) {
		int size=list.size();
		System.out.println("****************Used Cars in Chennai***************");
		for(int i=0;i<size;i++)
		{
			String ms=list.get(i).getText();
			System.out.println(ms);
		}

	}
}

package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import ZigWheelsUpcomingBikes.DisplayHondaBikes;
import ZigWheelsUpcomingBikes.SelectHonda;
import ZigWheelsUpcomingBikes.UpcomingBikes;

public class ZigWheelsUpcomingBikes extends TestBase
{
	SelectHonda obj1;
	UpcomingBikes obj;
	DisplayHondaBikes obj2;
	
	@BeforeMethod
	public void setHomePage() {
		 obj1=new SelectHonda(driver);
	}
	@BeforeMethod
	public void setUpcommingPage() {
		obj=new UpcomingBikes(driver);
	}
	@BeforeMethod
	public void setHondaBikePage() {
		obj2=new DisplayHondaBikes(driver);
	}
	
	@Test
	public void OpenWebsite() {
		driver.get("https://www.zigwheels.com/");
	}
	
	@Test
	public void SelectBikes() {
		obj.newBikes(driver);
		obj.clickUpcomingBikes(driver);
	}
	
	@Test
	public void clickHonda() {
		obj1.clickOnHonda(driver);
	}
	
	@Test
	public void displayBikeDetails() {
		obj2.display(driver);

	}
	
	
}

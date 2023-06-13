package Test;

import org.testng.annotations.BeforeClass;
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
	
	@BeforeClass
	public void setHomePage() {
		 obj1=new SelectHonda(driver);
	}
	@BeforeClass
	public void setUpcommingPage() {
		obj=new UpcomingBikes(driver);
	}
	@BeforeClass
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
	public void displayBikeDetails() throws InterruptedException {
		obj2.display(driver);

	}
	
	
}

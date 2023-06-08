package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import ZigWheelsUsedCars.FindNames;
import ZigWheelsUsedCars.UsedCars;

public class ZigWheelUsedCars extends TestBase{

	UsedCars ob;
	FindNames obj;
	
	@BeforeMethod
	public void setHomePage() {
		ob=new UsedCars(driver);
	}
	@BeforeMethod
	public void setlocationPage() {
		obj=new FindNames(driver);
	}
	@Test
	public void OpenWebsite() {
		driver.get("https://www.zigwheels.com/");
	}
	
	@Test
	public void setLocation() {
		ob.usedCardrop(driver);
		ob.location();
	}
	@Test
	public void printCarName() {
		obj.printNames(driver);
	}
	
}

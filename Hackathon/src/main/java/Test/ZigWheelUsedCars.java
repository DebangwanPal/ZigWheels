package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import ZigWheelsUsedCars.FindNames;
import ZigWheelsUsedCars.UsedCars;

public class ZigWheelUsedCars extends TestBase{

	UsedCars ob;
	FindNames obj;
	
	@BeforeClass
	public void setHomePage() {
		ob=new UsedCars(driver);
	}
	@BeforeClass
	public void setlocationPage() {
		obj=new FindNames(driver);
	}
	@Test
	public void OpenWebsite() {
		driver.get("https://www.zigwheels.com/");
	}
	
	@Test
	public void setLocation() throws InterruptedException {
		ob.usedCardrop(driver);
		Thread.sleep(1000);;
		ob.location();
	}
	@Test
	public void printCarName() {
		obj.printNames(driver);
	}
	
}

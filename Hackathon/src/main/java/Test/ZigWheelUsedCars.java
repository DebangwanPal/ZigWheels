package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
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
	
	@BeforeTest
	public void a()
	{
		logger=report.createTest("Used-Cars-Details","Test Cases");
	}
	
	@Test(priority=1)
	public void OpenWebsite() {
		try {
			driver.get("https://www.zigwheels.com/");
			reportPass("Website opened");
		}catch(Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void setLocation() throws InterruptedException {
		try {
			ob.usedCardrop(driver);
			reportPass("Used cars menu opened");
			Thread.sleep(2000);
			ob.location();
			reportPass("Location selected");

		}catch(Exception e) {
			reportFail(e.getMessage());
		}
		
	}
	@Test(priority=3)
	public void printCarName() {
		try {
			obj.printNames(driver);	
			reportPass("Used cars details printed");

		}catch(Exception e) {
			reportFail(e.getMessage());
		}
	}
	
}

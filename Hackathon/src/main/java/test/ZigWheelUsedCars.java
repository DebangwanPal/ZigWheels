package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import zigWheelsUsedCars.FindNames;
import zigWheelsUsedCars.UsedCars;

public class ZigWheelUsedCars extends TestBase{

	UsedCars ob;
	FindNames obj;
	
	@BeforeClass
	public void setPage() {
		ob=new UsedCars(driver);
		obj=new FindNames(driver);
	}
	
	@BeforeTest
	public void reportInitialiser()
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
			Thread.sleep(1000);
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

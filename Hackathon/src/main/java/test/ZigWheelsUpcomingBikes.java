package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import zigWheelsUpcomingBikes.DisplayHondaBikes;
import zigWheelsUpcomingBikes.SelectHonda;
import zigWheelsUpcomingBikes.UpcomingBikes;

public class ZigWheelsUpcomingBikes extends TestBase
{
	SelectHonda obj1;
	UpcomingBikes obj;
	DisplayHondaBikes obj2;
	
	@BeforeClass
	public void setPage() {
		obj1=new SelectHonda(driver);
		obj=new UpcomingBikes(driver);
		obj2=new DisplayHondaBikes(driver);
	}
	
	@BeforeTest
	public void reportInitialiser()
	{
		logger=report.createTest("Upcoming-Bike-Details","Test Cases");
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
	public void SelectBikes() {
		try {
			obj.newBikes(driver);
			reportPass("New Bikes selected");
			obj.clickUpcomingBikes(driver);
			reportPass("Upcoming Bikes clicked");
		}catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	@Test(priority=3)
	public void clickHonda() {
		try {
			obj1.clickOnHonda(driver);
			reportPass("Honda selected");
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	@Test(priority=4)
	public void displayBikeDetails() throws InterruptedException {
		try {
			obj2.display(driver);
			reportPass("Upcoming bikes details printed");
		}
		catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
}

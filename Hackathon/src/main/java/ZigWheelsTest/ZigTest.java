package ZigWheelsTest;

import org.testng.annotations.Test;

import Base.TestBase;
import ZigWheelsSignIn.ClickGoogleSignIn;
import ZigWheelsSignIn.GoogleSignIn;
import ZigWheelsSignIn.HandleWindows;
import ZigWheelsSignIn.SignInClick;
import ZigWheelsUpcomingBikes.DisplayHondaBikes;
import ZigWheelsUpcomingBikes.SelectHonda;
import ZigWheelsUpcomingBikes.UpcomingBikes;
import ZigWheelsUsedCars.FindNames;
import ZigWheelsUsedCars.UsedCars;

public class ZigTest extends TestBase
{
	
	@Test(priority=1)
	public void upcomingBikes() {
		driver.get("https://www.zigwheels.com/");
		driver.manage().window().maximize();
		
		UpcomingBikes obj=new UpcomingBikes(driver);
		obj.newBikes(driver);
		obj.clickUpcomingBikes(driver);
		
		SelectHonda obj1=new SelectHonda(driver);
		obj1.clickOnHonda(driver);
		
		DisplayHondaBikes obj2=new DisplayHondaBikes(driver);
		obj2.display(driver);
	}
	
	@Test(priority=2)
	public void usedCars() {

		driver.get("https://www.zigwheels.com/");
		driver.manage().window().maximize();
		
		UsedCars ob=new UsedCars(driver);
		ob.usedCardrop(driver);
		ob.location();
		
		FindNames obj=new FindNames(driver);
		obj.printNames(driver);
		
	}
	
	@Test(priority=3)
	public void googleSignInMessage() throws InterruptedException
	{
		driver.get("https://www.zigwheels.com/");
		driver.manage().window().maximize();
		
		SignInClick obj = new SignInClick(driver);
		obj.clickSignIn();
		
		ClickGoogleSignIn obj1=new ClickGoogleSignIn(driver);
		obj1.clickGoogleSignIn();
		
		HandleWindows obj3=new HandleWindows(driver);
		String window[]=obj3.manageWindows(driver);
		String parent = window[0];
		String child = window[1];
		driver.switchTo().window(child);
		
		GoogleSignIn obj2 = new GoogleSignIn(driver);
		obj2.SndEmail();
		obj2.clkNext();
		
		String message=obj2.getMessage();
		System.out.println(message);
		
		driver.switchTo().window(parent);		
	}
}

package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import dataProvider.ExcelDataProvider;
import zigWheelsSignIn.ClickGoogleSignIn;
import zigWheelsSignIn.GoogleSignIn;
import zigWheelsSignIn.HandleWindows;
import zigWheelsSignIn.SignInClick;

public class ZigWheelsGoogleSignIn extends TestBase{

	SignInClick obj;
	ClickGoogleSignIn obj1;
	HandleWindows obj3;
	GoogleSignIn obj2;
	String parent;
	String child;
	
	@BeforeClass
	public void setHomePage() {
		 obj = new SignInClick(driver);
	}
	
	@BeforeClass
	public void setGoogleSignPage() {
		obj1=new ClickGoogleSignIn(driver);
	}
	
	@BeforeClass
	public void setHandleWindows() {
		obj3=new HandleWindows(driver);
	}
	
	@BeforeClass
	public void setGoogleSignInCredentials() {
		obj2 = new GoogleSignIn(driver);
	}
	
	@BeforeTest
	public void reportInitialiser()
	{
		logger=report.createTest("Invalid-Email-Message","Test Cases");
	}
	
	@Test(priority=1)
	public void openWebsite() {
		try {
			driver.get("https://www.zigwheels.com/");
			reportPass("Website opened");
		}catch(Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	@Test(priority=2)
	public void clicksignIn() {
		try {
			obj.clickSignIn();
			reportPass("Sign in click");
		}catch(Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	@Test(priority=3)
	public void clickGoogleSignIn() {
		try {
			obj1.clickGoogleSignIn();
			reportPass("Google sign in clicked");
		}catch(Exception e) {
			reportFail(e.getMessage());
		}
	}
	
	@Test(priority=4)
	public void handleBrowser() {
		try {
			String window[]=obj3.manageWindows(driver);
			parent = window[0];
			child = window[1];
			driver.switchTo().window(child);
			reportPass("Window Handled");
		}catch(Exception e)
		{
			reportFail(e.getMessage());
		}
	}
	
	@Test(priority=5, dataProvider = "DATA",dataProviderClass = ExcelDataProvider.class)
	public void insertingCredentials(String email) {
		try {
			obj2.SndEmail(email);
			reportPass("Invalid mail-id sent");
			obj2.clkNext();
			reportPass("Next clicked");
			String message=obj2.getMessage();
			System.out.println("***********************************************");
			System.out.println(message);
			driver.switchTo().window(parent);
			
			reportPass("Error Message printed");
		}catch(Exception e)
		{
			reportFail(e.getMessage());
		}
		
		
		//driver.navigate().to("https://www.zigwheels.com/");
	}
}

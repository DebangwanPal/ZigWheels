package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import ZigWheelsSignIn.ClickGoogleSignIn;
import ZigWheelsSignIn.GoogleSignIn;
import ZigWheelsSignIn.HandleWindows;
import ZigWheelsSignIn.SignInClick;

public class ZigWheelsGoogleSignIn extends TestBase{

	SignInClick obj;
	ClickGoogleSignIn obj1;
	HandleWindows obj3;
	GoogleSignIn obj2;
	String parent;
	String child;
	@BeforeMethod
	public void setHomePage() {
		 obj = new SignInClick(driver);
	}
	@BeforeMethod
	public void setGoogleSignPage() {
		obj1=new ClickGoogleSignIn(driver);
	}
	@BeforeMethod
	public void setHandleWindows() {
		obj3=new HandleWindows(driver);
	}
	@BeforeMethod
	public void setGoogleSignInCredentials() {
		obj2 = new GoogleSignIn(driver);
	}
	@Test
	public void openWebsite() {
		driver.get("https://www.zigwheels.com/");
	}
	@Test
	public void clicksignIn() {
		obj.clickSignIn();
	}
	@Test
	public void clickGoogleSignIn() {
		obj1.clickGoogleSignIn();
	}
	@Test
	public void handleBrowser() {
		String window[]=obj3.manageWindows(driver);
		parent = window[0];
		child = window[1];
		driver.switchTo().window(child);
	}
	@Test
	public void insertingCredentials() {
		obj2.SndEmail();
		obj2.clkNext();
		String message=obj2.getMessage();
		System.out.println("***********************************************");
		System.out.println(message);
		driver.switchTo().window(parent);		
	}
}

package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter 1 for Chrome\nEnter 2 for Edge");
//		int browser=sc.nextInt();
		if(browser.equalsIgnoreCase(browser)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(browser)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}

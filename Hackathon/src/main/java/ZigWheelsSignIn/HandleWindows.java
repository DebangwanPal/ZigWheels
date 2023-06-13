package ZigWheelsSignIn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HandleWindows {
	public HandleWindows(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String[] manageWindows(WebDriver driver) {
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> i=windows.iterator();
		String parent = i.next();
		String child = i.next();
		String win[]= {parent,child};
		return win;
	}
}

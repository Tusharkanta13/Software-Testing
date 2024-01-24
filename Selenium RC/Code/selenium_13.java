package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class selenium_13 {
	public static void main(String[] args)
	{
		Selenium selenium = new DefaultSelenium("localhost",4444,"firefox","https://www.geeksforgeeks.org/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		
	}
}




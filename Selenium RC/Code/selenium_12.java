package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class selenium_12 {
	public static void main(String[] args)
	{
		Selenium selenium = new DefaultSelenium("localhost",4444,"firefox","https://maps.google.com/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		
	}
}




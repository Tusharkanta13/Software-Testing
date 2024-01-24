package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class selenium_5 {
	public static void main(String[] args)
	{
		Selenium selenium = new DefaultSelenium("localhost",4444,"firefox","https://classroom.google.com/u/1/h");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		
	}
}



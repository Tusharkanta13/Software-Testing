package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class Selenium_1 {
	public static void main(String[] args)
	{
		Selenium selenium = new DefaultSelenium("localhost",4444,"firefox","https://nitrkl.ac.in/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
	}
}

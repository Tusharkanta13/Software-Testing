package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class selenium_6 {
	public static void main(String[] args)
	{
		Selenium selenium = new DefaultSelenium("localhost",4444,"firefox","https://eapplication.nitrkl.ac.in/nitris/Login.aspx");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		
	}
}




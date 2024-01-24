package seleniumrc;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
public class Selenium_2 {
	public static void main(String[] args)
	{
		Selenium selenium = new DefaultSelenium("localhost",4444,"firefox","https://mail.nitrkl.ac.in/");
		selenium.start();
		selenium.open("/");
		selenium.click("username");
		selenium.type("username", "223cs3145");
		selenium.type("password", "LCA3DDB11");
		selenium.click("css=.ZLoginButton");
		selenium.windowMaximize();
	}
}


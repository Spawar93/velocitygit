package testbrowsersetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	
	public  static WebDriver openchromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANDY\\eclipse-workspace\\Velocity\\browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}
	
	public  static WebDriver openfirefoxbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SANDY\\eclipse-workspace\\Velocity\\browsers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		return driver;
	}

}

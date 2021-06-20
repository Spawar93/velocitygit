package classtest.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import zerodha.classes.kitelogin1;
import zerodha.classes.kitelogin2;
import zerodha.classes.verifylogin;

public class kitetest1 {

	public static void main(String[] args) throws InterruptedException {
		 // To manage notifactions
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(option);
		
		    

		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		
		// create object of kitelogin1
		kitelogin1 a = new kitelogin1(driver);   

		a.KiteUserID();
		a.KitePassword();
		a.Kiteloginbutton();
		Thread.sleep(2000);
		// create object of kitelogin2

		kitelogin2 b = new kitelogin2(driver);

		b.Kitepin();
		b.Kitesubmit();
		Thread.sleep(5000);

		// create object of verifylogin

		verifylogin c = new verifylogin(driver);
		c.verifyHoldingsTab();
		Thread.sleep(10000);
		
		c.Kitelogout();

		Thread.sleep(10000);
		driver.close();

	}
}

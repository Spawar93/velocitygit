package classtest.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zerodha.classes.VerifyFund;
import zerodha.classes.kitelogin1;
import zerodha.classes.kitelogin2;
import zerodha.classes.verifylogin;

public class kitetest2 {

	WebDriver driver;
	
	
	kitelogin1 a;
	kitelogin2 b;
	verifylogin c;
	VerifyFund d;
	

	@BeforeClass
	public void kitelaunchLogin1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");

		driver = new ChromeDriver();
		
		// To manage notifactions
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver.get("https://kite.zerodha.com");
		String actual =driver.getCurrentUrl();
		Assert.assertEquals("https://kite.zerodha.com/", actual);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		a = new kitelogin1(driver);// Type kite userid and password
		a.KiteUserID();
		
		

	}

	@BeforeMethod()
	public void KiteLoginpin() throws InterruptedException 
	{ 
		
		a.KitePassword();
		a.Kiteloginbutton();
		b = new kitelogin2(driver); // type kite pin and continue
		b.Kitepin();
		b.Kitesubmit();

	}

	@Test (priority=1)
	public void VerifyKiteLogin() throws InterruptedException // Verify kite login functionality
	{
		c = new verifylogin(driver);
		c.verifyHoldingsTab();
		String expected= "Holdings";
        
	}

	@Test (priority=2)
	public void VerifyKiteFund() throws InterruptedException // Verify kite fund option
	{
		d = new VerifyFund(driver);
		
        d.fundmethod();
        
      
	} 

	@AfterMethod()
	public void KiteLogout() throws InterruptedException // verify kite logout functionality
	{
		//c = new verifylogin(driver);
		Thread.sleep(30000);
		c.Kitelogout();
	}

	@AfterClass              // close the browser
	public void CloseKiteapp() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}

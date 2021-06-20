package classtest.classes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testbrowsersetup.baseclass;
import utility.classes.screenshot;
import zerodha.classes.VerifyFund;
import zerodha.classes.kitelogin1;
import zerodha.classes.kitelogin2;
import zerodha.classes.verifylogin;

public class frameworkkite extends baseclass {
	
	WebDriver driver;
	kitelogin1 a;
	kitelogin2 b;
	verifylogin c;
	VerifyFund d;
	screenshot e= new screenshot();
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void luanchbrowser(String browser)
	{   
		reporter = new ExtentHtmlReporter("test-output//ExtendReport//extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println("Before Test");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver= openchromebrowser();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver = openfirefoxbrowser();  
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void kitelaunchLogin1() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		driver.get("https://kite.zerodha.com");
		String actual =driver.getCurrentUrl();
		Assert.assertEquals("https://kite.zerodha.com/", actual);
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
, IOException
	{     
		c = new verifylogin(driver);
		c.verifyHoldingsTab();
		String expected= "Holdings";
		
        e.ScreenshotMethod(driver);
	}

	@Test (priority=2)
	public void VerifyKiteFund() throws InterruptedException // Verify kite fund option
, IOException
	{
		d = new VerifyFund(driver);
		
        d.fundmethod();
        e.ScreenshotMethod(driver);
      
	} 

	@AfterMethod()
	public void KiteLogout() throws InterruptedException // verify kite logout functionality
	{
		//c = new verifylogin(driver);
		Thread.sleep(8000);
		c.Kitelogout();
	}

	@AfterClass              // close the browser
	public void CloseKiteapp() throws InterruptedException {
		Thread.sleep(5000);
		//driver.close();
	}
	@AfterTest                 // close the browser
	public void QuitBrowser()
	{
		driver.quit();
	}
	

}

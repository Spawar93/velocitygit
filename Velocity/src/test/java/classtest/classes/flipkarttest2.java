package classtest.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flipkart.classes.fashiontab;
import flipkart.classes.flipkartlogin;
import flipkart.classes.searchbar;

public class flipkarttest2 {
	private WebDriver driver;
	private searchbar a;
    private fashiontab b;
	private flipkartlogin c;
	@BeforeClass
	public void flipkartlaunch()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
			
			driver = new  ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
	}
	
	@BeforeMethod()
	public void FlipkartHomepage() throws InterruptedException
	{  
	     c= new flipkartlogin(driver);
		 c.fliplogin();
		Thread.sleep(3000);
	}
	
	@Test (priority=1)
	public void verifysearchbar() throws InterruptedException
	{    
		
		
		a= new searchbar(driver);
		a.searchmethod();
		
		Thread.sleep(3000);
		a.submitmethod();
		Thread.sleep(3000);
		   String expectedUrl="//www.flipkart.com/";
		   String actualUrl=a.backtohomepage();
		   Assert.assertEquals(actualUrl, expectedUrl);
		Thread.sleep(3000);
		
	}
	
	@Test (priority=2)
	public void verifyfashiontab() throws InterruptedException
	{
		b = new fashiontab(driver);
		b.verityfashion();
		Thread.sleep(3000);
		 String expectedUrl="//www.flipkart.com/";
		  String actualUrl=b.backtohomepage();
		  Assert.assertEquals(actualUrl, expectedUrl);
		Thread.sleep(3000);
	} 
	@AfterMethod()
	public  void flipkartLogout() throws InterruptedException
	{
		 c= new flipkartlogin(driver);
		 c.fliplogout();

		
	}
	@AfterClass
	public void closeflipkart() throws InterruptedException
	{   Thread.sleep(5000);
		driver.close();
	}

	
	
	
	
	
	
	
	
	
}

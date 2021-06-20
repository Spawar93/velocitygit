package classtest.classes;

import java.io.IOException;
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

import fb.classes.homepage;
import fb.classes.login;
import utility.classes.screenshot;

public class fbtest2 {

	private WebDriver driver;
	private login log;
	private homepage home;
	

	@BeforeClass
	public void fblaunch() {
		// To manage notifactions
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/login");
		
		

	}

	@BeforeMethod
	public void fblogin() throws InterruptedException {
		log = new login(driver);
		log.sendemail();
		Thread.sleep(2000);
		log.sendpassword();
		Thread.sleep(2000);
		log.clicklogin();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void friends() throws InterruptedException, IOException {
		home = new homepage(driver);
		//home.Friendlist();
		Thread.sleep(2000);
		String expectedUrl = "https://www.facebook.com/friends";
		String actualUrl = home.Friendlist();
		Assert.assertEquals(actualUrl, expectedUrl);
		

	}

	@Test(priority = 2)
	public void FBmyprofile() throws InterruptedException, IOException {
		home = new homepage(driver);
		//home.FbProfile();
		String expectedUrl = "https://www.facebook.com/profile.php?id=100024087759184";
		String actualUrl = home.FbProfile();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}

	@AfterMethod
	public void fblogout() {
		home.logoutfb();
	}

	@AfterClass
	public void browserclose() throws InterruptedException {
		Thread.sleep(8000);
		driver.quit();
	}

}

package classtest.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import fb.classes.homepage;
import fb.classes.login;

public class facebooktestset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 // To manage notifactions
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://en-gb.facebook.com/login");
			
			login log = new login(driver);
			log.sendemail();
			log.sendpassword();
			log.clicklogin();
			
			
			homepage home = new homepage(driver);
			Thread.sleep(2000);
		
			home.Friendlist();
			Thread.sleep(2000);
            home.logoutfb();
       	    Thread.sleep(2000);
            driver.close();
					

	}

}

package classtest.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipkart.classes.fashiontab;
import flipkart.classes.flipkartlogin;
import flipkart.classes.searchbar;

public class flipkarttestclass {

	public static void main(String[] args) throws InterruptedException {
	
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			
			flipkartlogin log = new flipkartlogin(driver);
			log.fliplogin();
			searchbar a= new searchbar(driver);
			//a.cutmethod();
			a.searchmethod();
			
			a.submitmethod();
			a.backtohomepage();
			
			fashiontab b = new fashiontab(driver);
			b.verityfashion();
			b.backtohomepage();
			log.fliplogout();
			driver.close();
			

	}

}

package concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class findelements {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
			
	       WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	      driver.get("https://www.facebook.com/campaign/landing.php");
	      List<WebElement> listofements  = driver.findElements(By.xpath("//input[@type='radio']"));
	     // listofements.get(0).click();
	      Thread.sleep(2000);
	    //  listofements.get(1).click();
	      Thread.sleep(2000);
	     // listofements.get(2).click();
	     // List<WebElement> listoflinks  = driver.findElements(By.xpath("//input[@type='text']"));
	    //  int total=listoflinks.size();
	      
	      //System.out.println("totallinks="+total);
	      
	      Actions mouse= new Actions(driver);
	      
	      mouse.moveToElement(listofements.get(0)).click().perform();
	      mouse.moveToElement(listofements.get(1)).click().perform();
	      mouse.moveToElement(listofements.get(2)).click().perform();
	    	  
	      
	      Thread.sleep(8000);
	      driver.quit();
	}

}

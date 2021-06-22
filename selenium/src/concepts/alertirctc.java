package concepts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alertirctc {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		WebElement from =driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		from.click();
		ArrayList<WebElement> sourcestation=(ArrayList<WebElement> )driver.findElements(By.xpath("(//ul[@role='listbox'])//li"));
		 int a=sourcestation.size();
		 for(int i=1; i<a;i++)
		 {
			 String name= sourcestation.get(i).getText();
			 System.out.println(name);
		 }
		

		
       Thread.sleep(8000);
       driver.quit();
	}

}

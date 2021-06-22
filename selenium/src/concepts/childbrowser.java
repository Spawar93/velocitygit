   package concepts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class childbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
	    ArrayList<String>address= new ArrayList<String>(driver.getWindowHandles());
	    for(int i=0; i<=3;i++)
	    {
		System.out.println(address.get(i));
	    }
	
		for(int i=3; i>=0;i--)
		{	
		 driver.switchTo().window(address.get(i));
		 System.out.println(driver.getCurrentUrl());
		 Thread.sleep(2000);
		}
        Thread.sleep(4000);
        driver.quit();
		
	}

}

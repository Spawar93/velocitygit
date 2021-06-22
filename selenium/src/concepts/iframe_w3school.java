package concepts;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_w3school {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 int total_iframe = driver.findElements(By.tagName("iframe")).size();
		 System.out.println(total_iframe);
		       
		WebElement alertbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alertbox.click();
		WebElement linkbtreak=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		linkbtreak.click();
		WebElement hashname=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		hashname.click();
		
		//childbrowser handling
		ArrayList<String> address= new ArrayList<String>(driver.getWindowHandles());
   		driver.switchTo().window(address.get(3));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
     		
		//Iframe handling
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert a =driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		// nevigate to home page
		driver.switchTo().defaultContent(); 
		driver.switchTo().window(address.get(0));
		driver.findElement(By.xpath("(//a[text()='SQL'])[1]")).click();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
	Thread.sleep(4000);	
    driver.quit();
	}

}

   package concepts;

import java.util.concurrent.TimeUnit;   

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class synchronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		
		//implicit wait applied to all webelements present in the script
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement b= driver.findElement(By.xpath("//button[text()='Add Textbox1']"));
		b.click();
		WebElement box1= driver.findElement(By.xpath("(//h3[text()='Show the textboxes here:']//input)[1]"));
		box1.sendKeys("implicit");
		WebElement c= driver.findElement(By.xpath("//button[text()='Add Textbox2']"));
		c.click();

		//explicit wait applied to indiviual element
		WebDriverWait x = new WebDriverWait(driver, 15);
		
		x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[text()='Show the textboxes here:']//input)[2]"))).sendKeys("explicit");
		
		 boolean value1 = x.until(ExpectedConditions.visibilityOf(c)).isDisplayed();
		 System.out.println(value1);
		
		 WebElement pract =  x.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Selenium Practice']")));
		 pract.click();
		 System.out.println(pract.isDisplayed());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(8000);
		driver.close();
		
	}

}

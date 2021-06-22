import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sunilpawar003@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(8000);
		driver.quit();
	}

}

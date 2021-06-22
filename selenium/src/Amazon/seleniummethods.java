package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class seleniummethods {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // close login functionality
		Actions a= new Actions(driver);
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		a.moveToElement(fashion).perform();
		Thread.sleep(2000);
		WebElement watch = driver.findElement(By.xpath("(//a[@class ='_6WOcW9'])[6]"));
		a.moveToElement(watch).perform();
		Thread.sleep(3000);
		WebElement Jewellery = driver.findElement(By.xpath("//a[text()='Men Fashion Jewellery']"));
		a.moveToElement(Jewellery).click().build().perform(); 
		
		   
		
	/*	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Vivo V15 pro");//searchbox
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
		JavascriptExecutor scroll = ((JavascriptExecutor)driver);//scroll down
		//ScrollBy
		scroll.executeScript("window.scrollBy(0,1200)");// scroll down upto 1200 pixels
		Thread.sleep(2000);
		scroll.executeScript("window.scrollBy(0,-1200)");// scroll up upto 1200 pixels
		
	// now execute query which actually will scroll until that element is not appeared on page.
		  Thread.sleep(2000);
		  WebElement vivov9pro =  driver.findElement(By.xpath("(//img[@alt='ViVO V9 Pro (Nebula Purple, 64 GB)'])[1]"));
		  scroll.executeScript("arguments[0].scrollIntoView(true);", vivov9pro);
		  Thread.sleep(2000);
		 vivov9pro.click();
		  
		
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Vivo V15 pro");//searchbox
        driver.findElement(By.xpath("//button[@type='submit']")).click();            */
       
		
		
		   
		
        
		
		
		
Thread.sleep(10000);
driver.quit();
	}

}

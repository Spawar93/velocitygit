package zerodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	static WebDriver driver;
	
	public static void loginmethod() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("WP6944");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sunil260493#");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("260493");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	

}

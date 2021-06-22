package concepts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement1 {
	
      public static void main(String[] args) throws InterruptedException {
		
    	  
   System.setProperty("webdriver.chrome.driver","C:\\Users\\SANDY\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
       WebDriver s = new ChromeDriver();
       
      // s.get("https://www.google.com");
       //s.manage().window().maximize();
       
      s.get("https://www.facebook.com/campaign/landing.php");
     /*  List<WebElement> a = s.findElements(By.xpath("//input[@type='radio']"));// xpath by attributes
       System.out.println(a.size());  */


       
       
       
       
      WebElement b = s.findElement(By.xpath("//input[contains(@name,'last')]"));//xpath by contains attributes
       b.sendKeys("Pawar");
       WebElement e = s.findElement(By.xpath("(//input[@type='text'])[3]"));//xpath by index
       e.sendKeys("sunilpawar003@gmail.com");
       Thread.sleep(5000); 
       
       s.get("https://www.amazon.in/");
       WebElement c = s.findElement(By.xpath("//a[contains(text(),'Fashion')]"));//xpath by contains text
       c.click();
       Thread.sleep(4000);
       WebElement d = s.findElement(By.xpath("//a[text()='Mobiles']"));//xpath by text function
       d.click();     
       
       
      
       
           
      
       
       
   
   
   
   
   
   
   
   
   
      }

}

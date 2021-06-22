
package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signupfunctionality {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SANDY\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	       WebDriver s = new ChromeDriver();
	          
	       s.manage().window().maximize();
	       
	      s.get("https://www.facebook.com/campaign/landing.php");
	      WebElement a = s.findElement(By.xpath("(//div[@id='fullname_field']//input)[1]"));
	      a.sendKeys("Sunil");
	      
	      WebElement b = s.findElement(By.xpath("//input[@name='lastname']"));
	      b.sendKeys("Pawar");
	      
	      WebElement c = s.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _5dba _2ph-')])[3]"));
	      c.sendKeys("sunilpawar003@gmail.com");
	      
	      WebElement d = s.findElement(By.xpath("//input[@id='password_step_input']"));
	      d.sendKeys("Sunil93#");
	      
          WebElement t =  s.findElement(By.xpath("//select[@id='day']"));
	      Select day = new Select(t);
	      day.selectByValue("26");
	      
	       WebElement r = s.findElement(By.xpath("//select[@name='birthday_month']"));
	      
	      Select month= new Select(r);
	       month.selectByValue("4");
	      Thread.sleep(3000);
	      month.selectByValue("6");
	      Thread.sleep(3000);
	      month.selectByIndex(2);   
	      
          WebElement u =  s.findElement(By.xpath("//select[@id='year']"));
	      
	      Select year = new Select(u);
	      
	      year.selectByVisibleText("2000");
	      
	      WebElement e = s.findElement(By.xpath("//label[text()='Male']"));
	      e.click();
          
	      WebElement f = s.findElement(By.xpath("//div[text()='Create a new account']"));
	     // f.click();
	      String display  = f.getText();
	      
	      System.out.println(display);
	      
	      if(display.equals("Create a   new account") )
	      {
	    	  
	    	  System.out.println(" text is correct");
	      }
	      else
	      {

	    	  System.out.println("incorrect text");
	      }
	      
	     
	     
	      
	      
	      
	        
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}

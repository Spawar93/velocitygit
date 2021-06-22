package concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class w3schooldragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
			
	       WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	      driver.get("https://www.amazon.in/");
	      WebElement drag =driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
	      Actions a = new Actions(driver);
	      a.moveToElement(drag).perform();
	      Thread.sleep(2000);
	      WebElement drop= driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	      a.click(drop).perform();
	      
	      
	      
	      //a.dragAndDrop(drag, drop).perform();
	     
	     // a.moveToElement(drag).click(drop).build().perform();
	     // a.doubleClick().perform();
	     // a.contextClick().perform();
	      // Horizontal scrollbar
	      Thread.sleep(2000);
	      JavascriptExecutor mouse = ((JavascriptExecutor)driver);
	      WebElement musicprime= driver.findElement(By.xpath("//a[text()='Amazon Prime Music']"));
	      
	      mouse.executeScript("arguments[0].scrollIntoView(true);", musicprime);
	      Thread.sleep(4000);
	      musicprime.click();
	      
	      //Vertical scrollbar
	      driver.get("https://www.w3schools.com/howto/howto_css_menu_horizontal_scroll.asp");
	      Thread.sleep(2000);
	      WebElement work= driver.findElement(By.xpath("//a[text()='Work']"));
	      mouse.executeScript("arguments[0].scrollIntoView(false);", work);
	      
	}

}

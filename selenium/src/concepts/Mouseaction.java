    package concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//switchto iframe
		driver.switchTo().frame(element);
		
		//webelements for drag and drop
		 WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
         //mouse actions
		 Actions  mouse = new Actions( driver);
		 
		 
		 mouse.dragAndDrop(drag, drop).click().build().perform();

		 
		 
		 
		 Thread.sleep(6000);
		 driver.quit();
	}

}

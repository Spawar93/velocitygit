package concepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceclass {

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
	 driver.manage().window().maximize();
	 
	 List<WebElement> listofelements= driver.findElements(By.xpath("//a[text()='Try it Yourself »']"));
	 
	 listofelements.get(0).click();
	 listofelements.get(1).click();
	 listofelements.get(2).click();
	 
	 ArrayList<String> address= new ArrayList<String>(driver.getWindowHandles());
	 
	 driver.switchTo().window(address.get(2));
	        
	 driver.getCurrentUrl();
	 
	}

}

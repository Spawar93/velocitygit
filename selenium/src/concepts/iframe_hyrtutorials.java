    package concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframe_hyrtutorials {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//input[@class='frmTextBox'])[1]")).sendKeys("hiiie");
		driver.switchTo().frame("frm1");
		WebElement dropdown= driver.findElement(By.xpath("(//select[@id='course'])[1]"));
        dropdown.click();
        
        //explicit wait
        WebDriverWait r = new WebDriverWait(driver,5);
        WebElement dropdown2=r.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a")));
        dropdown2.click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("(//input[@class='frmTextBox'])[1]")).clear();
		
		
		
		
		
		
		
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
     Thread.sleep(8000);
     driver.quit();
	}

}

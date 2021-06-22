package concepts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class alertpopup {
	
	static WebDriver driver;
	public static void screenshot() throws IOException
	{
		Date d= new Date();
		String filename= d.toString().replace(':', '_').replace('-', '_');
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File("D:\\screenshot\\Test101"+filename+".jpg");
		
		FileHandler.copy(source, dest);
	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.xpath("//button[@id='promptBox']"));
		   s.click();
		   Thread.sleep(2000);  
		   Alert a= driver.switchTo().alert();// webdriver/Targetlocator/
		   System.out.println(a.getText());
		   Thread.sleep(2000); 
		   a.accept();
		  WebElement k= driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		   k.click();  
		   Thread.sleep(2000); 
		   
		   screenshot();
		   
		   
        
           
           
           
           
	}

}

package concepts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class browserlaunch {
	
	
	

	
	public static void main(String[] args) throws IOException {
		
		  
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://zerodha.com");
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		//WebElement post= driver.findElement(By.xpath("//input[@id='radio1']"));
		//System.out.println(post.isSelected());
		//  Boolean x  =  post.isEnabled();
		//System.out.println(x);
		//post.click();
		
		{
			
					Date d = new Date();
					String Filename = d.toString().replace(":", "_").replace(" ", "_") ;
					
					File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					File dest= new File("D:\\Software Testing\\screenshot"+"Test_"+Filename+".jpg");
			        FileHandler.copy(source, dest);
				
		}
		  
		
		
	
		
        
        
	}

	private static void screenshot() {
		// TODO Auto-generated method stub
		
	}

	
		
		
	

	

}
           
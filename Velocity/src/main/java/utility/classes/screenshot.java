package utility.classes;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	
       WebDriver driver;
      
       

	public  void  ScreenshotMethod(WebDriver driver) throws IOException
	{  
	   
		 
	   this.driver=driver;
	  
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_YYYY_HH_mm_ss");
		  Date date = new Date();
		  String dt=dateFormat.format(date);
		  
	    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest= new File("D:\\ProjectScreenshots\\screenshot"+dt+".jpg");
	    FileHandler.copy(source, dest);
	   
	   
	}  

}

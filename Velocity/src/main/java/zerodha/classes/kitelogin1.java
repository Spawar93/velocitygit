package zerodha.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class kitelogin1 {
	
	
	//kite username,password and login button Xpath
	 @FindBy (xpath="//input[@id='userid']") 
	 private WebElement userid;
	 
	 @FindBy (xpath="//input[@id='password']") 
	 private WebElement password;
	 
	 @FindBy (xpath="//button[@type='submit']") 
	 private WebElement loginbutton;
	 
	 //intialize the webelements
	 public kitelogin1(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 //type userid
	 public void KiteUserID()
	 {
		 userid.sendKeys("WP6944"); 
		 
		 
	 }
     
	 //type password
	 public void KitePassword()
	 {
		 password.sendKeys("Sunil260493#"); 
	 }
	 
	 //click login button
		 public void Kiteloginbutton()
		 {
			 loginbutton.click();
		 }
	 
}

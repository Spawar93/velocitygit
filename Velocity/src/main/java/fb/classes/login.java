package fb.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[@name='login']")
	private WebElement logininto;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendemail()
	{  
			
	  username.sendKeys("sunilpawar003@gmail.com");
	}
	
	public void sendpassword()
	{
		password.sendKeys("sunil@1234");
	}
	public void clicklogin()
	{
		logininto.click();
	}
	
	
	
	
	

}

package zerodha.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class verifylogin {
	
	WebDriver driver;

	// xpath for userid on homepage
	@FindBy(xpath = "//span[text()='WP6944']")
	private WebElement id;
	
	@FindBy(xpath = "//span[text()='Holdings']")
	private WebElement holdings;

	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logout;

	// intialize the webelements
	public verifylogin(WebDriver driver) 
	{    
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// verify userid method
	public String verifyHoldingsTab() throws InterruptedException {
        
		holdings.click();
		Thread.sleep(3000);
		String actual =holdings.getText();
		System.out.println(actual);
		return actual;
		
		//String expected= "Holdings";
		// Assert.assertEquals(actual,expected );
	


		 

		
	}

	public void Kitelogout() throws InterruptedException // kitelogout method
	{   
		Actions a = new Actions(driver);
		id.click();
		Thread.sleep(10000);
		a.moveToElement(logout).click().build().perform();
         
		
	}   

}

package zerodha.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class VerifyFund {
	 WebDriver driver;
	
	
	// verify fund option of kite
	@FindBy(xpath = "//span[text()='Funds']")
	private WebElement fund;
	
	@FindBy(xpath = "//button[@class='button-green']")
	private WebElement add;
	

	   // intialize the webelements
	   public VerifyFund(WebDriver driver)
	   {
		   this.driver=driver;
		PageFactory.initElements(driver, this);
	   }
	   
	   //click on fund option and verify
		public String fundmethod() throws InterruptedException 
		{
			fund.click();
			Thread.sleep(3000);
			String actual =fund.getText(); 
			System.out.println(actual);
			//String expected ="Funds";
			//Assert.assertEquals(actual,expected);
			return actual;
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		



}

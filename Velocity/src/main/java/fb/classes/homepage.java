package fb.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	WebDriver driver;
	Actions mouse;

	@FindBy(xpath = "//span[text()='Friends']")
	private WebElement friend;

	@FindBy(xpath = "//input[@aria-label='Search Facebook']")
	private WebElement search;

	@FindBy(xpath = "//span[text()='Sunil Pawar']")
	private WebElement Myprofile;

	@FindBy(xpath = "//div[@aria-label='Account']")
	private WebElement account;

	@FindBy(xpath = "(//div[@aria-label='Account']//span)[8]")
	private WebElement logout;

	public homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String Friendlist() throws InterruptedException {
		friend.click();
		Thread.sleep(2000);
		String urlfriend = driver.getCurrentUrl();
		/*
		 * if (urlfriend.equals("https://www.facebook.com/friends")) {
		 * System.out.println("Friendlist visible"); } else {
		 * System.out.println("Friendlist not visible"); }
		 */
		System.out.println(urlfriend);
		return urlfriend;

	}

	public String FbProfile() throws InterruptedException {

		Myprofile.click();
		Thread.sleep(2000);
		String urlprofile = driver.getCurrentUrl();
		System.out.println(urlprofile);
		/*
		 * if
		 * (urlprofile.equals("https://www.facebook.com/profile.php?id=100024087759184")
		 * ) { System.out.println("Profilepage visible"); } else {
		 * System.out.println("profilepage not visible"); }
		 */
		return urlprofile;
	}

	

	public void logoutfb() {
		account.click();

		mouse = new Actions(driver);
		mouse.moveToElement(logout).click().build().perform();

	}

}

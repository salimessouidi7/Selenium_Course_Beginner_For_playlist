package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClick {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		// Locators
		By usernameLocator = By.id("Email");
		By passwordLocator = By.id("Password");
		By loginButtonLocator = By.cssSelector(".login-button");
		By rememberMelocator = By.id("RememberMe");
		
		// use sendkeys() to send text on the fields
		driver.findElement(usernameLocator).sendKeys("salimsouidi7@gmail.com");
		driver.findElement(passwordLocator).sendKeys("123456");
		
		//use click() to select or deselect the checkbox
		driver.findElement(rememberMelocator).click();
		
		// use click() to click on the button
		driver.findElement(loginButtonLocator).click();
		
		//driver.quit();

	}

}

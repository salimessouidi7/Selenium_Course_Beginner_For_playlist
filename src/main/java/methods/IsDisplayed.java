package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		// Locators
		By loginButtonLocator = By.cssSelector(".login-button");
		
		// check if the element is displayed
		WebElement loginbutton = driver.findElement(loginButtonLocator);
		
		boolean isLoginbuttonDisplayed = loginbutton.isDisplayed();
		
		System.out.println("Is the login button displayed ? " + isLoginbuttonDisplayed);
		
		driver.quit();

	}

}

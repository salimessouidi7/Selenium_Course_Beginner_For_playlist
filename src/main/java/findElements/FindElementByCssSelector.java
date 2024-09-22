package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		// Locators 
		By email = By.cssSelector("#Email");
		By password = By.cssSelector(".password");
		By checkbox = By.cssSelector("input[type='checkbox']");
		By button = By.cssSelector("div.buttons button[class='button-1 login-button']");
		
		WebElement emailField = driver.findElement(email);
		WebElement passwordField = driver.findElement(password);
		WebElement checkboxField = driver.findElement(checkbox);
		WebElement buttonField = driver.findElement(button);
		
		// Finding an Element by ID
		emailField.sendKeys("salimsouidi7@gmail.com");
		
		// Finding an Element by Class
		passwordField.sendKeys("123456");
		
		// Finding an Element by Attribute
		checkboxField.click();
		
		// Finding an Element within Another Element
		buttonField.click();
		
		
		driver.quit();

	}

}

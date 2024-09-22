package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		// Locators
		By radioButtonLocator = By.id("gender-female");
		
		// click the radio button to select it 
		driver.findElement(radioButtonLocator).click();
		
		//driver.quit();

	}

}

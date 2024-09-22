package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		//Locators
		By rememberMelocator = By.id("RememberMe");
		
		WebElement rememberMeCheckbox = driver.findElement(rememberMelocator);
		
		boolean isRememberMeSelected = rememberMeCheckbox.isSelected();
		
		System.out.println("is the 'remember me' checkbox selected ? " +isRememberMeSelected);
		
		if (!isRememberMeSelected) {
			rememberMeCheckbox.click();
		}
		
		System.out.println("checkbox selected");
		
		driver.quit();

	}

}

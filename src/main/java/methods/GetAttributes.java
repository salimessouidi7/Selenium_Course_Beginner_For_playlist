package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		//Locators
		By usernameLocator = By.id("Email");
		By rememberMelocator = By.id("RememberMe");
		By forgotPassword = By.cssSelector(".forgot-password a");
		
		WebElement usernamefield = driver.findElement(usernameLocator);
		WebElement rememberMeCheckbox = driver.findElement(rememberMelocator);
		WebElement forgotPasswordLink = driver.findElement(forgotPassword);
		
		String idvalue = usernamefield.getAttribute("id");
		System.out.println("the id attribute is : " + idvalue);
		
		String datavalrequiredValue = rememberMeCheckbox.getAttribute("data-val-required");
		System.out.println("the data-val-required attribute value is : " + datavalrequiredValue);
		
		String hrefValue = forgotPasswordLink.getAttribute("href");
		System.out.println("the href attribute value is : " +hrefValue);
		
		driver.quit();
		
		

	}

}

package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:\\C:\\Users\\TOPINFORMATIQUE\\eclipse-workspace\\Selenium_Course_Beginner\\src\\main\\resources\\loginPage.html");
		
		// Locators
		By usernamelocator = By.id("username");
		By passwordLocator = By.id("password");
		By loginbuttonLocator = By.id("loginButton");
		
		// Locate the elements 
		WebElement usernameField = driver.findElement(usernamelocator);
		WebElement passwordField = driver.findElement(passwordLocator);
		WebElement loginButton = driver.findElement(loginbuttonLocator);
		
		// check if the button is disable initially
		System.out.println("is the login Button enabled initially ?" + loginButton.isEnabled());
		
		// fill in the username and password fields
		
		usernameField.sendKeys("salimsouidi7");
		passwordField.sendKeys("12345");
		
		// check if the button is enabled after filling in the fields
		System.out.println("is the login Button enabled after filling in the fields ?" + loginButton.isEnabled());
		
		// close the browser
		driver.quit();

	}

}

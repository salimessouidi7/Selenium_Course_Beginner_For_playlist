package methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("file:\\C:\\Users\\TOPINFORMATIQUE\\eclipse-workspace\\Selenium_Course_Beginner\\src\\main\\resources\\ThreadSleep.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Locators 
		By delayedbuttonlocator = By.id("delayedButton");
		By messageLocator = By.id("message");
		
		wait.until(ExpectedConditions.elementToBeClickable(delayedbuttonlocator));
		
		driver.findElement(delayedbuttonlocator).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(messageLocator));
		
		System.out.println("The message is : " + driver.findElement(messageLocator).getText());
		
		
		driver.quit();

	}

}

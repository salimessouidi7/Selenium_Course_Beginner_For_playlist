package methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("file:\\C:\\Users\\TOPINFORMATIQUE\\eclipse-workspace\\Selenium_Course_Beginner\\src\\main\\resources\\ThreadSleep.html");
		
		// Locators 
		By delayedbuttonlocator = By.id("delayedButton");
		By messageLocator = By.id("message");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(delayedbuttonlocator).click();
		
		System.out.println("The message is : " + driver.findElement(messageLocator).getText());
		
		
		driver.quit();

	}

}

package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("file:\\C:\\Users\\TOPINFORMATIQUE\\eclipse-workspace\\Selenium_Course_Beginner\\src\\main\\resources\\ThreadSleep.html");
		
		// Locators 
		By delayedbuttonlocator = By.id("delayedButton");
		
		// wait for 4 secondes to see the button become visible
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(delayedbuttonlocator).click();
		
		driver.quit();

	}

}

package visitingWebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// Locators
		By linkLocator = By.cssSelector("ul.visit li a");

		String currentWindow = driver.getWindowHandle();
		System.out.println("Id of current window is : " + currentWindow);
		
		driver.findElement(linkLocator).click();
		
		System.out.println("Ids of all opened windows : " + driver.getWindowHandles());

		driver.quit();

	}

}

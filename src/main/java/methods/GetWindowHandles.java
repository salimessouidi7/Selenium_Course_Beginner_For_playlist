package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		//Locators
		By youtubeLinkLocator = By.cssSelector("li.youtube a");
		
		String currentWindow = driver.getWindowHandle();
		System.out.println("current window id is : " +currentWindow);
		
		driver.findElement(youtubeLinkLocator).click();
		
		
		System.out.println("windows ids : " +driver.getWindowHandles());
		
		driver.quit();

	}

}

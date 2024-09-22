package methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchToWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locators
		By youtubeLinkLocator = By.cssSelector("li.youtube a");
		By usernameLocator = By.id("Email");
		By passwordLocator = By.id("Password");
		By loginButtonLocator = By.cssSelector(".login-button");

		driver.findElement(youtubeLinkLocator).click();

		// get all window ids
		List<String> handles = new ArrayList<>(driver.getWindowHandles());

		// switch to the new tab (assuming it is the second tab)
		driver.switchTo().window(handles.get(1));

		// wait for the page title to be availabe
		wait.until(ExpectedConditions.titleIs("nopCommerce - YouTube"));

		System.out.println("The title of new tab : " + driver.getTitle());

		// switch back to the parent window
		driver.switchTo().window(handles.get(0));

		// use sendkeys() to send text on the fields
		driver.findElement(usernameLocator).sendKeys("salimsouidi7@gmail.com");
		driver.findElement(passwordLocator).sendKeys("123456");

		// use click() to click on the button
		driver.findElement(loginButtonLocator).click();

		driver.quit();

	}

}

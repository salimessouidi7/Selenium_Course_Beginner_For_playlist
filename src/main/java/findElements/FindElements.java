package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		// Locators 
		By links = By.cssSelector(".header-links li");
		
		List <WebElement> linksElements = driver.findElements(links);
		
		System.out.println("the size of list " + linksElements.size());
		
		for (WebElement li : linksElements) {
			System.out.println(li.getText());
		}
		
		driver.quit();

	}

}

package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		driver.findElement(By.id("Email")).sendKeys("salimsouidi7@gmail.com");
		
		driver.quit();

	}

}

package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

		driver.findElement(By.id("Email")).sendKeys("salimsouidi7@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		
		driver.findElement(By.className("login-button")).click();
		
		//driver.findElement(By.className("ico-login")).click();

		driver.quit();

	}

}

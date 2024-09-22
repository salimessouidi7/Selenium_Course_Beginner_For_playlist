package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByPartialLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.findElement(By.linkText("Build your own computer")).click();
		driver.findElement(By.partialLinkText("Build")).click();
		
		driver.quit();
		

	}

}

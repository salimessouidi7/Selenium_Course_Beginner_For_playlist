package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//driver.close();
		driver.quit();

	}

}

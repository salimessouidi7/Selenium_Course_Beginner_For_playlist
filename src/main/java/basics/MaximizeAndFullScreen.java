package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreen {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().fullscreen();

	}

}

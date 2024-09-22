package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSizes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		Dimension iphoneSe = new Dimension(375, 667);
		driver.manage().window().setSize(iphoneSe);
		
	}

}

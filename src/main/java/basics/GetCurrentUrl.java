package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println("the current url is " + url);

	}

}

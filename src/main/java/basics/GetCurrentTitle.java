package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		String title = driver.getTitle();
		System.out.println("the current title is " + title);

	}

}

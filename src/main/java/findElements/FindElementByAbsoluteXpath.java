package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByAbsoluteXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		driver.quit();
		
		//Absolute xpath expression
		// /html/body/...../
		
		//relative xpath expression
		// //tagname[@attribute='value']

		
	}

}

package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByRelativeXpath {

	public static void main(String[] args) {
		
		//relative xpath expression
		// //tagname[@attribute='value']
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		// XPath with Attributes
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("ipad");
		
		//XPath with Text
		//driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		//XPath with Contains()
		//System.out.println(driver.findElement(By.xpath("//div[@class='page-title']/h1[contains(text(), 'Welcome')]")).getText());
		
		//XPath with Starts-with()
		//driver.findElement(By.xpath("//button[starts-with(text(), 'Log')]")).click();
		
		//XPath with AND operator
		driver.findElement(By.xpath("//input[@type='text' and @name='FirstName']")).sendKeys("hello");
		
		driver.quit();
		
	}	
		

}

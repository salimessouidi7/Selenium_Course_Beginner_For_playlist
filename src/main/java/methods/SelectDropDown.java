package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		// Locators
		
		By dateofBirthLocator = By.name("DateOfBirthDay");
		
		// Find the drop down element
		WebElement dropDown = driver.findElement(dateofBirthLocator);
		
		// create a Select object
		Select selectDateOfBirth = new Select(dropDown);
		
		// Select by visible text
		//selectDateOfBirth.selectByVisibleText("7");
		
		// Select by value
		//selectDateOfBirth.selectByValue("20");
		
		// select by index
		selectDateOfBirth.selectByIndex(5);

	}

}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	
	protected static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

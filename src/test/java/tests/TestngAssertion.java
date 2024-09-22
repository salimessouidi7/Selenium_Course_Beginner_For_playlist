package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAssertion {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest()
	public void setUp() {
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}
	
	@Test()
	public void getTiltle() {
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Swag Labs");
		
	}
	
	@AfterTest()
	public void tearDown() {
		driver.quit();
	}

}

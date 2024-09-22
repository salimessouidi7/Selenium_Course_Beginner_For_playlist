package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {

	WebDriver driver;
	WebDriverWait wait;

	// Locators
	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButton = By.id("login-button");

	@BeforeTest(groups = {"regression"})
	public void setUp() {
		
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@Test(priority = 1)
	public void loginPage() {

		driver.findElement(usernameField).sendKeys("standard_user");
		driver.findElement(passwordField).sendKeys("secret_sauce");
		driver.findElement(loginButton).click();

	}

	@Test(groups = {"regression"})
	public void getTiltle() {
		System.out.println("The title of the page is " + driver.getTitle());
	}

	@AfterTest(groups = {"regression"})
	public void tearDown() {
		driver.quit();
	}

}

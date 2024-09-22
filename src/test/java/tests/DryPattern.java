package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import utils.DataInjectionIntern;


public class DryPattern {
	WebDriver driver;
	WebDriverWait wait;

	// Locators
	By usernameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButton = By.id("login-button");

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	// Test method that uses data from the DataProvider
	@Test(priority= 1 ,dataProvider = "userData", dataProviderClass = DataInjectionIntern.class)
	public void loginPage(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
	}

	@Test(priority=2)
	public void getTiltle() {
		System.out.println("The title of the page is " + driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}

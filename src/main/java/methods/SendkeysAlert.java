package methods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendkeysAlert {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		driver.get("file:\\C:\\Users\\TOPINFORMATIQUE\\eclipse-workspace\\Selenium_Course_Beginner\\src\\main\\resources\\alert.html");
		
		// locator
		By showPromptbutton = By.id("ShowPrompt");
		
		driver.findElement(showPromptbutton).click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		alert.sendKeys("Salim Souidi");
		alert.accept();
		
		//driver.quit();

	}

}

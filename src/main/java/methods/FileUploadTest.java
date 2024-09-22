package methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		driver.get("file:\\C:\\Users\\TOPINFORMATIQUE\\eclipse-workspace\\Selenium_Course_Beginner\\src\\main\\resources\\uploadFile.html");
		
		// Locators 
		By fileInputLocator = By.id("fileInput");
		By uploadbutton = By.id("button");
		By message = By.id("message");
		
		// locate the file input and upload the file
		WebElement fileInput = driver.findElement(fileInputLocator);
		String filePath = "C:\\Users\\TOPINFORMATIQUE\\eclipse-workspace\\Selenium_Course_Beginner\\Uploads\\selenium-logo.png";
		
		fileInput.sendKeys(filePath);
		
		// locate and click the upload button
		driver.findElement(uploadbutton).click();
		
		// wait for the message to be displayed
		wait.until(ExpectedConditions.visibilityOfElementLocated(message));
		
		// verify the result message
		WebElement messageElement = driver.findElement(message);
		String messageText = messageElement.getText();
		
		System.out.println("The message is " +messageText);
		
		driver.quit();

	}

}

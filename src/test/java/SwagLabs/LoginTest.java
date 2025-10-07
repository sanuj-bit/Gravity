package SwagLabs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		// Launch browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://www.saucedemo.com/");

		// Identify username textfield and enter the username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Identify password textfield and enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Identify login button and click on it
		driver.findElement(By.id("login-button")).click();

		driver.switchTo().alert().accept();

		// Select a product and click on it
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();

		// Click on add to cart button
		driver.findElement(By.id("add-to-cart")).click();

		// Logout
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

		// Close the browser
		driver.quit();
	}

}

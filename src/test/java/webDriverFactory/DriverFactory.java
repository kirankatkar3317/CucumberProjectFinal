package webDriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Commons;

public class DriverFactory {
	public static WebDriver driver = null;

	public static WebDriver initializeBrowser(String browserName) {

		if (browserName.equalsIgnoreCase(Commons.CHROME)) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase(Commons.FIREFOX)) {
			driver = new FirefoxDriver();

		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Commons.ImplicitWait));
		return driver;

	}

	public static WebDriver getDriver() {
		return driver;
	}
}
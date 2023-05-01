package BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

	public WebDriver a;

	@BeforeClass
	public void Open_Browser() throws InterruptedException {
		a = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\venka\\eclipse-workspace\\Selenium_Practice\\src\\test\\resources\\Resourse\\chromedriver.exe");
		Thread.sleep(2000);
		a.manage().window().maximize();
		Thread.sleep(2000);
	
	}

	@AfterClass
	public void Close_Browser() throws InterruptedException {
		Thread.sleep(6000);
		a.close();
		a.quit();

	}

}

package Logins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BrowserLaunch.Base;

public class office_login extends Base {
	@Test
	public void office1() throws InterruptedException {
		a.get("https://app.kredily.com/login/");
		Thread.sleep(1000);
	}

	@Test
	public void office2() throws InterruptedException {
		a.findElement(By.id("signInFormEmailAddress")).sendKeys("7731831827");
		Thread.sleep(1000);
		a.findElement(By.name("password")).sendKeys("Venkat@12232");
		Thread.sleep(1000);
	}

	@Test
	public void office3() throws InterruptedException {
		a.findElement(By.id("signinSubmitBtn")).click();
		Thread.sleep(1000);
	}

}

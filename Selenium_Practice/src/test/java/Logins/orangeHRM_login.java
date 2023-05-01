package Logins;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BrowserLaunch.Base;

public class orangeHRM_login extends Base {

	@Test(priority = 1)
	public void OrangeHRM() throws InterruptedException {
		a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		a.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		a.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void click() throws InterruptedException {
		a.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
		a.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
	}

}

package Logins;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BrowserLaunch.Base;

public class facebook_login extends Base {

	@Test
	public void fb_test1() throws InterruptedException {
		a.get("https://www.facebook.com/");
		Thread.sleep(1000);
		a.findElement(By.xpath("//a[@class ='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);

	}

	@Test
	public void fb_test2() throws InterruptedException {
		a.findElement(By.name("firstname")).sendKeys("INNOJC");
		Thread.sleep(1000);
		a.findElement(By.name("lastname")).sendKeys("TECHNOLOGIES");
		Thread.sleep(1000);
		a.findElement(By.name("reg_email__")).sendKeys("9676832669");
		Thread.sleep(1000);
		a.findElement(By.name("reg_passwd__")).sendKeys("pabbu@123");
		Thread.sleep(1000);
	}

	@Test
	public void fb_test3() throws InterruptedException {
		a.findElement(By.xpath("//*[@id=\"day\"]/option[20]")).click();
		Thread.sleep(1000);
		a.findElement(By.xpath("//*[@id=\"month\"]/option[9]")).click();
		Thread.sleep(1000);
		a.findElement(By.xpath("//*[@id=\"year\"]/option[25]")).click();
		Thread.sleep(1000);
	}

	@Test
	public void fb_test4() throws InterruptedException {
		a.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1000);
		a.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);

	}
}

package Logins;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BrowserLaunch.Base;

public class innojc_login extends Base {
	@Test
	public void login1() throws InterruptedException {
		a.get("https://www.innojc.com/general-8-6");
		Thread.sleep(1000);
		a.findElement(By.xpath("//*[@id=\"comp-ldtq321c\"]/a/div/span[1]")).click();

	}

	@Test
	public void login2() throws InterruptedException {
		Set<String> handles = a.getWindowHandles();
		Iterator it = handles.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		a.switchTo().window(childid);
		Thread.sleep(2000);
	}

	@Test
	public void login3() throws InterruptedException {
		a.findElement(By.id("signInFormEmailAddress")).sendKeys("7731831827");
		Thread.sleep(1000);
		a.findElement(By.name("password")).sendKeys("Venkat@12232");
		Thread.sleep(1000);
		a.findElement(By.id("signinSubmitBtn")).click();
		Thread.sleep(1000);
	}

	/*
	 * @Test public void login4() {
	 * System.out.println(a.findElement(By.id("output")).getText());
	 * a.findElement(By.id("signinSubmitBtn")).click();
	 * System.out.println(a.switchTo().alert().getText());
	 * a.switchTo().alert().accept();
	 * 
	 * }
	 */

}

package Alerts;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import BrowserLaunch.Base;

public class Simple_Alerts extends Base {
	@Test
	public void alert() throws InterruptedException {
		a.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(1000);
		Alert sample = a.switchTo().alert();
		Thread.sleep(1000);
		sample.accept();
	}
}

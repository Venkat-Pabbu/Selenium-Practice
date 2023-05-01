package Selenium;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BrowserLaunch.Base;

public class Mouse_Actions extends Base {

	@Test
	public void Test11() throws InterruptedException {
		a.get("https://www.hyrtutorials.com/#");
		Thread.sleep(2000);
		Actions aa = new Actions(a);

	}

}
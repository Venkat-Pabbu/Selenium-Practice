package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;

	By txt_username = By.name("username");

	By txt_password = By.name("password");

	By Btn_Login = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

	By Btn_Dashboard = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		if (!driver.getTitle().equals("OrangeHRM")) {
			throw new IllegalStateException(
					"This is not a login page. and the correct login page is" + driver.getCurrentUrl());
		}

	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickonLoginBtn() {
		driver.findElement(Btn_Login).click();
	}

	public void DisplayDashboard() {
		driver.findElement(Btn_Dashboard).isDisplayed();
	}

	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(Btn_Login).click();
		driver.findElement(Btn_Dashboard).isDisplayed();

	}
}

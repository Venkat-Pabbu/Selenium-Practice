package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Protectable;

public class LoginSteps_POM {

	WebDriver driver = null;
	LoginPage login;

	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("****************I am Inside the Login Demo with POM *******************");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);

		System.setProperty("webdriver.chrome.driver",
				projectPath + "\\src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		;
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {

		login = new LoginPage(driver);

		login.enterUsername(username);
		Thread.sleep(3000);
		login.enterPassword(password);
		Thread.sleep(3000);

		// driver.findElement(By.name("username")).sendKeys(username);
		// driver.findElement(By.name("password")).sendKeys(password);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		login.clickonLoginBtn();

		// driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium
		// oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(4000);

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {

		// driver.getPageSource().contains("Dashboard");
		login.DisplayDashboard();

		Thread.sleep(6000);
		driver.close();
		driver.quit();
	}

}

package Stepdef;

import org.openqa.selenium.WebDriver;

import Generic.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sttepdef {
	
	WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
		Login lon = new Login();
		driver = lon.getChromeDriver(driver);
		

	}

	@Given("pass the URL {string}")
	public void pass_the_url(String URL) {

		driver.navigate().to(URL);
	}

	@When("enter username {string} in the Username field")
	public void enter_username_in_the_username_field(String string) {

	
	}

	@When("enter password {string} in the Password field")
	public void enter_password_in_the_password_field(String string) {

	}

	@When("click on Login")
	public void click_on_login() {

	}

	@Then("validate login is successful")
	public void validate_login_is_successful() {

	}

}

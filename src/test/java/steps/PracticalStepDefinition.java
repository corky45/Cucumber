package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class PracticalStepDefinition extends TestBase {
	LoginPage loginPage;

	@Before
	public void user_is_on_techfios_page() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("{string}  button exists")
	public void button_exists(String button) {
		loginPage.whiteButtonPresent();
		loginPage.blueButtonPresent();
	}

	@When("I click on the {string} button")
	public void i_click_on_the_color_button(String button) {
		loginPage.clickSkyBlueButton();
		loginPage.clickWhiteButton();
	}

	@Then("The background color will change to sky blue")
	public void the_background_color_will_change() {
		loginPage.verifySkyBlueBackgroundColor();
	}


	@Then("The background color will change to sky white")
	public void the_background_color_will_change_to_white() {
		loginPage.verifySkyWhiteBackgroundColor();
	}

	@After
	public void tear() {
		tearDown();
	}
}

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
	public void button_exists(String string) {
		driver.get("https://techfios.com/test/107/index.php");
		switch (string) {
		case "skyblue button":
			loginPage.skyBlueButtonPresent();
			break;
		case "white button":
			loginPage.whiteButtonPresent();
			break;
		}
	}

	@When("I click on the {string} button")
	public void i_click_on_the_color_button(String button) {
		switch (button) {
		case "Click on SkyBlue button":
			loginPage.clickSkyBlueButton();
			break;
		case "Click on skywhite Button":
			loginPage.clickWhiteButton();
			break;
		}
	}

	@Then("The background color will change to sky blue")
	public void the_background_color_will_change() {
		loginPage.takeScreenShot();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

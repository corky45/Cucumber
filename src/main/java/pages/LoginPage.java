package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SkyBlueButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement WhiteButton;

	// ("{string} button exists")
	public void skyBlueButtonPresent() {
		boolean t = SkyBlueButton.isDisplayed();
		if(t) {
			System.out.println("SkyBlue button is present");
		} else {
			System.out.println("SkyBlue button is not present");
		}
	}
	public void whiteButtonPresent() {
		boolean t = WhiteButton.isDisplayed();
		if(t) {
			System.out.println("SkyBlue button is present");
		} else {
			System.out.println("SkyBlue button is not present");
		}
	}
	

	public void clickSkyBlueButton() {
		SkyBlueButton.click();
	}
	public void clickWhiteButton() {
		WhiteButton.click();
	}
	public void takeScreenShot() {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFileToDirectory(sourceFile, new File(System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
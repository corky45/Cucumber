package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SkyBlueButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement WhiteButton;

	// ("{string} button exists")
	public void buttonPresent(String button) {
		if (button.equalsIgnoreCase("Set SkyBlue Background")) {
			SkyBlueButton.click();
		} else if (button.equalsIgnoreCase("Sey Sky White Background")) {
			WhiteButton.click();
		} else {
			System.out.println("Changed background color");
		}
	}
	public void blueButtonPresent() {
		boolean t = SkyBlueButton.isDisplayed();
		if (t) {
			System.out.println("Sky Blue button is present");
		} else {
			System.out.println("Sky Blue button is not present");
		}
	}
	
	public void whiteButtonPresent() {
		boolean t = WhiteButton.isDisplayed();
		if (t) {
			System.out.println("Sky White button is present");
		} else {
			System.out.println("Sky White button is not present");
		}
	}

	public void clickSkyBlueButton() {
		SkyBlueButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickWhiteButton() {
		WhiteButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void verifySkyBlueBackgroundColor() {
		SkyBlueButton = driver.findElement(By.tagName("body"));
        String bgColor = SkyBlueButton.getCssValue("background-color");
        Assert.assertEquals("rgba(255, 255, 255, 1)", bgColor);
    }
	public void verifySkyWhiteBackgroundColor() {
		WhiteButton = driver.findElement(By.tagName("body"));
        String bgColor = WhiteButton.getCssValue("background-color");
        Assert.assertEquals("rgb(226, 236, 235)", bgColor);
    }
}
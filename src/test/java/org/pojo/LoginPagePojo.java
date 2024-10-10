package org.pojo;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePojo extends BaseClass {

	// Non Parameterised constructor (with no arguments)
	public LoginPagePojo() {
		PageFactory.initElements(driver, this);

	}
	// 2. Find private WebElements or Objects using annotations

	// WebElement element = driver.findElements(By.id(""));
	// @FindBy(locname = "locvalue")

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(name = "login")
	private WebElement btnLogin;

	// 3. To Access private WebElements all over the project
	// We need getters method (Public methods)

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}

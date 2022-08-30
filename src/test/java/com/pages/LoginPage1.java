package com.pages;

import org.baseclass.BaseClassAdactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Bharath
 * @Description To use of Page Object Model and Page Factory in automation, Page
 *              Factory is a class provided by Selenium WebDriver to support
 *              Page Object Design patterns. In Page Factory,we use @FindBy
 *              annotation. The initElements method is used to initialize web
 *              elements.
 * @Date 08-jul-2022
 *
 */
public class LoginPage1 extends BaseClassAdactin {

	public LoginPage1() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement txtUserName;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement txtpassword;

	@FindBy(xpath = "//input[@id='login']")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[@id='username_show']")
	private WebElement txtVerifyUserName;

	@FindBy(xpath = "//b[contains(text(),'Invalid Login details or Your Password might have ')]")
	private WebElement txtVerifyErrorMsg;

	public WebElement getTxtVerifyUserName() {
		return txtVerifyUserName;
	}

	public WebElement getTxtVerifyErrorMsg() {
		return txtVerifyErrorMsg;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setTxtVerifyUserName(WebElement txtVerifyUserName) {
		this.txtVerifyUserName = txtVerifyUserName;
	}

	public void setTxtVerifyErrorMsg(WebElement txtVerifyErrorMsg) {
		this.txtVerifyErrorMsg = txtVerifyErrorMsg;
	}

	/**
	 * 
	 * @param userName
	 * @param password
	 * @Description Resuable method for Entering text and password using click
	 *              method
	 * 
	 * @Date 08-jul-2022
	 */
	public void login(String userName, String password) {
		enterText(getTxtUserName(), userName);
		enterText(getTxtpassword(), password);
		click(getBtnLogin());

	}

	/**
	 * @Description Resuable method for Entering text and password using Enter key
	 * @Date 08-jul-2022
	 * @param userName
	 * @param password
	 */
	public void loginWithEnter(String userName, String password) {
		enterText(getTxtUserName(), userName);
		enterTextEnter(getTxtpassword(), password);
	}

	// public void verifyLoginUserName(String message,String expecteds) {
	// assertEqualsGetAttribute(getTxtVerifyUserName(), message, expecteds);
	//
	// }
	//
	// public void verifyErrorMessage(String message,String expecteds) {
	// assertEqualsGetText(getTxtVerifyErrorMsg(), message, expecteds);
	//
	// }

}

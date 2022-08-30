package com.stepdefinition;

import org.baseclass.BaseClassAdactin;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Bharath
 * @Description LoginPage Verifying Adactin Hotel Login Details
 * @Date 08-jul-2022
 *
 */
public class LoginPageStep extends BaseClassAdactin {
	/**
	 * @Description To create an Object of Page Class only if the object is null. To
	 *              supply the already created object if it is not null
	 * @Date 08-jul-2022
	 */
	PageObjectManager pom = new PageObjectManager();

	@Given("User Should on Adactin page")
	public void userShouldOnAdactinPage() {
	}

	@When("User should  perform login enter {string} ,{string}")
	public void userShouldPerformLoginEnter(String userName, String password) {
		pom.getLoginPage1().login(getPropertyFileValue(userName), getPropertyFileValue(password));
	}

	@When("User should  perform login enter {string} ,{string} with Enter key")
	public void userShouldPerformLoginEnterWithEnterKey(String userName, String password) {
		pom.getLoginPage1().loginWithEnter(getPropertyFileValue(userName), getPropertyFileValue(password));
	}

	@Then("User should verify After login Unsuccessful error message occurs{string}")
	public void userShouldVerifyAfterLoginUnsuccessfulErrorMessageOccurs(String expectedErrorMessage) {
		// WebElement txtVerifyErrorMsg = pom.getLoginPage1().getTxtVerifyErrorMsg();
		// String text = txtVerifyErrorMsg.getText();
		// System.out.println(getText(pom.getLoginPage1().getTxtVerifyErrorMsg()));
		Assert.assertEquals("verify After Unsuccessful Login message", expectedErrorMessage,
				getText(pom.getLoginPage1().getTxtVerifyErrorMsg()));
	}

}

package com.stepdefinition;

import org.baseclass.BaseClassAdactin;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

/**
 * 
 * @author Bharath
 * @Description verify the Adactin Login details
 * @Date 08-jul-2022
 *
 */
public class CommonSteps extends BaseClassAdactin {
	/**
	 * @Description To create an Object of Page Class only ifthe object is null. To
	 *              supply the already created object if itis not null
	 * @Date 08-jul-2022
	 */
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Description User should verify After login Unsuccessful error message
	 *              occurs"Invalid Login details or Your Password might have
	 *              expired. Click here to reset your password" using Assert
	 * @Date 08-jul-2022
	 * @param expectedLoginSuccessfullMessage
	 */
	@Then("User should verify After login {string} successfully")
	public void userShouldVerifyAfterLoginSuccessfully(String expectedLoginSuccessfullMessage) {
		Assert.assertEquals("verify After Login Successful", expectedLoginSuccessfullMessage,
				getAttributeText(pom.getLoginPage1().getTxtVerifyUserName()));
	}

}

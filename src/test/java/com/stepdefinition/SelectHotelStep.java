package com.stepdefinition;

import org.baseclass.BaseClassAdactin;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Bharath
 * @Description Verifying Adactin Select Hotel Details
 * @Date 08-jul-2022
 *
 */
public class SelectHotelStep extends BaseClassAdactin {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Description User should perform in Select hotel by click continue
	 * @Date 08-jul-2022
	 */
	@When("User should perform in Select hotel by click continue")
	public void userShouldPerformInSelectHotelByClickContinue() {
		pom.getSelectHotelPage3().selecthotel();

	}

	/**
	 * 
	 * @DescriptionUser should verify after Select Hotel "Book A Hotel" is
	 *                  successfull by using Assert
	 * @Date 08-jul-2022
	 * @param expectedBookHotelSuccessfullMessage
	 */
	@Then("User should verify after Select Hotel {string} is successfull")
	public void userShouldVerifyAfterSelectHotelIsSuccessfull(String expectedBookHotelSuccessfullMessage) {
		Assert.assertEquals("verify After Select Hotel Successful", expectedBookHotelSuccessfullMessage,
				getText(pom.getSelectHotelPage3().getTxtVerifyBookHotel()));
	}

	/**
	 * @Description User should perform in Select hotel by not clicking any hotel
	 *              field
	 * @Date 08-jul-2022
	 */
	@When("User should perform in Select hotel by not clicking any hotel field")
	public void userShouldPerformInSelectHotelByNotClickingAnyHotelField() {
		pom.getSelectHotelPage3().selecthotelWithoutSelectingField();
	}

	/**
	 * @Description User should verify after Select Hotel Error message occurs
	 *              "Please Select a Hotel" using Assert
	 * @Date 08-jul-2022
	 * @param expectedErrorMessageinSelecthotel
	 */
	@Then("User should verify after Select Hotel Error message occurs {string}")
	public void userShouldVerifyAfterSelectHotelErrorMessageOccurs(String expectedErrorMessageinSelecthotel) {
		Assert.assertEquals("verify unsuccessful Message in select Hotel", expectedErrorMessageinSelecthotel,
				getText(pom.getSelectHotelPage3().getTxtVerifyErrormessage()));
	}

}

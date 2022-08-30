package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClassAdactin;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Bharath
 * @Description Verifying Adactin Book Hotel Details
 * @Date 08-jul-2022
 */
public class BookHotelStep extends BaseClassAdactin {

	/**
	 * @Description To create an Object of Page Class only if the object is null. To
	 *              supply the already created object if it is not null
	 * @Date 08-jul-2022
	 */
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Description User should perform in Book Hotel enter
	 *              "<firstName>","<lastName>" and "<billingAddress>" | creditCardNo
	 *              | creditCardType | expiryMonth | expiryYear | cvvNumber | using
	 *              datatable concepts
	 * @Date 08-jul-2022
	 * @param firstName
	 * @param lastName
	 * @param billingAddress
	 * @param dataTable
	 */
	@When("User should perform in Book Hotel enter {string},{string} and {string}")
	public void userShouldPerformInBookHotelEnterAnd(String firstName, String lastName, String billingAddress,
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(2);
		String creditCardNo = map.get("creditCardNo");
		String creditCardType = map.get("creditCardType");
		String expiryMonth = map.get("expiryMonth");
		String expiryYear = map.get("expiryYear");
		String cvvNumber = map.get("cvvNumber");

		pom.getBookHotelPage4().bookHotelSelectAllFields(firstName, lastName, billingAddress,
				getPropertyFileValue(creditCardNo), getPropertyFileValue(creditCardType),
				getPropertyFileValue(expiryMonth), getPropertyFileValue(expiryYear), getPropertyFileValue(cvvNumber));

	}

	/**
	 * @Description User should verify After Book hotel "Booking Confirmation"
	 *              successfully
	 * 
	 * @Date 08-jul-2022
	 * @param expectedBookingConfirmationSuccessfullMessage
	 */
	@Then("User should verify After Book hotel {string} successfully")
	public void userShouldVerifyAfterBookHotelSuccessfully(String expectedBookingConfirmationSuccessfullMessage) {
		System.out.println(getText(pom.getBookHotelPage4().getTxtVerifyBookingConfirmationMessage()));
		Assert.assertEquals("Verify After Book Hotel Successful", expectedBookingConfirmationSuccessfullMessage,
				getText(pom.getBookHotelPage4().getTxtVerifyBookingConfirmationMessage()));
	}

	/**
	 * @Description User should perform in Book hotel without selecting any fields
	 * @Date 08-jul-2022
	 */
	@When("User should perform in Book hotel without selecting any fields")
	public void userShouldPerformInBookHotelWithoutSelectingAnyFields() {
		pom.getBookHotelPage4().bookHotelWithoutSelectAnyFields();
	}

	/**
	 * @Description User should verify After Book hotel these error message occurs
	 *              "Please Enter your First Name" , "Please Enter you Last
	 *              Name","Please Enter your Address","Please Enter your 16 Digit
	 *              Credit Card Number","Please Select your Credit Card
	 *              Type","Please Select your Credit Card Expiry Month"and"Please
	 *              Enter your Credit Card CVV Number" using Assert
	 * 
	 * @Date 08-jul-2022
	 * @param expectedErrorMessageInFirstName
	 * @param expectedErrorMessageInLastName
	 * @param expectedErrorMessageInAddress
	 * @param expectedErrorMessageInCCNumber
	 * @param expectedErrorMessageInCCType
	 * @param expectedErrorMessageInExpiryMonth
	 * @param expectedErrorMessageInCVVnumber
	 */
	@Then("User should verify After Book hotel these error message occurs  {string} , {string},{string},{string},{string},{string}and{string}")
	public void userShouldVerifyAfterBookHotelTheseErrorMessageOccursAnd(String expectedErrorMessageInFirstName,
			String expectedErrorMessageInLastName, String expectedErrorMessageInAddress,
			String expectedErrorMessageInCCNumber, String expectedErrorMessageInCCType,
			String expectedErrorMessageInExpiryMonth, String expectedErrorMessageInCVVnumber) {

		Assert.assertEquals("Verify error message in first name", expectedErrorMessageInFirstName,
				getText(pom.getBookHotelPage4().getTxtVerifyErrorMessageInFirstName()));
		Assert.assertEquals("Verify error message in last name", expectedErrorMessageInLastName,
				getText(pom.getBookHotelPage4().getTxtVerifyErrorMessageInLastName()));
		Assert.assertEquals("Verify error message in Address", expectedErrorMessageInAddress,
				getText(pom.getBookHotelPage4().getTxtVerifyErrorMessageInAddress()));
		Assert.assertEquals("Verify error message in Card Number", expectedErrorMessageInCCNumber,
				getText(pom.getBookHotelPage4().getTxtVerifyErrorMessageInCardNumber()));
		Assert.assertEquals("Verify error message in Card Type", expectedErrorMessageInCCType,
				getText(pom.getBookHotelPage4().getTxtVerifyErrorMessageInCardType()));
		Assert.assertEquals("Verify error message in expiry month", expectedErrorMessageInExpiryMonth,
				getText(pom.getBookHotelPage4().getTxtVerifyErrorMessageInExpiryMonth()));
		Assert.assertEquals("Verify error message in cvv number", expectedErrorMessageInCVVnumber,
				getText(pom.getBookHotelPage4().getTxtVerifyErrorMessageInCvvNumber()));
	}

}

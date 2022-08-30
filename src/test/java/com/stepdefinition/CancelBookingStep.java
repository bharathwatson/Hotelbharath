package com.stepdefinition;

import org.baseclass.BaseClassAdactin;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Bharath
 * @Description Verifying Adactin Hotel to Cancel Booking
 * @Date 08-jul-2022
 */
public class CancelBookingStep extends BaseClassAdactin {
	/**
	 * @Description To create an Object of Page Class only if the object is null. To
	 *              supply the already created object if it is not null
	 * @Date 08-jul-2022
	 */
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Description User should perform to cancel the order id
	 * @Date 08-jul-2022
	 */
	@When("User should perform  to cancel the order id")
	public void userShouldPerformToCancelTheOrderId() {
		String bookingConfirmation = pom.getBookingConfirmationPage5().bookingConfirmation();
		pom.getCancelBookingpage6().cancelBooking(bookingConfirmation);
	}

	/**
	 * @Description User should verify After Cancel Order message contains "The
	 *              booking has been cancelled." sucessfully using Assert
	 * @Date 08-jul-2022
	 * @param expectedCancelOrderMessage
	 */
	@Then("User should verify After Cancel Order message contains {string} sucessfully")
	public void userShouldVerifyAfterCancelOrderMessageContainsSucessfully(String expectedCancelOrderMessage) {
		Assert.assertEquals("Verify cancelled message", expectedCancelOrderMessage,
				getText(pom.getCancelBookingpage6().getTxtVerifyCancelledMessage()));
	}

	/**
	 * @Description User should perform in Booked Itinerary to cancel existing
	 *              "<orderId>"
	 * @Date 08-jul-2022
	 * @param orderNo
	 */
	@When("User should perform in Booked Itinerary to cancel existing  {string}")
	public void userShouldPerformInBookedItineraryToCancelExisting(String orderNo) {
		pom.getCancelBookingpage6().cancelBookingExisiting(orderNo);
	}

}

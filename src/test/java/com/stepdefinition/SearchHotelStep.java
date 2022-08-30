package com.stepdefinition;

import org.baseclass.BaseClassAdactin;
import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Bharath
 * @Description Verifying Adactin Search Hotel Details
 * @Date 08-jul-2022
 */
public class SearchHotelStep extends BaseClassAdactin {
	/**
	 * @Description To create an Object of Page Class only if the object is null. To
	 *              supply the already created object if it is not null
	 * @Date 08-jul-2022
	 */
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @Description User should perfom in Search Hotel enter
	 *              "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultPerRoom>"and"<childPerRooom>"
	 * @Date 08-jul-2022
	 * @param location
	 * @param hotels
	 * @param room
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param noOfAdult
	 * @param noOfChild
	 */
	@When("User should perfom in Search Hotel enter {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void userShouldPerfomInSearchHotelEnterAnd(String location, String hotels, String room, String noOfRooms,
			String inDate, String outDate, String noOfAdult, String noOfChild) {
		pom.getSearchHotelPage2().searchHotelSelectAllField((location), (hotels), (room), (noOfRooms), (inDate),
				(outDate), (noOfAdult), (noOfChild));
	}

	/**
	 * @Description User should verify after Search Hotel "Select Hotel" is
	 *              successfull using Assert
	 * @Date 08-jul-2022
	 * @param expectedSelectHotelSuccessfullMessage
	 */
	@Then("User should verify after Search Hotel {string} is successfull")
	public void userShouldVerifyAfterSearchHotelIsSuccessfull(String expectedSelectHotelSuccessfullMessage) {

		Assert.assertEquals("verify After Search Successful", expectedSelectHotelSuccessfullMessage,
				getText(pom.getSearchHotelPage2().getTxtVerifySelectHotelMessage()));
	}

	/**
	 * @Description
	 * @Date 08-jul-2022
	 * @param location
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param noOfAdult
	 */
	@When("User should perfom only Mandatory Field in  Search Hotel enter {string},{string},{string},{string}and{string}")
	public void userShouldPerfomOnlyMandatoryFieldInSearchHotelEnterAnd(String location, String noOfRooms,
			String inDate, String outDate, String noOfAdult) {
		pom.getSearchHotelPage2().searchHotelSelectOnlyMandatoryFields((location), (noOfRooms), (inDate), (outDate),
				(noOfAdult));
	}

	/**
	 * @Description User should perfom only Mandatory Field in Search Hotel enter
	 *              "<location>","<numberOfRooms>","<checkInDate>","<checkOutDate>"and"<adultPerRoom>"
	 * @Date 08-jul-2022
	 * @param expectedErrorMsgCheckIn
	 * @param expectedErrorMsgCheckOut
	 */
	@Then("User should verify after Search Hotel Error message in CheckInDate and checkOutDate {string} and {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageInCheckInDateAndCheckOutDateAnd(
			String expectedErrorMsgCheckIn, String expectedErrorMsgCheckOut) {
		Assert.assertEquals("verify unsuccessful message in checkin date", expectedErrorMsgCheckIn,
				getText(pom.getSearchHotelPage2().getTxtVerifyErrorMessageInCheckIn()));
		Assert.assertEquals("verify unsuccessful message in checkout date", expectedErrorMsgCheckOut,
				getText(pom.getSearchHotelPage2().getTxtVerifyErrorMessageInCheckOut()));
	}

	/**
	 * @Description User should perfom without Enter any Fields in Search Hotels
	 * @Date 08-jul-2022
	 */
	@When("User should perfom without Enter any Fields in Search Hotels")
	public void userShouldPerfomWithoutEnterAnyFieldsInSearchHotels() {
		pom.getSearchHotelPage2().searchHotelWithoutSelectingField();
	}

	/**
	 * @Description User should verify after Search Hotel Error message in
	 *              CheckInDate and checkOutDate "Check-In Date shall be before than
	 *              Check-Out Date" and "Check-Out Date shall be after than Check-In
	 *              Date"
	 * @Date 08-jul-2022
	 * @param expectedErrorMessage
	 */
	@Then("User should verify after Search Hotel Error message in locations {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageInLocations(String expectedErrorMessage) {
		Assert.assertEquals("verify unsuccessful message in Location", expectedErrorMessage,
				getText(pom.getSearchHotelPage2().getTxtVerifyErrorMessageInLocation()));
	}

}

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
public class SearchHotelPage2 extends BaseClassAdactin {

	public SearchHotelPage2() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement dDnLocation;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement dDnHotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement dDnRoom;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement dDnNoofRoom;

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement txtInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement txtOutDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement dDnAdultRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement dDnChildRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement btnSearch;

	@FindBy(xpath = "//span[@id='location_span']")
	private WebElement txtVerifyErrorMessageInLocation;

	@FindBy(xpath = "//span[@id='checkin_span']")
	private WebElement txtVerifyErrorMessageInCheckIn;

	@FindBy(xpath = "//span[@id='checkout_span']")
	private WebElement txtVerifyErrorMessageInCheckOut;

	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement txtVerifySelectHotelMessage;

	public WebElement getTxtVerifyErrorMessageInLocation() {
		return txtVerifyErrorMessageInLocation;
	}

	public WebElement getTxtVerifyErrorMessageInCheckIn() {
		return txtVerifyErrorMessageInCheckIn;
	}

	public WebElement getTxtVerifyErrorMessageInCheckOut() {
		return txtVerifyErrorMessageInCheckOut;
	}

	public WebElement getTxtVerifySelectHotelMessage() {
		return txtVerifySelectHotelMessage;
	}

	public void setTxtVerifyErrorMessageInLocation(WebElement txtVerifyErrorMessageInLocation) {
		this.txtVerifyErrorMessageInLocation = txtVerifyErrorMessageInLocation;
	}

	public void setTxtVerifyErrorMessageInCheckIn(WebElement txtVerifyErrorMessageInCheckIn) {
		this.txtVerifyErrorMessageInCheckIn = txtVerifyErrorMessageInCheckIn;
	}

	public void setTxtVerifyErrorMessageInCheckOut(WebElement txtVerifyErrorMessageInCheckOut) {
		this.txtVerifyErrorMessageInCheckOut = txtVerifyErrorMessageInCheckOut;
	}

	public void setTxtVerifySelectHotelMessage(WebElement txtVerifySelectHotelMessage) {
		this.txtVerifySelectHotelMessage = txtVerifySelectHotelMessage;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoom() {
		return dDnRoom;
	}

	public WebElement getdDnNoofRoom() {
		return dDnNoofRoom;
	}

	public WebElement getTxtInDate() {
		return txtInDate;
	}

	public WebElement getTxtOutDate() {
		return txtOutDate;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	/**
	 * 
	 * @param location
	 * @param hotels
	 * @param room
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param noOfAdult
	 * @param noOfChild
	 * @Description Verify Search Hotels by selecting all fields method
	 * 
	 * @Date 08-jul-2022
	 */
	public void searchHotelSelectAllField(String location, String hotels, String room, String noOfRooms, String inDate,
			String outDate, String noOfAdult, String noOfChild) {

		selectOptionByvalue(getdDnLocation(), location);
		selectOptionByvalue(getdDnHotels(), hotels);
		selectOptionByvalue(getdDnRoom(), room);
		selectOptionByText(getdDnNoofRoom(), noOfRooms);
		clearText(getTxtInDate());
		enterText(getTxtInDate(), inDate);
		clearText(getTxtOutDate());
		enterText(getTxtOutDate(), outDate);
		selectOptionByText(getdDnAdultRoom(), noOfAdult);
		selectOptionByText(getdDnChildRoom(), noOfChild);
		click(getBtnSearch());

	}

	/**
	 * @Description Verify Search Hotels in Mandatory field method
	 * @Date 08-jul-2022
	 * @param location
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param noOfAdult
	 */
	public void searchHotelSelectOnlyMandatoryFields(String location, String noOfRooms, String inDate, String outDate,
			String noOfAdult) {

		selectOptionByvalue(getdDnLocation(), location);
		selectOptionByText(getdDnNoofRoom(), noOfRooms);
		clearText(getTxtInDate());
		enterText(getTxtInDate(), inDate);
		clearText(getTxtOutDate());
		enterText(getTxtOutDate(), outDate);
		selectOptionByText(getdDnAdultRoom(), noOfAdult);
		click(getBtnSearch());

	}

	/**
	 * @Description Verify Without enter any fields in Search Hotels click method
	 * @Date 08-jul-2022
	 */
	public void searchHotelWithoutSelectingField() {
		click(getBtnSearch());
	}

}

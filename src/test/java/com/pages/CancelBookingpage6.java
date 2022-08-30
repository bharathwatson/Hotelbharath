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
 * 
 * @Date 08-jul-2022
 *
 */
public class CancelBookingpage6 extends BaseClassAdactin {

	public CancelBookingpage6() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='order_id_text']")
	private WebElement txtOrderNo;

	@FindBy(xpath = "//input[@id='search_hotel_id']")
	private WebElement btnSearchHotelId;

	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement radioBtnOrderId;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancelSelect;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement lnkBookedItinerary;

	@FindBy(xpath = "//label[@id='search_result_error']")
	private WebElement txtVerifyCancelledMessage;

	public WebElement getTxtVerifyCancelledMessage() {
		return txtVerifyCancelledMessage;
	}

	public void setTxtVerifyCancelledMessage(WebElement txtVerifyCancelledMessage) {
		this.txtVerifyCancelledMessage = txtVerifyCancelledMessage;
	}

	public WebElement getLnkBookedItinerary() {
		return lnkBookedItinerary;
	}

	public WebElement getRadioBtnOrderId() {
		return radioBtnOrderId;
	}

	public WebElement getBtnCancelSelect() {
		return btnCancelSelect;
	}

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getBtnSearchHotelId() {
		return btnSearchHotelId;
	}

	/**
	 * 
	 * @param orderNo
	 * @Description Cancel booking in Adactin Hotel for Current Booking orderId
	 * @Date 08-jul-2022
	 */
	public void cancelBooking(String orderNo) {

		enterText(getTxtOrderNo(), orderNo);

		click(getBtnSearchHotelId());

		click(radioBtnOrderId);

		click(btnCancelSelect);

		alertAccept();

	}

	/**
	 * @Description Cancel booking in Adactin Hotel for exisiting Booked order id
	 * @Date 08-jul-2022
	 * @param orderNo
	 */
	public void cancelBookingExisiting(String orderNo) {

		click(getLnkBookedItinerary());

		enterText(getTxtOrderNo(), orderNo);

		click(getBtnSearchHotelId());

		click(radioBtnOrderId);

		click(btnCancelSelect);

		alertAccept();

	}

}

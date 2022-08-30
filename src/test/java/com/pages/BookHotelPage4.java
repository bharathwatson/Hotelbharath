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

public class BookHotelPage4 extends BaseClassAdactin {

	public BookHotelPage4() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement txtLastName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement txtAddress;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement txtCreditCard;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement dDnCardType;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement dDnSelectMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement dDnSelectYear;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement txtCVV;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement btnBookNow;

	@FindBy(xpath = "//label[@id='first_name_span']")
	private WebElement txtVerifyErrorMessageInFirstName;

	@FindBy(xpath = "//label[@id='last_name_span']")
	private WebElement txtVerifyErrorMessageInLastName;

	@FindBy(xpath = "//label[@id='address_span']")
	private WebElement txtVerifyErrorMessageInAddress;

	@FindBy(xpath = "//label[@id='cc_num_span']")
	private WebElement txtVerifyErrorMessageInCardNumber;

	@FindBy(xpath = "//label[@id='cc_type_span']")
	private WebElement txtVerifyErrorMessageInCardType;

	@FindBy(xpath = "//label[@id='cc_expiry_span']")
	private WebElement txtVerifyErrorMessageInExpiryMonth;

	@FindBy(xpath = "//label[@id='cc_cvv_span']")
	private WebElement txtVerifyErrorMessageInCvvNumber;

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement txtVerifyBookingConfirmationMessage;

	public void setTxtVerifyErrorMessageInFirstName(WebElement txtVerifyErrorMessageInFirstName) {
		this.txtVerifyErrorMessageInFirstName = txtVerifyErrorMessageInFirstName;
	}

	public void setTxtVerifyErrorMessageInLastName(WebElement txtVerifyErrorMessageInLastName) {
		this.txtVerifyErrorMessageInLastName = txtVerifyErrorMessageInLastName;
	}

	public void setTxtVerifyErrorMessageInAddress(WebElement txtVerifyErrorMessageInAddress) {
		this.txtVerifyErrorMessageInAddress = txtVerifyErrorMessageInAddress;
	}

	public void setTxtVerifyErrorMessageInCardNumber(WebElement txtVerifyErrorMessageInCardNumber) {
		this.txtVerifyErrorMessageInCardNumber = txtVerifyErrorMessageInCardNumber;
	}

	public void setTxtVerifyErrorMessageInCardType(WebElement txtVerifyErrorMessageInCardType) {
		this.txtVerifyErrorMessageInCardType = txtVerifyErrorMessageInCardType;
	}

	public void setTxtVerifyErrorMessageInExpiryMonth(WebElement txtVerifyErrorMessageInExpiryMonth) {
		this.txtVerifyErrorMessageInExpiryMonth = txtVerifyErrorMessageInExpiryMonth;
	}

	public void setTxtVerifyErrorMessageInCvvNumber(WebElement txtVerifyErrorMessageInCvvNumber) {
		this.txtVerifyErrorMessageInCvvNumber = txtVerifyErrorMessageInCvvNumber;
	}

	public void setTxtVerifyBookingConfirmationMessage(WebElement txtVerifyBookingConfirmationMessage) {
		this.txtVerifyBookingConfirmationMessage = txtVerifyBookingConfirmationMessage;
	}

	public WebElement getTxtVerifyErrorMessageInFirstName() {
		return txtVerifyErrorMessageInFirstName;
	}

	public WebElement getTxtVerifyErrorMessageInLastName() {
		return txtVerifyErrorMessageInLastName;
	}

	public WebElement getTxtVerifyErrorMessageInAddress() {
		return txtVerifyErrorMessageInAddress;
	}

	public WebElement getTxtVerifyErrorMessageInCardNumber() {
		return txtVerifyErrorMessageInCardNumber;
	}

	public WebElement getTxtVerifyErrorMessageInCardType() {
		return txtVerifyErrorMessageInCardType;
	}

	public WebElement getTxtVerifyErrorMessageInExpiryMonth() {
		return txtVerifyErrorMessageInExpiryMonth;
	}

	public WebElement getTxtVerifyErrorMessageInCvvNumber() {
		return txtVerifyErrorMessageInCvvNumber;
	}

	public WebElement getTxtVerifyBookingConfirmationMessage() {
		return txtVerifyBookingConfirmationMessage;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}

	public WebElement getdDnCardType() {
		return dDnCardType;
	}

	public WebElement getdDnSelectMonth() {
		return dDnSelectMonth;
	}

	public WebElement getdDnSelectYear() {
		return dDnSelectYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	/**
	 * @Description Book hotel by selecting all fields method
	 * @Date 08-jul-2022
	 * @param firstName
	 * @param lastName
	 * @param billingAddress
	 * @param creditCard
	 * @param cardType
	 * @param selectMonth
	 * @param selectYear
	 * @param cVV
	 * @throws InterruptedException
	 */
	public void bookHotelSelectAllFields(String firstName, String lastName, String billingAddress, String creditCard,
			String cardType, String selectMonth, String selectYear, String cVV) {
		enterText(getTxtFirstName(), firstName);
		enterText(getTxtLastName(), lastName);
		enterText(getTxtAddress(), billingAddress);
		enterText(getTxtCreditCard(), creditCard);
		selectOptionByvalue(getdDnCardType(), cardType);
		selectOptionByText(getdDnSelectMonth(), selectMonth);
		selectOptionByvalue(getdDnSelectYear(), selectYear);
		enterText(getTxtCVV(), cVV);
		click(getBtnBookNow());
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	/**
	 * @Description Book hotel by Without selecting any fields method
	 * @Date 08-jul-2022
	 */
	public void bookHotelWithoutSelectAnyFields() {
		click(getBtnBookNow());

	}

}

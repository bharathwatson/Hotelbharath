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
public class BookingConfirmationPage5 extends BaseClassAdactin {

	public BookingConfirmationPage5() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement prtOrderNo;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement lnkBookedItinerary;

	public WebElement getPrtOrderNo() {
		return prtOrderNo;
	}

	public WebElement getLnkBookedItinerary() {
		return lnkBookedItinerary;
	}

	/**
	 * @Description To Get the Booking Confirmation order id using Attribute text
	 * @Date 08-jul-2022
	 * @return
	 */
	public String bookingConfirmation() {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String attributeText = getAttributeText(getPrtOrderNo());

		click(getLnkBookedItinerary());
		return attributeText;

	}

}

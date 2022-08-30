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
public class SelectHotelPage3 extends BaseClassAdactin {

	public SelectHotelPage3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement btnSelect;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement btnContinue;

	@FindBy(xpath = "//label[@id='radiobutton_span']")
	private WebElement txtVerifyErrormessage;

	@FindBy(xpath = "//td[normalize-space()='Book A Hotel']")
	private WebElement txtVerifyBookHotel;

	public void setTxtVerifyErrormessage(WebElement txtVerifyErrormessage) {
		this.txtVerifyErrormessage = txtVerifyErrormessage;
	}

	public void setTxtVerifyBookHotel(WebElement txtVerifyBookHotel) {
		this.txtVerifyBookHotel = txtVerifyBookHotel;
	}

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtVerifyErrormessage() {
		return txtVerifyErrormessage;
	}

	public WebElement getTxtVerifyBookHotel() {
		return txtVerifyBookHotel;
	}

	/**
	 * @Description Select Hotels by select the Hotel Field method
	 * @Date 08-jul-2022
	 */
	public void selecthotel() {
		click(getBtnSelect());

		click(getBtnContinue());
	}

	/**
	 * @Description Select Hotels by Without select any Hotel Field method
	 * @Date 08-jul-2022
	 */
	public void selecthotelWithoutSelectingField() {

		click(getBtnContinue());
	}

}

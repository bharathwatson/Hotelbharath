package com.pagemanager;

import com.pages.BookHotelPage4;
import com.pages.BookingConfirmationPage5;
import com.pages.CancelBookingpage6;
import com.pages.LoginPage1;
import com.pages.SearchHotelPage2;
import com.pages.SelectHotelPage3;

/**
 * 
 * @author Bharath
 * @Description Using pageObjectManager to reduce the mulitple object creation
 *              for different class. To create an Object of Page Class only if
 *              the object is null. To supply the already created object if it
 *              is not null
 * 
 * @Date 08-jul-2022
 *
 */
public class PageObjectManager {

	private LoginPage1 loginPage1;
	private SearchHotelPage2 searchHotelPage2;
	private SelectHotelPage3 selectHotelPage3;
	private BookHotelPage4 bookHotelPage4;
	private BookingConfirmationPage5 bookingConfirmationPage5;
	private CancelBookingpage6 cancelBookingpage6;

	public LoginPage1 getLoginPage1() {
		return (loginPage1 == null) ? loginPage1 = new LoginPage1() : loginPage1;
	}

	public SearchHotelPage2 getSearchHotelPage2() {
		return (searchHotelPage2 == null) ? searchHotelPage2 = new SearchHotelPage2() : searchHotelPage2;
	}

	public SelectHotelPage3 getSelectHotelPage3() {
		return (selectHotelPage3 == null) ? selectHotelPage3 = new SelectHotelPage3() : selectHotelPage3;
	}

	public BookHotelPage4 getBookHotelPage4() {
		return (bookHotelPage4 == null) ? bookHotelPage4 = new BookHotelPage4() : bookHotelPage4;
	}

	public BookingConfirmationPage5 getBookingConfirmationPage5() {
		return (bookingConfirmationPage5 == null) ? bookingConfirmationPage5 = new BookingConfirmationPage5()
				: bookingConfirmationPage5;
	}

	public CancelBookingpage6 getCancelBookingpage6() {
		return (cancelBookingpage6 == null) ? cancelBookingpage6 = new CancelBookingpage6() : cancelBookingpage6;
	}

}

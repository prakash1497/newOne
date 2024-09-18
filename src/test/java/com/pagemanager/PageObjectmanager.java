package com.pagemanager;

import com.pom.BookingConfirmationPage;
import com.pom.BookingHotelPage;
import com.pom.CancelBookingPage;
import com.pom.LoginPage;
import com.pom.SearchHotelPage;
import com.pom.SelectHotelPage;

public class PageObjectmanager {
	private LoginPage loginPage;
	private SearchHotelPage searchHotelpage;
	private SelectHotelPage selectHotelpage;
	private BookingHotelPage bookingHotelpage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBooking;

	public LoginPage getLoginPage() {
		return (loginPage == null)? loginPage = new LoginPage() : loginPage;
	}

	public SearchHotelPage getSearchHotelpage() {
		return (searchHotelpage == null) ? searchHotelpage = new SearchHotelPage() : searchHotelpage;
	}

	public SelectHotelPage getSelectHotelpage() {
		return (selectHotelpage == null) ? selectHotelpage = new SelectHotelPage() : selectHotelpage;
	}

	public BookingHotelPage getBookingHotelpage() {
		return (bookingHotelpage == null) ? bookingHotelpage = new BookingHotelPage() : bookingHotelpage;
	}

	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage == null) ? bookingConfirmationPage = new BookingConfirmationPage()
				: bookingConfirmationPage;
	}

	public CancelBookingPage getCancelBooking() {
		return (cancelBooking == null) ? cancelBooking = new CancelBookingPage() : cancelBooking;
	}

}

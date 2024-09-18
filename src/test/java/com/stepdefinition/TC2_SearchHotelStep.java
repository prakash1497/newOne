package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends BaseClass {
	PageObjectmanager pom = new PageObjectmanager();

	@Then("user should enter all the fields {string}, {string}, {string},"
			+ " {string}, {string}, {string},{string} and {string}  click on Search")
	public void user_should_enter_all_the_fields_and_click_on_search(String location, String hotels, String roomType,
			String noOfRooms, String checkin, String checkout, String adults, String child) {
		pom.getSearchHotelpage().searchHotels(location, hotels, roomType, noOfRooms, checkin, checkout, adults, child);

	}

	@Then("user should enter only mandatory fields {string}, {string}, {string}, "
			+ "{string} and {string} click on Search")
	public void user_should_enter_only_mandatory_fields_and_click_on_search(String location, String noOfRooms,
			String checkInDate, String checkOutDate, String adultsPerRoom) {
		pom.getSearchHotelpage().searchHotels(location, noOfRooms, checkInDate, checkOutDate, adultsPerRoom);
	}

	@Then("user should enter Checkin Date  after than Checkout Date  {string}, {string}, "
			+ "{string}, {string}, {string}, {string},{string} and {string}  click on Search")
	public void user_should_enter_checkin_date_after_than_checkout_date_and_click_on_search(String location,
			String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom, String childsPerRoom) {
		pom.getSearchHotelpage().searchHotels(location, hotels, roomType, noOfRooms, checkInDate, checkOutDate,
				adultsPerRoom, childsPerRoom);

	}

	@Then("user should verify after click on search button error message {string} and {string}")
	public void user_should_verify_after_click_on_search_button_error_message_and(String checkin, String checkout) {
		pom.getSearchHotelpage().errordate(checkin, checkout);

	}

	@Then("user should click on search without entering any fields")
	public void userShouldClickOnSearchWithoutEnteringAnyFields() {
		pom.getSearchHotelpage().searchHotels();
	}

	@Then("user should verify location error message {string}")
	public void user_should_verify_location_error_message(String expected) {
		pom.getSearchHotelpage().errorlocation(expected);
	}

}

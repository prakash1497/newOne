package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement roomNos;
	public WebElement getSuccessmsg() {
		return successmsg;
	}

	public WebElement getErrorlocation() {
		return errorlocation;
	}

	public WebElement getErrorcheckin() {
		return errorcheckin;
	}

	public WebElement getErrorcheckout() {
		return errorcheckout;
	}

	@FindBy(id = "datepick_in")
	private WebElement dateIn;
	@FindBy(id = "datepick_out")
	private WebElement dateOut;
	@FindBy(id = "adult_room")
	private WebElement adults;
	@FindBy(id = "child_room")
	private WebElement childs;
	@FindBy(id = "Submit")
	private WebElement Searchbtn;
	@FindBy(id = "username_show")
	private WebElement successmsg;

	@FindBy(id = "location_span")
	private WebElement errorlocation;

	@FindBy(id = "checkin_span")
	private WebElement errorcheckin;

	@FindBy(id = "checkout_span")
	private WebElement errorcheckout;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChilds() {
		return childs;
	}

	public WebElement getSearchbtn() {
		return Searchbtn;
	}

	public void searchHotels(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
			String checkOutDate, String adultsPerRoom, String childsPerRoom) {

		WebElement location2 = getLocation();
		selectOptionByText(location2, location);

		WebElement hotel = getHotel();
		selectOptionByText(hotel, hotels);

		WebElement rType = getRoomType();
		selectOptionByText(rType, roomType);

		WebElement roomNos = getRoomNos();
		elementClick(roomNos);
		selectOptionByText(roomNos, noOfRooms);

		WebElement inDate = getDateIn();
		clearTextBox(inDate);
		elementSendKeys(inDate, checkInDate);

		WebElement outDate = getDateOut();
		clearTextBox(outDate);

		elementSendKeys(outDate, checkOutDate);

		WebElement adults = getAdults();
		elementClick(adults);
		selectOptionByText(adults, adultsPerRoom);

		WebElement childs = getChilds();
		elementClick(childs);
		selectOptionByText(childs, childsPerRoom);

		getSearchbtn().click();

	}

	public void searchHotels(String location, String noOfRooms, String checkInDate, String checkOutDate,
			String adultsPerRoom ) {
		WebElement loc = getLocation();
		elementClick(loc);
		selectOptionByText(loc, location);

		WebElement roomNos = getRoomNos();
		elementClick(roomNos);
		selectOptionByText(roomNos, noOfRooms);

		WebElement inDate = getDateIn();
		clearTextBox(inDate);
		elementSendKeys(inDate, checkInDate);

		WebElement outDate = getDateOut();
		clearTextBox(outDate);
		elementSendKeys(outDate, checkOutDate);

		WebElement adults = getAdults();
		elementClick(adults);
		selectOptionByText(adults, adultsPerRoom);
		

		getSearchbtn().click();
	}

	public void searchHotels() {
		getSearchbtn().click();
	}
	public void errordate(String checkin, String checkout) {
		
		
		String elementGetText = elementGetText(getErrorcheckin());
		Assert.assertEquals(elementGetText, checkin);
		String elementGetText2 = elementGetText(getErrorcheckout());
		Assert.assertEquals(elementGetText2, checkout);
		
	}
	public void errorlocation(String expected) {
		String elementGetText = elementGetText(errorlocation);
		Assert.assertEquals(elementGetText, expected);

	}

}

package com.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement bookedItinerary;
	@FindBy(name = "order_id_text")
	private WebElement searchBox;
	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancel;
	public WebElement getSuccess() {
		return success;
	}

	@FindBy(id = "search_result_error")
	private WebElement success;
	
	
	
	
	
	
	
	
	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getBtnGo() {
		return btnGo;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void cancelOrderId(String id) {
		getBookedItinerary().click();
		elementSendKeys(searchBox, id);
		elementClick(btnGo);
		elementClick(btnCancel);
		alertAccept();
		
	}
}


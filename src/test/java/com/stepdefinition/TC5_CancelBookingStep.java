package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TC5_CancelBookingStep extends BaseClass{
	PageObjectmanager pom = new PageObjectmanager();


	@Then("user should click on  Booked Itinerary and paste the order id and cancel the order")
	public void userShouldClickOnBookedItineraryAndPasteTheOrderIdAndCancelTheOrder() throws InterruptedException {
		String orderId = pom.getBookingConfirmationPage().getOrderId();

		pom.getCancelBooking().cancelOrderId(orderId);
		

	}

	
	@Then("user should verify after cancel the order id  success message {string}")
	public void userShouldVerifyAfterCancelTheOrderIdSuccessMessage(String expected) {
		WebElement success = pom.getCancelBooking().getSuccess();
		String actual = success.getText();
		Assert.assertEquals(expected, actual);
		
	}

	@Then("user should click on  Booked Itinerary and paste the existing {string} and cancel the order")
	public void userShouldClickOnBookedItineraryAndPasteTheExistingAndCancelTheOrder(String string) {
		pom.getCancelBooking().cancelOrderId(string);
		

	}

}

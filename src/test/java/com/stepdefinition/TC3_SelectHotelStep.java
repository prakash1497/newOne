package com.stepdefinition;

import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep extends BaseClass {
	
	PageObjectmanager pom= new PageObjectmanager();
	

	@Then("user should select hotel and click on continue button")
	public void userShouldSelectHotelAndClickOnContinueButton() throws InterruptedException {
		pom.getSelectHotelpage().selectHotel();
		

	}

	@Then("user should verify after click on continue navigates to {string}")
	public void userShouldVerifyAfterClickOnContinueNavigatesTo(String expected) {
		String elementGetText = elementGetText(pom.getBookingHotelpage().getSuccessmsg());
		Assert.assertEquals(elementGetText, expected);
	}

	@Then("user should click on continue without selecting any hotel")
	public void userShouldClickOnContinueWithoutSelectingAnyHotel() {
		pom.getSelectHotelpage().clickContinue();
	}

	@Then("user should verify after click on continue Error message {string}")
	public void userShouldVerifyAfterClickOnContinueErrorMessage(String expected) {
	
	String elementGetText = elementGetText(pom.getSelectHotelpage().getErrormsg());
	Assert.assertEquals(elementGetText, expected);

}}

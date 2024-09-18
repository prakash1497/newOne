package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectmanager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class CommonStep extends BaseClass {
	PageObjectmanager pom = new PageObjectmanager();

	@Then("user should verify after login succes message {string}")
	public void userShouldVerifyAfterLoginSuccesMessage(String expected) {
		WebElement successmsg = pom.getSearchHotelpage().getSuccessmsg();
		String actual = getAttributevalue(successmsg);
		Assert.assertEquals(expected, actual);

	}
	@Then("user should verify after search navigates to {string}")
	public void userShouldVerifyAfterSearchNavigatesTo(String expected) {
		WebElement successmsg = pom.getSelectHotelpage().getSuccessmsg();
		String actual = elementGetText(successmsg);
		Assert.assertEquals(expected, actual);

		
		// success

	}

}

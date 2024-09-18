package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep extends BaseClass {

	PageObjectmanager pom = new PageObjectmanager();

	@Then("user should enter all the fields {string}, {string} and {string} click on BookNow Btn")
	public void user_should_enter_all_the_fields_and_click_on_book_now_btn(String firstName, String lastName,
			String billAddress, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		// throw new io.cucumber.java.PendingException();
		List<List<String>> asLists = dataTable.asLists();
		List<String> list = asLists.get(1);
		String cardNo = list.get(0);
		String cardType = list.get(1);
		String expMonth = list.get(2);
		String expYear = list.get(3);
		String cvvNo = list.get(4);
		pom.getBookingHotelpage().bookHotel(firstName, lastName, billAddress, cardNo, cardType, expMonth, expYear,
				cvvNo);
		String orderId = pom.getBookingConfirmationPage().getOrderId();
		

	}

	@Then("user should verify after click on BookNow Btn success message {string} and save the order id")
	public void userShouldVerifyAfterClickOnBookNowBtnSuccessMessageAndSaveTheOrderId(String expected) {
		String actual = elementGetText(pom.getBookingConfirmationPage().getSuccessmsg());
		Assert.assertEquals(expected, actual);

	}

	@Then("user should click on BookNow Btn")
	public void userShouldClickOnBookNowBtn() {
		pom.getBookingHotelpage().bookHotel();
	}

	@Then("user should verify after click on BookNow Btn error messages {string}, {string}, {string}, {string},{string}, {string} and {string}.")
	public void userShouldVerifyAfterClickOnBookNowBtnErrorMessagesAnd(String s1, String s2, String s3,
			String s4, String s5, String s6, String s7) {
     String[] actual = pom.getBookingHotelpage().errorcheck();

     
     String[] expected={s1,s2,s3,s4,s5,s6,s7};
     Assert.assertEquals(expected.length, actual.length);
     for (int i = 0; i < expected.length; i++) {
 Assert.assertEquals(expected[i], actual[i]);		
	}
//     boolean equals = actual.equals(expected);
//     Assert.assertTrue(true);


	}

}

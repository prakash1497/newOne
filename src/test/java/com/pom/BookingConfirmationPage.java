package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfirmationPage extends BaseClass {

	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderID;
	
	@FindBy(xpath="//*[@id=\"booking_form\"]/table/tbody/tr[1]/td")
	private WebElement successmsg;


	public WebElement getSuccessmsg() {
		return successmsg;
	}

	public WebElement getOrderID() {
		return orderID;
	}
	
	public String getOrderId() throws InterruptedException {
		
		WebElement orderId = getOrderID();
		String id = getAttributevalue(orderId);
		System.out.println(id);
		return id;
	}
	
	
}

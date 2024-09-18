package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	public WebElement getSuccessmsg() {
		return successmsg;
	}

	public WebElement getErrormsg() {
		return errormsg;
	}
	@FindBy(className="login_title")
	private WebElement successmsg;
	
	@FindBy(id = "radiobutton_span")
	private WebElement errormsg;
	
	
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public void selectHotel() {
		getRadiobtn().click();
		getContinueBtn().click();
	}
	public void clickContinue() {
		getContinueBtn().click();
	}

}

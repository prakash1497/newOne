package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingHotelPage extends BaseClass {

	public BookingHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cardNo;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement bookBtn;

	@FindBy(xpath = "//*[@id=\"book_hotel_form\"]/table/tbody/tr[2]/td")
	private WebElement successmsg;

	@FindBy(id = "first_name_span")
	private WebElement errorfirstname;

	@FindBy(id = "last_name_span")
	private WebElement errorlastname;

	@FindBy(id = "address_span")
	private WebElement erroraddress;

	@FindBy(id = "cc_num_span")
	private WebElement errorccnum;

	@FindBy(id = "cc_type_span")
	private WebElement errorcctype;

	@FindBy(id = "cc_expiry_span")
	private WebElement errorexpcard;

	public String [] errorcheck() {
		String[] s = { elementGetText(errorfirstname), elementGetText(errorlastname), elementGetText(erroraddress),
				elementGetText(errorccnum), elementGetText(errorcctype), elementGetText(errorexpcard),
				elementGetText(errorcvv) };
		return s;
	}

	public WebElement getSuccessmsg() {
		return successmsg;
	}

	public WebElement getErrorfirstname() {
		return errorfirstname;
	}

	public WebElement getErrorlastname() {
		return errorlastname;
	}

	public WebElement getErroraddress() {
		return erroraddress;
	}

	public WebElement getErrorccnum() {
		return errorccnum;
	}

	public WebElement getErrorcctype() {
		return errorcctype;
	}

	public WebElement getErrorexpcard() {
		return errorexpcard;
	}

	public WebElement getErrorcvv() {
		return errorcvv;
	}

	@FindBy(id = "cc_cvv_span")
	private WebElement errorcvv;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	public void bookHotel(String firstName, String lastName, String billAddress, String cardNo, String cardType,
			String expMonth, String expYear, String cvvNo) {
		WebElement nameFirst = getFirstName();
		elementSendKeys(nameFirst, firstName);

		WebElement nameLast = getLastName();
		elementSendKeys(nameLast, lastName);

		WebElement billingAddress = getAddress();
		elementSendKeys(billingAddress, billAddress);

		WebElement ccNo = getCardNo();
		elementSendKeys(ccNo, cardNo);

		WebElement ccType = getCardType();
		selectOptionByText(ccType, cardType);

		WebElement selectMonth = getMonth();
		selectOptionByText(selectMonth, expMonth);

		WebElement selectYear = getYear();
		selectOptionByText(selectYear, expYear);

		WebElement cvv = getCvv();
		elementSendKeys(cvv, cvvNo);

		WebElement btnBook = getBookBtn();
		elementClick(btnBook);
		
	}

	public void bookHotel() {
		WebElement btnBook = getBookBtn();
		elementClick(btnBook);
	}
}

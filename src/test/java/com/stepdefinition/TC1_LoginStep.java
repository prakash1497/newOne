package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	PageObjectmanager pom = new PageObjectmanager();

	@Given("user is on Adactin Login page")
	public void userIsOnAdactinLoginPage() throws FileNotFoundException, IOException {
	}

	@When("user should Login {string}, {string} click login")
	public void userShouldLoginClickLogin(String username, String password) {
		pom.getLoginPage().login(username, password);
	}

	@When("user should Login {string}, {string} using ENTER")
	public void userShouldLoginUsingENTER(String username, String password) {
		pom.getLoginPage().loginWithEnterKey(username, password);
	}

	@Then("user should verify after login with invalid credentials error message contains {string}")
	public void userShouldVerifyAfterLoginWithInvalidCredentialsErrorMessageContains(String expect) {
		WebElement errorMsg = pom.getLoginPage().getErrorMsg();
		String attributevalue = elementGetText(errorMsg);
		boolean contains = attributevalue.contains(expect);
		Assert.assertTrue("VerifyAfterLoginWithInvalidCredentialsErrorMessageContains", contains);

	}

}

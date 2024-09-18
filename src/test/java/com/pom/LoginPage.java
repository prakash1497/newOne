package com.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class LoginPage extends BaseClass{
	public LoginPage() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement loginbtn;
	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement errorMsg;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void login(String username, String password) {
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginbtn().click();
	}

	public void loginWithEnterKey(String username, String password) {
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginbtn().sendKeys(Keys.ENTER);
		
	}
	
}

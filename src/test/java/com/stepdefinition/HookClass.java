package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass extends BaseClass {

	@Before
	public void before() throws FileNotFoundException, IOException {
		System.out.println("before--------check");

		getDrive(getPropertyFileValue("browser"));
		maximizeWindow();

		getUrl(getPropertyFileValue("url"));

		implicitWait();

	}

	@After
	public void after(Scenario scenario) {
		System.out.println("after-------Check");
		if (scenario.isFailed()) {
			scenario.attach(screenshot(), "images/png", "everyscenario");
		}
//		closeWindow();
	}

}

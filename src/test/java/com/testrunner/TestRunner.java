package com.testrunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@Login"), snippets=SnippetType.UNDERSCORE, dryRun=false, monochrome=true, 
publish=true, stepNotifications=true, plugin= {"pretty", "json:target/Json.json",
		"rerun:\\target\\rerun.txt"}
,features="src\\test\\resources", glue="com.stepdefinition")
public class TestRunner extends BaseClass {
	
	@AfterClass
	public static void afterclass() throws FileNotFoundException, IOException {
		Reporting.generateJvmReport(getProjectPath()+(getPropertyFileValue("jsonpath")));
	
//	driver.quit();
	}
	
	
	
	

}
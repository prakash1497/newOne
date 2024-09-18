package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.base.BaseClass;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;




public class Reporting extends BaseClass{
	public static void generateJvmReport(String jsonFile) throws FileNotFoundException, IOException {
		File file = new File(getProjectPath()+getPropertyFileValue("jvmpath"));
		Configuration configuration = new Configuration(file, "CUCUMBERPROJECT");
		configuration.addClassifications("brwoser", "chrome");
		configuration.addClassifications("version", "107");
		configuration.addClassifications("OS", "Win");
		configuration.addClassifications("sprint", "37");
		ArrayList<String> json = new ArrayList<String>();
		json.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(json, configuration);
		builder.generateReports();
	}

}

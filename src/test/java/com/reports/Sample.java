package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Sample {
	
	public static void jvmReport(String json) {
		
		File reportDirectory= new File("C:\\Users\\YUVA\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");
		
		Configuration c = new Configuration(reportDirectory, "adactin");
		c.addClassifications("OS", "window");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		
		
		ReportBuilder report = new ReportBuilder(jsonFiles , c);
		report.generateReports();
	}

}

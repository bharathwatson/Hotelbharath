package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.baseclass.BaseClassAdactin;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author Bharath
 * @Description Generate the JVM report
 * @Date 08-jul-2022
 *
 */

public class Reporting extends BaseClassAdactin {
	/**
	 * 
	 * @Description To generate JVM report ,file to be stored in the target folder,
	 *              Configuration class object creation to be done , then Add the
	 *              Details in the addClassifications method ReportBuilder Class
	 *              object creation to be done then generate Reports using
	 *              generateReports methods
	 * @Date 08-jul-2022
	 * @param jsonFile
	 * 
	 */
	public static void generateJVMReport(String jsonFile) {

		File file = new File(getPropertyFileValue("JVMReportOutput"));

		Configuration config = new Configuration(file, "Adactin Hotel Booking Validation");

		config.addClassifications("Browser", "Chrome");
		config.addClassifications("version", "103");
		config.addClassifications("OS", "WIN10");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder report = new ReportBuilder(jsonFiles, config);
		report.generateReports();

	}
}

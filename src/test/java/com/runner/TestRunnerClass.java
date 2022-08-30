package com.runner;

import org.baseclass.BaseClassAdactin;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author Bharath
 * @Description This class just needs annotations to understand that cucumber
 *              features would be run through it and you can specify feature
 *              files to be picked up plus the steps package location. There are
 *              bunch of other parameters that it can take, to be discussed
 *              later in Cucumber Options.
 * @Date 08-jul-2022
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = {}, snippets = SnippetType.CAMELCASE, plugin = {
		"json:target//output.json" }, strict = true, dryRun = false, monochrome = true, features = {
				"src/test/resources/features/" }, glue = { "com.stepdefinition" })
public class TestRunnerClass extends BaseClassAdactin {

	/**
	 * 
	 * @Description To locate the json file for the Reporting class to Generate the
	 *              JVM reports
	 * @Date 08-jul-2022
	 * 
	 */
	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport(getPropertyFileValue("JVMReportInput"));
	}

}

package com.stepdefinition;

import org.baseclass.BaseClassAdactin;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

/**
 * 
 * @author Bharath
 * @Description Cucumber supports hooks, which are blocks of code that run
 *              before or after each scenario.
 * @Date 08-jul-2022
 *
 */
public class Hooksclass extends BaseClassAdactin {
	/**
	 * @Description Exectue Before each scenario
	 * @Date 08-jul-2022
	 */
	@Before
	public void beforeScenario() {
		setUpDriver(getPropertyFileValue("browser"));
		maximize();
		getUrl(getPropertyFileValue("url"));
	}

	/**
	 * 
	 * @param sc
	 * @Description Execute After each scernario
	 * @Date 08-jul-2022
	 */
	@After
	public void afterScenario(Scenario sc) {
		if (!sc.isFailed()) {
			TakesScreenshot shot = (TakesScreenshot) driver;
			byte[] screenshotAs = shot.getScreenshotAs(OutputType.BYTES);
			sc.embed(screenshotAs, "Every Adactin Scenario");
		}

		quit();

	}
	@AfterStep
	public void afterStep() {
		
//		System.out.println("after step");
	}
	@BeforeStep
	public void beforeStep() {
//		System.out.println("before step");		
	}
//	@RunWith(Suite.class)
//	@SuiteClasses({bharath.class,Hooksclass.class})
//	public class bharath{
//		
//	}
}

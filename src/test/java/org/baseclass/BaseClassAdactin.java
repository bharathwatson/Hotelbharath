package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Bharath
 * @Description It facilitates the creation of other classes that can reuse the
 *              code implicitly inherited from the base class
 * @Date 08-jul-2022
 */

public class BaseClassAdactin {

	public static WebDriver driver;

	/**
	 * @Description switch to different type of browser
	 * @Date 08-jul-2022
	 * @param browserType
	 */
	public void setUpDriver(String browserType) {

		// switch to different type of browser
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}

	}

	/**
	 * @Description setup webdrivermanger and Launch the chrome Browser
	 * @Date 08-jul-2022
	 */
	public void setupChromeDriver() {
		// 1.0 setup webdrivermanger and Launch the Browser

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	/**
	 * @Description Insert the Url of the Webpage
	 * @Date 08-jul-2022
	 * @param url
	 */

	public void getUrl(String url) {
		// 2.0 Insert the Url of the Webpage
		driver.get(url);
	}

	/**
	 * @Description Maximize the Browser
	 * @Date 08-jul-2022
	 */

	public void maximize() {
		// 3.0 Maximize the Browser
		driver.manage().window().maximize();
	}

	/**
	 * @param seconds
	 * @Description Insert Implicity wait
	 * @Date 08-jul-2022
	 */
	public void implicityWait(int seconds) {
		// 4.0 Insert Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	/**
	 * @Description Get the Title of the current webpage
	 * @Date 08-jul-2022
	 * @return
	 */
	public String getTitle() {
		// 5.0 Get the Title of the current webpage
		String title = driver.getTitle();
		return title;
	}

	/**
	 * @Description Get the Url of the current Webpage
	 * @Date 08-jul-2022
	 * @return
	 */
	public String getCurrentUrl() {
		// 6.0 Get the Url of the current Webpage
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	/**
	 * @Description Get the PageSource of the current Webpage
	 * @Date 08-jul-2022
	 * @return
	 */
	public String getPageSource() {
		// 7.0 Get the PageSource of the current Webpage
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	/**
	 * @Description Navigate to Launch the String url in the browser
	 * @Date 08-jul-2022
	 * @param url
	 */
	public void navigateUrl(String url) {
		// 8.0 Navigate to Launch the String url in the browser
		driver.navigate().to(url);
	}

	/**
	 * @Description Navigate to Launch the Url in the Browser
	 * @Date 08-jul-2022
	 * @param url
	 */
	public void navigateUrlofurl(String url) {
		// 9.0 Navigate to Launch the Url in the Browser
		URL url1;
		try {
			url1 = new URL(url);
			driver.navigate().to(url1);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @Description Refresh the Webpage
	 * @Date 08-jul-2022
	 */
	public void refresh() {
		// 10.0 Refresh the Webpage
		driver.navigate().refresh();
	}

	/**
	 * @Description move Forward to the Webpage
	 * @Date 08-jul-2022
	 */
	public void forward() {
		// 11.0 move Forward to the Webpage
		driver.navigate().forward();
	}

	/**
	 * @Description Move back to the Previous Webpage
	 * @Date 08-jul-2022
	 */
	public void back() {
		// 12.0 Move back to the Previous Webpage
		driver.navigate().back();
	}

	/**
	 * @Description find the locator by Id
	 * @Date 08-jul-2022
	 * @param AttributeIdname
	 * @return
	 */
	public WebElement findElementById(String AttributeIdname) {
		// 13.0 find the locator by Id
		WebElement findElement = driver.findElement(By.id(AttributeIdname));
		return findElement;
	}

	/**
	 * @Description Find the locator by Name
	 * @Date 08-jul-2022
	 * @param Attributename
	 * @return
	 */
	public WebElement findElementByName(String Attributename) {
		// 14.0 Find the locator by Name
		WebElement findElement = driver.findElement(By.name(Attributename));
		return findElement;
	}

	/**
	 * @Description Find the Locator by ClassName
	 * @Date 08-jul-2022
	 * @param AttributeClassname
	 * @return
	 */
	public WebElement findElementByClassName(String AttributeClassname) {
		// 15.0 Find the Locator by ClassName
		WebElement findElement = driver.findElement(By.className(AttributeClassname));
		return findElement;
	}

	/**
	 * @Description Find the Locator by linkText
	 * @Date 08-jul-2022
	 * @param linkText
	 * @return
	 */
	public WebElement findElementByLinkText(String linkText) {
		// 16.0 Find the Locator by linkText
		WebElement findElement = driver.findElement(By.linkText(linkText));
		return findElement;
	}

	/**
	 * @Description Find the Locator by TagName
	 * @Date 08-jul-2022
	 * @param tagName
	 * @return
	 */
	public WebElement findElementByTagName(String tagName) {
		// 17.0 Find the Locator by TagName
		WebElement findElement = driver.findElement(By.tagName(tagName));
		return findElement;
	}

	/**
	 * @Description Find the Locator by partialLinkText
	 * @Date 08-jul-2022
	 * @param partialLinkText
	 * @return
	 */
	public WebElement findElementByPartialLinkText(String partialLinkText) {
		// 18.0 Find the Locator by partialLinkText
		WebElement findElement = driver.findElement(By.partialLinkText(partialLinkText));
		return findElement;
	}

	/**
	 * @Description Find the Locator by Xpath
	 * @Date 08-jul-2022
	 * @param xpathExpression
	 * @return
	 */
	public WebElement findElementByXpath(String xpathExpression) {
		// 19.0 Find the Locator by Xpath
		WebElement findElement = driver.findElement(By.xpath(xpathExpression));
		return findElement;
	}

	/**
	 * @Description Find the Locator by CSSselector
	 * @Date 08-jul-2022
	 * @param cssSelector
	 * @return
	 */
	public WebElement findElementByCSSselector(String cssSelector) {
		// 20.0 Find the Locator by CSSselector
		WebElement findElement = driver.findElement(By.cssSelector(cssSelector));
		return findElement;
	}

	/**
	 * @Description Get the Text from the WebPage
	 * @Date 08-jul-2022
	 * @param element
	 * @return
	 */
	public String getText(WebElement element) {
		// 21.0 Get the Text from the WebPage
		String text = element.getText();
		return text;
	}

	/**
	 * @Description Get the Text from the WebPage by Default Value
	 * @Date 08-jul-2022
	 * @param element
	 * @return
	 */
	public String getAttributeText(WebElement element) {
		// 22.0 Get the Text from the WebPage by Default Value
		String text = element.getAttribute("value");
		return text;
	}

	/**
	 * @Description Get the Text from the WebPage by passing the AttributeValue
	 * @Date 08-jul-2022
	 * @param element
	 * @param value
	 * @return
	 */
	public String getAttributeText(WebElement element, String value) {
		// 23.0 Get the Text from the WebPage by passing the AttributeValue
		String text = element.getAttribute(value);
		return text;
	}

	/**
	 * @Description Get the Tagname of the Current Webelement
	 * @Date 08-jul-2022
	 * @param element
	 * @return
	 */
	public String getTagName(WebElement element) {
		// 24.0 Get the Tagname of the Current Webelement
		String tagName = element.getTagName();
		return tagName;
	}

	/**
	 * @Description Click any Element
	 * @Date 08-jul-2022
	 * @param element
	 */
	public void click(WebElement element) {
		// 25.0 Click any Element
		element.click();
	}

	/**
	 * @Description Clear the TextBox
	 * @Date 08-jul-2022
	 * @param element
	 */
	public void clearText(WebElement element) {
		// 26.0 Clear the TextBox
		element.clear();
	}

	/**
	 * @Description Enter the value in the TextBox
	 * @Date 08-jul-2022
	 * @param element
	 * @param value
	 */
	public void enterText(WebElement element, String value) {
		// 27.0 Enter the value in the TextBox
		element.sendKeys(value);
	}

	/**
	 * @Description Check the Element is selected or not
	 * @Date 08-jul-2022
	 * @param element
	 * @return
	 */
	public boolean checkSelected(WebElement element) {
		// 28.0 Check the Element is selected or not
		boolean selected = element.isSelected();
		return selected;
	}

	/**
	 * @Description To Accept the (Popup or Alert) box found in the Webpage
	 * @Date 08-jul-2022
	 */
	public void alertAccept() {
		// 29.0 To Accept the (Popup or Alert) box found in the Webpage
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	/**
	 * @Description To Dismiss the (Popup or Alert) box found in the Webpage
	 * @Date 08-jul-2022
	 */
	public void alertDismiss() {
		// 30.0 To Dismiss the (Popup or Alert) box found in the Webpage
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	/**
	 * @Description To Pass Text In the alert textBox And accept the WebPage
	 * @Date 08-jul-2022
	 * @param value
	 */
	public void alertSendTextAccept(String value) {
		// 31.0 To Pass Text In the alert textBox And accept the WebPage
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
	}

	/**
	 * @Description get Data from the Excel file
	 * @Date 08-jul-2022
	 * @param fileName
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws IOException
	 */
	public String getDataFromExcel(String fileName, String sheetname, int rowNum, int cellNum) throws IOException {
		// 32.0 get Data from the Excel file
		String res = null;
		File file = new File(
				"C:\\Users\\YUVA\\eclipse-workspace\\MavenFramework\\excelsheet\\Amazon\\" + fileName + ".xlsx");
		FileInputStream Stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();

		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(dateCellValue);
			} else if (cell.getNumericCellValue() < 1000000) {
				double numericCellValue = cell.getNumericCellValue();
				int a = (int) numericCellValue;
				BigDecimal num = BigDecimal.valueOf(a);
				res = num.toString();
			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				res = valueOf.toString();
			}
		default:
			break;
		}
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
		return res;
	}

	/**
	 * @Description To Update The String value in the excel cell
	 * @Date 08-jul-2022
	 * @param fileName
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @param oldData
	 * @param newData
	 * @throws IOException
	 */
	public void upateValueOfCellInExcel(String fileName, String sheetname, int rowNum, int cellNum, String oldData,
			// 33.0 To Update The String value in the excel cell
			String newData) throws IOException {
		File file = new File(
				"C:\\Users\\YUVA\\eclipse-workspace\\MavenFramework\\excelsheet\\Amazon\\" + fileName + ".xlsx");
		FileInputStream Stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
	}

	/**
	 * @Description To Create cell and insert value in the Create cell
	 * @Date 08-jul-2022
	 * @param fileName
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws IOException
	 */
	public void insertValueInCreateCell(String fileName, String sheetname, int rowNum, int cellNum, String data)
			// 34.0 To Create cell and insert value in the Create cell
			throws IOException {
		File file = new File(
				"C:\\Users\\YUVA\\eclipse-workspace\\MavenFramework\\excelsheet\\Amazon\\" + fileName + ".xlsx");
		FileInputStream Stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
	}

	/**
	 * @Description To Create row & Create cell and insert value in the Create cell
	 * @Date 08-jul-2022
	 * @param fileName
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws IOException
	 */
	public void insertValueInCreateRowCreateCell(String fileName, String sheetname, int rowNum, int cellNum,
			// 35.0 To Create row & Create cell and insert value in the Create cell
			String data) throws IOException {
		File file = new File(
				"C:\\Users\\YUVA\\eclipse-workspace\\MavenFramework\\excelsheet\\Amazon\\" + fileName + ".xlsx");
		FileInputStream Stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
	}

	/**
	 * @Description To Create sheet,Row and cell then Insert the value in the
	 *              Createcell
	 * @Date 08-jul-2022
	 * @param fileName
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws IOException
	 */
	public void insertValueInCreateSheetCreateRowCreateCell(String fileName, String sheetname, int rowNum, int cellNum,
			// 36.0 To Create sheet,Row and cell then Insert the value in the Createcell
			String data) throws IOException {
		File file = new File(
				"C:\\Users\\YUVA\\eclipse-workspace\\MavenFramework\\excelsheet\\Amazon\\" + fileName + ".xlsx");
		FileInputStream Stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.createSheet(sheetname);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
	}

	/**
	 * @Description To Create WorkBook & To Create sheet,Row and cell then Insert
	 *              the value in the Createcell
	 * @Date 08-jul-2022
	 * @param fileName
	 * @param sheetname
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws IOException
	 */
	public void insertValueInCreateWorkbookCreateSheetCreateRowCreateCell(String fileName, String sheetname, int rowNum,
			// 37.0 To Create WorkBook & To Create sheet,Row and cell then Insert the value
			// in the Createcell
			int cellNum, String data) throws IOException {
		File file = new File(
				"C:\\Users\\YUVA\\eclipse-workspace\\MavenFramework\\excelsheet\\Amazon\\" + fileName + ".xlsx");
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetname);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream outStream = new FileOutputStream(file);
		workbook.write(outStream);
	}

	/**
	 * @Description Minimize the browser
	 * @Date 08-jul-2022
	 */
	public void minimize() {
		// 38.0 Minimize the browser
		driver.manage().window().minimize();
	}

	/**
	 * @Description Quit the browser
	 * @Date 08-jul-2022
	 */
	public void quit() {
		// 39.0 Quit the browser
		driver.quit();
	}

	/**
	 * @Description close the current tab in browser
	 * @Date 08-jul-2022
	 */
	public void close() {
		// 40.0 close the current tab in browser
		driver.close();
	}

	/**
	 * @Description select the option by text from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 * @param text
	 */
	public void selectOptionByText(WebElement element, String text) {
		// 41.0 select the option by text from drop down using Select Class
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * @Description select the option by value from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 */
	public void selectOptionByValue(WebElement element) {
		// 42.0 select the option by value from drop down using Select Class
		Select select = new Select(element);
		select.selectByValue("value");
	}

	/**
	 * @Description select the option by value from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 * @param value
	 */
	public void selectOptionByvalue(WebElement element, String value) {
		// 43.0 select the option by value from drop down using Select Class
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * @Description select the option by index from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 * @param index
	 */
	public void selectOptionByIndex(WebElement element, int index) {
		// 43.0 select the option by index from drop down using Select Class
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * @Description deselect the All option from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 */
	public void deSelectAllOption(WebElement element) {
		// 44.0 deselect the All option from drop down using Select Class
		Select select = new Select(element);
		select.deselectAll();
	}

	/**
	 * @Description deselect the option by index from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 * @param index
	 */
	public void deSelectAllOptionByIndex(WebElement element, int index) {
		// 45.0 deselect the option by index from drop down using Select Class
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	/**
	 * @Description deselect the option by text from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 * @param text
	 */
	public void deSelectAllOptionByIndex(WebElement element, String text) {
		// 46.0 deselect the option by text from drop down using Select Class
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	/**
	 * @Description deselect the option by value from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 * @param value
	 */
	public void deSelectAllOptionByValue(WebElement element, String value) {
		// 47.0 deselect the option by value from drop down using Select Class
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	/**
	 * @Description deselect the option by value from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 */
	public void deSelectAllOptionByValue(WebElement element) {
		// 48.0 deselect the option by value from drop down using Select Class
		Select select = new Select(element);
		select.deselectByValue("value");
	}

	/**
	 * @Description Get the select text by index from drop down using Select Class
	 * @Date 08-jul-2022
	 * @param element
	 * @param index
	 * @return
	 */
	public WebElement getSelectOptionByIndex(WebElement element, int index) {
		// 49.0 Get the select text by index from drop down using Select Class
		Select select = new Select(element);
		select.selectByIndex(index);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		firstSelectedOption.getText();
		return firstSelectedOption;
	}

	/**
	 * @Description Thread sleep function to stop the webDriver for Given seconds
	 * @Date 08-jul-2022
	 * @param milliseconds
	 * @throws InterruptedException
	 */
	public void threadSleep(int milliseconds) throws InterruptedException {
		// 50.0 Thread sleep function to stop the webDriver for Given seconds
		Thread.sleep(milliseconds);
	}

	/**
	 * @Description To print in the Console
	 * @Date 08-jul-2022
	 * @param text
	 */
	public void systemPrint(String text) {
		// 51.0 To print in the Console
		System.out.println(text);
	}

	/**
	 * @Description Take screenShot by element method
	 * @Date 08-jul-2022
	 * @param element
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public File takeScreentshotElement(WebElement element, String fileName) throws IOException {
		// 52.0 Take screenShot by element method
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		File file = new File(
				"C:\\Users\\YUVA\\eclipse-workspace\\MavenFramework\\TakeScreenshot\\" + fileName + ".png");
		FileUtils.copyFile(screenshotAs, file);
		return file;

	}

	/**
	 * @Description Action to move To the element of the locator
	 * @Date 08-jul-2022
	 * @param element
	 */
	public void mouseOveraction(WebElement element) {
		// 53.0 Action to move To the element of the locator
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * @Description Switch to childWindows bY using Windows handle
	 * @Date 08-jul-2022
	 * @param childWindows
	 */
	public void switchToChildWindows(int childWindows) {
		// 54.0 Switch to childWindows bY using Windows handle
		String windowHandle = driver.getWindowHandle();
		System.out.println("Parent Id = " + windowHandle);

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("AllWindows = " + windowHandles);
		int i = 0;
		for (String window : windowHandles) {

			// System.out.println(window);
			i++;
			if (i == childWindows) {
				driver.switchTo().window(window);
				System.out.println(window);
			}
		}

	}

	/**
	 * @Description Action to move To the element of the locator
	 * @Date 08-jul-2022
	 * @param element
	 */
	public void mouseOveractionClick(WebElement element) {
		// 54.0 Action to move To the element of the locator
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
	}

	/**
	 * @Description Action to move To the element of the locator
	 * @Date 08-jul-2022
	 */
	public void switchToParentWindows() {
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		System.out.println("current windows" + windowHandle);
	}

	/**
	 * @Description Explicit wait visibility of text or toast
	 * @Date 08-jul-2022
	 * @param element
	 * @param seconds
	 * @return
	 */
	public WebElement explicitWaitVisibility(WebElement element, int seconds) {
		// 55.0 Explicit wait visibility of text or toast
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		WebElement visibility = wait.until(ExpectedConditions.visibilityOf(element));
		return visibility;
	}

	/**
	 * @Description Explicit wait for title that contains
	 * @Date 08-jul-2022
	 * @param contains
	 * @param seconds
	 * @return
	 */
	public Boolean explicitWaitTitle(String contains, int seconds) {
		// 56.0 Explicit wait for title that contains
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		Boolean titleContains = wait.until(ExpectedConditions.titleContains(contains));
		return titleContains;
	}

	/**
	 * @Description ExplicitWait for Alert is present Accept
	 * @Date 08-jul-2022
	 * @param seconds
	 */
	public void explicitWaitAlertAccept(int seconds) {
		// 57.0 ExplicitWait for Alert is present Accept
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		String text = until.getText();
		System.out.println(text);
		until.accept();
	}

	/**
	 * @Description ExplicitWait for Alert is present Dismiss
	 * @Date 08-jul-2022
	 * @param seconds
	 */
	public void explicitWaitAlertDismiss(int seconds) {
		// 58.0 ExplicitWait for Alert is present Dismiss
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		String text = until.getText();
		System.out.println(text);
		until.dismiss();
	}

	/**
	 * @Description ExplicitWait for Alert is present SendText and accept
	 * @Date 08-jul-2022
	 * @param seconds
	 * @param keysToSend
	 */
	public void explicitWaitAlertSendTextAccept(int seconds, String keysToSend) {
		// 59.0 ExplicitWait for Alert is present SendText and accept
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		until.sendKeys(keysToSend);
		until.accept();
	}

	/**
	 * @Description Explicit wait Invisibility of text or toast
	 * @Date 08-jul-2022
	 * @param element
	 * @param seconds
	 * @return
	 */
	public Boolean explicitWaitInVisibility(WebElement element, int seconds) {
		// 60.0 Explicit wait Invisibility of text or toast
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		Boolean inVisibility = wait.until(ExpectedConditions.invisibilityOf(element));
		return inVisibility;
	}

	/**
	 * 
	 * @Description
	 * @Date 08-jul-2022
	 * @param element
	 * @param seconds
	 * @return Explicit wait
	 */
	public WebElement explicitWaitElementVisibility(WebElement element, int seconds) {
		// 61.0 Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		WebElement elementToBeClickable = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elementToBeClickable;
	}

	/**
	 * @Description Enter the value in the TextBox
	 * @Date 08-jul-2022
	 * @param element
	 * @param value
	 */
	public void enterTextEnter(WebElement element, String value) {
		// 62.0 Enter the value in the TextBox
		element.sendKeys(value, Keys.ENTER);
	}

	/**
	 * @Description Compare the Expected and Actual condition using Assert equals by
	 *              GetAttribute
	 * @Date 08-jul-2022
	 * @param element
	 * @param message
	 * @param expecteds
	 */
	public void assertEqualsGetAttribute(WebElement element, String message, String expecteds) {
		// 63.0 Compare the Expected and Actual condition using Assert equals by
		// GetAttribute
		String attribute = element.getAttribute("value");
		Assert.assertEquals(message, expecteds, attribute);
	}

	/**
	 * @Description Compare the Expected and Actual condition using Assert equals by
	 *              Gettext
	 * @Date 08-jul-2022
	 * @param element
	 * @param message
	 * @param expecteds
	 */
	public void assertEqualsGetText(WebElement element, String message, String expecteds) {
		// 64.0 Compare the Expected and Actual condition using Assert equals by Gettext
		String text = element.getText();
		Assert.assertEquals(message, expecteds, text);
	}

	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 * @Description get the value from properties file using properties class
	 * @Date 08-jul-2022
	 */
	public static String getPropertyFileValue(String key) {
		// 65.0 get the value from properties file using properties class
		String res = null;
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");

			Properties properties = new Properties();

			properties.load(file);

			Object object = properties.get(key);

			res = (String) object;

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return res;

	}

}

package org.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal1 {

	public static WebDriver driver;
	public static WebElement e;
	public static Actions a;
	public static Robot r;
	public static Alert alrt;
	public static TakesScreenshot tk;
	public static JavascriptExecutor js;

	// To launch browser:
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// To launch URL:-----------------------------> 1) we have to give value after
	// called
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// To maximize the browser:
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	// To click the button
	public static void btnClick(WebElement e) {
		e.click();
	}

	// To get webpage title:
	public static void getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Title " + title);
	}

	// To get webpage url: -----------------------> 2) It prints in the console
	public static void getPageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url" + currentUrl);
	}

	// To quit the browser:
	public static void quitBrowser() {
		driver.quit();
	}

	// To pass values in the text box: --------------> 3)To pass the value in the
	// text box(specific field)
	public static void passValue(WebElement e, String text) {
		e.sendKeys(text);
	}

	// To get the sent text:
	public static void getSentText(WebElement ele) {
		String text = ele.getText();
		System.out.println("Passed text" + text);
	}

	// To get the existing text:
	public static void getExistText(WebElement e, String value) {
		String attribute = e.getAttribute(value);
		System.out.println("Existing Text:" + attribute);
	}

	// To perform move to element:
	private static void moveToElement(WebElement e) {
		a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	// To perform drag and drop:
	public static void dragAndDrop(WebElement source, WebElement target) {
		a.dragAndDrop(source, target).perform();
	}

	// To perform double click:
	public static void doubleClick(WebElement e) {
		a.doubleClick(e).perform();
	}

	// To perform context / right click:
	public static void contextClick(WebElement e) {
		a.contextClick(e).perform();
	}

	// To perform key up in shift button:
	public static void keyUp(WebElement e) {
		a.keyUp(e, Keys.SHIFT).perform();
	}

	// To perform key down in shift button:
	public static void keyDown(WebElement e) {
		a.keyDown(e, Keys.SHIFT).perform();
	}

	// To perform Enter key:
	public static void performEnter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// To perform down key:
	public static void performDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// To accept the alert:
	public static void acceptAlert() {
		alrt.accept();
	}

	// To dismiss the alert:
	public static void dismissAlert() {
		alrt.dismiss();
	}

	// To get Screenshot:
	public static void getScreenShot() throws IOException {
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Abhyramy\\Desktop\\ABHY - Java Selenium\\Java\\MavenSample\\Screenshot");
		FileUtils.copyFile(src, desc);
	}

	// To scroll the page up:
	public static void pageUp(WebElement pageUp) {
		js.executeScript("arguments[0].scrollIntoView(false)", pageUp);
	}

	// To scroll the page down:
	public static void pageDown(WebElement pageDown) {
		js.executeScript("arguments[0].scrollIntoView(true)", pageDown);
	}

	// To insert the value (If send keys method is not working) [replacement for
	// send keys]
	public static void sendKey1(WebElement e, String s) {
		js.executeScript("arguments[0].setAttribute('value','s')", e);

	}
	
	//for checking purpose
	private void checking() {
     System.out.println("Done");

     System.out.println("Preethi Done");
     System.out.println("Abhy Done");
     //abhy conflicts
     
		
		
	}

}

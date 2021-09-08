package org.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver driver;
	
	
	//BROWSER LAUNCH
	public static void broswerLaunch(String broswername) {
		
		switch(broswername) {
		
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		
		
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		default:
			System.out.println("INVALID BROWSER");
		
		}
		
	}
	
	
	
	//URL LAUCH
		public static void urlLaunch(String url) {
			driver.get(url);
			

		}
		
		
		

		//IMPWAIT
		public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		
		
		//Thread sleep
		
		public static void threadSleep(long micsec) throws Throwable {
			Thread.sleep(micsec);

		}
		
		
		
		
		
		//GETATTRIBUTE
		
		public static void getText(WebElement e,String name ) {
			e.getAttribute(name);
			
		}
		
		
		
		//MOUSE CLICK
		public static void clickMouse(WebElement e) {
			Actions a=new Actions(driver);
			
			a.click(e).perform();
			
		}
		
		//MOUSE DRAG AND DROP
		public static void dragandDrop(WebElement from,WebElement to) {
			Actions a=new Actions(driver);
			a.dragAndDrop(from, to).perform();

		}
		
		
		//MOUSE MOVE TO ELEMENT
		
		public static void moveToElement(WebElement e) {
			Actions a=new Actions(driver);
			
			a.moveToElement(e);
			
		}
		
		
		
		//CONTEXTCLICK
		
		
		public static void contextClick(WebElement e) {
				Actions a=new Actions(driver);	
				a.contextClick(e);
		}
		
		
		//DOUBLE CLICK
		
		public static void doubleClick(WebElement e) {
			Actions a=new Actions(driver);
			
			a.doubleClick(e);
		}
		
		
		
		//SIMPLE ALERT
		
		public static void simpleAlert() {
			
			
			Alert sim = driver.switchTo().alert();
			sim.accept();
			
		}
		
		//CONFIRM ALERT
		public static void confirm() {
			Alert confirm = driver.switchTo().alert();
			confirm.dismiss();

		}
		
		//PROMPT ALERT
		public static void prompt(String data) {
			Alert prompt = driver.switchTo().alert();
			prompt.sendKeys(data);
			prompt.accept();

		}
		
		
		
		//SENDKEYS
		public static void sendKeys(WebElement e,String data) {
			 e.sendKeys(data);

		}
		
		
		//BTNCLICK
		
		public static void btnClick(WebElement e) {
			e.click();
		}
		
		//FILLTEXT BOX
		
		public static void fillTextBox(WebElement e,String data) {
			e.sendKeys(data);
			
		}
		
		
		//GET CURRENT URL
		
		public static void currentUrl() {
			String currentUrl = driver.getCurrentUrl();
	
			System.out.println(currentUrl);
		}
		
		
		//GET TITLE
		
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		
		
		//WINDOW HANDLE(Doubt)
//		
//		public static void windowHandle(int windowno) {
//			
//			
//			Set<String> window=driver.getWindowHandle();
//			List<String> list=new ArrayList<String>(window);
//			
//			driver.switchTo().window(list.get(windowno));
//			
//			}
		
		
		
		//WINDOW HANDLE USING URL
		
		public static void windowHandleUrl(String url) {
			
			driver.switchTo().window(url);
			
		}
		
		
		
		//SCREENSHOT(Doubt)
		
		public static void screenshot(String folderloc) throws IOException {
			TakesScreenshot tk=(TakesScreenshot)driver;
			
			File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
			
			File destination=new File(folderloc+"a.png");
			
			FileUtils.copyDirectory(screenshotAs, destination);
		}
		
	 
	
	
	

}

package org.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook extends BaseClass{
	
	
	@BeforeClass
	private void beforeClass() {
		
		broswerLaunch("chrome");
		impWait(20);
		
	}
	
	@BeforeMethod
	private void beforetest() {
		Date d=new Date();
		System.out.println(d);
	}
	
	
	//@Parameters({"user","pass"})
	@Test(dataProvider="login",dataProviderClass=Login.class)
	private void test(String user,String pass) {
		
		
		urlLaunch("https://en-gb.facebook.com/");
		Login l=new Login();
		fillTextBox(l.getTxtusername(), user);
		fillTextBox(l.getTxtpassword(),pass );
		
	}
	
	
	
	
	
	@BeforeMethod
	private void beforetest1() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@AfterClass
	private void AfterClass() {
		driver.quit();
		
	}
			
			
	
	
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

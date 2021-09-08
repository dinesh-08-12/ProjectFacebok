package org.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Login extends BaseClass {
	
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtusername;
	
	
	
	@FindBy(id="pass")
	private WebElement txtpassword;



	public WebElement getTxtusername() {
		return txtusername;
	}



	public WebElement getTxtpassword() {
		return txtpassword;
	}
	
	@DataProvider(name="login")
	
	
	private Object[][]getData(){
		
		return new Object[][] {
			
			{"DINESH","1234567"},
			{"JAVA","765434"},
			{"SELENIUM","45446778766"}
	};
	
	
	
	
	
	
}
	
}

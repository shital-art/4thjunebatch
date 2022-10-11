package com.Saucdemo.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucloginPomClass {
	 WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}

	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;
	public void clickonlogin()
	{
		login.click();
	}

public SaucloginPomClass(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
	
}

}

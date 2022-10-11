package com.Saucdemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Saucdemo.PomClass.SaucHomepagePomClass;
import com.Saucdemo.PomClass.SaucloginPomClass;

import testNgPackage.TestBaseClass;



public class TestClassLogoutFunctonality  extends TestBaseClass{
	@Test 
	public void verifylogoutFunctionality()
	{
		SaucHomepagePomClass l=new SaucHomepagePomClass(driver);
		System.out.println("click on menu option");
		l.clickmenu();
		System.out.println("click on clickOnlogout");
		l.clickLogout();

		System.out.println("apply validation");
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		String expectedResult="Swag Labs";
		Assert.assertEquals( actualresult, expectedResult);

			
		
		
	}

}

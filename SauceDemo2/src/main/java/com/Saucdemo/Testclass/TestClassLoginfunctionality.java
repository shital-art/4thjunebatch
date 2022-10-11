package com.Saucdemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Saucdemo.PomClass.SaucloginPomClass;


import testNgPackage.TestBaseClass;



public class TestClassLoginfunctionality extends TestBaseClass{
	 
	@Test	//pmclass.clickonlogin();
public void verifyloginfunctionality() {
		log.info("apply validation");
		String actualresult=driver.getTitle();
		System.out.println(actualresult);
		String expectedResult="Swag Labs";
		Assert.assertEquals( actualresult, expectedResult);
}
}

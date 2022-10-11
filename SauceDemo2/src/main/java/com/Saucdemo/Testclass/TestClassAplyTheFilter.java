package com.Saucdemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Saucdemo.PomClass.SaucHomepagePomClass;
import com.Saucdemo.PomClass.SaucloginPomClass;

import testNgPackage.TestBaseClass;


public class TestClassAplyTheFilter extends TestBaseClass {
	
	@Test
	public void verifyfilteraply()
	{
		
		System.out.println("aply the filter on ");
		SaucHomepagePomClass hp=new SaucHomepagePomClass(driver);
		hp.clickonfilterdropdown();
		String ExpectedResult="Price (high to low)]";
				
		String ActualProduct=hp.getfiltertext();
		System.out.println(ActualProduct);
		
		Assert.assertEquals(ExpectedResult,ActualProduct);
	
		
	}
	
}

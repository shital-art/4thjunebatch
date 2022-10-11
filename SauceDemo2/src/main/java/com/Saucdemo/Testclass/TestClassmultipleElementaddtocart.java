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


public class TestClassmultipleElementaddtocart extends TestBaseClass {
	@Test
	public void verifyaddmultipleproduct()
	{
	
		System.out.println("add to cart the product");
		SaucHomepagePomClass hp=new SaucHomepagePomClass(driver);
		hp.clickAllproduct();
	
		
		System.out.println("apply validation");
		
		
		String ExpectedResult="6";
		String ActualProduct=hp.gettextaddtocart();
		
		
		Assert.assertEquals( ActualProduct, ExpectedResult);

	}
		
			
		
		
		
	
	}


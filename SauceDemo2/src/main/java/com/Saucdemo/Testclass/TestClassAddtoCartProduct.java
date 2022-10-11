package com.Saucdemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Saucdemo.PomClass.SaucHomepagePomClass;
import com.Saucdemo.PomClass.SaucloginPomClass;

import testNgPackage.TestBaseClass;


public class TestClassAddtoCartProduct extends TestBaseClass{
	
	@Test
	public void VerifyAddtocart()
	{
		System.out.println("add to cart the product");
		SaucHomepagePomClass hp=new SaucHomepagePomClass(driver);
		hp.addtocartProduct();
		System.out.println("apply validation");
		String ExpectedResult="1";
		String ActualProduct=hp.gettextaddtocart();
		
		
		Assert.assertEquals( ActualProduct, ExpectedResult);

	
}
}
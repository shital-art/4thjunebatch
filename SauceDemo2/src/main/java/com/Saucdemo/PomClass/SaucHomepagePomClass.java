package com.Saucdemo.PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SaucHomepagePomClass {
	private WebDriver driver;
	private Select s;
//menu webelement
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menu;
	
	public void clickmenu()
	{
		menu.click();
	}
	//logoutbutton
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	public void clickLogout()
	{
		logout.click();
	}
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private WebElement addtocart;
	public void addtocartProduct()
	{
		addtocart.click();
	}
	
	
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addtocarttext;
	public String gettextaddtocart()
	{
		String s=addtocarttext.getText();
		System.out.println(s);
		return s;
	}
	
	
	
	
	public void addtocartlinkClick()
	{
		addtocarttext.click();
	}
	
	//proceedto checkout element
		@FindBy(xpath="//button[@id='checkout']")
		private WebElement proccedtocheckout;
		
		public void proceedcheckout()
		{
			proccedtocheckout.click();
		}
		
		//dropdown verify the fileter 
		@FindBy(xpath="//select[@class='product_sort_container']")
		private WebElement filterdropdown;
		
		public void clickonfilterdropdown()
		{
			filterdropdown.click();
			//Select s=new Select(filterdropdown);
			s.selectByValue("az");
		}
		
		public String getfiltertext()
		{
			String f=filterdropdown.getText();
			System.out.println(f);
			return f;
		}
		@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
		private List<WebElement> allproduct;
		public void clickAllproduct()
		{
			for(WebElement i:allproduct)
			{
				i.click();
			}
		}
	public SaucHomepagePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		s=new Select(filterdropdown);
		
	}
	}

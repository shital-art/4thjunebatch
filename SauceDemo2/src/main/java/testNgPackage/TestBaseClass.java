package testNgPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Saucdemo.PomClass.SaucloginPomClass;

import ScreenshotPackage.ScreenshotMethod;

public class TestBaseClass {
	public WebDriver driver;
	public Logger log=Logger.getLogger("SauceDemo2");
@Parameters("BrowserName")
	@BeforeMethod
	public  void setup(String BrowserName) throws IOException {
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	else if(BrowserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "./Driverfiles\\geckodriver.exe");
		 driver=new FirefoxDriver();
	
	
	}
	else
	{
		System.out.println("throw exception");
	}
		PropertyConfigurator.configure("log4j.properties");			
		log.info("broser is open");

		driver.manage().window().maximize();//maximize the window
		log.info("maximize the window");

		driver.get("https://www.saucedemo.com/");
		log.info("open the url");
	
		//loginpomclassobject
		SaucloginPomClass pmclass=new SaucloginPomClass(driver);
		System.out.println("username is entered");
		log.info("username is entered");
		pmclass.sendusername();
		log.info("password is entered");

		pmclass.sendpassword();
		log.info("click on login button");

		pmclass.clickonlogin();
		ScreenshotMethod.screenshot(driver);
	}

	@AfterMethod
	public void teardown()
	{
		driver.quit();
		System.out.println("browser close");
	}

}

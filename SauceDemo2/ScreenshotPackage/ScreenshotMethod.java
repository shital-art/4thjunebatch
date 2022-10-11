package ScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotMethod {
	public static void screenshot(WebDriver driver) throws IOException
	{
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("yy-mm-dd mm-ss-hh");
		String date=d1.format(d);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
	File selfile=ts.getScreenshotAs(OutputType.FILE);
		File myfile=new File("D:\\webdriver\\saucdemoScreenshot\\saucdemo"+".jpg");
		FileHandler.copy(selfile, myfile);
	}
}